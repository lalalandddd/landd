package java0702;

public class ClassBasic {

	public static void main(String[] args) {

	// 구조체(struct) : 실수, 정수, 문자열 등을 하나의 배열에 묶기 위한 방법 - 근데 자바에는 이게 없다... 배열은 무조건 같은 타입만.
	// 같은 타입만 가능하다 보니, 여러 정보를 따로 관리하게 되어 불편함 → 구조체 전용 함수들이 만들어지게 됨 (그 결과 중 하나가 class)
	// class 구조체는 데이터 저장할 때, 함수도 같이 저장함으로써 여러 타입의 정보를 하나의 배열에 넣을 수 있게 됨
	// 기존 [age, age, age...], [tall, tall, tall...] [wg, wg, wg...]
	// struct [int.age float.tall float.wg] [int.age float.tall float.wg] ...

		// 영화 관련 변수들을 모아보았다
		// String 제목; String 장르; String 감독; int[] 개봉일; int 관객수; long 총수익?;
		// 전체 출력 메서드? 순수익 출력 메서드?

	// 정의된 class 타입의 공간을 생성한다. 생성한 공간에 데이터를 저장한다.
	// class 타입으로 생성된 공간을 객체 또는 인스턴스라고 한다.

		// class 인스턴스 생성

//		Member member1=new Member();
//		Member member2=new Member();
//		System.out.println(member1);  // 보이는 건 데이터 주소... 데이터가 아니다
//		member1.name="이순신";  // 아래에서 class를 먼저 정의해야 데이터를 입력할 수 있다.
//		member1.age=23;
//		System.out.println(member1.name);  // 이순신
//		System.out.println(member1.age);  // 23
//		System.out.println(member2.name);  // null (만들었으나 아무 값이 없다)
//		System.out.println(member2.age);  // 0 (만들었으나 아무 값이 없다)
//		member2.name="김유신";
//		member2.age=34;
//		System.out.println(member2.name);  // 김유신
//		System.out.println(member2.age);  // 34

//		// java, 495p / 메모리 최적화기법, 893p
//		Book book1=new Book();
//		Book book2=new Book();
//		book1.title="java";
//		book1.pageEnd=495;
//		book2.title="메모리 최적화기법";
//		book2.pageEnd=893;
//		System.out.println(book1.title+" "+book1.pageEnd+"p");
//		System.out.println(book2.title+" "+book2.pageEnd+"p");

		// 스마트폰 제품명, 운영체제, 메모리 크기를 저장할 수 있는 클래스를 정의하고 인스턴스 생성하여 값 저장, 출력하세요(3개)
		SmartPhone sp1=new SmartPhone();
		SmartPhone sp2=new SmartPhone();
		SmartPhone sp3=new SmartPhone();
		sp1.name="galaxy24";
		sp1.system="android";
		sp1.ram=2048;
		sp2.name="googlephone";
		sp2.system="android";
		sp2.ram=1024;
		sp3.name="Iphone24";
		sp3.system="IOS16";
		sp3.ram=2048;
		System.out.printf("%15s %8s %5s\n","phone name","system","ram");
		System.out.printf("%15s %8s %5smb\n",sp1.name,sp1.system,sp1.ram);
		System.out.printf("%15s %8s %5smb\n",sp2.name,sp2.system,sp2.ram);
		System.out.printf("%15s %8s %5smb\n",sp3.name,sp3.system,sp3.ram);

	}
}
// class는 사용자 정의 데이터 타입 이라고 한다.
//class Member{  // Member 라는 이름의 클래스 정의
//	String name;  // 이름 정의
//	int age;  // 나이 정의
//	Member(){}
//}
//class Book{  // 책 제목과 총 페이지 수를 저장하기 위한 클래스 정의
//	String title;
//	int pageEnd;
//}
class SmartPhone{
	String name;
	String system;
	int ram;
}