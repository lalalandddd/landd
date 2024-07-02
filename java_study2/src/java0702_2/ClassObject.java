package java0702_2;

import java.util.Arrays;
import java.util.Scanner;

public class ClassObject {

	static Scanner scan=new Scanner(System.in);

	public static void main(String[] args) {

//		System.out.println(Car.maker2);  // 클래스 변수이기 때문에 바로 사용할 수 있다.
//		// System.out.println(Car.maker1);  // maker1 변수는 아직 생성되지 않았으므로 사용할 수 없다.
//		Car car1;
//		// car1.fuelType="휘발유";  // 변수를 생성하지 않았으므로 사용할 수 없다.
//		car1=new Car();  // carName, 배기량, fuelType 변수 생성
//		car1.carName="쏘나타";
//		car1.fuelType="휘발유";
//		System.out.print(car1.maker1+car1.carName+car1.fuelType+car1.배기량);
//		// 근데 일일이 하나씩 데이터를 넣어야 해서 불편하다...???
//		
//		Car car2=new Car("그랜져",3000,"휘발유");  // 아래에서 Car 매개변수를 만들었기에 위보다 쉽게 데이터를 넣을 수 있다.
		
		// 웹소설 작가들의 구독자 평점과 소설 뷰 횟수에 따른 포인트점수 내용을 저장할 수 있는 클래스를 정읳하고 데이터 입력 후 출력하시오
		// (매개변수 있는 생성자 메서드는 두 개 이상 구현할 것)
		// 데이터(이름, 포인트, 평점) : (김건우,4580,4.3)(김경제,3485,4.1)(박재범,90930,2.7)(서석완,19200,3.1)
		Webnovel novel1=new Webnovel("김건우",4580,4.3f);
		Webnovel novel2=new Webnovel("김경제",3485,4.1f);
		Webnovel novel3=new Webnovel("박재범",90930,2.7f);
		Webnovel novel4=new Webnovel("서석완",19200,3.1f);
		System.out.print("작가이름 뷰 횟수 평점\n");
		System.out.println(" "+novel1);
		System.out.println(" "+novel2);
		System.out.println(" "+novel3);
		System.out.println(" "+novel4);

	}

}
class Webnovel{
	String name;  // 이름 - 인스턴스 변수 (문자)
	int point;  // 포인트점수 - 인스턴스 변수 (정수)
	float grade;  // 평점 - 인스턴스 변수 (실수)
	Webnovel(){}
	Webnovel(String name,int point, float grade){
		this.name=name;
		this.point=point;
		this.grade=grade;
	}
	public String toString() { // public 반환타입 to반환타입(){출력 내용(문자열)}
		return name+" "+point+"점 "+grade;
	};
}

// class 내부에 선언되는 변수(또는 배열)는 두 가지가 있다.
// class 변수(현재까진 scanner가 유일), instance 변수(처음 배운 변수는 모두 인스턴스이다.)
// class 변수는 static로 만든다.
// instance 변수는 class 객체 생성 시 메모리가 할당된다. class 객체 안에서만 사용해야 한다. (자바스크립트의 지역변수 let과 같은 용도)
// class 변수는 new 연산자를 통해서 객체를 생성한다.
// class 변수는 프로그램 실행할 때 메모리에 로드하면서 생성된다. 즉 class 객체를 만들기도 전에 이미 쓸 수 있다.
// 모든 class 변수는 어디서든 사용할 수 있다. (공유 자원)

//class Car{
//	String maker1="현대";  // 인스턴스 변수
//	String carName;  // 인스턴스 변수
//	int 배기량;  // 인스턴스 변수
//	String fuelType;  // 인스턴스 변수
//	static String maker2="기아";  // 클래스 변수  car class에 maker2 변수 공간은 아직 없다. 이 내용을 실행하면서 생성된다.
	
	// 생성자 메서드 - 객체(인스턴스)공간을 생성할 때, 공간을 초기화해주는 메서드
	// 생성자 메서드의 내용 - 인스턴스 변수의 초기값 지정. 아무것도 없으면 바로 위의 초기값이 들어간다.
	// 생성자 메서드는 return이 존재하지 않아서 return 타입 지정이 안 되기 때문에 return; 을 쓰면 붉은 밑줄(오류)이 생긴다.

	// 오버로딩 - 하나의 메서드 이름으로 여러 메서드를 만드는 것. (자바스크립트에서 같은 이름을 가진 메서드는 오류가 떴었다.)
	// (예 : print() - 실수, 정수, 문자 모두 출력되는데 각 매개변수 타입의 출력 메서드가 print()로 오버로딩 되어 있기 때문이다.
	// 오버로딩 구현 조건 1. 동일 클래스에서만 가능 / 2. 메서드의 이름이 동일 / 3. 매개변수의 타입은 달라야 함
	//   응용 : 매개변수의 숫자가 다르다(O), 매개변수가 동일해도 타입이 다르다(O), 매개변수 동일, 타입 동일해도 매개변수 숫자가 다르다(O)
	//   결론 : 매개변수의 숫자 동일, 매개변수 타입 동일, 매개변수 이름 동일....해야만 오버로딩이 안 된다.
	// 오버로딩을 얼마나 잘 활용하느냐에 따라 구현할 수 있는 범위가 넓어진다.
//	Car(){
//		fuelType="휘발유";  // new 연산자로 객체를 생성하면 연료 변수에 휘발유가 저장된다. 나중에 변경 가능... 즉 초기값 개념?
//	}
//	Car(String name,int cc,String fuel){
//		this.carName=name;
//		배기량=cc;
//		this.fuelType=fuel;
//	}
//	Car(String fuel){
//		this.fuelType=fuel;
//	}
//	// Car(String fuel){this.fuelType="경유";}  // fuel 동일 매개변수에 String 동일 타입이므로 오류가 뜬다.
//	Car(String fuel, String fuels){this.fuelType="경유";this.fuelType="기름";}  // 매개변수 수가 다르므로 오류가 아니다.
//	
//	// Car(String fuel, String fuels){this.fuelType="경유";this.fuelType="기름";}  // 매개변수 타입이 같으면 
//	// Car(String fuels, String fuel){this.fuelType="경유";this.fuelType="기름";}  // 순서가 달라도 오류다.
//	
//	Car(String fuel, int fuels){this.fuelType="경유";this.fuelType="기름";}  // 매개변수 타입이 다르므로
//	Car(int fuels, String fuel){this.fuelType="기름";this.fuelType="경유";}  // 순서만 바뀌어도 오류가 아니다.
//	
//}  // 보통 class 변수는 공통 데이터를 저장할 때 쓴다.

// 클래스 명 Car, 인스턴스 변수 name, String, null 설계도를 주면...
// Car(){String name=null;} 이란 결과가 나와야 한다.
