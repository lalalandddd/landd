<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- imageBoard.jsp --%>
<div id="imageBoard">
	<% for(int i=1;i<16;i++){ %>
	<img src="https://picsum.photos/300/350?random=<%=i%>">
	<% } %>
</div>