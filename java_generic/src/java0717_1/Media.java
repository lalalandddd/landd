package java0717_1;

public class Media {
	private String id;  // 도서,dvd 관리번호
	private String title;  // 도서,dvd 제목
	public Media(String id, String title) {  // 생성자 메서드
		this.id=id;
		this.title=title;
	}
	@Override
	public String toString() {  // 전체 보내기
		return "ID : "+id+" , 제목 : "+title;
	}
	public String getId() {  // 겟셋
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	

}
