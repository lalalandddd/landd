package java0627;

import java.util.Scanner;

public class Loop {

	public static void main(String[] args) {

		// �ݺ��� for, while, do~while  (java�� ����, ����� ��� ����)
		// for(�ʱⰪ;���ǽ�;������){�ݺ�����} �ʱⰪ�� var�� �ƴ϶� ���� Ÿ���� ��� �Ѵ�.
		// ���ǽ��� ������ �� ������(���̸�) �ݺ������� ��� ����, ���ǽ��� �����̸� ����
		// �迭�� �����ؼ� ���� ���δ�.
		
//		for(int i=1;i<=9;i++) {
//			System.out.printf("��... �ݺ���....%d\n",i*2-1);
//		}
		
//		int num=1;
//		num=num+1;
//		System.out.println(num);  // 2
//		num=num+2;
//		System.out.println(num);  // 4
//		num=num+3;
//		System.out.println(num);  // 7
		
//		int num=1, a=1;
//		num=num+a;
//		System.out.println(num);  // 2
//		a++;
//		num=num+a;
//		System.out.println(num);  // 4
//		a++;
//		num=num+a;
//		System.out.println(num);  // 7
//		a++;
		
		// �� ��ƾ�� �ݺ������� ������?
//		int num=1;
//		for(int a=1;a<4;a++) {
//			num=num+a;
//			System.out.println(num);
//		}
		
		// ���� �Է��� ���ڱ����� �� ���� ���ϼ���
		Scanner scan=new Scanner(System.in);
		System.out.println("������ �Է��ϼ���");
		int a=scan.nextInt();
		int c=0;
		for(int b=1;b<=a;b++) {
			c=c+b;
		}
		System.out.printf("1���� %d������ �� ���� %d�̴�.",a,c);

	}

}
