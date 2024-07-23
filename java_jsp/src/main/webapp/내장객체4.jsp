<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- 내장객체1.jsp --%>
<%--
config - 서버의 구성정보를 가지고 있는 객체, 서블릿의 구성 정보
  - Servlet : 웹 애플리케이션(tomcat 프로그램)의 구성요소 중 하나. 동적인 페이지를 생성하고 관리하는 자바 클래스
--%>
<% out.println("서블릿 이름 : "+config.getServletName());
out.println("서블릿 파라미터 : "+config.getInitParameter("id"));
config.getServletContext();  // 서버 전체의 파라미터... 즉 페이지가 바뀌어도 사용 가능
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