package DAO;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import DTO.BoardDTO;

public class BoardDAO extends DBConnect {
	public BoardDTO findById(int bid){
		String sql="select * from studysite_board where board_id=?";
		try {
			pt=conn.prepareStatement(sql);
			pt.setInt(1, bid);
			rs=pt.executeQuery();
			if(rs.next()) {
				return new BoardDTO(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5));
			}
		}catch(SQLException e) {
			System.out.println("게시글 상세 데이터 조회 실패");
			e.printStackTrace();
		}
		return null;
	}
	public int totalCount(String keyWord){  // 게시글 총 갯수
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
			e.printStackTrace();
		}
		return 0;
	}
	public List<BoardDTO> findAll(int row, String keyWord){
//		String sql="select * from studysite_board order by board_id desc limit ?, 10";
		keyWord="%"+keyWord+"%";
		String sql="select * from studysite_board where title like ? or content like ? order by board_id desc limit ?, 10";
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
			System.out.println("게시글 선택 실패");
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
			//System.out.println("게시물이 저장되었습니다.");
		}catch(SQLException e){
			System.out.println("게시글 저장 실패");
			e.printStackTrace();
		}
		//res.sendRedirect("/java_jsp/study/?part=board");
	}
	public void delete(int bid) {  // 게시글 삭제
		String sql="delete from studysite_board where board_id=?";
		try {
			pt=conn.prepareStatement(sql);
			pt.setInt(1, bid);
			pt.executeUpdate();
		}catch(SQLException e) {
			System.out.println("게시글 삭제 실패");
			e.printStackTrace();
		}
	}
	public void update(BoardDTO dto) {  // 게시글 수정
		String sql="update studysite_board set title=?, content=? where board_id=?";
		try {
			pt=conn.prepareStatement(sql);
			pt.setString(1, dto.getTitle());
			pt.setString(2, dto.getContent());
			pt.setInt(3, dto.getBoard_id());
			pt.executeUpdate();
		}catch(SQLException e){
			System.out.println("게시글 수정 실패");
			e.printStackTrace();
		}
	}
}
