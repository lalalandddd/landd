package java0717_2;

import java.util.Date;

@FunctionalInterface
interface moveable{  // �޼��带 �� �ϳ��� ������ �������̽� : �Լ��� �������̽�
	public void move();
}
class A<T>{
	T item;
	@SafeVarargs  // �� ������ ���� ������� �������.
	final void get(T... add) {  // �������� add�� ������� ���.
		
	}
}

public class MainClass {
	@Deprecated
	static void aaa() {}

	public static void main(String[] args) {

		aaa();
		Date today=new Date();
		@SuppressWarnings("all")
		ArrayList ist=new ArrayList();
		@SuppressWarnings("deprecation")
		today.getYear();

	}
}
/*
annotation �ֳ����̼�(������̼�) - �ּ�
�����ڸ� ���� �޸�/�ּ��� �ǹ��Ѵ�. ��, ��� ���ۿ� ������ ����.
�׷��� �ּ��� ������ ������ �뵵�� ������ �˾����� �� �ִ�. ������ ������ �ȴ�.
��ǻ�Ϳ��� Ư�� �ڵ��� ������ ����
ǥ�� annotation
	- @Override : �����Ϸ����� �޼��带 �������̵� �ϴ� ���̶�� �˷��ش�.
	- @Deprecated : ������ ������� ���� ����̶�� �˷��ش�.
	- @SuppressWarnings("") : �����Ϸ� ��� ������� �ʰ� ����. () �ȿ� text�� �־�� �Ѵ�.
		> all : ��� ��� ����
		> deprecation : ��������ʴ� ��� ���(��Ҽ�) ����
		> null : null ���� ��� ����
		> unchecked : ��Ȯ�� ���۷��̼� ���(�����) ����
		> unused : ������� �ʴ� �ڵ�/���ʿ��� �ڵ忡 ���� ��� ����
	- @FunctionalInterface : �Լ��� �������̽���� ���� �˷��ش�.
	- @SafeVarargs : ���׸��� ���� ���� ������ �Ű������� ����� �� ��� ����
��Ÿ annotation
	- @Target : �ֳ����̼��� ������ �� ������ ����� ����
	- @Documented : javadoc�� �ۼ��� ������ ����
	- @Inherited : ����Ŭ������ ��ӵǵ��� �� �� ���
	- @Retention : �ֳ����̼� �Ⱓ ����
	- @Repeatable : �ֳ����̼� �ݺ� ����
*/