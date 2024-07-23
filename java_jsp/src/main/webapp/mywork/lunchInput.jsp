<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%-- lunchInput.jsp --%>
	<h3> 점심 메뉴 정보 입력 </h3>
	<form method="post" action="lunch.jsp">
		점심 메뉴 : <input type="text" name="menu"><br>
		가격 : <input type="number" name="price"><br>
		식당 이름 : <input type="text" name="restaurant"><br>
		<button>등록</button>
	</form>
</body>
</html>