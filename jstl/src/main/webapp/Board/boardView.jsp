<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- boardView.jsp --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<td>제목</td>
			<td>${studysite_board.title }</td>
		</tr>
		<tr>
			<td>조회수</td>
			<td>${studysite_board.hit }</td>
		</tr>
		<tr>
			<td>작성자</td>
			<td>${studysite_board.writer }</td>
		</tr>
		<tr>
			<td>내용</td>
			<td>${studysite_board.content }</td>
		</tr>
		<tr>
			<td colspan='2'></td>
		</tr>
	</table>
</body>
</html>