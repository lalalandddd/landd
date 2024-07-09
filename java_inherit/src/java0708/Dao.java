package java0708;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Dao {
	
	private Connection conn;  // �����ͺ��̽� ���� ������ü�� ������ ����
	private Statement st;  // sql���� �����Ͽ� �����ͺ��̽��� ��ȣ �ۿ��� ���� ����(java.sql�� import!!)
	private ResultSet rs;  // �����ͺ��̽� select(��ȸ) ����� �ޱ� ���� ����
	private PreparedStatement pt;
	
// �����ͺ��̽� ���� ����
// �����ͺ��̽��� �ڷḦ �����Ϸ��� ����Ǵ� ��ΰ� �����־�� �Ѵ�.
// ��) PC�� �����͸� �����Ϸ��� ����̹��� ��ƾ� �Ѵ�.
// ����̹��� ���� �� ������ ����̹��� ���� ���ؿ;� �Ѵ�.
	Dao(){
		DriverInit();
		Connect();
	}
	// MySQL�� java�� ������ driver �ε�
	private void  DriverInit() {
		try {  // try catch : �۾� ���� �� �۵� �׸� �� ������ �־�� ������ �������.
		Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(Exception e) {
			System.out.println("����̹� �ε� ����");
		}
	}
	// MySQL�� ���� ����
	private void Connect() {
		String user="ry0606";  // MySQL�� ������� ������
		String password="123456";  // MySQL�� ������� ��й�ȣ
		String url="jdbc:mysql://localhost:3306/ry0606";  // MySQL�� ������� host �ּ�
		try {
			conn=DriverManager.getConnection(url,user,password);  // Connection�� import�� ��!!
		}catch(Exception e) {
			System.out.println("�α��� ����");
		}  // DriverNanager�� import�� ��!!
	}
//	public void insert(Member m) {  // �� ���� �Ƿ��� ���, ���Ȼ� ����Ͽ�(���� ���ɼ�) Statement�� �������� ����
//		String sql="insert into test_member(name,kor,eng,mat,total,"+ "std_avg) values('"+m.getName()+"',"+m.getKor()+","+m.getEng()+","+m.getMat()+","+m.getTotal()+","+m.getStd_avg()+")";
//		try {
//			st=conn.createStatement();  // Statement ��ü ����
//			st.executeUpdate(sql);  // sql���� �����ͺ��̽��� ����
//		}catch(Exception e) {
//			System.out.println("������ ���� ����");
//		}
//	}
	public void insert(Member m) {  // PreparedStatement ���
		String sql="insert into test_member(name,kor,eng,mat,total,std_avg) values(?,?,?,?,?,?)";  // ?�� �翬�� ������ �� ��ŭ
		try {
			pt=conn.prepareStatement(sql);
			pt.setString(1, m.getName());
			pt.setInt(2, m.getKor());
			pt.setInt(3, m.getEng());
			pt.setInt(4, m.getMat());
			pt.setInt(5, m.getTotal());
			pt.setInt(6, m.getStd_avg());
			pt.executeUpdate();
		}catch(Exception e) {
			System.out.println("������ ���� ����");
		}
	}
	public Member[] select() {  // ��ȯ���� �����Ƿ� void ���� �� �ȴ�.
		Member[] list=null;
		String sql="select count(*) as cnt from test_member";
		try {  // �̹��� �����Ͱ� �����Ƿ� Statement�� �ᵵ ���� ����.
			int size=0;  // �������� ���� �����
			st=conn.createStatement();
			rs=st.executeQuery(sql);
			if(rs.next()) {
			// rs�� ���� ���� ���� �ٿ� �����Ͱ� �ִ��� Ȯ���ؼ� �ִٸ� ����, ���ٸ�(null) ���� �����ȴ�.
			// ù ��° ���� �����Ͱ� ���� ������ .next()�� �־�߸� �Ѵ�.
				size=rs.getInt("cnt");  // �����ͺ��̽��� �����Ͱ� �� �� ��?
			}
			if(size!=0) {
				list=new Member[size];
				int i=0;
				sql="select * from test_member";  // ��ü ������ ��ȸ ������(sql ���ǹ�)
				rs=st.executeQuery(sql);
				while(rs.next()) {  // ��ȸ ����� �ϳ��� ��ȸ
					list[i]=new Member(rs.getInt("member_id"),rs.getString("name"),rs.getInt("kor"),rs.getInt("eng"),rs.getInt("mat"),rs.getInt("total"),rs.getInt("std_avg"));
					i++;
				}
			}
		}catch(Exception e) {
			System.out.print("������ ��ȸ ����");
		}
		return list;
	}
}
