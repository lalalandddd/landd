package java_modifier;

public class Modifier {

	public static void main(String[] args) {
		
		Book book1=new Book();  // 메소드를 사용해서 변수를 저장!!
		book1.setTitle("자바 속성");
		book1.setAuthor("유재학");
		book1.setPage(786);
		// 저장은 set, 가져오는건 get
		System.out.println(book1.getTitle());
		System.out.println(book1.getAuthor());
		System.out.println(book1.getPage());
		
		Book book2=new Book("자바 웹","이병현",564);
		// toString 메서드를 오버라이드 해서 표시가 편해졌다!!
		System.out.println(book2.toString());

	}

}

/*
클래스
	- 변수, 메서드
	- 인스턴스, 클래스
	- 생성자 메서드
	- 인스턴스 변수, 클래스 변수 초기화
	- 오버로딩
	- 오버라이딩
	- 상속
	- 제어자
	- 다형성
	- 추상화
	- 인터페이스
	- 내부클래스(익명클래스, 정적클래스)
	- 열거형

컬렉션 - 자료 구조와 알고리즘 (앞으로 이게 중요함)
	- collection, List, Map, Set
	- ArrayList, Vector, LinkedList
	- Queue, stack, HashSet, TreeSet
	- HashMap, treeMap, 등등

제네릭 (개념만)
애너테이션 (무쟈게 많이 씀 무조건 알아야 함)
스트링 (어쩌다가 한번 씀)
쓰레드 (구현 안함)
(JAVA 기본 문법 끝)

JSP - 내장객체, MVC 패턴
스프링프레임워크 - 스프링 부트
MVC패턴
간단한 쇼핑몰사이트
프로젝트(웹)
*/