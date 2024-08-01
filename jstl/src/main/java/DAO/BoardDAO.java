package DAO;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DTO.BoardDTO;

public class BoardDAO extends DBConnect {
	public List<BoardDTO> findById(){
		
	}
	public int totalCount(String keyWord){
		keyWord="%"+keyWord+"%";
		String sql="select COUNT(board_id) as cnt from studysite_board where title like ? or content like ?";
		// studysite_board에 cnt라는 가짜 컬럼을 만들어서 저장
		try {
			pt=conn.prepareStatement(sql);
			pt.setString(1,keyWord);
			pt.setString(2,keyWord);
			rs=pt.executeQuery();  // ?가 없으므로 변수 없음
			if(rs.next()) {
				return rs.getInt("cnt");
			}
		}catch(SQLException e){
			System.out.println("총 게시글 수 조회 실패");
		}
		return 0;
	}
	public List<BoardDTO> findAll(int row, String keyWord){
//		String sql="select * from studysite_board order by board_id desc limit ?, 10";
		keyWord="%"+keyWord+"%";
		String sql="select * from studysite_board where title like '%?%' or content like '%?%' order by board_id desc limit ?, 10";
		List<BoardDTO> list=new ArrayList<>();
		try {
			pt=conn.prepareStatement(sql);
			pt.setString(1, keyWord);
			pt.setString(2, keyWord);
			pt.setInt(3, row);
			rs=pt.executeQuery();
			while(rs.next()) {
				list.add(new BoardDTO(rs.getInt("board_id"), rs.getString("writer"), rs.getString("title"), rs.getString("content"), rs.getInt("hit")));
			}
		}catch(SQLException e) {
			System.out.println("게시글 불러오기 실패");
			e.printStackTrace();
		}
		return list;
	}
	public void save(BoardDTO board) {  // 입력한 게시글 저장
		String sql="insert into studysite_board(title, writer, content) values(?,?,?)";
		try{
			pt=conn.prepareStatement(sql);
			pt.setString(1, board.getTitle());
			pt.setString(2, board.getWriter());
			pt.setString(3, board.getContent());
			pt.executeUpdate();
			System.out.println("게시물이 저장되었습니다.");
		}catch(SQLException e){
			e.printStackTrace();
			System.out.println("게시물 저장 실패");
		}
		//res.sendRedirect("/java_jsp/study/?part=board");
	}
}
