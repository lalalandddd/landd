<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- boardWrite.jsp --%>
<%-- 스타일은 boardWrite.css 만들 것 --%>
<form method="post" action="boardSave.jsp" enctype="multipart/form-data">
	<div id="writeBox">
		<div class="writeInput">
			<label>제목</label>
			<input type="text" name="title" id="title">
		</div>
		<div class="writeInput">
			<label>이미지</label>
			<input type="file" name="boardImg" id="boardImg" accept=".jpg, .png, .jpeg, .gif">
			<!-- 이미지 파일 모두 : accept="image/*" -->
			<!-- 동영상 파일 모두 : accept="video/*" -->
			<!-- 파일 허용 범위 설정 : 자바스크립트 (html은 못한다) -->
		</div>
		<div class="writeInput">
			<label>내용</label>
			<textarea name="content" id="content"></textarea>
		</div>
		<button>작성</button>
	</div>
</form>