package java0626;

import java.util.Scanner;

public class input2 {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		
		// 직원 이름, 소속부서명, 월 급여액을 키보드로 입력받는다.
		// 세금은 8%를 낼 때, 실수령액은 얼마인가? 이름, 부서, 실수령액을 출력하라
		// 두 명째도 해봐라?
		// Integer.parseInt(scan.nextLine());
		String name=null, dept=null;
		int pay=0;
		float tax=0, netPay=0;
		tax=0.08f;
		System.out.print("이름을 입력하세요");
		name=scan.nextLine();
		System.out.print("소속부서명을 입력하세요");
		dept=scan.nextLine();
		System.out.print("월 급여액(만원)을 입력하세요");
		pay=scan.nextInt();
		netPay=pay-pay*tax;
		System.out.printf("첫번째 직원 이름 : %s, 소속부서 : %s, 실수령액 : %.1f만원\n",name,dept,netPay);
		scan.nextLine();  // 이 줄에서 pay 변수에 남아있는 엔터키 문자열이 사라진다.
		System.out.print("이름을 입력하세요");
		name=scan.nextLine();
		System.out.print("소속부서명을 입력하세요");
		dept=scan.nextLine();
		System.out.print("월 급여액(만원)을 입력하세요");
		pay=scan.nextInt();
		netPay=pay-pay*tax;
		System.out.printf("두번째 직원 이름 : %s, 소속부서 : %s, 실수령액 : %.1f만원\n",name,dept,netPay);

	}

}
