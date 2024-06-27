package java0627;

import java.util.Scanner;

public class Loop {

	public static void main(String[] args) {

		// 반복문 for, while, do~while  (java와 종류, 사용방법 모두 동일)
		// for(초기값;조건식;증감식){반복내용} 초기값에 var이 아니라 변수 타입을 써야 한다.
		// 조건식이 거짓이 될 때까지(참이면) 반복내용을 계속 실행, 조건식이 거짓이면 종료
		// 배열과 연결해서 자주 쓰인다.
		
//		for(int i=1;i<=9;i++) {
//			System.out.printf("아... 반복문....%d\n",i*2-1);
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
		
		// 위 루틴을 반복문으로 만들어보자?
//		int num=1;
//		for(int a=1;a<4;a++) {
//			num=num+a;
//			System.out.println(num);
//		}
		
		// 내가 입력한 숫자까지의 총 합을 구하세요
		Scanner scan=new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		int a=scan.nextInt();
		int c=0;
		for(int b=1;b<=a;b++) {
			c=c+b;
		}
		System.out.printf("1부터 %d까지의 총 합은 %d이다.",a,c);

	}

}
