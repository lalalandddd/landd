package service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.BoardDAO;
import DTO.BoardDTO;

public class BoardPage implements MainActive{
	@Override
	public String action(HttpServletRequest request,HttpServletResponse response) {
		BoardDAO dao=new BoardDAO();
		String keyWord=request.getParmeter("word");
		if(keyWord==null)keyWord="";
// ���⼭���� ����¡ �۾�
		int pageNum=1;  // ���� ������ ��ȣ
		if(request.getParameter("page")!=null) {  // ������ ��ȣ 2�� �̻� Ŭ�� ��
			pageNum=Integer.parseInt(request.getParameter("page"));
		}
		int total=dao.totalCount(keyWord);
		int skip=5;  // ȭ�鿡 ���̴� ����¡ ��ȣ ��
		int pagePost=10;  // �� ������ ���ñ� ��
		int pageTotalNum=total/pagePost;  // �� ������ ��(�� �Խñ� �� / �� ������ �Խñ� ��)
		if(total%pagePost!=0)pageTotalNum++;
		int startPage=1;  // ���� ȭ�� ����¡ ���� ��ȣ
		int endPage=pageTotalNum>skip?skip:pageTotalNum;  // ���� ȭ�� ����¡ ���� ��ȣ
		if(pageTotalNum>skip&&pageNum>=(skip/2+1)) {  // ������ ��ȣ�� ��ġ�� �̵���Ű�鼭 ���� ������ ��ȣ�� ��� ����ϵ��� �ϱ�
			startPage=pageNum-2;
			endPage=pageTotalNum>pageNum+2?pageNum+2:pageTotalNum;
//		}else if(pageTotalNum>skip&&(endPage-pageNum)<3) {
//			startPage=pageTotalNum-5;
//			endPage=pageTotalNum;
		}
// ������� ����¡ �۾�
// ���⼭���� �Խñ� ��� ��������, �˻� ���
		public List<BoardDTO> 
// ������� �Խñ� ��� ��������, �˻� ���
// �Խñ� ��� ��������
		int start=(pageNum-1)*pagePost;
		List<BoardDTO> list=dao.findAll(start);  // ��ü �Խñ� ��������
// ����¡ �۾� ��� ���������� ����
		request.setAttribute("startPage",startPage);
		request.setAttribute("endPage",endPage);
		request.setAttribute("pageNum",pageNum);
		request.setAttribute("skip",skip);
		request.setAttribute("pageTotalNum",pageTotalNum);
// ����¡ �۾� ��� ���������� ��
		request.setAttribute("list",list);
		return "/Board/board.jsp";
	}
}
