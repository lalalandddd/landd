<%@page import="java.util.Scanner"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- test2.jsp --%>
<%--
JSP 스크립트
	- JSP 스크립트릿 : <% %> 자바 로직 코드를 작성(일반적인 코드 작성) / 메서드, 클랫 정의 안 됨
	- 선언문 : <%! %> 자바 변수 선언 또는 메서드, 클래스 정의할 때 / if문, for문 안 됨
	- 표현문 : <%= %> 결과값 출력 / if문, for문, 변수 선언, 클래스 정의, 메서드 정의 모두 안 됨
--%>
<%!
int age=20;  // 변수 선언
String name="이순신";  // 변수 선언
int sum(int a, int b){  // 메서드 정의
	return a+b;
}
class mem{  // 클래스 정의
	String userName;
}
// if문 for문 계산 등등 넣으면 바로 오류 발생
// sum(10,20);
//Scanner scan=new Scanner(System.in);  // 브라우저 입력 방식이므로 웹에서 이 문구를 쓰면 안 된다.
%>
<% // 스크립트릿
sum(10,20);  // 메서드 호출 가능
if(age>15){  // if문, for문, 계산 등등 가능
	
}
String job="군인";  // 변수 선언 가능
// void print(){  // 메서드, 클래스 정의 안됨
//	out.println(job);
// }
//int num=scan.nextInt();
%>
<%=100 %>
<%="<br>이순신<br>" %>
<%=10>5?"크다":"작다" %>
<%=sum(10,20) %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>