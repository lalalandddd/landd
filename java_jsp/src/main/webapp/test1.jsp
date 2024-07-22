<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage="error.jsp" buffer="10kb" autoFlush="false"
    %>
<%
// include 동작 전
String name="이순신";
out.println(name);
%>
<%@ include file="menu.jsp" %>
<%
	out.println("테스트");
	// int num 10/0;
%>
<%--
JSP 주석 - 사용자 브라우저에서는 확인되지 않는다. 서버 컴퓨터에서만 동작하는 부분이기 때문에 사용자에게 노출되지 않는다.
웹 흐름
	- 같은 페이지여도 java 먼저 실행 후, http, css, js를 실행한다.
	- 서버컴퓨터 : 서비스를 제공하는 컴퓨터.
	- 클라이언트가 주소에 의한 요청을 하면 서버컴퓨터는 요청에 대해 응답을 한다.
	- 1. 페이지를 보기 위해 해당 페이지에 대한 주소를 요청하면
	- 2. 서버는 해당 페이지를 찾아서 페이지 내부의 서버언어(JAVA)를 실행시키고
	- 3. 클라이언트 언어(HTML, CSS, JS) 부분을 클라이언트에게 전송한다.

jsp 확장자 파일을 만들면 제일 위에 구문이 생성되는데...
	- <%@ : JSP 지시어  스크립트 작성 부분
	- 지시어는 해당 jsp 페이지의 설정을 하기 위한 부분이다.
	  > page : jsp 페이지의 속성을 지정하는 역할
		>> language : 페이지에서 사용할 언어셋 설정 (기본 세팅)
		>> contentType : 페이지의 문서 타입 지정 (기본 세팅)
		>> pageEncoding : 현재 페이지의 인코딩 타입 지정 (기본 세팅)
		>> import : 다른 패키지의 클래스나 메서드를 추가(여기선 직접 다 쳐야 함, 문자열"") (필요하면 지정)
			import="java.util.ArrayList, java.util.LinkedList" (,로 두개 적용-여러 개 적용 가능)
		>> session : 세션 사용 여부를 지정(기본은 true) (지정할 필요 없음)
		>> isErrorPage : true면 현재 페이지를 에러 페이지로 지정(기본은 false)  다른 방법이 있음
		>> errorPage : 현재 페이지에서 에러 발생 시 사용될 페이지 지정(클라이언트 브라우저에 서버언어(JAVA)가 노출되면 안 된다.)
			errorPage="에러 시 보여줄 페이지"  (에러를 처리하는 방법 1/3)
		>> info : 페이지의 설명(주석 비스무리...)
		>> extends : 현재 페이지에 상속받을 클래스 지정
		>> buffer : jsp페이지의 출력 버퍼값 지정(기본 8kb)
		>> autoFlush : 출력버퍼가 초과되면 수행할 기능 지정
			true일 경우, 버퍼가 100%이면 내용을 화면에 출력
			false일 경우, IOException 발생 (예외 처리에서 throw를 하는 이유와 같이 기록(log)을 남겨두기 위해 사용하기도 한다.)
	  > include : 다른 JSP 페이지를 추가하기(현재 페이지 내용 포함) (이걸 잘 써야 java가 편해진다.)
	  	>> 다른 페이지의 java만 실행하고, 그 페이지의 html, css, js만 가져오는 방식으로 적용된다.
	  	>> 실행은 순차적으로 include 위 > include > include 아래 순서로 실행된다.
	  > tagLib : 태그라이브러리 태그를 사용할 경우에 사용
--%>
<%--  test1.jsp --%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>