package java0709_3;

public class Main_Method {

	public static void main(String[] args) {
/*
java에서 인터페이스 - 추상클래스의 한 종류 : 추상메서드만 가능!
	- 인스턴스 변수 불가능, 객체 생성 불가능
	- static 변수, static 메서드 선언 가능
	- 클래스들에 연결되어 사용된다.
	- 다형성 구현을 위해 사용한다.
	- 프로그램의 기본 틀을 구축할 수 있다.

서버에서 클라이언트에게 페이지를 제공한다. 아래 두 가지 메서드가 필요하다.
클라이언트의 요청을 받아주는 메서드 / 클라이언트가 원하는 페이지를 제공하는 메서드

상속 : 자바는 단일 상속만 가능하다. 그래서 편한 점과 불편한 점이 있다. (C++은 다중 상속이 가능하다.)
	다중 상속이 가진 장점을 활용하기 위해 interface를 사용한다.
 */
		move d=new dog();
		move c=new cat();
		d.moving();
		c.moving();

	}
}
class dog implements move{
	@Override
	public void moving() {
		System.out.println("성큼 성큼 이동한다.");
	}
}
class cat implements move{
	@Override
	public void moving() {
		System.out.println("사뿐 사뿐 이동한다.");
	}
}
interface move{
	static int a=10;
	public void moving();
}