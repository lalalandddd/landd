package java0708;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Dao {
	
	private Connection conn;  // 데이터베이스 접속 정보객체를 저장할 변수
	private Statement st;  // sql문을 실행하여 데이터베이스와 상호 작용을 위한 변수(java.sql로 import!!)
	private ResultSet rs;  // 데이터베이스 select(조회) 결과를 받기 위한 변수
	private PreparedStatement pt;
	
// 데이터베이스 접근 축약어
// 데이터베이스에 자료를 저장하려면 연결되는 통로가 열려있어야 한다.
// 예) PC와 프린터를 연결하려면 드라이버를 깔아야 한다.
// 드라이버가 있을 리 없으니 드라이버를 직접 구해와야 한다.
	Dao(){
		DriverInit();
		Connect();
	}
	// MySQL과 java를 연결할 driver 로드
	private void  DriverInit() {
		try {  // try catch : 작업 실패 시 작동 항목 이 문구가 있어야 오류가 사라진다.
		Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(Exception e) {
			System.out.println("드라이버 로드 실패");
		}
	}
	// MySQL에 계정 접속
	private void Connect() {
		String user="ry0606";  // MySQL에 만들었던 계정명
		String password="123456";  // MySQL에 만들었던 비밀번호
		String url="jdbc:mysql://localhost:3306/ry0606";  // MySQL에 만들었던 host 주소
		try {
			conn=DriverManager.getConnection(url,user,password);  // Connection을 import할 것!!
		}catch(Exception e) {
			System.out.println("로그인 실패");
		}  // DriverNanager를 import할 것!!
	}
//	public void insert(Member m) {  // 단 정부 의뢰의 경우, 보안상 취약하여(변조 가능성) Statement를 권장하지 않음
//		String sql="insert into test_member(name,kor,eng,mat,total,"+ "std_avg) values('"+m.getName()+"',"+m.getKor()+","+m.getEng()+","+m.getMat()+","+m.getTotal()+","+m.getStd_avg()+")";
//		try {
//			st=conn.createStatement();  // Statement 객체 생성
//			st.executeUpdate(sql);  // sql문을 데이터베이스에 전달
//		}catch(Exception e) {
//			System.out.println("데이터 저장 실패");
//		}
//	}
	public void insert(Member m) {  // PreparedStatement 사용
		String sql="insert into test_member(name,kor,eng,mat,total,std_avg) values(?,?,?,?,?,?)";  // ?는 당연히 데이터 수 만큼
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
			System.out.println("데이터 저장 실패");
		}
	}
	public Member[] select() {  // 반환값이 있으므로 void 쓰면 안 된다.
		Member[] list=null;
		String sql="select count(*) as cnt from test_member";
		try {  // 이번엔 데이터가 없으므로 Statement를 써도 문제 없다.
			int size=0;  // 데이터의 갯수 저장용
			st=conn.createStatement();
			rs=st.executeQuery(sql);
			if(rs.next()) {
			// rs는 현재 열의 다음 줄에 데이터가 있는지 확인해서 있다면 실행, 없다면(null) 실행 중지된다.
			// 첫 번째 열은 데이터가 없기 때문에 .next()가 있어야만 한다.
				size=rs.getInt("cnt");  // 데이터베이스에 데이터가 총 몇 개?
			}
			if(size!=0) {
				list=new Member[size];
				int i=0;
				sql="select * from test_member";  // 전체 데이터 조회 쿼리문(sql 질의문)
				rs=st.executeQuery(sql);
				while(rs.next()) {  // 조회 결과를 하나씩 순회
					list[i]=new Member(rs.getInt("member_id"),rs.getString("name"),rs.getInt("kor"),rs.getInt("eng"),rs.getInt("mat"),rs.getInt("total"),rs.getInt("std_avg"));
					i++;
				}
			}
		}catch(Exception e) {
			System.out.print("데이터 조회 실패");
		}
		return list;
	}
}
