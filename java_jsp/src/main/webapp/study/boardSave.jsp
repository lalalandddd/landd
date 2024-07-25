<%@ page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="study.*" %>
<%-- boardSave.jsp --%>
<%
request.setCharacterEncoding("UTF-8");
// 작성자 가져오기(로그인 세선 안에서 가져오기)
String writer=((Member)session.getAttribute("user")).getUserId();
// 데이터베이스 사용
DBconnect db=new DBconnect();
//Connection conn=null;
// PreparedStatement pt=null;
// db.pt=db.conn.prepareStatement(sql);  처럼 사용하면 된다...
%>
<%
String title=request.getParameter("title");
String content=request.getParameter("content");
String sql="insert into studysite_board (title,writer,content) values (?,?,?)";
try{
	db.pt=db.conn.prepareStatement(sql);
	db.pt.setString(1,title);
	db.pt.setString(2,writer);
	db.pt.setString(3,content);
	db.pt.executeUpdate();
	out.println("게시물이 저장되었습니다.");
}catch(SQLException e){
	e.printStackTrace();
	out.println("데이터베이스에 오류 발생"+e.getMessage());
}
response.sendRedirect("/java_jsp/study/?part=board");
%>