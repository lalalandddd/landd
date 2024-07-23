<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- action.jsp --%>
<%--
액션 태그
서버나 클라이언트에게 동작을 명령하는 태그
xml 형식의 태그 사용 방법
'자바빈'의 기능 사용
종류
  - <jsp:forward /> : (주소 변경 없이) 다른 페이지로 이동
  - <jsp:include /> : 외부 페이지의 내용을 포함
  - <jsp:plugin /> : 웹 브라우저에서 자바 애플릿을 실행
  - <jsp:useBean /> : jsp 페이지에 자바빈즈를 설정(자바클래스 객체)
  - <jsp:setProperty /> : 자바빈즈의 프로퍼티 값 설정/저장(클래스의 인스턴스변수 값 설정/저장)
    java파일의 셋.을 여기서 동작시킨다.
  - <jsp:getProperty /> : 자바빈즈의 프로퍼티 값 가져오기(클래스의 인스턴스변수 값 가져오기)
    java파일의 겟.을 여기서 동작시킨다.
  - <jsp:param /> : forward, include 의 인자 추가(== 메서드의 매개변수에 값 저장)

src/main/java > test 패키지 안에 music.java 만들기

useBean 변수
  - id : 클래스객체의 주소를 저장할 참조변수  (== Music music=new Music();)
  - class : 클래스의 경로(패키지 포함)
  - scope : 자바빈 객체가 저장될 영역을 설정(내장객체 중 하나) (application(앱), session(세션), page/request(현재페이지))
setProperty 변수
  - name : 객체 이름(객체 주소가 저장된 참조변수) (== music.setTitle("");)
  - property : 인스턴스변수 이름(set변수명 메서드 호출)
  - value : 저장할 데이터
getProperty 변수
  - name : 객체 이름
  - property : 인스턴스변수 이름
--%>
<% request.setCharacterEncoding("utf-8"); %> <%-- 한글이 깨질 경우, 이렇게 인코딩 해주면 다시 잘 나온다. --%>
<jsp:useBean id="music" class="test.Music" scope="application" />
<%--
<jsp:setProperty name="music" property="title" value="비가오는날엔" />
<jsp:setProperty name="music" property="singer" value="헤이즈" />
<jsp:setProperty name="music" property="year" value="2021" />
--%>
<jsp:setProperty name="music" property="title" />
<jsp:setProperty name="music" property="singer" />
<jsp:setProperty name="music" property="year" />

<%--
변수명(title)이 동일해야 별다른 로딩 없이 사용할 수 있다.
변수명이 다르면 musicInput를 import하고 값을 가져와야 한다.
변수명이 모두 같다면 property="*" 하나로 끝이다.
--%>

<jsp:getProperty name="music" property="title" />
<jsp:getProperty name="music" property="singer" />
<jsp:getProperty name="music" property="year" />
<br>
<% String title=request.getParameter("title");
out.println(title); %>
<% out.println(music.getSinger()); %>
<%=music.getYear() %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>