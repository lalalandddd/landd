package java0710;

abstract class animal {  // �θ� Ŭ����
//	public abstract void fly();  // ��,��,�� �� �� �� ������ �̰� ������ ������ �޾ƾ� �Ѵ�.
// ���� ���� ���̸� �ڽ�Ŭ������ �߻�Ŭ������ �Ǿ�� �ϴµ� �׷��� ��ä�� ���� �� �����Ƿ� �� �ȴ�...
	public abstract void sound();  // class ����� ���� �Ѱ���
}
class Dog extends animal{
	@Override
	public void sound() {
		System.out.println("�۸�");
	}
}
class Cat extends animal{
	@Override
	public void sound() {
		System.out.println("�Ŀ�");
	}
}
class Chicken extends animal{
	@Override
	public void sound() {
		System.out.println("������");
	}
}
class Pigeon extends animal{
	@Override
	public void sound() {
		System.out.println("����");
	}
}
class Cow extends animal{
	@Override
	public void sound() {
		System.out.println("����");
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
// �������� �Ҹ��� ����Ѵ�. (��, �����, ��, ��ѱ�, �� ���) > ���ͳݿ��� �Ҹ��� �޾ƾ� �Ѵ�.
// �� ������ ���� �ٸ� ��ü�̱� ������ ������ Ŭ������ ����
// ������ ��, �����, �� ���� ������ ������ �����ϹǷ� animal �θ� Ŭ������ �ΰڴ�.