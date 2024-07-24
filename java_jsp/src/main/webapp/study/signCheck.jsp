<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- signCheck.jsp --%>
<% request.setCharacterEncoding("utf-8"); %>
<jsp:useBean id="signin" class="test.Signin" scope="application" />
<jsp:setProperty name="signin" property="userId" />
<jsp:setProperty name="signin" property="userPassword" />
<jsp:getProperty name="signin" property="userId" />
<jsp:getProperty name="signin" property="userPassword" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>