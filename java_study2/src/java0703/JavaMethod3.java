package java0703;

import java.util.Scanner;

public class JavaMethod3 {

	public static void main(String[] args) {
		
//		// 정수 두개 입력받아 합을 출력하시오 ... 당연히 class를 만들어야겠지?
//		Calc calc=new Calc();
//		calc.sum1(8,5);
//		calc.sum();
//		calc.minus();
//		calc.times();
//		calc.division();
		
//		// 세 과목의 총점을 구하여 출력하세요
//		int kor=89, mat=74, eng=43;
//		Total total=new Total();
//		total.total(kor,mat,eng);  // 국,수,영 세 과목 값을 void total에 넘기고 void total을 실행한다.
		
//		// 메서드 호출하여 '메서드 dog쉽네~' 라고 출력
//		Call call=new Call();
//		call.aaa();
		
//		// 변수 a,b의 값을 출력하는 메서드
//		Print1 print=new Print1();
//		print.view();
		
//		// 메서드를 호출하여 이름과 나이를 출력하세요. 매개변수 없는 메서드, 키보드 입력 X
//		Print2 print=new Print2();
//		print.view();
		
//		// 메서드를 호출하여 아래의 데이터를 출력하세요.
//		String animal="골드리트리버";
//		String 공고일="2024-07-01";
//		Dataprint dataprint=new Dataprint();
//		dataprint.print3(animal,공고일);
		
//		// 다음 날짜 중에서 월과 일만 출력하세요. 문자열 메서드 substring 또는 split 사용
//		String examDate="2024-08-13";
//		Pprint pprint=new Pprint();
//		pprint.print4(examDate);
		
		// 네 사람의 나이 평균을 구하여 출력하세요. 평균값은 정수입니다.
		int 흥민=31, 강인=23, 희찬=28, 재범=37;
		Age ages=new Age();
		ages.print5(흥민,강인,희찬,재범);

	}

}
// 인스턴스 메서드, 인스턴스 변수는 객체(인스턴스)를 통해 사용한다. 즉, 객체를 먼저 만들어야 한다. print.view();
// static이 붙어있는 클래스 메서드, 클래스변수는 클래스 이름으로 사용한다. Print2.view();

// 네 사람의 나이 평균을 구하여 출력하세요. 평균값은 정수입니다.
class Age{
	void print5(int a, int b, int c, int d) {
		int avg=(a+b+c+d)/4;
		float avg2=(a+b+c+d)/4f;
		System.out.printf("네 사람의 나이의 평균은 %5d세 입니다.\n",avg);
		System.out.printf("네 사람의 나이의 평균은 %.2f세 입니다.",avg2);
	}
}
//// 다음 날짜 중에서 월과 일만 출력하세요. 문자열 메서드 substring 또는 split 사용
//class Pprint{
//	void print4(String a) {
//		String aa=a.substring(5,7);
//		String bb=a.substring(8,10);
//		String[] cc=a.split("-");
//		System.out.printf("%2s월\n%2s일\n",cc[1],cc[2]);
//		System.out.printf("%2s월\n%2s일",aa,bb);
//	}
//}

////메서드를 호출하여 아래의 데이터를 출력하세요.
//class Dataprint{
//	void print3(String a, String b) {
//		System.out.printf("동물 : %s\n공고일 : %s",a,b);
//	}
//}

////메서드를 호출하여 이름과 나이를 출력하세요. 매개변수 없는 메서드, 키보드 입력 X
//class Print2{
//	void view() {
//		String name="내이름";
////		String age="나이";
//		int age=41;
//		System.out.print(name+" "+age);
//	}
//}

////변수 a,b의 값을 출력하는 메서드
//class Print1{
//	void view() {
//		int a=10, b=20;
//		System.out.print(a+" "+b);
//	}
//}

////메서드 호출하여 '메서드 dog쉽네~' 라고 출력
//class Call{
//	void aaa() {
//		System.out.println("메서드 dog쉽네~");
//	}
//}

////세 과목의 총점을 구하여 출력하세요
//class Total{
//	void total(int a, int b, int c) {  // 세 개의 값을 가져온다.
//		int total=a+b+c;
//		System.out.printf("국어 %d점 수학 %d점 영어 %d점 \n총점 = %d점",a,b,c,total);
//	}
//}

////	정수 두개 입력받아 합을 출력하시오 ... 당연히 class를 만들어야겠지?
//class Calc{
//	void sum1(int num1, int num2) {  // 외부에서 데이터 받아서 활용
//		int result=num1+num2;
//		System.out.printf("%d + %d = %d\n",num1,num2,result);
//	}
//	void sum() {  // 내부 데이터 활용
//		Scanner scan=new Scanner(System.in);
//		System.out.println("첫 번째 정수 : ");
//		int num1=scan.nextInt();
//		System.out.println("두 번째 정수 : ");
//		int num2=scan.nextInt();
//		int result=num1+num2;
//		System.out.printf("%d + %d = %d\n",num1,num2,result);
//	}
//	void minus() {
//		Scanner scan=new Scanner(System.in);
//		System.out.println("첫 번째 정수 : ");
//		int num1=scan.nextInt();
//		System.out.println("두 번째 정수 : ");
//		int num2=scan.nextInt();
//		int result=num1-num2;
//		System.out.printf("%d - %d = %d\n",num1,num2,result);
//	}
//	void times() {
//		Scanner scan=new Scanner(System.in);
//		System.out.println("첫 번째 정수 : ");
//		int num1=scan.nextInt();
//		System.out.println("두 번째 정수 : ");
//		int num2=scan.nextInt();
//		int result=num1*num2;
//		System.out.printf("%d × %d = %d\n",num1,num2,result);
//	}
//	void division() {
//		Scanner scan=new Scanner(System.in);
//		System.out.println("첫 번째 정수 : ");
//		int num1=scan.nextInt();
//		System.out.println("두 번째 정수 : ");
//		int num2=scan.nextInt();
//		float result=num1/num2f;
//		System.out.printf("%d ÷ %d = %.2f\n",num1,num2,result);
//	}
//}