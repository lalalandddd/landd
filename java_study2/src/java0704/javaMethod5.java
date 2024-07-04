package java0704;

import java.util.Scanner;

public class javaMethod5 {

	public static void main(String[] args) {

//	// 두 개의 정수를 반환하기
//		MethodUtil util=new MethodUtil();
//		int[] num=util.twoNum();
//		System.out.print(num[0]+" "+num[1]);

//	// 사각형의 너비와 높이를 설정하고 넓이를 출력하세요. 넓이는 main메서드에서 출력되게 하세요
//		Main a=new Main();
//		int[] d=a.area();
//		System.out.printf("너비 %d, 높이 %d인 사각형의 넓이는 %d이다.",d[0],d[1],d[0]*d[1]);

	// ?를 만드시오 로그인 가능한 아이디는 skyblue, 비밀번호는 1234sea
	// login 메서드를 실행하여 로그인 여부를 출력하세요.
	// 아이디, 비밀번호가 모두 일치하면 "로그인 성공" 출력, 하나라도 불일치하면 "로그인 실패" 출력
	// 로그인 여부 출력은 main에서 할 것.
//		? isFail=?;
//		if(?) {
//		?
//		}else {
//		?
//		}
//		Scanner scan=new Scanner(System.in);
//		Log a=new Log();
//		boolean isFail=a.login();
//		if(isFail) {
//			System.out.println("로그인 성공");
//		}else {
//			System.out.println("로그인 실패");
//		}
		
	// 정수 세 개를 키보드로 입력받으세요. 입력한 세 정수의 합이 100을 넘으면 100-합의 결과를 출력하고 100을 못넘으면 합을 출력하세요.
	// main 메서드에서 출력하세요.
		Num a=new Num();
		int[] aa=a.num();
		System.out.printf("세 수는 %d, %d, %d\n결과는 %d",aa[0],aa[1],aa[2],aa[3]);

	}
}
// 정수 세 개를 키보드로 입력받으세요. 입력한 세 정수의 합이 100을 넘으면 100-합의 결과를 출력하고 100을 못넘으면 합을 출력하세요.
// main 메서드에서 출력하세요. (a+b+c)
class Num{
	int[] num(){
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 세 개를 입력하세요");
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		if((a+b+c)>100) {
			return new int[] {a,b,c,100-(a+b+c)};
		}else {
			return new int[] {a,b,c,(a+b+c)};
		}
	}
}

// ?를 만드시오 로그인 가능한 아이디는 skyblue, 비밀번호는 1234sea
// login 메서드를 실행하여 로그인 여부를 출력하세요.
// 아이디, 비밀번호가 모두 일치하면 "로그인 성공" 출력, 하나라도 불일치하면 "로그인 실패" 출력
// 로그인 여부 출력은 main에서 할 것.
//class Log{
//	? login(){  // 문제
//		Scanner scan=new Scanner(System.in);
//		System.out.print("아이디 : ");
//		String id=?;
//		System.out.print("비밀번호 : ");
//		String password=?;
//		?
//		?
//		?
//		?
//		?
//		?
//	}
//}
//	boolean login() {  // 답?
//		Scanner scan=new Scanner(System.in);
//		System.out.print("아이디 : ");
//		String id=scan.nextLine();
//		System.out.print("비밀번호 : ");
//		String password=scan.nextLine();
//		boolean check=true;
//		if(id.equals("skyblue")) {
//			if(password.equals("1234sea")) {
//				return check;
//			}
//		}
//		return check=false;
//	}
//}

////사각형의 너비와 높이를 설정하고 넓이를 출력하세요. 넓이는 main메서드에서 출력되게 하세요
//class Main{
//	int[] area() {
//		int w=(int)(Math.random()*50+1);
//		int h=(int)(Math.random()*50+1);
//		return new int[] {w,h};
//	}
//}

//class MethodUtil{
//	int[] twoNum() {
//		int num1=20, num2=50;
////		return num1;  // num1을 되돌리면서 동시에 메서드 종료
////		return num2;  // 메서드가 종료되었기에 실행할 수 없으므로 오류 발생
////		return num1num2;  // num1num2 라는 이름을 가진 변수로 인식하는데 이런 변수는 안 만들었으므로 오류 발생
//		return new int[] {num1,num2};  // 배열 '하나'를 보내므로 가능. 단 메소드 명도 int → int[]
//	}
//}