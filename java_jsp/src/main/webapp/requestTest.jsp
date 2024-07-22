<%@ page import="java.util.Arrays"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	String name=request.getParameter("myName");  // 숫자 입력해도 문자열 저장
	String today=request.getParameter("today");  // 날짜도 문자열로 저장
	String[] interest=request.getParameterValues("interest");
	String city=request.getParameter("city");
	%>
	<div> 이름 : <%=name %></div>
	<div> 날짜 : <%=today %></div>
	<div> 관심분야 : <%=Arrays.toString(interest) %></div>
	<div> 거주지 : <%=city %></div>
</body>
</html>