package java0703;

import java.util.Scanner;

public class JavaMethod3 {

	public static void main(String[] args) {
		
//		// ���� �ΰ� �Է¹޾� ���� ����Ͻÿ� ... �翬�� class�� �����߰���?
//		Calc calc=new Calc();
//		calc.sum1(8,5);
//		calc.sum();
//		calc.minus();
//		calc.times();
//		calc.division();
		
//		// �� ������ ������ ���Ͽ� ����ϼ���
//		int kor=89, mat=74, eng=43;
//		Total total=new Total();
//		total.total(kor,mat,eng);  // ��,��,�� �� ���� ���� void total�� �ѱ�� void total�� �����Ѵ�.
		
//		// �޼��� ȣ���Ͽ� '�޼��� dog����~' ��� ���
//		Call call=new Call();
//		call.aaa();
		
//		// ���� a,b�� ���� ����ϴ� �޼���
//		Print1 print=new Print1();
//		print.view();
		
//		// �޼��带 ȣ���Ͽ� �̸��� ���̸� ����ϼ���. �Ű����� ���� �޼���, Ű���� �Է� X
//		Print2 print=new Print2();
//		print.view();
		
//		// �޼��带 ȣ���Ͽ� �Ʒ��� �����͸� ����ϼ���.
//		String animal="��帮Ʈ����";
//		String ������="2024-07-01";
//		Dataprint dataprint=new Dataprint();
//		dataprint.print3(animal,������);
		
//		// ���� ��¥ �߿��� ���� �ϸ� ����ϼ���. ���ڿ� �޼��� substring �Ǵ� split ���
//		String examDate="2024-08-13";
//		Pprint pprint=new Pprint();
//		pprint.print4(examDate);
		
		// �� ����� ���� ����� ���Ͽ� ����ϼ���. ��հ��� �����Դϴ�.
		int ���=31, ����=23, ����=28, ���=37;
		Age ages=new Age();
		ages.print5(���,����,����,���);

	}

}
// �ν��Ͻ� �޼���, �ν��Ͻ� ������ ��ü(�ν��Ͻ�)�� ���� ����Ѵ�. ��, ��ü�� ���� ������ �Ѵ�. print.view();
// static�� �پ��ִ� Ŭ���� �޼���, Ŭ���������� Ŭ���� �̸����� ����Ѵ�. Print2.view();

// �� ����� ���� ����� ���Ͽ� ����ϼ���. ��հ��� �����Դϴ�.
class Age{
	void print5(int a, int b, int c, int d) {
		int avg=(a+b+c+d)/4;
		float avg2=(a+b+c+d)/4f;
		System.out.printf("�� ����� ������ ����� %5d�� �Դϴ�.\n",avg);
		System.out.printf("�� ����� ������ ����� %.2f�� �Դϴ�.",avg2);
	}
}
//// ���� ��¥ �߿��� ���� �ϸ� ����ϼ���. ���ڿ� �޼��� substring �Ǵ� split ���
//class Pprint{
//	void print4(String a) {
//		String aa=a.substring(5,7);
//		String bb=a.substring(8,10);
//		String[] cc=a.split("-");
//		System.out.printf("%2s��\n%2s��\n",cc[1],cc[2]);
//		System.out.printf("%2s��\n%2s��",aa,bb);
//	}
//}

////�޼��带 ȣ���Ͽ� �Ʒ��� �����͸� ����ϼ���.
//class Dataprint{
//	void print3(String a, String b) {
//		System.out.printf("���� : %s\n������ : %s",a,b);
//	}
//}

////�޼��带 ȣ���Ͽ� �̸��� ���̸� ����ϼ���. �Ű����� ���� �޼���, Ű���� �Է� X
//class Print2{
//	void view() {
//		String name="���̸�";
////		String age="����";
//		int age=41;
//		System.out.print(name+" "+age);
//	}
//}

////���� a,b�� ���� ����ϴ� �޼���
//class Print1{
//	void view() {
//		int a=10, b=20;
//		System.out.print(a+" "+b);
//	}
//}

////�޼��� ȣ���Ͽ� '�޼��� dog����~' ��� ���
//class Call{
//	void aaa() {
//		System.out.println("�޼��� dog����~");
//	}
//}

////�� ������ ������ ���Ͽ� ����ϼ���
//class Total{
//	void total(int a, int b, int c) {  // �� ���� ���� �����´�.
//		int total=a+b+c;
//		System.out.printf("���� %d�� ���� %d�� ���� %d�� \n���� = %d��",a,b,c,total);
//	}
//}

////	���� �ΰ� �Է¹޾� ���� ����Ͻÿ� ... �翬�� class�� �����߰���?
//class Calc{
//	void sum1(int num1, int num2) {  // �ܺο��� ������ �޾Ƽ� Ȱ��
//		int result=num1+num2;
//		System.out.printf("%d + %d = %d\n",num1,num2,result);
//	}
//	void sum() {  // ���� ������ Ȱ��
//		Scanner scan=new Scanner(System.in);
//		System.out.println("ù ��° ���� : ");
//		int num1=scan.nextInt();
//		System.out.println("�� ��° ���� : ");
//		int num2=scan.nextInt();
//		int result=num1+num2;
//		System.out.printf("%d + %d = %d\n",num1,num2,result);
//	}
//	void minus() {
//		Scanner scan=new Scanner(System.in);
//		System.out.println("ù ��° ���� : ");
//		int num1=scan.nextInt();
//		System.out.println("�� ��° ���� : ");
//		int num2=scan.nextInt();
//		int result=num1-num2;
//		System.out.printf("%d - %d = %d\n",num1,num2,result);
//	}
//	void times() {
//		Scanner scan=new Scanner(System.in);
//		System.out.println("ù ��° ���� : ");
//		int num1=scan.nextInt();
//		System.out.println("�� ��° ���� : ");
//		int num2=scan.nextInt();
//		int result=num1*num2;
//		System.out.printf("%d �� %d = %d\n",num1,num2,result);
//	}
//	void division() {
//		Scanner scan=new Scanner(System.in);
//		System.out.println("ù ��° ���� : ");
//		int num1=scan.nextInt();
//		System.out.println("�� ��° ���� : ");
//		int num2=scan.nextInt();
//		float result=num1/num2f;
//		System.out.printf("%d �� %d = %.2f\n",num1,num2,result);
//	}
//}