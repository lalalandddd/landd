package java0710;

interface Animal{  // �θ� Ŭ����...�� �̹� �߻� �޼����̹Ƿ� sound��...
	static int a=10;
	final int b=10;  // ���� �Ұ��� ���
	static void mee() {
		
	}
	public void sound();  // �߻�޼��������� abstract�� �Ⱥٿ��� �ȴ�.
}
class Dog implements Animal{
	@Override
	public void sound() {
		System.out.println("�۸�");
	}
}
class Cat implements Animal{
	@Override
	public void sound() {
		System.out.println("�Ŀ�");
}
class Pigeon implements Animal{
	@Override
	public void sound() {
		System.out.println("����");
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
