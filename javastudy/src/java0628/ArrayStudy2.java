package java0628;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayStudy2 {

	static Scanner scan=new Scanner(System.in);

	public static void main(String[] args) {

		// question!! ����!!
		// ���� �迭�� �����ϴ� ���� 5���� �ǸŰ����� �Է��Ͽ� �����ϼ���.
		// ������ ������ �ǸŰ��ݿ��� ���հ� ����� ���ϼ���.
//		int sum=0, avg=0;
//		int[] cracker=new int[5];
//		System.out.println("�����ϴ� ���� 5���� �ǸŰ����� �Է��ϼ���");
//		for(int i=0;i<cracker.length;i++) {
//			cracker[i]=scan.nextInt();
//		}
//		for(int i=0;i<cracker.length;i++) {
//			sum=sum+cracker[i];
//		}
//		avg=sum/cracker.length;
//		System.out.println(Arrays.toString(cracker));
//		System.out.printf("���� ������ ������ %d��, ����� %d��",sum,avg);
		
		// 6���� Ű�� tall �迭�� �����Ͽ���. Ű 175 �̸��� ����ϼ���.
//		float[] tall=new float[] {173.4f, 175.1f, 169.5f, 181.4f, 178.8f, 185.3f};
//		int j=0;
//		System.out.println(Arrays.toString(tall));
//		System.out.println("Ű 175 �̸�");
//		for(int i=0;i<tall.length;i++) {
//			if(tall[i]<175) {
//				System.out.print(tall[i]+" ");
//				j++;
//			}
//		}
//		System.out.println(j+"��");
		
		// name �迭 ���ڿ� �߿��� �̼���, ������, ������, �ֿ��� ���ߴ�(advParty) �迭�� �����ϰ� ����ϼ���.
//		String[] name=new String[] {"�̼���","������","�庸��","�̼���","������","������","�ֿ�","���߱�","�縸��","�����̿�"};
//		String[] advParty=new String[4];
//		System.arraycopy(name, 3, advParty, 0, 4);
//		System.out.println("���ߴ�� "+Arrays.toString(advParty));
		
		// ���ڿ����� Ư�� ���ڳ� ���ڿ��� ��ġ ã�� : indexOf (���� �� ���� ��� ���� ó�� �ϳ��� ã�´�.)
		// ���ڿ����� Ư�� ���ڳ� ���ڿ��� ���� ���� Ȯ�� : contains
//		String word="I like banana";  // ������ �迭�̴�.
//		word.indexOf("like");  // �ڹٿ��� indexOf�� ���忡�� �� �� �ִ�. [] �迭�� �� �� ����.
//		System.out.print(word.indexOf("like"));  // 2
//		System.out.print(word.indexOf("l"));  // 2
//		System.out.print(word.indexOf("a"));  // 8
//		System.out.print(word.indexOf("I"));  // 0
//		System.out.print(word.contains("orange"));  // false
//		System.out.print(word.contains("banana"));  // true
//		System.out.print(word.contains("ba"));  // true
//		System.out.print(word.contains("bn"));  // false
		
//		String[] a=new String[] {"orange","banana","apple","tomato"};
//		System.out.println(a[1].indexOf("na"));
//		System.out.println(a[0].contains("ge"));
//		a[0].indexOf("na");  // 2
//		a[1].contains("ge");  // true
		
//		String[] name=new String[] {"������","�Ѽ���","�Ż��Ӵ�","�縸��","������","������","���߱�","������","�����","�̼���","�̻��","�̻��","�Ѱ���","������"};
//		System.out.print("�̸� �˻� : ");
//		String search=scan.nextLine();
//		for(int i=0;i<name.length;i++) {
//			if(name[i].contains(search)) {  // �� ��ü�� true/false ���ǹ��� �ȴ�.
//				System.out.println("�˻� ��� : "+name[i]);
//			}
//		}
		
		// ���� : ���Ḧ �˻��Ͽ� ���� �̸��� �ݾ��� ����ϼ���
		// �迭�� ���� ����� �˻� �� (�˼��մϴ� �غ����Դϴ�) ��� ���
		String[] cafe=new String[] {"�Ƹ޸�ī�� : 2000��","ȭ��Ʈ �Ƹ޸�ī�� : 2500��","ī��� : 3000��","��ü�� : 3000��","ī���ī : 3500��","ȭ��Ʈ�� : 3000��","�����ֽ� : 5000��","�����ֽ� : 5000��","�������ֽ� : 4500��","��Ӿ��̽�Ƽ : 4000��","���������̽�Ƽ : 4500��","�����ƾ��̽�Ƽ : 5000��","�ڵξ��̽�Ƽ : 5000��","���ڿ��̵� : 6000��","�����ƿ��̵� : 6000��","�������̵� : 7000��","�����̵� : 6000��","û�������̵� : 6500��"};
		System.out.print("���� �˻� : ");
		String drink=scan.nextLine();
		boolean j=true;
		for(int i=0;i<cafe.length;i++) {
			if(cafe[i].contains(drink)) {
				System.out.print("���� : "+cafe[i]+"�� / ���� : "+cafe[i]+"��\n");
				j=false;
			}
		}
		if(j) {
			System.out.print("�˼��մϴ� �غ����Դϴ�");
		}

	}

}
