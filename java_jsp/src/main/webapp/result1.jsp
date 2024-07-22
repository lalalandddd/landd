<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- result1.jsp --%>
<%--
이름과 국어, 수학, 과학 성적을 받아서
평균이 90점 이상이면 참 잘했어요 출력
평균이 80점 이상이면 잘했어요 출력
평균이 70점 이상이면 노력해라 출력
나머지는 이게 점수야! 출력
--%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%--내가작성
<% String name=request.getParameter("name");
	int kor=Integer.parseInt(request.getParameter("kor"));
	int mat=Integer.parseInt(request.getParameter("mat"));
	int sic=Integer.parseInt(request.getParameter("sic"));
	int avg=(kor+mat+sic)/3; %>
	<div><%= name+" : "+avg+"점" %></div>
	<% if(avg>=90){ %>
	<div><%= "참 잘했어요" %></div>
	<% } else if(avg>=80){ %>
	<div><%= "잘했어요" %></div>
	<% } else if(avg>=70){ %>
	<div><%= "노력해라" %></div>
	<% } else { %>
	<div><%= "이게 점수야!" %></div>
	<% } %>
--%>
<%-- 선생님 작성 --%>
<%
	String name=request.getParameter("name");
	int kor=Integer.parseInt(request.getParameter("kor"));
	int mat=Integer.parseInt(request.getParameter("mat"));
	int sic=Integer.parseInt(request.getParameter("sic"));
	int avg=(kor+mat+sic)/3;
	String print="이름 : "+name+"<br>평균 : "+avg+"점<br>";
	if(avg>=90) print+=" 참 잘했어요";
	else if(avg>=80) print+=" 잘했어요";
	else if(avg>=70) print+=" 노력해라";
	else print+=" 이게 점수야!"; %>
	<%= print %>
<%@ include file="requestTest2.jsp" %>
</body>
</html>