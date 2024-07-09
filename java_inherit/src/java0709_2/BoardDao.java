package java0709_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class BoardDao {
// Connection, Statement, ResultSet, PreparedStatement 참조변수 필요
	private Connection conn;
	private Statement st;
	private ResultSet rs;
	private PreparedStatement pt;
	BoardDao(){
		DriverLoad();
		Connect();
	}
	public Board[] findByAll() {
		Board[] list=new Board[7];  // Board class 객체 7개 저장용 배열
		String sql="select * from test_board";  // sql질의문, 쿼리문
		try {
			st=conn.createStatement();  // statement생성
			rs=st.executeQuery(sql);
			int i=0;
			while(rs.next()) {
				list[i]=new Board(rs.getInt("board_id"),rs.getString("title"),rs.getString("writer"),rs.getString("content"),rs.getInt("hit"));
				i++;
			}
		}catch(Exception e) {
			System.out.println("데이터 로드 실패");
		}
		return list;
	}
	// 데이터베이스와 연결하기 위한 드라이버 로드
	// 5버전 이후:com.mysql.cj.jdbc.Driver / 5버전 이전:com.mysql.jdbc.Driver
	private void DriverLoad() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(Exception e) {
			System.out.println("드라이버 로드 실패");
		}
	}
	private void Connect() {
		String user="ry0606";
		String password="123456";
		String url="jdbc:mysql://localhost:3306/ry0606";
		try {
			conn=DriverManager.getConnection(url,user,password);
		}catch(Exception e) {
			System.out.println("로그인 실패");
		}
	}
}
