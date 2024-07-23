<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- lunch.jsp --%>
<%--
점심 메뉴는?
class : Lunch
인스턴스변수 : menu(점심메뉴이름), price(가격), restaurant(식당 이름)
브라우저를 통해 입력하고 자바빈 객체에 저장한 후 출력하세요
--%>
<% request.setCharacterEncoding("utf-8"); %>
<jsp:useBean id="lunch" class="test.Lunch" scope="application" />
<jsp:setProperty name="lunch" property="menu" />
<jsp:setProperty name="lunch" property="price" />
<jsp:setProperty name="lunch" property="restaurant" />
<jsp:getProperty name="lunch" property="menu" />
<jsp:getProperty name="lunch" property="price" />
<jsp:getProperty name="lunch" property="restaurant" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>