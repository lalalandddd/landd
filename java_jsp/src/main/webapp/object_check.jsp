<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- object_check.jsp --%>
request 객체 -> name1 : <%= request.getAttribute("name1") %><br>
request 객체 -> age1 : <%= request.getAttribute("age1") %><br>
request 객체 -> job1 : <%= request.getAttribute("job1") %><br>
session 객체 -> name2 : <%= session.getAttribute("name2") %><br>
session 객체 -> age2 : <%= session.getAttribute("age2") %><br>
session 객체 -> job2 : <%= session.getAttribute("job2") %><br>
application 객체 -> name3 : <%= application.getAttribute("name3") %><br>
application 객체 -> age3 : <%= application.getAttribute("age3") %><br>
application 객체 -> job3 : <%= application.getAttribute("job3") %>