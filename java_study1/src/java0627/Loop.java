package java0627;

import java.util.Scanner;

public class Loop {

	static Scanner scan=new Scanner(System.in);  // void main �ۿ� scan

	public static void main(String[] args) {

//		Scanner scan=new Scanner(System.in);  // void main �ȿ� scan

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
//		Scanner scan=new Scanner(System.in);
//		System.out.println("������ �Է��ϼ���");
//		int a=scan.nextInt();
//		int c=0;
//		for(int b=1;b<=a;b++) {
//			c=c+b;
//		}
//		System.out.printf("1���� %d������ �� ���� %d�̴�.",a,c);
		
		// for(;;){} || for(;true;){} = ���ǽ��� �̷��� �Ǹ� ���ѷ��� Terminate ������ ��������
		
		// �ݺ��� �ۼ� ��, �ݺ� Ƚ��, ���� �ñ�(���ǽ�) ���� �����ؾ� �Ѵ�.
		// ���ѷ��� ���� ���
		// 1. ���ǹ� ���ǽ� ����ݺ����� break; ���� (if���� �ܵ����� break�� �� �� ����)
		// 2. �ݺ��� ���ǽ� ����
		// 3. return; �ݺ��� �޼��带 �����Ų��.
		
//		for(;true;) {  // 1. ���ǹ�
//			System.out.print("���� �Է� : ");
//			int num=scan.nextInt();
//			if (num==0) {
//				System.out.println("0? ����!!");
//				break;
//			}
//		}

//		Scanner scan=new Scanner(System.in);	
//		int num1=1;
//		for(;num1!=0;) {  // 2. �ݺ���
//			System.out.print("���� �Է� : ");
//			int num1=scan.nextInt();
//			if (num1==0) {
//			}
//			System.out.println("0? ����!!");
//		}

//		for(int i=1;i<=10;i++) {
//			System.out.println(i+"��° �ݺ� ����");
//			if(i%3==0){continue;}  // continue�� �ݺ����� �������� �׳� �Ѱܹ�����. �Ʒ� ����
//			System.out.println(i+"��° �ݺ� ������");
//			System.out.println(i+"��° �ݺ� ������ ����");
//		}
		
		// �ڹ��� ����
//		int random=(int)Math.floor(Math.random()*10+1);
//		System.out.println(random);
		
		// ���� �� ��� ����϶�. (1~50) ��, 11�� ����� ������ �����϶�.
//		for(int i=1;true;i++) {
//			int random=(int)(Math.random()*50+1);
//			System.out.println(random);
//			if(random%11==0) {
//				System.out.printf("%dȸ���� ����!",i);
//				break;
//			}
//		}
		
		// up / down �����
		// ��ǻ�Ͱ� ������ ����(20~100 ����) ���߱�
		int cpu=(int)(Math.random()*81+20);
		System.out.println("Up/Down 20~100 ���߱�");
		for(int j=1;true;j++) {
			System.out.print("20~100 ������ ���ڸ� �Է��ϼ��� : ");
			int user=scan.nextInt();
			if(user<20||user>100) {
				System.out.println("20~100 ������ ���ڸ� ��Ȯ�� �Է��ϼ���!");
			}else if(user==cpu) {
				System.out.printf("��ǻ�Ͱ� ������ %d %dȸ ���� ����!",cpu,j);
				break;
			}else if(user>cpu) {
				System.out.println("Down!");
			}else {
				System.out.println("Up!");
			}
		}
		
		// up / down ����� ������ CPU!!
//		int cpu1=0, user1=0, max=150, min=50;
//		System.out.println("Up/Down 50~150 ���߱� - ������ CPU!!");
//		for(;true;) {
//			System.out.print("50~150 ������ ���ڸ� �Է��ϼ��� : ");
//			user1=scan.nextInt();
//			if(user1>150||user1<50) {
//				System.out.println("50~150 ������ ���ڸ� ��Ȯ�ϰ� �Է��ϼ���!");
//			}else {break;}
//		}
//		for(int j1=1;true;j1++) {
//			cpu1=(int)(Math.random()*(max-min+1)+min);
//			if(user1==cpu1) {
//				System.out.printf("������ ������ %d CPU�� %dȸ ���� ����!",user1,j1);
//				break;
//			}
//			if(user1>cpu1) {
//				System.out.printf("%d, Up\n",cpu1);
//				min=cpu1+1;
//			}else {
//				System.out.printf("%d, Down\n",cpu1);
//				max=cpu1-1;
//			}
//		}

		// �̸��� ���� �ݺ���
//		int sum=0;
//		���:  // �ݺ����� �̸�
//		for(int i=0;i<=10;i++) {
//			sum=sum+i;
//			System.out.printf("%d, %d\n",i,sum);
//			if(sum>20) {
//				break ���;  // ����̶� �̸��� ���� �ݺ����� ����
//			}
//		}
		
//		int sum=0;
//		���ϱ�: for(int i=1;i<=10;i++) {
//			for(int k=1;k<=4;k++) {
//				if(sum+k>40)break ���ϱ�;
//				sum=sum+k;
//				System.out.println("      "+k);
//			}
//			System.out.println(i);
//			sum=sum+i;
//		}
//		if(sum<40) {
//			System.out.println("sum ��� : "+sum);
//		}
		
		// ����Ų��� 31! com�� user�� ���� �Ѵ�. �̸� �ִ� �ݺ����� ����Ѵ�.
		// �� ���� ������ �� �ִ� ���ڴ� �ּ� 1�� �ִ� 3��
		// 31�� �Է��ϴ� ���� �й��Ѵ�!
//		int num=0, user=0, com=0, win=0;
//		����Ų: for(;;) {  // while(true)  �� ������ ������ �Ѵ�.
//			System.out.println("User ���� �? (1~3��) : ");
//			user=scan.nextInt();
//			System.out.print("�� : ");
//			for(int u=1;u<=user;u++) {
//				System.out.print(num+" ");
//				if(num==31) break ����Ų;
//				num++;
//			}
//			win=1;
////			break;  // for ���� �ΰ��̹Ƿ� ������ break�� �ι� ������ ������, ������ ���� for�� �̸��� �������Ƿ� �ʿ䰡 ��������
//			System.out.println();
//		
//			com=(int)(Math.random()*3+1);
//			System.out.print("Com : ");
//			for(int c=1;c<=com;c++) {
//				System.out.print(num+" ");
//				if(num==31) break ����Ų;
//				num++;
//			}
//			win=2;
//		}
//		if(win==2) {
//		System.out.println("\nCom�� �̰��!");
//		}else {System.out.println("\n���� �̰��!");}

	}

}
