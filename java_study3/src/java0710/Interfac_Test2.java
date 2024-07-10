package java0710;

interface Animal{  // 부모 클래스...가 이미 추상 메서드이므로 sound에...
	static int a=10;
	final int b=10;  // 변경 불가능 상수
	static void mee() {
		
	}
	public void sound();  // 추상메서드이지만 abstract를 안붙여도 된다.
}
class Dog implements Animal{
	@Override
	public void sound() {
		System.out.println("멍멍");
	}
}
class Cat implements Animal{
	@Override
	public void sound() {
		System.out.println("냐옹");
}
class Pigeon implements Animal{
	@Override
	public void sound() {
		System.out.println("구구");
}

public class Interfac_Test2 {

	public static void main(String[] args) {

		Dog d=new Dog();
		Cat c=new Cat();
		Pigeon p=new Pigeon();
		d.sound();
		c.sound();
		p.sound();

	}

}
