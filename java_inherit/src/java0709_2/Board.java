package java0709_2;

public class Board {
	private int board_id;
	private String title;
	private String writer;
	private String content;
	private int hit;
	public int getBoard_id() {
		return board_id;
	}
	public void setBoard_id(int board_id) {
		this.board_id = board_id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getHit() {
		return hit;
	}
	public void setHit(int hit) {
		this.hit = hit;
	}
	public Board() {}
	public Board(String title, String writer, String content, int hit) {
		this.title=title;
		this.writer=writer;
		this.content=content;
		this.hit=hit;
	}
	public Board(int board_id, String title, String writer, String content, int hit) {
		this(title,writer,content,hit);
		this.board_id=board_id;
	}
	@Override
	public String toString() {
		return board_id+", "+title+", "+writer+", "+content+", "+hit;
	}
}
