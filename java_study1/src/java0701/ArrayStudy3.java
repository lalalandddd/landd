package java0701;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayStudy3 {

	static Scanner scan=new Scanner(System.in);
	
	public static void main(String[] args) {

		// �迭�� 20���� ���� ����(1~30)�� �����ϰ� ����� ������ �߿��� 5�� ����� ����� �������.
		int[] number=new int[20];
		int c=0;
		for(int i=0;i<number.length;i++) {
			int r=(int)(Math.random()*30+1);
			number[i]=r;
			if(number[i]%5==0) {
				System.out.print(number[i]+" ");
				c++;
			}
		}
		System.out.print("\n"+Arrays.toString(number));
		System.out.print("\n20���� ���� ���� �� 5�� ����� �� "+c+"����.");

		// �迭 ���� ���, �迭�� ������ ���� ���, �迭�� ����� ������ ���� ���

		// 

	}

}
