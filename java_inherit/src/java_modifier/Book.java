package java_modifier;

public class Book {

	public static int count=0;
	
	private String title;
	private String author;
	private int page;
	// 위에 데이터 3개를 만들었다? get set 메소드를 만들자
	// 근데 데이터의 출력이 조금 많이 힘들다?(일일이 출력해야 해서)
	// getset 위의 오버라이드도 만들자.
	// 오버라이드: toString 메서드를 지정하여 연결된 class에서 toString 하면 메서드에 넣은 내용이 돌아가도록 한다.
	// 데이터를 다루는 때만 만들면 된다.

	public Book() {}  // 생성자 메서드
	public Book(String title, String author, int page) {  // 매개변수 생성자 메서드
		this.title=title;
		this.author=author;
		this.page=page;
	}
	
	@Override
	public String toString() {  // toString 메서드
		return this.title+" "+this.author+" "+this.page;
	}
	public static int getCount() {
		return count;
	}
	public static void setCount(int count) {
		Book.count = count;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	
}
