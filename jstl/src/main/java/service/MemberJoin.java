package service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MemberJoin {
	public void join(HttpServletRequest req,HttpServletResponse res) {
// 회원가입 때 적은 내용을 가져와서 처리하는 곳 - 입력값을 데이터베이스에 저장해야 한다. (아이디, 비번, 이메일, 이름)
// 데이터베이스에 저장하는 건 서블렛이 아니라 서비스가 한다.
// 근데 데이터베이스 관련 작업은 서비스가 아니라 DAO가 한다.
		String id=req.getParameter("userId");
		String pw=req.getParameter("userPassword");
		String email=req.getParameter("userEmail");
		String name=req.getParameter("userName");
		
	}

}
