package java0710;

abstract class animal {  // 부모 클래스
//	public abstract void fly();  // 개,냥,소 는 날 수 없지만 이게 있으면 무조건 받아야 한다.
// 받지 않을 것이면 자식클래스가 추상클래스가 되어야 하는데 그러면 객채를 만들 수 없으므로 안 된다...
	public abstract void sound();  // class 상속은 오직 한개만
}
class Dog extends animal{
	@Override
	public void sound() {
		System.out.println("멍멍");
	}
}
class Cat extends animal{
	@Override
	public void sound() {
		System.out.println("냐옹");
	}
}
class Chicken extends animal{
	@Override
	public void sound() {
		System.out.println("꼬끼오");
	}
}
class Pigeon extends animal{
	@Override
	public void sound() {
		System.out.println("구구");
	}
}
class Cow extends animal{
	@Override
	public void sound() {
		System.out.println("음메");
	}
}

public class InterfaceTest1 {

	public static void main(String[] args) {

		animal d=new Dog();
		animal c=new Cat();
		animal ch=new Chicken();
		animal p=new Pigeon();
		animal co=new Cow();
		d.sound();
		c.sound();
		ch.sound();
		p.sound();
		co.sound();

	}
}
// 동물들의 소리를 출력한다. (개, 고양이, 닭, 비둘기, 소 등등) > 인터넷에서 소리를 받아야 한다.
// 각 동물은 서로 다른 개체이기 때문에 각각의 클래스로 구현
// 하지만 개, 고양이, 닭 들은 동물로 통합이 가능하므로 animal 부모 클래스를 두겠다.