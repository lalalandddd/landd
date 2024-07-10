package java0710;

interface Animal1{  // 부모클래스1...가 이미 추상 메서드이므로 sound에...
	static int a=10;
	final int b=10;  // 변경 불가능 상수
	static void mee() {
		
	}
	public void sound();  // 추상메서드1 abstract를 안붙여도 된다.
}
interface bird{  // 부모클래스2
	public void fly();  // 추상메서드2
}
class Dog1 implements Animal1{
	@Override
	public void sound() {
		System.out.println("멍멍");
	}
}
class Cat1 implements Animal1{
	@Override
	public void sound() {
		System.out.println("냐옹");
	}
}
class Pigeon1 implements Animal1 , bird{
	// interface는 상속을 여러 개 사용할 수 있다.
	// 자식class는 필요한 인터페이스를 골라서 상속할 수 있음
	@Override
	public void sound() {
		System.out.println("구구");
	}
	public void fly() {
		System.out.println("푸드득 비둘기 날다");
	}
}

public class InterfaceTest2 {

	public static void main(String[] args) {

		Dog1 d=new Dog1();
		Cat1 c=new Cat1();
		Pigeon1 p=new Pigeon1();
		d.sound();
		c.sound();
		p.sound();
		p.fly();

	}
}

/*
클래스 상속
1. 단일상속 : 하나의 클래스만 상속 가능.  자식class는 하나의 부모class만 가질 수 있다.
	다른 class의 기능을 사용하려면 포함관계로 구현해야 한다.
	포함관계?
	class A{}
	class B{
		A a=new A();
	}
	자동차 : 타이어, 엔진, 창문, 에어컨, 핸들, ...
	자동차 : 소나타, 아반떼, 그랜져, 스포티지, 카니발, ...

2. 부모class의 변수와 메서드를 상속받아 사용한다.
	부모class의 public, protected, default 제어자 변수와 메서드만 상속된다.
	자식class는 부모가 상속으로 주는 건 강제적으로 다 받아야 한다.

3. 강한 결합 : 부모class의 변경은 자식class에 영향을 준다.

인터페이스
1. 다중 구현 : 클래스가 여러 개의 인터페이스를 연결하여 구현할 수 있다.
2. 유연성 : 클래스는 필요한 인터페이스를 조합하여 구현할 수 있다.
3. 약한 결합 : 클래스는 필요한 인터페이스만 구현하면 되므로
	상속관계일 때 보다 유연성이 크다(상속보다 영향이 적다.)
- 인터페이스는 만들고 싶은 프로그램의 설계만 담당한다.
*/
