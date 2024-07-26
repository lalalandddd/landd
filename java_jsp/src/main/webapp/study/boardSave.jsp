<%@ page import="java.util.Enumeration"%>
<%@ page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@ page import="com.oreilly.servlet.MultipartRequest"%>
<%@ page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="study.*" %>
<%-- boardSave.jsp --%>
<%-- 작성자 정보 받아서 게시물 저장 --%>
<%
request.setCharacterEncoding("UTF-8");
// 작성자 가져오기(로그인 세선 안에서 가져오기)
String writer=((Member)session.getAttribute("user")).getUserId();

// 파일 업로드(cos.jar) 관련 부분 내용 추가 (시작)
// 이미지 업로드해서 저장될 실제 위치 (윈도우는 \ → \\ 표현해야 한다.)
String path="C:\\lalalandddd\\leeyeonsanghtml\\leeyeonsanghtml\\landd\\java_jsp\\src\\main\\webapp\\study\\image";
// 업로드할 이미지의 최대 크기
int size=1024*1024*20;  // 20mb
String title=null;
String content=null;
String imgName=null;
String imgPath="/java_jsp/study/image/";
try{
// 파일 업로드를 위한 MultipartRequest 객체 생성, 생성자는 (request,파일 저장 위치,크기,한글셋,이름이 같을 때 이름 바꾸는 메서드)
	MultipartRequest mr=new MultipartRequest(request,path,size,"UTF-8",new DefaultFileRenamePolicy());
// 업로드 이미지 파일 이름을 가져오기
	Enumeration em=mr.getFileNames();
	String file=(String)em.nextElement();  // 이미지 한개만 업로드 : nextElement() 한번으로 끝
	imgName=mr.getFilesystemName(file);  // 실제 저장된 파일의 이름 ←→ 원본이름 : mr.getOriginalFileName(file)
// 제목과 내용 파라미터 가져오기
	title=mr.getParameter("title");
	content=mr.getParameter("content");
}catch(Exception e){
	System.out.println("파일 업로드 실패");
	e.printStackTrace();
}
// 파일 업로드 관련 부분 내용 추가 (종료)

//String title=request.getParameter("title");
//String content=request.getParameter("content");
//데이터베이스 사용
DBconnect db=new DBconnect();
//Connection conn=null;
//PreparedStatement pt=null;
//db.pt=db.conn.prepareStatement(sql);  처럼 사용하면 된다...
String sql="insert into studysite_board (title,writer,content) values (?,?,?)";
try{
	db.pt=db.conn.prepareStatement(sql);
	db.pt.setString(1,title);
	db.pt.setString(2,writer);
	db.pt.setString(3,content);
	db.pt.executeUpdate();
	out.println("게시물이 저장되었습니다.");
}catch(SQLException e){
	e.printStackTrace();
	out.println("데이터베이스에 오류 발생"+e.getMessage());
}
//파일 업로드(cos.jar) 관련 부분 내용 추가 (시작)
// limit 1 = 전체 조회한 데이터 중에서 가장 위의 한개만 가져오기. 여기서는 desc 내림차순 정렬이므로 가장 위가 최신. 즉 최신 한개만 가져오기
int boardId=0;  // 방금 저장한 게시글 번호를 저장하기 위한 변수
sql="select board_id from studysite_board order by board_id desc limit 1";
try{
	db.pt=db.conn.prepareStatement(sql);
	db.rs=db.pt.executeQuery();
	if(db.rs.next()){
		boardId=db.rs.getInt("board_id");
	}
}catch(SQLException e){
	e.printStackTrace();
}
sql="insert into studysite_board_img (board_id, img_name, img_path) values(?,?,?)";
try{
	db.pt=db.conn.prepareStatement(sql);
	db.pt.setInt(1,boardId);
	db.pt.setString(2,imgName);
	db.pt.setString(3,imgPath);
	db.pt.executeUpdate();
}catch(SQLException e){
	e.printStackTrace();
}
//파일 업로드 관련 부분 내용 추가 (종료)
response.sendRedirect("/java_jsp/study/?part=board");
%>
