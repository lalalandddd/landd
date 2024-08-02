package DTO;

import java.time.LocalDate;

import lombok.Data;

@Data // 롬복 에너테이션으로 getter, setter, equals 등등 기본적인 메서드 생성자를 한번에 모두 해결했다!!
public class CommentDTO {
	private int commentId;
	private int boardId;
	private String writer;
	private String comment;
	private LocalDate writeDate;
	public static CommentDTO of(int cid, int bid, String writer, String comment, LocalDate date) {
		CommentDTO dto=new CommentDTO();
		dto.commentId=cid;
		dto.boardId=bid;
		dto.writer=writer;
		dto.comment=comment;
		dto.writeDate=date;
		return dto;
	}
}
