package java0709;

public class Movie {
// ��� ������ ���� Ŭ������ ����� �� �⺻ : ���� ����, getset, �޼��� �̸�/�Ű����� �ִ� �޼���, Override/String toString
// �� �װ��� ���� �� �˾ƾ� �Ѵ�.

// �ν��Ͻ������� �����ڴ� Ư���� ��츦 �����ϸ� ������ private�� �Ѵ�!!!
	private String title;  // ����
	private String director;  // ����
	private int viewAge;  // ��������
	// ������ ����� ������ get, set ����

// Ŭ������ ��ü ���� �ν��Ͻ��� �����͸� �����ϴ� ���
// set �޼��带 ���ؼ� ������ ����, ������ �޼��带 ���ؼ� ������ ����
	public Movie() {}  // �޼��� �̸�
	public Movie(String title, String director, int viewAge) {  // �Ű����� �ִ� �޼���
		this.title=title;
		this.director=director;
		this.viewAge=viewAge;
	}
// ��ü�� �ν��Ͻ������� �� ����ϱ� ���� �޼��� - java�� ��κ� Ŭ������ ������ ����
// @Override, public String toString(){�Ű�����}
	@Override
	public String toString() {
		return title+", "+director+" "+viewAge;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public int getViewAge() {
		return viewAge;
	}
	public void setViewAge(int viewAge) {
		this.viewAge = viewAge;
	}

}
