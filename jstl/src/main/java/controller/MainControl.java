package controller;

import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.ResourceBundle;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.MainActive;
import service.MemberJoin;

/**
 * Servlet implementation class MainControl
 */
@WebServlet("/MainControl")
public class MainControl extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private HashMap<String , MainActive> map = new HashMap<>();
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
		ResourceBundle rb=ResourceBundle.getBundle("class_bundle/mainProp");
		Enumeration key=rb.getKeys();
		while(key.hasMoreElements()) {
			String k=(String)key.nextElement();  // signUp.do, signIn.do ....
			String value=rb.getString(k);  // service.MemberJoin
			// 프로퍼티즈에서 키와 밸류를 가져와서 맵에 저장해야 한다.
			try {
				Class<?> hcl=Class.forName(value);
				MainActive his=(MainActive)hcl.newInstance();
				map.put(k,his);
			}catch(Exception e) {
				System.out.println("mainProp 파일 Map 변환 실패");
			}
		}
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
		request.setCharacterEncoding("UTF-8");  // 요청 시 입력값 한글 인코딩
		String uri=request.getRequestURI();  // 사용자가 요청한 주소
		// URI = /signUp.do
		String cmd=uri.substring(uri.lastIndexOf("/")+1);
		// cmd = signUp.do
		String view="/";  // 사용자가 보는 뷰 페이지

		MainActive target=map.get(cmd);  // 요청 주소에 맞는 클래스 객체 가져오기
		view=target.action(request,response);
// forward와 sendRedirect는 하나가 작동하면 다른 하나는 무조건 없어야 한다.
// sendRedirect가 작동할 경우 view값은 null이다.
		if(view!=null) {
			RequestDispatcher rd=request.getRequestDispatcher(view);
			rd.forward(request, response);
		}
	}
}
/*
		if(cmd.equals("signUp.do")) {  // 회원가입
			if(request.getMethod().equals("POST")) {
				MemberJoin save=new MemberJoin();
				save.join(request, response);
			}else {
				view="Member/signUp.html";
			}
		}else if(cmd.equals("signIn.do")) {  // 로그인
			view="Member/signIn.jsp";
		}else if(cmd.equals("board.do")) {  // 게시판
			view="./board.jsp";
		}
		//RequestDispatcher rd=request.getRequestDispatcher(view);
		//rd.forward(request, response);
	}
}
*/