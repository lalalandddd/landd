package java0627;

public class Bitop {

	public static void main(String[] args) {

		// 연산자

		// 정수와 정수를 연산하면 결과는 정수
		// 정수와 실수를 연산하면 결과는 실수

		// 산술연산자 +, -, *, /(몫), %(나머지)
		// 증감연산자 ++, --
		// 자바와 마찬가지로 먼저 넣느냐 나중에 넣느냐에 따라 증감의 순서가 달라진다.
		// 대입연산자 =
		// 복합대입연산자 +=, -=, *=, /=, %=
		// 비교연산자 >, <, >=, <=, ==, !=
		//   비교연산자 주의(숫자에만 사용해야 한다. 자바는 문자열도 비교 가능)
		//   문자를 비교하려면 equals를 사용해야 한다.
		// 논리연산자 &&, ||, !
		// 조건연산자 (조건식) ? 참 : 거짓;  (자바와 동일)
		// 비트연산자 : 비트 논리 연산자 &, |, ~, ^
		// 비트연산자 : 비트 시프트 연산자 >>, <<

//		System.out.println(10/3);
//		System.out.println(10%3);
//		System.out.println(10/3.0);
//		System.out.println(10%3.0);
//		System.out.println(10/(float)3);
//		System.out.println(10%(float)3);

//		int a=10;
//		a+=3;
//		System.out.println(a);

//		System.out.println(10==20);
//		System.out.println(10==3.14);
//		System.out.println("이순신"=="김유신");
//		String name1="이순신", name2="김유신", name3="이순신";
//		System.out.println(name1==name2);
//		System.out.println(name1.equals(name2));
//		System.out.println("이순신"=="이순신");
//		System.out.println(name1==name3);
//		System.out.println(name1.equals(name3));

//		System.out.println(34&15);
//		System.out.println(42|21);
//		System.out.println(~28);  // 부호비트의 존재로 35가 아니라 -29가 나온다.....
//		System.out.println(~-44);
//		System.out.println(33^17);
//		System.out.println(33<<2);
//		System.out.println(-33<<2);
//		System.out.println(11>>2);

		// << 2의 n승을 구할 때
		System.out.println(1<<4);  // 2의 4승
		System.out.println(1<<20);  // ???
		// >> 2의 n승 만큼 나눌 때
		System.out.println(1024>>3);  // 1024에 2의 3승을 나누기

		int red=188;
		int green=229;
		int blue=92;
		int color=(red<<16)|(green<<8)|blue;
		System.out.printf("#%06X \n ",color);  // RGB 값을 헥사코드(16진수)로 변환

	}

}
