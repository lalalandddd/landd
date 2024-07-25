<%@ page import="java.sql.*"%>
<%@ page import="java.sql.SQLException"%>
<%@ page import="java.sql.PreparedStatement"%>
<%@ page import="java.sql.Connection"%>
<%@ page import="java.sql.DriverManager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- signupSave.jsp --%>
<%--
회원가입을 위해 입력값을 Member 클래스 객체로 저장하고
객체의 데이터를 데이터베이스에 저장한다.
--%>
<% request.setCharacterEncoding("utf-8"); %>
<jsp:useBean id="newMem" class="study.Member"/>
<jsp:setProperty property="*" name="newMem"/>
<% /*
newMem 객체의 데이터를 데이터베이스에 저장하려면
1. 데이터베이스 드라이버 로드
2. 데이터베이스 계정 접속
*/ %>
<%
try {
Class.forName("com.mysql.cj.jdbc.Driver");
}catch(Exception e) {
System.out.println("드라이버 로드 실패");
}

String user="ry0606";  // 계정명
String password="123456";  // 비밀번호
String url="jdbc:mysql://localhost:3306/ry0606";  // host 주소
Connection conn=null;
PreparedStatement pt=null;
try {
conn=DriverManager.getConnection(url,user,password);
}catch(SQLException e) {
System.out.println("데이터베이스 접속 실패");
}
/* 
1. member 테이블에 회원가입 입력한 값을 저장하기
2. 테이블에 저장하기
3. sql 쿼리문 작성하기
4. PreparedStatement 또는 Statement 객체 생성
5. 생성한 객체를 사용하여 쿼리문 전달
*/
String sql="insert into studysite_member(user_id, user_password, user_email, user_name) values(?,?,?,?)";
boolean isSuccess=true;  // 데이터 저장 성공 유무
try{
	pt=conn.prepareStatement(sql);
	pt.setString(1, newMem.getUserId());
	pt.setString(2, newMem.getUserPassword());
	pt.setString(3, newMem.getUserEmail());
	pt.setString(4, newMem.getUserName());
	pt.executeUpdate();
}catch(SQLException e){
	isSuccess=false;
	e.printStackTrace();
	System.out.println("member 테이블 저장 실패");
	out.println("<h1>회원가입 오류! 다시입력!</h1>"+
	"<a href='javascript:history.back();'>이전</a>");
	// 저장 실패 시 회원가입 페이지로 이동
	// response.sendRedirect("/java_jsp/study/?part=signup");
}
// 테이블 저장 성공 시 로그인 페이지로 이동
if(isSuccess){
	response.sendRedirect("/java_jsp/study/?part=signin");
}
%>