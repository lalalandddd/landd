package java_modifier;

public class Book {

	public static int count=0;
	
	private String title;
	private String author;
	private int page;
	// ���� ������ 3���� �������? get set �޼ҵ带 ������
	// �ٵ� �������� ����� ���� ���� �����?(������ ����ؾ� �ؼ�)
	// getset ���� �������̵嵵 ������.
	// �������̵�: toString �޼��带 �����Ͽ� ����� class���� toString �ϸ� �޼��忡 ���� ������ ���ư����� �Ѵ�.
	// �����͸� �ٷ�� ���� ����� �ȴ�.

	public Book() {}  // ������ �޼���
	public Book(String title, String author, int page) {  // �Ű����� ������ �޼���
		this.title=title;
		this.author=author;
		this.page=page;
	}
	
	@Override
	public String toString() {  // toString �޼���
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
