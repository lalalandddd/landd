package java0710_2;

public class InnerClass1 {

	public static void main(String[] args) {

		Out out=new Out();
		out.num=100;
		out.obj.age=40;
		out.obj.setName("이순신");
		Out.인스턴스내부클래스 in=out.new 인스턴스내부클래스();  // 내부클래스의 변수 사용 방법(대소문자 구분!)
		in.age=20;
		in.setName("김유신");

	}
}
class Out{
	static int count;  // 클래스 변수
	int num;  // 인스턴스 변수
	private String job;  // 인스턴스 변수
	인스턴스내부클래스 obj=new 인스턴스내부클래스();
	class 인스턴스내부클래스{  // 앞에 private 제어자 붙이면 class Out 안에서만 사용 가능 > main의 변수에 오류 붉은줄
		public int age;  // 같은 클래스 사용 가능
		private String name;  // private라서 외부 사용 불가능
		void setName(String name) {
			this.name=name;
		}
		void create() {
			count=10;  // static으로 선언/정의한 변수/메서드는 인스턴스 메서드에서 사용 가능 <> 인스턴스 변수/메서드는 static에서 사용 불가능
		}
	}
	static void save() {}
	static class 정적내부클래스{  // static이므로 Out class에 속하지 않는다.
		int tall;
		static int birth;
		static void update() {}
	}
	void buyComputer() {  // 메소드
		class 지역내부클래스{
			// 메소드(buyComputer) 내부에서만 사용 가능. 메소드가 종료되면 클래스, 변수 등등이 모두 소멸한다
			// > 존재하지 않음 > 외부 클래스에서 변수 사용 불가능, 제어자 붙일 수 없다(private, public, static 등등)
			int weight;
			void del() {}
		}
		지역내부클래스 ob=new 지역내부클래스();
	}
	interface Car{  // 내부 인터페이스
		void make();  // 메서드
	}
	void makeCar() {  // 객체는 만들 수 없지만 익명내부클래스를 사용해서 비슷하게 사용할 수 있다.
		Car c=new Car() {  // 익명내부클래스로 만든 객체
			@Override
			public void make() {
				System.out.println("익명 클래스를 통해 만들기");
			}
		};
	}
}
/* 내부 클래스 : 클래스 내부에서만 사용 가능한 클래스 (포함 관계는 클래스 외부에서 사용 가능?)
1. 인스턴스 내부 클래스
2. 정적 내부 클래스
3. 지역 내부 클래스
4. 익명 내부 클래스(이름없는 클래스)
*/