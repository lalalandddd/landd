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
		String detail="신규회원 가입 10명 남았습니다.";
		request.setAttribute("message",detail);
		RequestDispatcher rd=request.getRequestDispatcher("/Member/signIn.jsp");
		rd.forward(request,response);
// forward와 redirect의 차이
// forward : 주소가 바뀌지 않음, 서버에서 데이터를 넘길 수 있음 - 자주 쓰이는 이유
// redirect : 주소가 바뀜, 페이지 이동이 전부(서버에서 데이터를 넘길 수 없음) - 잘 쓰이지 않는 이유
// 사용자가 보는 페이지에 html내용만 필요하거나 보여줄 데이터가 없다면 redirect를 사용
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		// 입력한 아이디와 비밀번호를 가져오기
		String id=request.getParameter("id");
		String pw=request.getParameter("pw");
		if(id.equals("gold")&&pw.equals("1234")) {
			// id gold, pw 1234면 로그인 성공
			// session은 되돌려보낼 필요가 없다(doPost, doGet에 되돌려보낼 내용도 없다) 그래서 이 경우엔 sendRedirect를 사용
			response.sendRedirect("/");
		}else {
			// 로그인 실패
			request.setAttribute("fail","아이디 또는 비밀번호를 잘못 입력하셨습니다.");
			RequestDispatcher rd=request.getRequestDispatcher("main.jsp");
			rd.forward(request, response);
		}
	}
}
