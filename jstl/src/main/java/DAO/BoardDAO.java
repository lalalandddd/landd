package DAO;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DTO.BoardDTO;
import DTO.MemberDTO;

public class BoardDAO extends DBConnect {
	public void save(BoardDTO board, HttpServletRequest req,HttpServletResponse res) {  // 입력한 게시글 저장
		req.setCharacterEncoding("UTF-8");
		HttpSession session = req.getSession();
		String writer=((MemberDTO)session.getAttribute("user")).getUserId();
		String title=req.getParameter("title");
		String content=req.getParameter("content");
		DBConnect db=new DBConnect();
		String sql="insert into studysite_board (title,writer,content) values (?,?,?)";
		try{
			db.pt=db.conn.prepareStatement(sql);
			db.pt.setString(1,title);
			db.pt.setString(2,writer);
			db.pt.setString(3,content);
			db.pt.executeUpdate();
			System.out.println("게시물이 저장되었습니다.");
		}catch(SQLException e){
			e.printStackTrace();
			System.out.println("데이터베이스에 오류 발생"+e.getMessage());
		}
		res.sendRedirect("/java_jsp/study/?part=board");
	}
}
