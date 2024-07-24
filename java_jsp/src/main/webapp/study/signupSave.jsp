<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page import="java.sql.DriverManager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- signupSave.jsp --%>
<%--
회원가입을 위해 입력값을 Member 클래스 객체로 저장하고
객체의 데이터를 데이터베이스에 저장한다.
--%>
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

}catch(SQLException e) {
System.out.println("데이터베이스 접속 실패");
}
%>