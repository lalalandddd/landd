package java0710;

interface Animal1{  // �θ�Ŭ����1...�� �̹� �߻� �޼����̹Ƿ� sound��...
	static int a=10;
	final int b=10;  // ���� �Ұ��� ���
	static void mee() {
		
	}
	public void sound();  // �߻�޼���1 abstract�� �Ⱥٿ��� �ȴ�.
}
interface bird{  // �θ�Ŭ����2
	public void fly();  // �߻�޼���2
}
class Dog1 implements Animal1{
	@Override
	public void sound() {
		System.out.println("�۸�");
	}
}
class Cat1 implements Animal1{
	@Override
	public void sound() {
		System.out.println("�Ŀ�");
	}
}
class Pigeon1 implements Animal1 , bird{
	// interface�� ����� ���� �� ����� �� �ִ�.
	// �ڽ�class�� �ʿ��� �������̽��� ��� ����� �� ����
	@Override
	public void sound() {
		System.out.println("����");
	}
	public void fly() {
		System.out.println("Ǫ��� ��ѱ� ����");
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
Ŭ���� ���
1. ���ϻ�� : �ϳ��� Ŭ������ ��� ����.  �ڽ�class�� �ϳ��� �θ�class�� ���� �� �ִ�.
	�ٸ� class�� ����� ����Ϸ��� ���԰���� �����ؾ� �Ѵ�.
	���԰���?
	class A{}
	class B{
		A a=new A();
	}
	�ڵ��� : Ÿ�̾�, ����, â��, ������, �ڵ�, ...
	�ڵ��� : �ҳ�Ÿ, �ƹݶ�, �׷���, ����Ƽ��, ī�Ϲ�, ...

2. �θ�class�� ������ �޼��带 ��ӹ޾� ����Ѵ�.
	�θ�class�� public, protected, default ������ ������ �޼��常 ��ӵȴ�.
	�ڽ�class�� �θ� ������� �ִ� �� ���������� �� �޾ƾ� �Ѵ�.

3. ���� ���� : �θ�class�� ������ �ڽ�class�� ������ �ش�.

�������̽�
1. ���� ���� : Ŭ������ ���� ���� �������̽��� �����Ͽ� ������ �� �ִ�.
2. ������ : Ŭ������ �ʿ��� �������̽��� �����Ͽ� ������ �� �ִ�.
3. ���� ���� : Ŭ������ �ʿ��� �������̽��� �����ϸ� �ǹǷ�
	��Ӱ����� �� ���� �������� ũ��(��Ӻ��� ������ ����.)
- �������̽��� ����� ���� ���α׷��� ���踸 ����Ѵ�.
*/
