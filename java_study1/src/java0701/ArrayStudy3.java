package java0701;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayStudy3 {

	static Scanner scan=new Scanner(System.in);
	
	public static void main(String[] args) {

		// 배열에 20개의 랜덤 숫자(1~30)를 저장하고 저장된 데이터 중에서 5의 배수가 몇개인지 출력하자.
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
		System.out.print("\n20개의 랜덤 숫자 중 5의 배수는 총 "+c+"개다.");

		// 배열 생성 방법, 배열에 데이터 저장 방법, 배열에 저장된 데이터 추출 방법

		// 

	}

}
