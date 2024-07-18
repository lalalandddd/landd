package java0701;

import java.util.Arrays;
import java.util.Scanner;

public class StringMethod {

	static Scanner scan=new Scanner(System.in);

	public static void main(String[] args) {

	// 자바에서 문자열을 사용하려면 String 클래스를 사용해야 한다.
	// String 클래스는 내부적으로 char 기본 데이터 타입의 배열이 생성되도록 되어 있다.
	// char 타입으로 생성된 배열은 동적 배열의 동작을 한다. (추가 가능)
	// 프로그램에서 사용되는 데이터의 70% 정도가 문자열 데이터이다.
	// 그래서 문자열 관련 메서드는 반드시 익혀야 한다.
		
	// 문자열 데이터를 저장하는 방법
		String word="i like banana";
		System.out.println(word);
//	// 문자열 비교 - 같은 문자열인가?  equals
//		System.out.println("equals : "+(word.equals("i like banana")));
//		System.out.println("equals : "+(word.equals("i like orange")));
//	// 문자열 포함 여부  indexOf
//		System.out.println("indexOf : "+word.indexOf("orange"));
//		System.out.println("indexOf : "+word.indexOf("banana"));
//	// 문자열 합치기  '+'
//		System.out.println(word+" 합치기");
//		System.out.println(word.concat("합치기 "));
//	// 특정 문자 또는 문자열 위치 찾기  indexOf(앞) / lastIndexOf(뒤)
//		System.out.println(word.indexOf('b'));
//		System.out.println(word.indexOf('a'));
//		System.out.println(word.lastIndexOf('a'));
//	// 문자열에서 특정 문자 추출  charAt
//		System.out.println(word.charAt(5));
//	// 키보드로 문자 입력 받기  nextLine
//		System.out.print("알파벳 하나 입력 : ");
//		char alp=scan.nextLine().charAt(0);
//		System.out.println("입력한 문자 : "+alp);
//		char ch1=65;
//		System.out.println(ch1);
//		char ch2='A';
//		System.out.println(ch2);
//		System.out.println(ch1+4);
//		char ch3='가';
//		System.out.println(ch3);
//		System.out.println(ch3+4);
//	// 문자열의 길이  length()
//		System.out.println("문자열 글자수 : "+word.length());
//	// 문자열의 대/소문자 변환  toUpperCase(), toLowerCase()
//		String 대문자=word.toUpperCase();
//		String 소문자=word.toLowerCase();
//		System.out.println(대문자);
//		System.out.println(소문자);
//	// 공백 제거 - 앞 뒤의 공백 제거  trim()
//		String word2="  i hate java  ";
//		System.out.println(word2);
//		System.out.println(word2.trim());
//	// 문자열 분할  split()
//		System.out.println(Arrays.toString(word.split(" ")));
//		String name="이순신@김유신@강감찬@";
//		String[] names=name.split("@");
//		System.out.println(names[1]);
//		System.out.println(Arrays.toString(names));
//	// 문자열 자르기(추출)  substring()
//		System.out.println(word.substring(0));
//		System.out.println(word.substring(2));
//		System.out.println(word.substring(6));
//		System.out.println(word.substring(2,6));
//	// 문자열 변환  replace, replaceAll
//		String 뽀뽀뽀="아빠가 출근할때 뽀뽀뽀 엄마가 안아줘도 뽀뽀뽀 만나면 반갑다고 뽀뽀뽀 헤어질때 또만나요 뽀뽀뽀";
//		String 변경=뽀뽀뽀.replace("뽀뽀뽀","뿡뿡뿡");
//		System.out.println(변경);
//		변경=변경.replaceAll("뿡뿡뿡", "뿌우웅");
//		System.out.println(변경);
	// replaceAll에서만 정규표현식 사용 가능
	/* 정규표현식 =
		^ - 문자열의 시작
		$ - 문자열의 종료
		. - 임의의 한 문자
		* - 앞 문자가 있거나 없거나 (*가 : 가로 끝나는 단어)
		+ - 앞 문자가 하나 이상
		? - 앞 문자가 없거나 하나 있음
		[] - 문자의 집합이나 범위
		{} - 횟수 또는 범위
		() - 소괄호의 문자를 하나의 문자로 인식
		| - 패턴 안에서 or 연산 수행
		\s - 공백 문자
		\S - 공백 문자가 아닌 나머지 문자
		\w - 알파벳이나 숫자
		\W - 알파벳이나 숫자를 제외한 문자
		\d - 숫자
		\D - 숫자를 제외한 모든 문자    \는 특수문자이므로 \뒤에 써야 한다.
		문자열에서 숫자만 제거 [0-9] 또는 [\\d]
		문자열에서 한글만 제거 [가-힕]
		전화번호 
	*/
//		String aa="abcd1234efgh5678ij90";
//		System.out.println(aa.replaceAll("[0-9]",""));  // [0-9] 숫자를 제거한다.
//		System.out.println(aa.replaceAll("[\\d]",""));  // \d 숫자를 제거한다.
//		System.out.println(aa.replaceAll("[\\D]",""));  // \D 숫자를 제외한 문자를 제거한다.
		
		// 206쪽 문제 풀어보자
		String str="내 이름은 [홍길동]입니다. 나이는 [15]살 입니다";
		String name;
		int age;
		name=str.substring(str.indexOf('[')+1,str.indexOf(']'));
		String temp=str.substring(str.lastIndexOf('[')+1,str.lastIndexOf(']'));
		age=Integer.parseInt(temp);
		System.out.println(name);  // 홍길동
		System.out.println(age);   // 15

	}

}
