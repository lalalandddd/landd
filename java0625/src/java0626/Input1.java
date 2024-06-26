package java0626;

import java.util.Scanner;  // Scanner 클래스의 위치를 지정해줘야(가져와야) Scanner을 쓸 수 있다.
// 무조건 위치는 package 바로 아래
// 근데 모든 명령어를 이런 식으로 가져올 수는 없는 노릇이라...
// 아래 Scanner에 마우스를 대고 가만히 있으면 나오는 팝업에서 import Scanner(java.util)을 누르면 알아서 써진다.
// 다른 명령어도 동일

public class Input1 {

	public static void main(String[] args) {
		
//		System.out.println("자바출력");
		// System.out - 출력 ←→ System.in - 입력
		// 입력받을 수 있는 내장 클래스 : Scanner
		// 이렇게 해야 글자를 입력받을 수 있다. 각 class 당 한번만 하면 된다.
		// 근데 왜 오류 뜸? ↑ import 부분에 이유...
		
		// new는 자바에선 배열, 객체를 새로 만들 때 사용했었다... 왜 이걸 쓰냐면 한글 정리에 메모리 표 참고
		
//		int a=scan.nextInt();  // Int는 변수 타입... 다른 타입도 사용 가능 단, char(문자)는 없다.
		// 문자열 입력은 nextLint(), next()  문자는 없다.
//		System.out.println(a);
		
		// 철수가 점심을 먹기 위해 편의점에 갔다. 대게라면, 삼각김밥, 바나나우유를 먹었다. 점심값은 얼마를 지불했는가?
//		System.out.println("대개라면 가격은?");
//		int crapRamyeon=scan.nextInt();
//		System.out.println("삼각김밥 가격은?");
//		int triGimbap=scan.nextInt();
//		System.out.println("바나나우유 가격은?");
//		int bananaMilk=scan.nextInt();
//		int price=crapRamyeon+triGimbap+bananaMilk;
//		System.out.println("지불한 점심값 : "+price);
		// 교사님 제시
//		int crapRamyeon,triGimbap,bananaMilk;
//		System.out.println("대개라면 가격은?");
//		crapRamyeon=scan.nextInt();
//		System.out.println("삼각김밥 가격은?");
//		triGimbap=scan.nextInt();
//		System.out.println("바나나우유 가격은?");
//		bananaMilk=scan.nextInt();
//		int price=crapRamyeon+triGimbap+bananaMilk;
//		System.out.printf("지불한 점심값 : %d 원\n",price);
		
		// 민수가 친구들을 만나러 나왔다. 나와서 보니 지갑을 놓고 와서 집에 갔다 왔다.
		// 이번에는 신발을 짝짝이로 신어서 다시 집에 갔다 왔다.
		// 민수의 집은 5층이다. 민수가 1층 올라가는데 3.4초가 걸린다.
		// 민수가 집에 들어갔다 나왔다 하는데 걸린 총 시간은?
//		int floor;
//		float time, moveTime;
//		moveTime=3.4f;
//		floor=5;
//		time=(floor-1)*moveTime*5;
//		System.out.printf("민수가 이동한 시간 : %.1f초\n",time);
		
		// 프로그램 코드는 위에서 아래로 순차적으로 진행되는 것이 기본이다.
		// 예외 : 조건문, 반복문, 함수(메서드), goto문
		
		// c언어, 자바, 건축학개론 시험 성적을 입력하세요. 세 과목의 총점과 평균을 각각 출력하세요.
		int cLang, java, archi, sum;
		float avg;
		System.out.println("c언어 성적은?");
		cLang=scan.nextInt();
		System.out.println("자바 성적은?");
		java=scan.nextInt();
		System.out.println("건축학개론 성적은?");
		archi=scan.nextInt();
		sum=cLang+java+archi;
		avg=sum/3f;
		System.out.printf("총점 : %d점, 평균 : %.1f점\n",sum,avg);

	}

}
