package java0627;

public class Bitop {

	public static void main(String[] args) {

		// ������

		// ������ ������ �����ϸ� ����� ����
		// ������ �Ǽ��� �����ϸ� ����� �Ǽ�

		// ��������� +, -, *, /(��), %(������)
		// ���������� ++, --
		// �ڹٿ� ���������� ���� �ִ��� ���߿� �ִ��Ŀ� ���� ������ ������ �޶�����.
		// ���Կ����� =
		// ���մ��Կ����� +=, -=, *=, /=, %=
		// �񱳿����� >, <, >=, <=, ==, !=
		//   �񱳿����� ����(���ڿ��� ����ؾ� �Ѵ�. �ڹٴ� ���ڿ��� �� ����)
		//   ���ڸ� ���Ϸ��� equals�� ����ؾ� �Ѵ�.
		// �������� &&, ||, !
		// ���ǿ����� (���ǽ�) ? �� : ����;  (�ڹٿ� ����)
		// ��Ʈ������ : ��Ʈ �� ������ &, |, ~, ^
		// ��Ʈ������ : ��Ʈ ����Ʈ ������ >>, <<

//		System.out.println(10/3);
//		System.out.println(10%3);
//		System.out.println(10/3.0);
//		System.out.println(10%3.0);
//		System.out.println(10/(float)3);
//		System.out.println(10%(float)3);

//		int a=10;
//		a+=3;
//		System.out.println(a);

//		System.out.println(10==20);
//		System.out.println(10==3.14);
//		System.out.println("�̼���"=="������");
//		String name1="�̼���", name2="������", name3="�̼���";
//		System.out.println(name1==name2);
//		System.out.println(name1.equals(name2));
//		System.out.println("�̼���"=="�̼���");
//		System.out.println(name1==name3);
//		System.out.println(name1.equals(name3));

//		System.out.println(34&15);
//		System.out.println(42|21);
//		System.out.println(~28);  // ��ȣ��Ʈ�� ����� 35�� �ƴ϶� -29�� ���´�.....
//		System.out.println(~-44);
//		System.out.println(33^17);
//		System.out.println(33<<2);
//		System.out.println(-33<<2);
//		System.out.println(11>>2);

		// << 2�� n���� ���� ��
		System.out.println(1<<4);  // 2�� 4��
		System.out.println(1<<20);  // ???
		// >> 2�� n�� ��ŭ ���� ��
		System.out.println(1024>>3);  // 1024�� 2�� 3���� ������

		int red=188;
		int green=229;
		int blue=92;
		int color=(red<<16)|(green<<8)|blue;
		System.out.printf("#%06X \n ",color);  // RGB ���� ����ڵ�(16����)�� ��ȯ

	}

}
