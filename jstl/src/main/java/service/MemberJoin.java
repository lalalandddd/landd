package service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MemberJoin {
	public void join(HttpServletRequest req,HttpServletResponse res) {
// ȸ������ �� ���� ������ �����ͼ� ó���ϴ� �� - �Է°��� �����ͺ��̽��� �����ؾ� �Ѵ�. (���̵�, ���, �̸���, �̸�)
// �����ͺ��̽��� �����ϴ� �� ������ �ƴ϶� ���񽺰� �Ѵ�.
// �ٵ� �����ͺ��̽� ���� �۾��� ���񽺰� �ƴ϶� DAO�� �Ѵ�.
		String id=req.getParameter("userId");
		String pw=req.getParameter("userPassword");
		String email=req.getParameter("userEmail");
		String name=req.getParameter("userName");
		
	}

}
