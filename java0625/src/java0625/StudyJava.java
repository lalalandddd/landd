package java0625;

public class StudyJava {

	public static void main(String[] args) {
		// 자바 기본 구조 : 프로젝트(java0625[landd main↑1]) - 패키지(java0625) - 클래스(Studyjava)
		
		System.out.println("자바테스트");  // 출력 방법
		// 코드 실행 : Lctrl+F11

		// 자바는 데이터 저장을 위해 변수를 만든다.
		// 자바 변수 생성 → 데이터타입(반드시 붙여야 함) 변수이름 = 데이터;
		// 데이터타입:정수,실수,문자 (한번 정한 변수의 데이터타입은 절대 바꿀 수 없음)
		// 정수 : byte(최대 127), short, (int), long, char
		// 실수 : (float), (double), longdouble
		// 문자 : char            () 3종을 가장 많이 사용하게 된다.
		byte num1=127;  // 변수 num은 정수 10 이다.
		short num2=200;  // 지금은 변수 밑에 노란줄이 뜨는데 의미는 (이 변수를 사용한 적이 없다.)
		int num3=2323;
		long num4=234;
		char ch1='a';  // ''작은따옴표:문자  ""큰따옴표:문자열
//		char ch2='ab';  // 문자는 오직 하나만... ab는 글자가 두개이므로 빨간 밑줄(오류)이 뜬다.

	}

}
