package java0627;

import java.util.Scanner;

public class Conditional {

	public static void main(String[] args) {

		// 조건문 if, switch  (java와 종류, 사용방법 모두 동일)

		// 그냥 모든 데이터를 출력할 때도 조건문을 사용한다 = (데이터가 있으면) 출력, 이게 없으면 오류가 뜬다...
		
		// if문의 조건식 : 비교연산자, 논리연산자로 참/거짓 구분이 가능한 식을 만든다.
		// 키가 150 이상  :  키>=150
		// 10월달의 지출 내역  :  지출내역날짜(월)==10
		// 32000원 이상 지출 내역  :  지출내역(지출금액)>=32000
		// 판매중인 상품들만 출력  :  상품 상태==판매, 재고수량>0

//		int tall=135;
//		if( tall>=150 ) {  // 키가 150 이상인가?
//			System.out.println("바이킹 탑승 가능");  // 150 이상이 맞다면 실행
//		}else {
//			System.out.println("바이킹 탑승 불가능");  // 150 이상이 아니면 실행
//		}
		
		// 시험 합격 기준 : 60점 이상
//		int score1=72;
//		if(score1>=60) {
//			System.out.printf("%d점, 시험 합격!",score1);
//		}else {
//			System.out.printf("%d점,  시험 불합격!",score1);
//		}
		
		// if~else : 조건식이 참/거짓에 따라 실행되는 내용이 다른 경우
		// 하나의 조건에 두 개의 내용이 있는 경우, if~else 구조로 작성
		
		// 시험 성적 등급 1
//		int score2=89;
//		if(score2>=90) {
//			System.out.println("A Grade");
//		}else if(score2>=80) {
//			System.out.println("B Grade");
//		}else {
//			System.out.println("get out!");
//		}
		
		// 시험 성적 등급 2  A(90점이상), B(80점이상), C(70점 이상), D(60점 이상), F(나머지)
//		int score3=48;
//		if(score3>=90) {
//			System.out.printf("%d점, A Grade", score3);
//		}else if(score3>=80) {
//			System.out.printf("%d점, B Grade", score3);
//		}else if(score3>=70) {
//			System.out.printf("%d점, C Grade", score3);
//		}else if(score3>=60) {
//			System.out.printf("%d점, D Grade", score3);
//		}else {
//			System.out.printf("%d점, F Grade", score3);
//		}
		
		// switch문 - 실행 조건을 case로 설정하여 case와 일치하는 값이면 발동되는 조건문
		// 조건식에 == 연산자를 사용하면 switch로 작성하는 것을 고려하자
		
/*		지렁이 게임을 만들자. 방향키(w,a,s,d) 일시정지(p) 계속하기(o) 처음부터(i) 게임시작(ctrl+s)
		String key=null, key2=null;
		switch(key) {
			case 'w': 실행내용
			case 'a': 실행내용
			case 's': 실행내용
			case 'd': 실행내용
			case 'p': 실행내용
			case 'o': 실행내용
			case 'i': 실행내용
			case 'ctrl':
				switch(key2) {
				case 's': 실행내용
				}
		}
		
		프로그램의 메뉴 구성
		switch(menu){
			case "open":
			case "save":
			case "build":
			case "git":
			case "exit":
		}
*/
		
		// 시작 버튼 클릭하면 게임 시작, 종료 버튼 클릭하면 게임 종료, 저장 버튼 클릭하면 게임 저장
//		String button="종료";
//		switch (button) {
//			case "시작":
//				System.out.println("게임 시작!");
//				break;  // 이걸 치지 않으면 아래 저장까지 계속 실행한다. 반드시 멈춰!
//			case "자동저장":
//			case "저장":
//				System.out.println("게임 저장!");
//				break;
//			case "종료":
//				System.out.println("게임 종료!");
//		}
		
		// 가로와 세로의 길이를 키보드로 입력하세요(단위 무시하고)
		// 가로 또는 세로의 길이가 다르다면 직사각형, 같다면 정사각형이라고 출력하세요
		// switch문으로 (if문 사용 금지)  case에 변수는 넣을 수 없다
		Scanner sc=new Scanner(System.in);
		int a=0, b=0;
		System.out.println("가로 길이(정수)를 입력하세요");
		a=sc.nextInt();
		System.out.println("세로 길이(정수)를 입력하세요");
		b=sc.nextInt();
		switch (a-b) {  // 가로-세로 ()안에 수식은 가능
		case 0:  // 정사각형은 가로와 세로의 길이가 같으므로 빼면 0이다!
			System.out.printf("가로 세로가 %d인 정사각형",a);
			break;
		default:  // 위의 case 들에 해당하지 않는 나머지 경우
			System.out.printf("가로가 %d, 세로가 %d인 직사각형",a,b);
		}
		// switch 문에 default는 단 한번만 가능. case에 일치하는 게 없다면 실행

	}

}
