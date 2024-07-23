<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- create.jsp --%>
<% 
request.setAttribute("name1","장보고");
request.setAttribute("age1",34);
request.setAttribute("job1","군인");
session.setAttribute("name2","문익점");
session.setAttribute("age2",25);
session.setAttribute("job2","학자");
application.setAttribute("name3","세종");
application.setAttribute("age3",17);
application.setAttribute("job3","임금");
%>
<h2> 객체 속성 저장 </h2>
request 객체 -> name1 : <%= request.getAttribute("name1") %><br>
request 객체 -> age1 : <%= request.getAttribute("age1") %><br>
request 객체 -> job1 : <%= request.getAttribute("job1") %><br>
session 객체 -> name2 : <%= session.getAttribute("name2") %><br>
session 객체 -> age2 : <%= session.getAttribute("age2") %><br>
session 객체 -> job2 : <%= session.getAttribute("job2") %><br>
application 객체 -> name3 : <%= application.getAttribute("name3") %><br>
application 객체 -> age3 : <%= application.getAttribute("age3") %><br>
application 객체 -> job3 : <%= application.getAttribute("job3") %>
<a href="object_check.jsp"> 이동 </a>