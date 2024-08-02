<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%-- boardView.jsp --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- jquery CDN-->
<script src="https://code.jquery.com/jquery-3.7.1.js" integrity="sha256-eKhayi8LEQwp4NKxN+CfCh+3qOVUtJn3QNZ0TciWLP4=" crossorigin="anonymous"></script>
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
			<td colspan='2'>
				<c:if test="${sessionScope.user eq studysite_board.writer }">
					<button type="button" id="modify">수정</button>
					<button type="button" id="delete">삭제</button>
				</c:if>
			</td>
		</tr>
	</table>
	<hr>
	<!-- 댓글 -->
	<table>
		<c:if test="${ sessionScope.user!=null }">
		<tr>
			<td>
				<textarea id="comment" name="comment" rows=3 cols=30></textarea>
			</td>
			<td>
				<button id="commentBt">입력</button>
			</td>
		</tr>
		</c:if>
		<c:forEach var="row" items="${comments }">
		<tr>
			<td>${row.writer }<br>${row.writeDate }<br>
			<c:if  test="${ sessionScope.user eq row.writer }">
				<a href="/commentDelete.do?id=${row.commentId }">삭제</a>
			</c:if>
			</td>
			<td>${row.comments }</td>
		</tr>
		</c:forEach>
	</table>
	<a href="/board.do">게시판 목록</a>
</body>
</html>
<script>
	$("#commentBt").on("click",function(){
		let $fm=$('<form></form>');  // 폼 태그 생성
		$fm.attr('method','get');
		$fm.attr('action','/comment.do');
		$fm.append("<input type=hidden name=boardId value=${studysite_board.board_id}>");
		$fm.append($("#comment"));  // id는 comment
		$fm.appendTo("body");  // body 안에 넣기
		$fm.submit();  // 전송
	});
	$("#modify").on("click",function(){
		location.href="/boardUpdate.do?id=${studysite_board.board_id}";
	});
	$("#delete").on("click",function(){
		var isOk=confirm("정말로 삭제하시겠습니까?");
		if(isOk){
			location.href="/boardDelete.do?id=${studysite_board.board_id}";
		}
	});
</script>