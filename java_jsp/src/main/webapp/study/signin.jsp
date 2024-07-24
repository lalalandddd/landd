<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- signin.jsp --%>
<div id="signinBox">
	<form method="post" action="signCheck.jsp">
		<div class="signinInput">
			<div class="loginInput">
				<b>아이디</b>
				<input type="text" name="userId"><br>
			</div>
			<div class="loginInput">
				<b>비밀번호</b>
				<input type="password" name="userPassword"><br>
			</div>
			<button id="loginBt">로그인</button><br>
		</div>
	</form>
	<p><a href="/java_jsp/study/?part=findUser">아이디/비밀번호찾기</a></p>
	<p><a href="/java_jsp/study/?part=signup">회원가입</a></p>
</div>
<%-- 
전송방식 : post
전송 url : signCheck.jsp
아이디 파라미터 : userId
비밀번호 파라미터 : userPassword
아이디/비밀번호찾기 url : findUser.jsp
회원가입 url : signup.jsp
--%>