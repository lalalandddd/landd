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
// 여기서부터 페이징 작업
		int pageNum=1;  // 현재 페이지 번호
		if(request.getParameter("page")!=null) {  // 페이지 번호 2번 이상 클릭 시
			pageNum=Integer.parseInt(request.getParameter("page"));
		}
		int total=dao.totalCount(keyWord);
		int skip=5;  // 화면에 보이는 페이징 번호 수
		int pagePost=10;  // 한 페이지 개시글 수
		int pageTotalNum=total/pagePost;  // 총 페이지 수(총 게시글 수 / 한 페이지 게시글 수)
		if(total%pagePost!=0)pageTotalNum++;
		int startPage=1;  // 현재 화면 페이징 시작 번호
		int endPage=pageTotalNum>skip?skip:pageTotalNum;  // 현재 화면 페이징 종료 번호
		if(pageTotalNum>skip&&pageNum>=(skip/2+1)) {  // 페이지 번호의 위치를 이동시키면서 현재 페이지 번호를 가운데 출력하도록 하기
			startPage=pageNum-2;
			endPage=pageTotalNum>pageNum+2?pageNum+2:pageTotalNum;
//		}else if(pageTotalNum>skip&&(endPage-pageNum)<3) {
//			startPage=pageTotalNum-5;
//			endPage=pageTotalNum;
		}
// 여기까지 페이징 작업
// 여기서부터 게시글 목록 가져오기, 검색 결과
		public List<BoardDTO> 
// 여기까지 게시글 목록 가져오기, 검색 결과
// 게시글 목록 가져오기
		int start=(pageNum-1)*pagePost;
		List<BoardDTO> list=dao.findAll(start);  // 전체 게시글 가져오기
// 페이징 작업 결과 돌려보내기 시작
		request.setAttribute("startPage",startPage);
		request.setAttribute("endPage",endPage);
		request.setAttribute("pageNum",pageNum);
		request.setAttribute("skip",skip);
		request.setAttribute("pageTotalNum",pageTotalNum);
// 페이징 작업 결과 돌려보내기 끝
		request.setAttribute("list",list);
		return "/Board/board.jsp";
	}
}
