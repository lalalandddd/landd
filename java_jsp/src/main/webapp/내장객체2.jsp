<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- 내장객체2.jsp --%>
<%--
response : 사용자 요청에 대한 응답을 위한 객체(요청의 대부분은 새 페이지이다. 사용자가 원하는 페이지를 제공한다.)
  - sendRedirect : 페이지 (강제)이동을 위한 메서드 (DB에 저장하고 다음 페이지로 이동해야 할 때)
  - 내일은 쿠키, 세션......
--%>
<%
	int num=20;
	if(num>20){
		response.sendRedirect("requestTest2.jsp");
	}else{
		out.println("20보다 작거나 같다.");
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>