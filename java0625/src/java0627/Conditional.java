package java0627;

import java.util.Scanner;

public class Conditional {

	public static void main(String[] args) {

		// ���ǹ� if, switch  (java�� ����, ����� ��� ����)

		// �׳� ��� �����͸� ����� ���� ���ǹ��� ����Ѵ� = (�����Ͱ� ������) ���, �̰� ������ ������ ���...
		
		// if���� ���ǽ� : �񱳿�����, �������ڷ� ��/���� ������ ������ ���� �����.
		// Ű�� 150 �̻�  :  Ű>=150
		// 10������ ���� ����  :  ���⳻����¥(��)==10
		// 32000�� �̻� ���� ����  :  ���⳻��(����ݾ�)>=32000
		// �Ǹ����� ��ǰ�鸸 ���  :  ��ǰ ����==�Ǹ�, ������>0

//		int tall=135;
//		if( tall>=150 ) {  // Ű�� 150 �̻��ΰ�?
//			System.out.println("����ŷ ž�� ����");  // 150 �̻��� �´ٸ� ����
//		}else {
//			System.out.println("����ŷ ž�� �Ұ���");  // 150 �̻��� �ƴϸ� ����
//		}
		
		// ���� �հ� ���� : 60�� �̻�
//		int score1=72;
//		if(score1>=60) {
//			System.out.printf("%d��, ���� �հ�!",score1);
//		}else {
//			System.out.printf("%d��,  ���� ���հ�!",score1);
//		}
		
		// if~else : ���ǽ��� ��/������ ���� ����Ǵ� ������ �ٸ� ���
		// �ϳ��� ���ǿ� �� ���� ������ �ִ� ���, if~else ������ �ۼ�
		
		// ���� ���� ��� 1
//		int score2=89;
//		if(score2>=90) {
//			System.out.println("A Grade");
//		}else if(score2>=80) {
//			System.out.println("B Grade");
//		}else {
//			System.out.println("get out!");
//		}
		
		// ���� ���� ��� 2  A(90���̻�), B(80���̻�), C(70�� �̻�), D(60�� �̻�), F(������)
//		int score3=48;
//		if(score3>=90) {
//			System.out.printf("%d��, A Grade", score3);
//		}else if(score3>=80) {
//			System.out.printf("%d��, B Grade", score3);
//		}else if(score3>=70) {
//			System.out.printf("%d��, C Grade", score3);
//		}else if(score3>=60) {
//			System.out.printf("%d��, D Grade", score3);
//		}else {
//			System.out.printf("%d��, F Grade", score3);
//		}
		
		// switch�� - ���� ������ case�� �����Ͽ� case�� ��ġ�ϴ� ���̸� �ߵ��Ǵ� ���ǹ�
		// ���ǽĿ� == �����ڸ� ����ϸ� switch�� �ۼ��ϴ� ���� �������
		
/*		������ ������ ������. ����Ű(w,a,s,d) �Ͻ�����(p) ����ϱ�(o) ó������(i) ���ӽ���(ctrl+s)
		String key=null, key2=null;
		switch(key) {
			case 'w': ���೻��
			case 'a': ���೻��
			case 's': ���೻��
			case 'd': ���೻��
			case 'p': ���೻��
			case 'o': ���೻��
			case 'i': ���೻��
			case 'ctrl':
				switch(key2) {
				case 's': ���೻��
				}
		}
		
		���α׷��� �޴� ����
		switch(menu){
			case "open":
			case "save":
			case "build":
			case "git":
			case "exit":
		}
*/
		
		// ���� ��ư Ŭ���ϸ� ���� ����, ���� ��ư Ŭ���ϸ� ���� ����, ���� ��ư Ŭ���ϸ� ���� ����
//		String button="����";
//		switch (button) {
//			case "����":
//				System.out.println("���� ����!");
//				break;  // �̰� ġ�� ������ �Ʒ� ������� ��� �����Ѵ�. �ݵ�� ����!
//			case "�ڵ�����":
//			case "����":
//				System.out.println("���� ����!");
//				break;
//			case "����":
//				System.out.println("���� ����!");
//		}
		
		// ���ο� ������ ���̸� Ű����� �Է��ϼ���(���� �����ϰ�)
		// ���� �Ǵ� ������ ���̰� �ٸ��ٸ� ���簢��, ���ٸ� ���簢���̶�� ����ϼ���
		// switch������ (if�� ��� ����)  case�� ������ ���� �� ����
		Scanner sc=new Scanner(System.in);
		int a=0, b=0;
		System.out.println("���� ����(����)�� �Է��ϼ���");
		a=sc.nextInt();
		System.out.println("���� ����(����)�� �Է��ϼ���");
		b=sc.nextInt();
		switch (a-b) {  // ����-���� ()�ȿ� ������ ����
		case 0:  // ���簢���� ���ο� ������ ���̰� �����Ƿ� ���� 0�̴�!
			System.out.printf("���� ���ΰ� %d�� ���簢��",a);
			break;
		default:  // ���� case �鿡 �ش����� �ʴ� ������ ���
			System.out.printf("���ΰ� %d, ���ΰ� %d�� ���簢��",a,b);
		}
		// switch ���� default�� �� �ѹ��� ����. case�� ��ġ�ϴ� �� ���ٸ� ����

	}

}
