package java0626;

import java.util.Scanner;  // Scanner Ŭ������ ��ġ�� ���������(�����;�) Scanner�� �� �� �ִ�.
// ������ ��ġ�� package �ٷ� �Ʒ�
// �ٵ� ��� ��ɾ �̷� ������ ������ ���� ���� �븩�̶�...
// �Ʒ� Scanner�� ���콺�� ��� ������ ������ ������ �˾����� import Scanner(java.util)�� ������ �˾Ƽ� ������.
// �ٸ� ��ɾ ����

public class Input1 {

	public static void main(String[] args) {
		
//		System.out.println("�ڹ����");
		// System.out - ��� ��� System.in - �Է�
		// �Է¹��� �� �ִ� ���� Ŭ���� : Scanner
		// �̷��� �ؾ� ���ڸ� �Է¹��� �� �ִ�. �� class �� �ѹ��� �ϸ� �ȴ�.
		// �ٵ� �� ���� ��? �� import �κп� ����...
		
		// new�� �ڹٿ��� �迭, ��ü�� ���� ���� �� ����߾���... �� �̰� ���ĸ� �ѱ� ������ �޸� ǥ ����
		
//		int a=scan.nextInt();  // Int�� ���� Ÿ��... �ٸ� Ÿ�Ե� ��� ���� ��, char(����)�� ����.
		// ���ڿ� �Է��� nextLint(), next()  ���ڴ� ����.
//		System.out.println(a);
		
		// ö���� ������ �Ա� ���� �������� ����. ��Զ��, �ﰢ���, �ٳ��������� �Ծ���. ���ɰ��� �󸶸� �����ߴ°�?
//		System.out.println("�밳��� ������?");
//		int crapRamyeon=scan.nextInt();
//		System.out.println("�ﰢ��� ������?");
//		int triGimbap=scan.nextInt();
//		System.out.println("�ٳ������� ������?");
//		int bananaMilk=scan.nextInt();
//		int price=crapRamyeon+triGimbap+bananaMilk;
//		System.out.println("������ ���ɰ� : "+price);
		// ����� ����
//		int crapRamyeon,triGimbap,bananaMilk;
//		System.out.println("�밳��� ������?");
//		crapRamyeon=scan.nextInt();
//		System.out.println("�ﰢ��� ������?");
//		triGimbap=scan.nextInt();
//		System.out.println("�ٳ������� ������?");
//		bananaMilk=scan.nextInt();
//		int price=crapRamyeon+triGimbap+bananaMilk;
//		System.out.printf("������ ���ɰ� : %d ��\n",price);
		
		// �μ��� ģ������ ������ ���Դ�. ���ͼ� ���� ������ ���� �ͼ� ���� ���� �Դ�.
		// �̹����� �Ź��� ¦¦�̷� �ž �ٽ� ���� ���� �Դ�.
		// �μ��� ���� 5���̴�. �μ��� 1�� �ö󰡴µ� 3.4�ʰ� �ɸ���.
		// �μ��� ���� ���� ���Դ� �ϴµ� �ɸ� �� �ð���?
//		int floor;
//		float time, moveTime;
//		moveTime=3.4f;
//		floor=5;
//		time=(floor-1)*moveTime*5;
//		System.out.printf("�μ��� �̵��� �ð� : %.1f��\n",time);
		
		// ���α׷� �ڵ�� ������ �Ʒ��� ���������� ����Ǵ� ���� �⺻�̴�.
		// ���� : ���ǹ�, �ݺ���, �Լ�(�޼���), goto��
		
		// c���, �ڹ�, �����а��� ���� ������ �Է��ϼ���. �� ������ ������ ����� ���� ����ϼ���.
		int cLang, java, archi, sum;
		float avg;
		System.out.println("c��� ������?");
		cLang=scan.nextInt();
		System.out.println("�ڹ� ������?");
		java=scan.nextInt();
		System.out.println("�����а��� ������?");
		archi=scan.nextInt();
		sum=cLang+java+archi;
		avg=sum/3f;
		System.out.printf("���� : %d��, ��� : %.1f��\n",sum,avg);

	}

}
