package java0704;

import java.util.Scanner;

public class javaMethod5 {

	public static void main(String[] args) {

//	// �� ���� ������ ��ȯ�ϱ�
//		MethodUtil util=new MethodUtil();
//		int[] num=util.twoNum();
//		System.out.print(num[0]+" "+num[1]);

//	// �簢���� �ʺ�� ���̸� �����ϰ� ���̸� ����ϼ���. ���̴� main�޼��忡�� ��µǰ� �ϼ���
//		Main a=new Main();
//		int[] d=a.area();
//		System.out.printf("�ʺ� %d, ���� %d�� �簢���� ���̴� %d�̴�.",d[0],d[1],d[0]*d[1]);

	// ?�� ����ÿ� �α��� ������ ���̵�� skyblue, ��й�ȣ�� 1234sea
	// login �޼��带 �����Ͽ� �α��� ���θ� ����ϼ���.
	// ���̵�, ��й�ȣ�� ��� ��ġ�ϸ� "�α��� ����" ���, �ϳ��� ����ġ�ϸ� "�α��� ����" ���
	// �α��� ���� ����� main���� �� ��.
//		? isFail=?;
//		if(?) {
//		?
//		}else {
//		?
//		}
//		Scanner scan=new Scanner(System.in);
//		Log a=new Log();
//		boolean isFail=a.login();
//		if(isFail) {
//			System.out.println("�α��� ����");
//		}else {
//			System.out.println("�α��� ����");
//		}
		
	// ���� �� ���� Ű����� �Է¹�������. �Է��� �� ������ ���� 100�� ������ 100-���� ����� ����ϰ� 100�� �������� ���� ����ϼ���.
	// main �޼��忡�� ����ϼ���.
		Num a=new Num();
		int[] aa=a.num();
		System.out.printf("�� ���� %d, %d, %d\n����� %d",aa[0],aa[1],aa[2],aa[3]);

	}
}
// ���� �� ���� Ű����� �Է¹�������. �Է��� �� ������ ���� 100�� ������ 100-���� ����� ����ϰ� 100�� �������� ���� ����ϼ���.
// main �޼��忡�� ����ϼ���. (a+b+c)
class Num{
	int[] num(){
		Scanner scan=new Scanner(System.in);
		System.out.print("���� �� ���� �Է��ϼ���");
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		if((a+b+c)>100) {
			return new int[] {a,b,c,100-(a+b+c)};
		}else {
			return new int[] {a,b,c,(a+b+c)};
		}
	}
}

// ?�� ����ÿ� �α��� ������ ���̵�� skyblue, ��й�ȣ�� 1234sea
// login �޼��带 �����Ͽ� �α��� ���θ� ����ϼ���.
// ���̵�, ��й�ȣ�� ��� ��ġ�ϸ� "�α��� ����" ���, �ϳ��� ����ġ�ϸ� "�α��� ����" ���
// �α��� ���� ����� main���� �� ��.
//class Log{
//	? login(){  // ����
//		Scanner scan=new Scanner(System.in);
//		System.out.print("���̵� : ");
//		String id=?;
//		System.out.print("��й�ȣ : ");
//		String password=?;
//		?
//		?
//		?
//		?
//		?
//		?
//	}
//}
//	boolean login() {  // ��?
//		Scanner scan=new Scanner(System.in);
//		System.out.print("���̵� : ");
//		String id=scan.nextLine();
//		System.out.print("��й�ȣ : ");
//		String password=scan.nextLine();
//		boolean check=true;
//		if(id.equals("skyblue")) {
//			if(password.equals("1234sea")) {
//				return check;
//			}
//		}
//		return check=false;
//	}
//}

////�簢���� �ʺ�� ���̸� �����ϰ� ���̸� ����ϼ���. ���̴� main�޼��忡�� ��µǰ� �ϼ���
//class Main{
//	int[] area() {
//		int w=(int)(Math.random()*50+1);
//		int h=(int)(Math.random()*50+1);
//		return new int[] {w,h};
//	}
//}

//class MethodUtil{
//	int[] twoNum() {
//		int num1=20, num2=50;
////		return num1;  // num1�� �ǵ����鼭 ���ÿ� �޼��� ����
////		return num2;  // �޼��尡 ����Ǿ��⿡ ������ �� �����Ƿ� ���� �߻�
////		return num1num2;  // num1num2 ��� �̸��� ���� ������ �ν��ϴµ� �̷� ������ �� ��������Ƿ� ���� �߻�
//		return new int[] {num1,num2};  // �迭 '�ϳ�'�� �����Ƿ� ����. �� �޼ҵ� �� int �� int[]
//	}
//}