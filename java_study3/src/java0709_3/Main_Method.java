package java0709_3;

public class Main_Method {

	public static void main(String[] args) {
/*
java���� �������̽� - �߻�Ŭ������ �� ���� : �߻�޼��常 ����!
	- �ν��Ͻ� ���� �Ұ���, ��ü ���� �Ұ���
	- static ����, static �޼��� ���� ����
	- Ŭ�����鿡 ����Ǿ� ���ȴ�.
	- ������ ������ ���� ����Ѵ�.
	- ���α׷��� �⺻ Ʋ�� ������ �� �ִ�.

�������� Ŭ���̾�Ʈ���� �������� �����Ѵ�. �Ʒ� �� ���� �޼��尡 �ʿ��ϴ�.
Ŭ���̾�Ʈ�� ��û�� �޾��ִ� �޼��� / Ŭ���̾�Ʈ�� ���ϴ� �������� �����ϴ� �޼���

��� : �ڹٴ� ���� ��Ӹ� �����ϴ�. �׷��� ���� ���� ������ ���� �ִ�. (C++�� ���� ����� �����ϴ�.)
	���� ����� ���� ������ Ȱ���ϱ� ���� interface�� ����Ѵ�.
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
		System.out.println("��ŭ ��ŭ �̵��Ѵ�.");
	}
}
class cat implements move{
	@Override
	public void moving() {
		System.out.println("��� ��� �̵��Ѵ�.");
	}
}
interface move{
	static int a=10;
	public void moving();
}