package java0704;

import java.util.Scanner;

public class javaMethod6 {

	public static void main(String[] args) {
		
	// 컴퓨터와 가위바위보 하기. 컴퓨터의 값은 comInput 메서드를 사용한다. 유저의 가위바위보는 한글로 입력한다.
	// 승,무,패 결과를 출력한다. 메서드-(유저 가위바위보 입력하고 저장), (컴퓨터와 비교하여 결과 출력), comInput
	// Game class에 필요한 변수나 메서드 작성. main에서는 Game class 객체로 메서드들만 실행할 것.
		Game game=new Game();
		game.play();
//		game.comInput();
//		game.userInput();
//		game.result();

	}
}

class Game{  // rock-paper-scissors 게임
	String com;
	String user;
	Scanner scan=new Scanner(System.in);
	void play() {
		comInput();
		userInput();
		result();
	}
	void comInput() {
		int temp=(int)(Math.random()*3);
		switch(temp) {
		case 0:this.com="가위";break;
		case 1:this.com="바위";break;
		case 2:this.com="보";break;
		}
	}
	void userInput() {
		System.out.print("가위 바위 보 중 하나를 입력하세요");
		user=scan.nextLine();
	}
	void result() {
		if(user.equals(com)) {
			System.out.printf("%s, %s, 무",user,com);
		}else if((user.equals("가위")&&com.equals("보"))||(user.equals("바위")&&com.equals("가위"))||(user.equals("보")&&com.equals("바위"))) {
			System.out.printf("%s, %s, 승",user,com);
		}else {
			System.out.printf("%s, %s, 패",user,com);
		}
//		System.out.printf("나 (%s) : COM (%s)\n",user,com);  // 내껀 너무 복잡해!
//		switch(user) {
//			case "가위": switch(com) {
//				case "가위": System.out.print("무");break;
//				case "바위": System.out.print("패");break;
//				case "보": System.out.print("승");break;
//				}break;
//			case "바위": switch(com) {
//				case "가위": System.out.print("승");break;
//				case "바위": System.out.print("무");break;
//				case "보": System.out.print("패");break;
//				}break;
//			case "보": switch(com) {
//				case "가위": System.out.print("패");break;
//				case "바위": System.out.print("승");break;
//				case "보": System.out.print("무");break;
//				}break;
//		}
	}
}