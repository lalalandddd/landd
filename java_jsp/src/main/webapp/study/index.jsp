<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- index.jsp --%>
<%
String part=request.getParameter("part");
if(part==null) part="main";
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="default.css">
<link rel="stylesheet" href="<%=part %>.css">
</head>
<body>
	<div id="wrap">
		<jsp:include page="header.jsp"/>
		<div id="main">
<%-- part+".jsp" 방식으로 페이지 로드,"<%=part %>.css" 방식으로 css 적용하는 방법을 익혀두자... --%>
			<% String subpage=part+".jsp"; %>
			<jsp:include page="<%=subpage %>"/>
		</div>
		<jsp:include page="footer.jsp"/>
	</div>
</body>
</html>