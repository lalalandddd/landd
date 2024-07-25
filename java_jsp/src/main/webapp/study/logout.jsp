<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- logout.jsp --%>
<%
session.removeAttribute("user");
response.sendRedirect("/java_jsp/study");
%>