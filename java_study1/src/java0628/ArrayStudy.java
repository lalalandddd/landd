package java0628;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayStudy {

	static Scanner scan=new Scanner(System.in);
	
	public static void main(String[] args) {

		// �迭 - [{(���� Ÿ��)}]�� �����Ͱ� ����Ǵ� ������ ���������� �Ǿ��ִ� ����
//		int[] array1= {10,20,30};  // �ڹٽ�ũ��Ʈ�� array1=[10,20,30];
//		System.out.println(array1[0]+" "+array1[1]);
//		int b[] = {40,50,60};  // �ڹٽ�ũ��Ʈ�� b=[40,50,60];
//		System.out.println(b[0]+" "+b[1]);
		// �ڹٽ�ũ��Ʈ�� push�� ������ �߰��� �� ������, ���⼭�� �߰��ϴ� method�� ����
		// �ڹٽ�ũ��Ʈ�� ������ ���� length ��, �� indexOf�� ������ �͵� �Ұ����ϴ�. �̷��� �۵��ϴ� �Լ��� ������ ������ �Ѵ�.
//		System.out.println(array1+"\n"+b);  // �迭 b�� �޸� �ּ�(16����)�� ���´�.
//		System.out.println(Arrays.toString(array1));  // Arrays�� import�ؾ� �ϳ�...
//		int[] arr=new int[10];  // �迭�� ���� 10�� ���� (������ �ȵǹǷ� �˳��� ���ڷ� ������ �Ѵ�)
//		int[] brr=new int[] {10,20,30,40,50,60};  // ���� ���� ���
		// int[] arr2=new int[];  // ���� �߻�!!! �迭�� ũ�⸦ �����ؾ߸� �Ѵ�.
		
//		int size=15;
//		int[] arr2=new int[size];  // ����(size)�� ��(15) ��ŭ�� ������ ���� �迭
//		System.out.println(arr2[0]);
		
		// ���� �迭�� �� ������ �����ҷ� ������� �ʴ´�. Ȯ���� ���� �ʱ� �����̴�. Ư�� �뵵�θ� ����.
		// �ڹٿ����� ���� �迭�� ����� �� �ִ� ����� �ִ�.
		
		// �迭 ���� ���
		// ������Ÿ��[] �迭�̸�=new ������Ÿ��[�迭ũ��];
//		int[] money=new int[5];
//		money[0]=5000;
//		money[1]=12000;
//		money[2]=4000;
//		money[3]=43000;
//		money[4]=50000;
//		for(int i=0;i<money.length;i++){
//			System.out.println(money[i]);
//		}
//		for(int i=0;i<money.length;i++) {
//			if(money[i]>=10000) {  // 10000 �̻��� �� ���
//				System.out.println(money[i]);
//			}
//		}
		
		int[] AClass=new int[3];
		AClass[0]=89; AClass[1]=78; AClass[2]=93;
		int[] BClass=new int[3];
		BClass[0]=56; BClass[1]=84; BClass[2]=72;
		System.out.println("A�� ���� : "+Arrays.toString(AClass));
		System.out.println("B�� ���� : "+Arrays.toString(BClass));
		// �� �� ���� �߿��� 80�� �̻� ���1
//		for(int i=0;i<AClass.length;i++) {
//			if(AClass[i]>=80) {
//				System.out.print(AClass[i]+" ");
//			}
//			if(BClass[i]>=80) {
//				System.out.print(BClass[i]+" ");
//			}
//		}
		
		// �� �� ���� �߿��� 80�� �̻� ���2 if���� �ѹ���
		int[] AB=new int[AClass.length+BClass.length];
//		for(int i=0;i<AB.length;i++) {  // ���ǹ����� �ֱ� (6ȸ �ݺ�)
//			if(i<3) {
//				AB[i]=AClass[i];
//			}else {
//				AB[i]=BClass[i-3];
//			}
//		}
		
//		for(int i=0;i<AClass.length;i++) {  // ���ǹ� ���� �ֱ� (3ȸ �ݺ�)
//			AB[i]=AClass[i];
//			AB[i+3]=BClass[i];
//		}
		
		System.arraycopy(AClass, 0, AB, 0, AClass.length);  // arraycopy�� �ֱ� (������ �迭, ��������ε���, �����ҹ迭, ������ġ�ε���, ���� ����)
		System.arraycopy(BClass, 0, AB, AClass.length, BClass.length);  // BClass 0������ AB 3���� 3�� ����

		for(int i=0;i<AB.length;i++) {  // 80�� �̻� ���
			if(AB[i]>=80) {
				System.out.print(AB[i]+" ");
			}
		}
		
		Arrays.sort(AB);  // ����
		System.out.println(Arrays.toString(AB));
		
		boolean same=Arrays.equals(AClass,BClass);  // �迭�� ������? �ٸ��� false
		System.out.println("A��, B�� �迭�� ������? "+same);

	}
}
