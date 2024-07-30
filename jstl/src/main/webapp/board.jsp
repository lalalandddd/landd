<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- board.jsp --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action="/board">
		<button>글작성</button>
	</form>
	<table>
		<tr>
			<td class="post">게시글</td>
			<td class="writer">작성자</td>
		</tr>
		<tr>
			<td class="post"><a href="/board">첫번째 게시글 제목</a></td>
			<td class="writer">내가 작성자</td>
		</tr>
	</table>
</body>
</html>