<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- header.jsp --%>
<%
String select=request.getParameter("select");
%>
<%=select %>
<div id="header">
	<ul id="menuList">
		<li class="menu"><a href="mainPage.jsp">홈</a></li>
		<li class="menu"><a href="">소개</a></li>
		<li class="menu"><a href="">자유게시판</a></li>
		<li class="menu <%=select.equals("imageBoard")?"active":"" %>"><a href="mainPage.jsp?part=imageBoard">이미지게시판</a></li>
		<li class="menu"><a href="mainPage.jsp?part=notify">신고</a></li>
	</ul>
</div>