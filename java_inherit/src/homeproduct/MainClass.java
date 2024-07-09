package homeproduct;

import java.sql.Date;

public class MainClass {

	public static void main(String[] args) {

		Tv tv=new Tv();
		tv.brand="삼성AMORED";
		tv.power();
		tv.power();
		Aircon aircon=new Aircon();
		aircon.brand="LG휘센";
		aircon.power();
		aircon.power();
		aircon.windControl();
		Computer com=new Computer();
		com.brand="애플IMAC";
		com.power();
		com.power();
		
		System.out.println("다형성");
		House tv2=new Tv("LG",1500000);
		tv2.power();
		House item=new Tv("삼성",1750000);
		item.power();
		item=new Aircon("휘센",1030000);
//		item.windControl();  // item은 house에 있으므로 aircon에만 있는 windControl을 못쓴다.
		// TV 객체 100개, 에어컨 객체 30개
		House[] arr= {new Tv(), new Aircon(), new Computer()};  // 이거하려고 상속했다!!!

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

// 그래서 tv.brand="삼성" 하면 house 의 brand에 저장이 아니라
// tv의 brand에 저장되므로 aircon의 brand는 아무것도 없어서 null이 뜬다.

// 부모 클래스의 필드(변수), 메서드는 자식 클래스에서 사용 가능하다.
// 1. 상속은 재사용을 위해-여러 클래스들의 중복 코드를 하나의 클래스로 모아서 사용
// 2. 부모 클래스의 필드(변수), 메서드를 모두 자식 클래스에서 사용할 수 있는 건 아니다.
//    - 제어자, 패키지에 따라 제한이 있다.
// 3. 자식 클래스에서 부모 클래스를 지칭하는 예약어는 super()이다.
//    - 자식클래스에 super()=(부모를 의미) 메서드가 생략되어있다.

// 오버라이딩의 조건
// 부모 클래스에 자식 클래스의 해당 메서드가 존재해야 한다.
// 반환 타입, 메서드 이름, 매개변수가 모두 동일해야 한다.
// 메서드 {} 안의 내용은 달라도 된다.
// 추상 클래스 - abstract class 클래스이름, 추상 클래스는 객체 생성 불가
// 추상 메서드를 가지고 있는 클래스는 반드시 추상 클래스가 되어야 한다.
// 부모가 추상클래스(추상메서드), 자식클래스는 추상메서드를 정의해야 한다.(=추상클래스가 아니다.)

/*
자바의 기타 제어자
1. static
		- 클래스의 정적 변수, 정적 메서드
		- 클래스에서 객체들이 공동으로 사용할 수 있는 변수, 메서드
		- 객체에 속하지 않고 클래스에 속한다.
		- 클래스명.static변수명, 클래스명.static메서드,()
2. abstract
		- 추상 클래스, 추상 메서드, 객체 생성 불가능
		- 미완성의 의미를 가진다.
3. final
		- 변경되지 않는 의미로 사용된다. 변수 앞에 붙이면 변수 값 변경 불가능
		- 메서드 앞에 final을 붙이면 해당 메서드는 오버라이딩 불가능
		- 클래스 앞에 final을 붙이면 상속이 불가능(부모 클래스 지정 불가능, 자식 클래스로는 사용 가능)
4. 그 외synchronized, volatile, transient, strictfp
자바의 접근 제어자
1. public - 어디서나 누구든지 메서드에 접근을 허용.
		- 이게 없으면 외부에서 메서드를 사용할 수 없다.
		- 외부에서 메서드를 사용하려면 import해야 한다.
2. default (package-private) - 같은 패키지에서만 접근 가능
3. protected - 같은 패키지에서만 접근 가능
		- 단, 부모자식(상속) 관계는 예외
		- 1)부모클래스의 변수, 메서드가 protected
		- 2)자식클래스에서 extends, import
		- 3)자식클래스 메서드에 protected 해야 적용된다... 복잡해;;
4. private - 오직 같은 클래스에서만 접근 가능 (상속도 안 됨, 같은 패키지 외부 클래스도 안 됨)
		- 앞으로 나오는 모든 '변수'는 모조리 이걸로 = 변수에 저장 작업은 앞으로 메서드로 한다...
		- 1) 사용할 변수에 private 적음
		- 2) 빈칸에서 우클릭 > source > generate getter and setter
		- 3) select all > generate 하면 자동으로 완성된다.
*/
