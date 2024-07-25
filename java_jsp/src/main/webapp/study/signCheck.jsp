<%@ page import="java.sql.*, java.util.ArrayList, study.Member" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="study.Member" %>
<%-- signCheck.jsp --%>
<%--
입력한 아이디와 비밀번호를 데이터베이스에 저장된 member 테이블의 값들과 비교하여
일치하면 로그인 처리(세션), 불일치하면 아이디 또는 비밀번호가 잘못 입력되었다고 알림
--%>
<% request.setCharacterEncoding("utf-8"); %>
<%
String id=request.getParameter("userId");
String pw=request.getParameter("userPassword");
try {
Class.forName("com.mysql.cj.jdbc.Driver");
}catch(Exception e) {
System.out.println("드라이버 로드 실패");
}

String user="ry0606";  // 계정명
String password="123456";  // 비밀번호
String url="jdbc:mysql://localhost:3306/ry0606";  // host 주소
Connection conn=null;
PreparedStatement pt=null;
try {
conn=DriverManager.getConnection(url,user,password);
}catch(SQLException e) {
System.out.println("데이터베이스 접속 실패");
}
%>
<%
// member 테이블의 데이터들과 비교하여 로그인 처리 진행하기
// 자바 코드로 비교하기, 테이터베이스를 통해 비교하기 둘 다 해 볼 예정
%>
<% // 1. 자바 코드로 비교하기(java.util.ArrayList, study.Member import)
String sql="select * from studysite_member";
ResultSet rs=null;  // select문 결과를 받기 위한 참조변수
ArrayList<Member> list=new ArrayList<>();
try{
	pt=conn.prepareStatement(sql);
	rs=pt.executeQuery();  // select문 일 경우 executeQuery();
	while(rs.next()){
		list.add(
			new Member(rs.getString("user_id"),rs.getString("user_password"),rs.getString("user_email"),rs.getString("user_name"),rs.getInt("level"))
		);
	}
}catch(SQLException e){
	System.out.println("데이터베이스 조회 실패");
}

if(!list.isEmpty()){  // 테이블 조회한 데이터를 arraylist에 저장한 경우
	for(Member m:list){
		if(m.getUserId().equals(id)){  // id 동일?
			if(m.getUserPassword().equals(pw)){  // 비밀번호 동일?
				// 아이디, 비밀번호가 일치하므로 세션값 생성
				session.setAttribute("user",m);
				// m은 아이디, 비밀번호가 일치한 Member 클래스 객체이다.
				String path=request.getContextPath()+"/study";
				response.sendRedirect(path);
			}
		}
	}
}
%>
<script>
	alert("아이디 또는 비밀번호가 잘못되었습니다");
	history.back();
</script>
<% // 2. 테이터베이스를 통해 비교하기

%>
<jsp:useBean id="signin" class="test.Signin" scope="application" />
<jsp:setProperty name="signin" property="userId" />
<jsp:setProperty name="signin" property="userPassword" />
<jsp:getProperty name="signin" property="userId" />
<jsp:getProperty name="signin" property="userPassword" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>