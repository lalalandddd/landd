package java0703;

public class JavaMethod4 {

	public static void main(String[] args) {
		
//	// 메서드를 통해서 숫자 10을 받아 출력하기
//		ReturnMth rt=new ReturnMth();
//		int num=rt.get();
//		System.out.println(num);
		
//	// 메서드를 통해서 두 정수의 연산 결과를 받아서 출력하기
//		Return1 rt=new Return1();
//		int num1=rt.plus();
//		int num2=rt.minus();
//		int num3=rt.times();
//		int num4=rt.div();
//		int num5=rt.rest();
//		System.out.printf("더하기 : %d\n빼기 : %d\n곱하기 : %d\n나누기 : %d\n나머지 : %d",num1,num2,num3,num4,num5);
		
//	// 다음의 물음표에 들어갈 코드를 작성하여 이름과 나이가 출력되게 만들기
//		// ? userName = ?;
//		Return2 rt=new Return2();
//		String userName=rt.getName();
//		int age=34;
//		System.out.println(userName+" "+age);
		
//	// 국어(89), 영어(78), 수학(94) 세 과목의 총점을 구하는 메서드, 평균을 구하는 메서드, 총점과 평균을 출력하세요.
//		int kor=89, eng=78, mat=94;
//		Total tot=new Total();
//		Avg avg=new Avg();
//		int a=tot.total(kor,eng,mat);
//		float b=avg.avg(kor,eng,mat);
//		System.out.printf("국어 : %d점\n영어 : %d점\n수학 : %d점\n총점 : %d점\n평균 : %.1f점",kor,eng,mat,a,b);
		
		/* 오늘의 과제
		주사위 게임
		j형준과 s석완이가 주사위 게임을 한다. 주사위는 6면 1개다. 주사위의 값이 큰 쪽이 이긴다.
		주사위의 값을 구하는 메서드, 주사위의 값을 비교하여 누가 이겼는지 출력하는 메서드 두 개를 만든다.
		 */

	}
}
//// 국어, 영어, 수학 세 과목의 총점을 구하는 메서드, 평균을 구하는 메서드, 총점과 평균을 출력하세요.
//class Total{
//	int total(int a,int b,int c) {
//		int total=a+b+c;
//		return total;
//	}
//}
//class Avg{
//	float avg(int a, int b, int c) {
//		float avg=(a+b+c)/3f;
//		return avg;
//	}
//}

////다음의 물음표에 들어갈 코드를 작성하여 이름과 나이가 출력되게 만들기
//class Return2{
//	String getName() {
//		String Name="이순신";
//		return Name;
//	}
//}

////메서드를 통해서 두 정수의 연산 결과를 받아서 출력하기
//class Return1{
//	int num1=45, num2=10;
//	int plus=num1+num2;
//	int minus=num1-num2;
//	int times=num1*num2;
//	int div=num1/num2;
//	int rest=num1%num2;
//	int plus() {return plus;}
//	int minus() {return minus;}
//	int times() {return times;}
//	int div() {return div;}
//	int rest() {return rest;}
//}

////메서드를 통해서 숫자 10을 받아 출력하기
//class ReturnMth{
//	int a=10;
//	int get() {
//		return a;
//	}
//}