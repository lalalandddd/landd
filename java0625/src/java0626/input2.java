package java0626;

import java.util.Scanner;

public class input2 {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		
		// 직원 이름, 소속부서명, 월 급여액을 키보드로 입력받는다.
		// 세금은 8%를 낼 때, 실수령액은 얼마인가? 이름, 부서, 실수령액을 출력하라
		char name, sect;
		int pay, netPay;
		float netPay2;
		System.out.println("이름을 입력하세요");
		scan.next("name");
		System.out.println("소속부서명을 입력하세요");
		scan.next("sect");
		System.out.println("월 급여액을 입력하세요");
		pay=scan.nextInt();
		netPay=pay*92/100;
		netPay2=pay*0.92f;
		System.out.printf("이름 : %s, 소속부서 : %s, 실수령액 : %d원","name","sect",netPay);
		System.out.printf("이름 : %s, 소속부서 : %s, 실수령액 : %.1f원","name","sect",netPay2);

	}

}
