package homework;

import java.util.Scanner;

public class java0704_Dice {

	public static void main(String[] args) {
		
//		Dice j=new Dice();  // 내가 만든 것
//		Dice s=new Dice();
//		Versus vs=new Versus();
//		int j형준=j.get();
//		int s석완=s.get();
//		String a결과=vs.vs(j형준,s석완);
//		System.out.printf("형준 : 석완\n%2d  : %2d\n%7s",j형준,s석완,a결과);
		
//		Dice d=new Dice();  // 교사님 만든 것 1
//		Versus vs=new Versus();
//		int j형준=d.get("형준");  // 이름을 보냄으로써 위에 주사위를 굴리는 한 줄이 줄었다!!
//		int s석완=d.get("석완");
//		String a결과=vs.vs(j형준,s석완);
//		System.out.printf("형준 : 석완\n%2d  : %2d\n%7s",j형준,s석완,a결과);
		
		// 교사님 만든 것 2  - 이렇게 한 이유는 나중에 이와 비슷한 형식으로 실기를 치뤄야 하기 때문...
		Dice game=new Dice();
		game.init();  // 주사위 게임 초기 설정 (참가 인원, 참가자 이름)
		game.diceThrow();  // 주사위 던지기 X 참가 인원 수
		game.result();  // 주사위 값 비교

	}
}

//class Dice{  // 내가 만든 것
//	int a=(int)(Math.random()*6+1);
//	int get() { return a; }
//}

//class Dice{  // 교사님 만든 것 1
//	int get(String name) {  // 이름을 받음으로써 위에 주사위를 굴리는 한 줄이 줄었다!!
//		int a=(int)(Math.random()*6+1);
//		return a;
//	}
//}

class Dice{  // 교사님 만든 것 2 (참가자 인원수 상관 없이 class 안에서 주사위 게임 완료하기 - return 없음)
	String[] names;
	int[] diceNum;
	void init() {
		Scanner scan=new Scanner(System.in);
		System.out.print("주사위 게임 참가인원 : ");
		int cnt=scan.nextInt();
		scan.nextLine();  // 버퍼 비우기 - 엔터키, 다음의 문자 입력에 문제가 없다. 안하면 첫번째 문자가 입력되지 않는다.
		this.names=new String[cnt];
		this.diceNum=new int[cnt];
		for(int i=0;i<names.length;i++) {
			System.out.print("참가자 이름은? : ");
			names[i]=scan.nextLine();
		}
	}
	void diceThrow() {  // 주사위 던지기
		for(int i=0; i<names.length;i++) {
			this.diceNum[i]=(int)(Math.random()*6+1);
			System.out.println(this.names[i]+"주사위 : "+this.diceNum[i]);
		}
	}
	void result() {  // 주사위 값이 가장 큰 사람이 이긴다
		int max=0;
		for(int num : diceNum) {  // 가장 큰 주사위 값을 먼저 찾는다.
			if(max<num) max=num;
		}
		boolean isSame=true;  // 모든 참가자들의 주사위 값이 같다면
		for(int num:diceNum) {
			if(num!=max) isSame=false;
		}
		if(isSame) {
			System.out.println("모든 참가자 주사위 값이 같다. 비김");
			return;
		}
		for(int i=0;i<diceNum.length;i++) {
			if(diceNum[i]==max) {
				System.out.println(names[i]+"승리!");
			}
		}
	}
}

//class Versus{  // 내가 만든 것
//	String vs(int j,int s) {
//		if(j>s) {
//			String a=" 승  :  패";
//			return a;
//		}else if(j<s) {
//			String a=" 패  :  승!";
//			return a;
//		}else {
//			String a="DRAW GAME!";
//			return a;
//		}
//	}
//}