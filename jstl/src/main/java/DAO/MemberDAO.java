package DAO;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import DTO.MemberDTO;

public class MemberDAO extends DBConnect{  // 회원 관련 데이터베이스 작업 하는 클래스
	public boolean login(String id, String pw) {
		String sql="select * from studysite_member where user_id=? and user_password=?";   // 비교 부분까지 절약 가능
		try {
			pt=conn.prepareStatement(sql);
			pt.setString(1, id);
			pt.setString(2, pw);
			rs=pt.executeQuery();  // 사용자가 입력한 아이디와 비번이 존재한다면 값이 있다. 일치하지 않으면 아무 값도 없다.
			if(rs.next()) {  // rs 값 다음에 뭔가 있다(아이디 비번 존재)면 true, 없으면 false
				return true;
			}
		}catch(SQLException e) {
			System.out.println("회원 로그인 조회 중 오류 발생");
		}
		return false;
		//System.out.println("아이디 또는 비밀번호가 잘못되었습니다");
	}
	public void save(MemberDTO member) {  // 회원가입 내용을 DB(studysite_member 테이블)에 저장
		String sql="insert into studysite_member(user_id, user_password, user_email, user_name) value(?,?,?,?)";
		try {
			pt=conn.prepareStatement(sql);
			pt.setString(1, member.getUserId());
			pt.setString(2, member.getUserPassword());
			pt.setString(3, member.getUserEmail());
			pt.setString(4, member.getUserName());
			pt.executeUpdate();
			//System.out.println("회원 가입을 축하합니다!");
		}catch(SQLException e) {
			System.out.println("회원가입 member 테이블 저장 실패");
			e.printStackTrace();
		}
	}
	public List<String> findAllUserId(){  // 회원가입 된 전체 아이디 조회
		String sql="select user_id from studysite_member";
		List<String> list=new ArrayList<>();
		try {
			pt=conn.prepareStatement(sql);
			rs=pt.executeQuery();
			while(rs.next()) {
				list.add(rs.getString("user_id"));
			}
		}catch(SQLException e){
			System.out.println("전체 아이디 조회 실패");
			e.printStackTrace();
		}
		return list;
	}
}
