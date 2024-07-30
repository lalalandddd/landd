package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.MemberJoin;

/**
 * Servlet implementation class MainControl
 */
@WebServlet("/main")
public class MainControl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MainControl() {
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
		doMethod(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doMethod(request,response);
	}
	protected void doMethod(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");  // 요청 시 입력값 인코딩
		String uri=request.getRequestURI();  // 사용자가 요청한 주소
		// URI = /signUp.do
		String cmd=uri.substring(uri.lastIndexOf("/")+1);
		// cmd = signUp.do
		String view="/";  // 사용자가 보는 뷰 페이지
		if(cmd.equals("signUp.do")) {  // 회원가입
			MemberJoin save=new MemberJoin();
			save.join(request, response);
			view="Member/signUp.html";
		}else if(cmd.equals("signIn.do")) {  // 로그인
			view="Member/signIn.jsp";
		}else if(cmd.equals("board.do")) {  // 게시판
			view="./board.jsp";
		}
		RequestDispatcher rd=request.getRequestDispatcher(view);
		rd.forward(request, response);
	}
}