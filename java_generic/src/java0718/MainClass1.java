package java0718;

import java.util.Scanner;

public class MainClass1 {

	public static void main(String[] args) {

// ���� ���� ������ ������ �� ��. �����带 �޾Ƽ� ����Ʈ�ؾ� ��...
		MyThread th=new MyThread();  // ������ ��ü ����
		th.start();  // ������ ����
//		Scanner scan=new Scanner(System.in);
//		System.out.println("������ �Է��ϼ���");
//		int a=scan.nextInt();
//		System.out.println(a);
		for(int i=1;i<11;i++) {
			System.out.println("      ���¾� Main "+i);
			try {
				Thread.sleep(1500);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}

//		for(int i=1;i<101;i++) {
//			System.out.print("\n0."+i+"��");
//			try {
//				Thread.sleep(100);
//			}catch(InterruptedException e) {
//				e.printStackTrace();
//			}
//		}

	}
}
class MyThread extends Thread{
	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("���� �������!"+i);
			try {
				Thread.sleep(1000);  // 1�ʾ� ������ ����, ������ ����� ������ ����
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
/*
���μ��� - CPU�� ���� �޸�(ram)�� �ε�Ǿ��ִ� ���α׷��� ���Ѵ�.
	�� ���� ���� ���α׷����� ���μ����̴�.
	102���� ���μ����� �ִ� = 102���� ���α׷� �������̴�
����ǻ�Ϳ��� �������� ���μ��� Ȯ�� ���
1. �ϴ� �۾�ǥ���� ��Ŭ��, �۾������� ����, ���μ���
2. ���������Ʈâ(������+R > cmd) ���� tasklist �Է�
3. Ctrl+Alt+Delete > �۾�������
���μ��� ���� - ���������Ʈ : taskkill /pid[pid��] (pid = ���μ���id)
			 �۾������� : ��Ŭ�� > �۾�������
������ - ���μ��� �ȿ��� ������ ������ �����ϴ� ����
		�����带 �߰��ϸ� ���ÿ� ���� ������ ������ �� �ִ�.
�ڹ� ������
������ ������ (����Ʈ�ؾ� ��)
java api ���� �˻� > Overview (Java Platform SE 8 ) Ŭ�� > Thread ã�Ƽ� Ŭ�� > �ٿ� �޾Ƽ� ���......
Thread() : ���ο� ������ ��ü �Ҵ� (x�� �����ϸ� x�� ���� ó�� ������ �����尡 ���������.) 
Thread("�������̸�")

�������� ����
���� �غ�(new)
����(run)
	������ ���� block, waiting, timeWating
		block(lock) : �� ����
		waiting(���) : �� �����尡 ����Ǿ�� �� �����尡 ����ȴ�.
		timawaiting(sleep) : ������ �ð� ���� ����ߴٰ� �ð��� �Ǹ� ����
����(dead)

������ ���� �޼���
	- sleep(�и�������) : ������ �ð� ��ŭ ���
	- start() : ������ ����, run() �޼��忡�� ȣ��
	- join() : �ش� �����尡 ���� ������ ���� ������ ���
	- run() : �����尡 �����ϴ� �޼���
	- stop() : ������ �ߴ�(�������� ����)
	- interrupt() : ������ �ߴ�(����)
	- setPriority(������) : �������� �켱����
	- setPriority() : ������ �������� �켱������
	- isAlive() : ���� �����尡 ����ֳ�(������� �ʾҳ� > ����ǰų� ������ΰ�)
	- suspend() : ������ �Ͻ�����(�������� ����)
	- yield() : �ٸ� �����忡�� ������¸� �纸�ϰ� ���
	- resume() : �Ͻ������� �����带 ����(�������� ����)
	- notify() : ��� ���¿� �ִ� �����带 ���� ���� ��ȯ/���� ��� ���¿� �ִ� �����带 ����
*/