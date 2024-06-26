package java0625;

public class StudyJava {

	public static void main(String[] args) {
		// 자바 기본 구조 : 프로젝트(java0625[landd main↑1]) - 패키지(java0625) - 클래스(Studyjava)
		
		System.out.println("자바테스트");  // 출력 방법
		// 코드 실행 : Lctrl+F11  그냥 F11 : 이전 저장 순간까지만 코드 실행

		// 자바는 데이터 저장을 위해 변수를 만든다.
		// 자바 변수 생성 → 데이터타입(반드시 붙여야 함) 변수이름 = 데이터;
		// 데이터타입:정수,실수,문자 (한번 정한 변수의 데이터타입은 절대 바꿀 수 없음)
		// 정수 : byte(1byte 최대 127), short(2byte), (int)(4byte 최대 40억...), long(8byte), char
		// 실수 : (float)(소숫점 6자리), (double)(소숫점 15자리), longdouble(소숫점 30자리)
		// 문자 : char            () 3종을 가장 많이 사용하게 된다.
		byte num1=127;  // 변수 num은 정수 10 이다.
		short num2=200;  // 지금은 변수 밑에 노란줄이 뜨는데 의미는 (이 변수를 사용한 적이 없다.)
		int num3=2323;
		long num4=234;
		
		// 실수는 소숫점 밑을 2진수로 변환하는 과정에서 오류가 뜰 수 있다. 정확도 99.9999% 예)실수34 저장 = 34.00003(??)
		float fnum=3.14f;  // f를 무조건 붙여야 한다. 안붙이면 오류 (사용할 때 double로 바꿔서 계산한 후 다시 float로 바꾸기 때문 f표시의 이유)
		double dnum=12.345;
		
		char ch1='a';  // ''작은따옴표:문자  ""큰따옴표:문자열
//		char ch2='ab';  // 문자는 오직 하나만... ab는 글자가 두개이므로 빨간 밑줄(오류)이 뜬다.
		
		boolean isTrue=false;  // true / false 중 하나 선택 함수
		
		String word="이순신";  // class(기본 색이 다르다.) 사용자 정의 타입. 객체로 저장 위의 나머지는 모두 변수
		
		// 사각형의 넓이를 구하시오 (밑변과 높이는 정수)
		int bottom=15;
		int high=20;
		int area=bottom*high;
		System.out.println("밑변 : "+bottom+", 높이 : "+high+", 사각형의 넓이 : "+area);
		
		// 키보드 30개를 구매해야 한다. hp게이밍키보드의 가격은 8000원, 총 구매 금액은?
		int purchase=30;
		int keyboardPrise=8000;
		int allPrise=purchase*keyboardPrise;
		System.out.println("키보드 가격 : "+keyboardPrise+", 구매 수량 : "+purchase+", 총 구매 금액 : "+allPrise);
		
		// 출력 방법의 차이
		System.out.print("자바 출력 방법 print");  // \n : end line... 줄바꿈 표시
		System.out.print("줄바꿈이 안 된다!");  // \n = enter키의 keycode
		System.out.printf("printf \n 출력");
		// printf에서만 되는 것 : 서식 문자 - 형식지정문자
		System.out.printf("\n총 금액 : %d \n", allPrise);
		// %d, %u : 10진수 정수  // %f : 10진수 실수  // %c : 문자  // %s : 문자열
		// %b : boolean(false, true)  // %o : 8진수 정수  // %x : 16진수 정수
		System.out.printf("국어 : %d점, 수학 : %d점 \n",80,90);
//		System.out.printf("%d+%f", 3.14,80);  // 데이터 타입이 맞지 않으므로 실행시키면 오류!
		System.out.printf("%d+%f\n",80,3.14);  // 80+3.140000 정상 출력 소숫점은 6자리까지 출력
		System.out.printf("나이 : %d, 키 : %f\n",34,172.0);
		System.out.println(172.315);
		System.out.print(172.315);
		System.out.printf("\n %f",172.315);
		System.out.printf("\n %.0f",172.315);
		System.out.printf("\n %.1f",172.315);
		System.out.printf("\n %.2f",172.315);  // 반올림!
		System.out.printf("\n %.2f",172.314);  // 반올림!
		System.out.printf("\n %.3f",172.315);
		System.out.printf("\n %.4f",172.315);
		System.out.printf("\n %.7f\n",172.315);  // 6개 초과도 가능
		System.out.println(3);
		System.out.printf("%d",3);
		System.out.printf("\n%5d",3);
		System.out.printf("\n%s 마을의 나이가 %d살인 폭군지도자 %c씨", "코딩빌",30,'박');

	}

}
