package homeproduct;

import java.sql.Date;

public class MainClass {

	public static void main(String[] args) {

		Tv tv=new Tv();
		tv.brand="삼성";
		tv.power();
		tv.power();
		Aircon aircon=new Aircon();
		System.out.println(tv.brand);  // 삼성
		System.out.println(aircon.brand);  // null
		aircon.power();
		aircon.power();
		Computer com=new Computer();
		com.power();
		com.power();

	}

}

// 클래스 상속
// 상속하려면 (자식클래스 이름) 뒤에 extends (부모클래스 이름)
// 자식클래스는 부모클래스의 메서드도 사용할 수 있게 된다.
// 예) Tv extends House : 자식클래스(Tv)에 부모클래스(House) 메서드를 상속
// class 간 공통적인 메서드가 있어야 상속하는 의미가 있다.
// 상속의 목적 : 다형성(코드 관리 쉽고 코드 길이 줄고는 추후 이야기)
// 다형성 : 하나의 타입으로 다른 여러 타입을 제어/사용하기 위함
//        부모 클래스의 인스턴스 변수, 인스턴스 메서드, 클래스 변수, 클래스 메서드 모두 사용 가능
//        일부 사용하지 못하는 것이 있다. 제어자(static, public 현재까진 단 두 개)
// 다형성은 난이도가 있으므로 마지막에 배울 예정 예)toString

// 상속에서 주의할 점 : 자식클래스에 super()=(부모를 의미) 메서드가 생략되어있다.
// 그래서 tv.brand="삼성" 하면 house 의 brand에 저장이 아니라
// tv의 brand에 저장되므로 aircon의 brand는 아무것도 없어서 null이 뜬다.
