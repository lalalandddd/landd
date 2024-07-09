package java0709_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class BoardDao {
// Connection, Statement, ResultSet, PreparedStatement �������� �ʿ�
	private Connection conn;
	private Statement st;
	private ResultSet rs;
	private PreparedStatement pt;
	BoardDao(){
		DriverLoad();
		Connect();
	}
	public Board[] findByAll() {
		Board[] list=new Board[7];  // Board class ��ü 7�� ����� �迭
		String sql="select * from test_board";  // sql���ǹ�, ������
		try {
			st=conn.createStatement();  // statement����
			rs=st.executeQuery(sql);
			int i=0;
			while(rs.next()) {
				list[i]=new Board(rs.getInt("board_id"),rs.getString("title"),rs.getString("writer"),rs.getString("content"),rs.getInt("hit"));
				i++;
			}
		}catch(Exception e) {
			System.out.println("������ �ε� ����");
		}
		return list;
	}
	// �����ͺ��̽��� �����ϱ� ���� ����̹� �ε�
	// 5���� ����:com.mysql.cj.jdbc.Driver / 5���� ����:com.mysql.jdbc.Driver
	private void DriverLoad() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(Exception e) {
			System.out.println("����̹� �ε� ����");
		}
	}
	private void Connect() {
		String user="ry0606";
		String password="123456";
		String url="jdbc:mysql://localhost:3306/ry0606";
		try {
			conn=DriverManager.getConnection(url,user,password);
		}catch(Exception e) {
			System.out.println("�α��� ����");
		}
	}
}
