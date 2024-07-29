<%@ page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- index.jsp --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- core 태그 변수 --%>
<c:set var="num" value="10" />
${num }
${num+20 }
<c:set var="num" value="300" scope="session" />
${num }
${sessionScope.num }

<%-- core 태그 if 조건문(거짓else문은 없다) --%>
<c:if test="${num>5}">
${num }은 5보다 크다.
</c:if>
<c:if test="${num>100}">
${num }은 100보다 크다.
</c:if>

<%-- core 태그 choose 조건문 --%>
<c:choose>
	<c:when test="${num>5}">
		<h3>${num }은 5보다 크다</h3>
	</c:when>
	<c:when test="${num>8}">
		<h1>${num }은 8보다 크다</h1>
	</c:when>
	<c:when test="${num>100}">
		<h1>${num }은 100보다 크다</h1>
	</c:when>
	<c:otherwise>
		나는 위의 모든 when이 거짓일 때 실행된다.
	</c:otherwise>
</c:choose>

<%-- core 태그 forEach 반복문(모든 데이터 가능) --%>
<c:forEach begin="1" end="3" step="1">
	내가 반복된다.<br>
</c:forEach>

<%
ArrayList<String> list=new ArrayList<>();
list.add("강감찬"); list.add("이순신"); list.add("장보고"); list.add("양만춘");
request.setAttribute("list",list);
pageContext.setAttribute("list",list);
session.setAttribute("list",list);
application.setAttribute("list",list);
%>
<c:forEach var="name" items="${list}">
	${name }
</c:forEach>

<%-- core 태그 forTokens 반복문(문자열 데이터만 다룰 수 있음) --%>
<c:forTokens items="${'포도@딸기@수박@참외@토마토' }" var="fruit" delims="@">
	${fruit }
</c:forTokens>
<c:forTokens items="${'검-창-망치-도끼-폴암' }" var="fruit" delims="-">
	${fruit }
</c:forTokens>

<%--
웹 모델 1 : client 요청 > 서버 > 컨테이너 > 서블릿 실행 > 페이지 처리 > 컨테이너 > 서버 > client
웹 모델 2(MVC 디자인 패턴) : client 요청 > 서버 > 컨테이너 > (요청에 맞는 만들어둔) 서블릿 실행 > 서비스 > (데이터베이스가 필요하면 DAO, DTO 동작) > 서블릿 > 컨테이너 > 서버 > client
M : model - service, DAO, DTO
V : view - html, jsp 페이지(사용자 브라우저에 표시되는 부분)
C : controller - 사용자의 요청을 어떻게 처리할지 결정
DAO : Data Access Object - 데이터 접근 클래스 (스프링에서 더 세분화 예정)
DTO : Data Transfer Object - 데이터 저장 클래스 (스프링에서 더 세분화 예정)
--%>
<%--
회원가입을 위해 아이디, 비번, 이름, 주소, 연락처 등을 입력하고 가입 버튼을 클릭! 한다면?
1. 가입요청을 Controller(서블릿)가 받는다.
2. 가입요청을 처리해줄 service를 실행한다.
3. service에서 데이터베이스에 저장하기 위해 DAO를 실행한다.
4. DAO 실행이 끝나면 가입 완료 페이지를 Controller에게 보낸다.
5. Controller은 가입 완료 페이지를 사용자에게 보낸다.
사용자가 로그인을 한다. (아이디 입력, 비번 입력, 로그인 버튼 클릭!)
1. 로그인 요청을 Controller가 받는다.
2. 로그인 처리를 할 수 있는 service를 실행한다.
3. service에서 데이터베이스 작업을 수행하는 DAO를 실행한다.
4. DAO 실행 결과 아이디와 비번이 일치하면 service에서 세션 생성, 일치하지 않으면 로그인 실패를 Controller에게 보낸다.
5. Controller은 로그인 성공 유무에 따른 service의 결과를 사용자에게 보낸다.
--%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>