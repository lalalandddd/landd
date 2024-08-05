<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- update.jsp --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="/boardUpdate.do">
	<input type="hidden" name="method" value="update">
	<input type="hidden" name="boardId" value="${board.board_id }">
	<div id="writeBox">
		<div class="writeInput">
			<label>제목</label>
			<input type="text" name="title" id="title" value="${board.title }">
		</div>
		<div class="writeInput">
			<label>내용</label>
			<textarea name="content" id="content">${board.content }</textarea>
		</div>
		<button>작성</button>
	</div>
</form>
</body>
</html>