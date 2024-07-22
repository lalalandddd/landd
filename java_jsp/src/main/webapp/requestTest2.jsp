<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- requestTest2.jsp --%>
<%--
학생이름과 국어, 수학, 과학 성적을 입력하고 제출버튼을 클릭하기
전송 페이지 : result1.jsp
전송 방식 : get
--%>
<form method="get" action="result1.jsp">
	<p>국어, 수학, 과학 성적을 입력하고 제출 버튼을 클릭하세요</p>
	이름 : <input type="text" name="name"><br>
	국어성적 : <input type="text" name="kor"><br>
	수학성적 : <input type="text" name="mat"><br>
	과학성적 : <input type="text" name="sic"><br>
	<button>전송</button>
</form>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>