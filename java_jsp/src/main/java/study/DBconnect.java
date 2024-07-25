package study;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBconnect {
	public Connection conn;
	public PreparedStatement pt;
	public ResultSet rs;
	public DBconnect() {
		dblink();
	}
	private void dblink() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(Exception e) {
			System.out.println("드라이버 로드 실패");
		}
		String user="ry0606";  // 계정명
		String password="123456";  // 비밀번호
		String url="jdbc:mysql://localhost:3306/ry0606";  // host 주소
		try {
			conn=DriverManager.getConnection(url,user,password);
		}catch(SQLException e) {
			System.out.println("데이터베이스 접속 실패");
		}
	}
//	public void close() {
//		try {
//			if(pt!=null)pt.close();
//			if(conn!=null)conn.close();
//		}catch(SQLException e) {
//			e.printStackTrace();
//		}
//	}
}