<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="/member">회원가입</a><br>
	<%-- 회원가입은 get방식 처리, 아래 로그인은 post 방식 처리 --%>
	<form method="post" action="/member">
		<input type="text" name="id" placeholder="아이디"><br>
		<input type="password" name="pw" placeholder="비밀번호"><br>
		<button>로그인</button>
	</form>
	<%-- <a href="/board.jsp">게시판</a><br>
	<a href="/inquiry">문의</a><br>  --%>
	<div style="color:red"> ${fail } </div>
</body>
</html>