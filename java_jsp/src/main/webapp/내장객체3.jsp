<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- 내장객체3.jsp --%>
<%--
page, pageContext
--%>
<%
out.print("print 출력");
out.newLine();
out.println("println 출력");

// page == this
String name="둘리";
pageContext.getRequest().getParameter(name);  // 페이지에 이름 저장
pageContext.setAttribute("age",25);  // 페이지에 age 속성 부여하고 25 저장
//pageContext.include("requestTest2.jsp");
// == <%@ include file="경로" 다른 파일의 내용을 추가해서 보여줄 수 있음
//pageContext.forward("내장객체1.jsp");
// 앞에 무었이 있든(include 제외) 무조건 ()안의 내용만 보여줌
// include와 forward는 액션태그로 사용할 예정 ( <jsp:include page="파일명"/> <jsp:forward page="파일명"/> )
%>
<jsp:include page="requestTest2.jsp"/>
<jsp:forward page="내장객체1.jsp"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%= pageContext.getAttribute("age") %>
</body>
</html>