<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- mainPage.jsp --%>
<%
	String part=request.getParameter("part");
	if(part!=null){  // part가 null이 아니면... 이게 먼저 충족되어야 아래의 조건을 비교할 수 있다.
		if(part.equals("notify") && session.getAttribute("user")==null){  // 신고메뉴 클릭했는데 로그인 상태가 아니다?
%>
			<jsp:forward page="login.jsp"/>
<%
		}
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="./main.css">
</head>
<body>
<%-- mainPage.jsp --%>
<div id="loginBox">
	<a href="login.jsp">로그인</a>
</div>
<h2> 내가 main이다!!! </h2>
<!-- 메뉴 표시 header.jsp -->
	<jsp:include page="header.jsp">
	<jsp:param value="<%=part %>" name="select" />
	</jsp:include>
<%-- 헤더에 리퀘스트로 저장되는 객체 --%>
	<div id="main">
		<% if(part==null){ %>
			첫 페이지 내용
		<% }else {
			part+=".jsp"; %>
			<jsp:include page="<%=part %>" />
		<% } %>
	</div>
<!-- footer.jsp 표시 -->
	<jsp:include page="footer.jsp"/>
</body>
</html>