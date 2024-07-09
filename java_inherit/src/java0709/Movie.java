package java0709;

public class Movie {
// 모든 데이터 저장 클래스가 갖춰야 할 기본 : 변수 설정, getset, 메서드 이름/매개변수 있는 메서드, Override/String toString
// 이 네개는 만들 줄 알아야 한다.

// 인스턴스변수의 제어자는 특별한 경우를 제외하면 무조건 private로 한다!!!
	private String title;  // 제목
	private String director;  // 감독
	private int viewAge;  // 관람연령
	// 변수를 만들면 무조건 get, set 설정

// 클래스의 객체 내부 인스턴스에 데이터를 저장하는 방법
// set 메서드를 통해서 데이터 저장, 생성자 메서드를 통해서 데이터 저장
	public Movie() {}  // 메서드 이름
	public Movie(String title, String director, int viewAge) {  // 매개변수 있는 메서드
		this.title=title;
		this.director=director;
		this.viewAge=viewAge;
	}
// 객체의 인스턴스변수들 값 출력하기 위한 메서드 - java의 대부분 클래스가 가지고 있음
// @Override, public String toString(){매개변수}
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
