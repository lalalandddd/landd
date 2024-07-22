<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- test3.jsp --%>
<%! // jsp스크립트 - 선언문
	class Worker{
		String name;
		String job;
		Worker(String name, String job){
			this.name=name;
			this.job=job;
		}
		@Override
		public String toString(){
			return name+" , "+job;
		}
	}
%>
<%//jsp스크립트 - 스크립트릿
	Worker[] work=new Worker[]{
		new Worker("이순신", "군인"), new Worker("문익점", "식물학자"), new Worker("김춘추", "정치인"), 
		new Worker("최무선", "연구원"), new Worker("장영실", "발명가"), new Worker("정약전", "집필가")
	};
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>명단</h2>
	<%
	for(int i=0;i<work.length;i++){
	%>
		<div><%=work[i] %></div>
	<%
	}
	%>
<%-- 문제 : 반복문을 사용하여 1부터 10까지 출력하세요 --%>
	<u> 1~10까지 출력</u>
	<%for(int i=1;i<11;i++){ // 이 방식을 반드시 외우자%>
		<div><%=i %></div>
	<%} %>
	<%for(int i=1;i<11;i++){out.println("<div>"+i+"</div>");} // 이건 안 될 수도 있으므로 패스}%>
</body>
</html>