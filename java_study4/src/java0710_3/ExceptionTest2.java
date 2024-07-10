package java0710_3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest2 {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		int num=0;
		boolean is=true;
		do {
			try {
				System.out.println("정수 입력 : ");
				num=scan.nextInt();  // 정수 하나 입력에 이렇게까지 해야 문제가 없다.
				is=false;
				if(is) break;
			}catch(InputMismatchException e) {  // InputMismatchException 이것도 import!!
				System.out.println("정수만 입력하세요!");
			}finally {  // 오류 발생 여부 상관 없이 마지막으로 실행하기
				scan.nextLine();  // 버퍼 비워주기(이게 없으면 잘못 입력한 값이 남아서 무한반복)
			}
		}while(is);
		System.out.println(num+100);
		System.out.println("이름 : ");
		String name=scan.nextLine();
		System.out.println("이름 : "+name);
	}
}

