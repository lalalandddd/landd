package java0701;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayStudy4 {

	static Scanner scan=new Scanner(System.in);
	
	public static void main(String[] args) {

		// ���� ���� �����͸� �ٷ� ���� �迭�� ����Ѵ�. ��Ȳ�� ���󼭴� �迭�� ���� �� �Ǵ� ��쵵 ������...
		// ������ �迭�� ������ �����͸� �����Ѵ�.
		
		// ���� �迭 �����
		// ������ �迭 ũ�⸦ �ø��ų� �ٿ��� ����ϴ� �迭
		
//		int[] a=new int[5];
//		a[0]=10; a[1]=20; a[4]=40;
//		System.out.println(Arrays.toString(a));
//		a=new int[7];
//		a[5]=100;
//		System.out.println(Arrays.toString(a));
		
		// �����͸� �߰��� �� �����Ϸ��� �迭�� ũ�⸦ �÷��� �Ѵ�.
//		int[] num=new int[] {10,20,30,40,50};
//		System.out.print(Arrays.toString(num));
//		// num[5]=60; �ϸ� �ε��� ������ ����Ƿ� ������ ���... �ٵ� �߰��ϰ� �ʹٸ� �迭�� ũ�⸦ �÷��� �Ѵ�.
//		int size=num.length;  // ���� �迭 ũ��
//		int[] temp=new int[size+1];  // ���� �迭 ũ�� +1�� ���ο� �迭�� �����.
//		for(int i=0;i<size;i++) {
//			temp[i]=num[i];
//		}
//		num=temp;
//		num[5]=60;
//		System.out.print(Arrays.toString(num));
		
		// ���ڿ����� ���� �񱳴� .equals() �� �Ѵ�.
		// ���ڿ��� Ư�� ���ڳ� ���ڿ� ���� ���δ� .contains() �� �Ѵ�.
		
		// ���� �ּ� �߿��� ��ȭ���� �����Ͽ� �迭�� �����ϼ���. Ȯ�� ����� Arrays �̿��� ��
//		String[] addr=new String[] {"���� �߱� ��ȭ�� 25","���� �߱� ��ȭ�� 92","���� ���� �л굿 111","���� ���� �л굿 1023","���� ����� ���ϵ� 15","���� ����� ��ź���� 222","���� ������ ������ 93","���� �߱� ���ﵿ 932","���� �߱� ���� 24","���� ���� ���絿 945","���� �߱� ��ȭ�� 1234","���� �߱� ���ﵿ 23","���� �߱� ��ȭ�� 984"};
//		String[] search=new String[1];
//		int j=0;
//		for(int i=0;i<addr.length;i++) {
//			if(addr[i].contains("��ȭ��")) {
//				String[] a=new String[j+1];
//				if(j!=0) {
//					for(int k=0;k<j;k++) {
//						a[k]=search[k];
//					}
//				}
//				a[j]=addr[i];
//				search=a;
//				j++;
//			}
//		}
//		System.out.print(Arrays.toString(search));
		
		// 2���� �迭 : 1���� �迭�� ������ 1���� �迭�� ������ ����
//		int[][] arr=new int[2][3];  // 3�� ũ�⸦ ���� 1���� �迭�� 2�� �ִ�.
//		arr[0][0]=10;
//		arr[0][1]=20;
//		arr[0][2]=30;
//		arr[1][0]=40;
//		arr[1][1]=50;
//		arr[1][2]=60;
		
		// ����б� 1�г� 1~6�� �л����� ����? �� new int[6][30];
		
		// 2���� �迭 ���� �����...?
//		int[] a=new int[] {10,20,30,40,50,60,70,80,90,100};
//		// for(int i=0;i<a.length;i++){  // �̰� �����ϰ� ���̸� ��
//		for(int data:a) {   // �� for �ݺ���...�� �̸��� forEach, each��... �迭 ���� �ݺ����̴�.
//			System.out.println(data);  // �ε���(��ġ)�� ���� ���Ѵٴ°� ����
//		}
		// ���� 184p 2���� �迭 ���� ���� Ȯ��

	}

}
