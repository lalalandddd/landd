package java0718;

import java.util.Scanner;

public class MainClass2 {

	public static void main(String[] args) throws InterruptedException {

		Th1 th=new Th1();  // �Ϲ� Ŭ���� ��ü ����(������ Ŭ���� ��ü�� �ƴϴ�)
//		th.run();
		new Thread(th).start(); // ������ ��ü ����
		for(int i=1;i<=5;i++) {
			System.out.println("��� ���� ���� ����"+i);
			Thread.sleep(2000);  // ���콺 ��� throw ���� ��
		}

	}
}
class Th1 implements Runnable{
// Ŭ������ �߻�޼��尡 �ִٸ� �޼��带 ���� �����ų� �߻�Ŭ������ �Ǿ�߸� �Ѵ�. �װ� �� �ż� ó���� Th1�� ������ ���.
// ������ �߻�Ŭ������ ��ü�� ������ �� ���µ� ��ü�� �����ؾ� �Ѵ�... �׷��� Th1�� ���콺�� ��� ù��° �׸��� Ŭ���Ѵ�.
// �׷��� ������ �������.
	@Override
	public void run() {
		Scanner sc=new Scanner(System.in);
		System.out.print("�����Է� : ");
		int a=sc.nextInt();
		System.out.print("�Է¼��� : "+a+"\n");
	}
}