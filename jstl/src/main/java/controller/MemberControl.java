package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MemberControl
 */
@WebServlet("/member")
public class MemberControl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MemberControl() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String detail="�ű�ȸ�� ���� 10�� ���ҽ��ϴ�.";
		request.setAttribute("message",detail);
		RequestDispatcher rd=request.getRequestDispatcher("/Member/signIn.jsp");
		rd.forward(request,response);
// forward�� redirect�� ����
// forward : �ּҰ� �ٲ��� ����, �������� �����͸� �ѱ� �� ���� - ���� ���̴� ����
// redirect : �ּҰ� �ٲ�, ������ �̵��� ����(�������� �����͸� �ѱ� �� ����) - �� ������ �ʴ� ����
// ����ڰ� ���� �������� html���븸 �ʿ��ϰų� ������ �����Ͱ� ���ٸ� redirect�� ���
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		// �Է��� ���̵�� ��й�ȣ�� ��������
		String id=request.getParameter("id");
		String pw=request.getParameter("pw");
		if(id.equals("gold")&&pw.equals("1234")) {
			// id gold, pw 1234�� �α��� ����
			// session�� �ǵ������� �ʿ䰡 ����(doPost, doGet�� �ǵ������� ���뵵 ����) �׷��� �� ��쿣 sendRedirect�� ���
			response.sendRedirect("/");
		}else {
			// �α��� ����
			request.setAttribute("fail","���̵� �Ǵ� ��й�ȣ�� �߸� �Է��ϼ̽��ϴ�.");
			RequestDispatcher rd=request.getRequestDispatcher("main.jsp");
			rd.forward(request, response);
		}
	}
}
