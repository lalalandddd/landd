package java0704;

import java.util.Scanner;

public class javaMethod6 {

	public static void main(String[] args) {
		
	// ��ǻ�Ϳ� ���������� �ϱ�. ��ǻ���� ���� comInput �޼��带 ����Ѵ�. ������ ������������ �ѱ۷� �Է��Ѵ�.
	// ��,��,�� ����� ����Ѵ�. �޼���-(���� ���������� �Է��ϰ� ����), (��ǻ�Ϳ� ���Ͽ� ��� ���), comInput
	// Game class�� �ʿ��� ������ �޼��� �ۼ�. main������ Game class ��ü�� �޼���鸸 ������ ��.
		Game game=new Game();
		game.play();
//		game.comInput();
//		game.userInput();
//		game.result();

	}
}

class Game{  // rock-paper-scissors ����
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
		case 0:this.com="����";break;
		case 1:this.com="����";break;
		case 2:this.com="��";break;
		}
	}
	void userInput() {
		System.out.print("���� ���� �� �� �ϳ��� �Է��ϼ���");
		user=scan.nextLine();
	}
	void result() {
		if(user.equals(com)) {
			System.out.printf("%s, %s, ��",user,com);
		}else if((user.equals("����")&&com.equals("��"))||(user.equals("����")&&com.equals("����"))||(user.equals("��")&&com.equals("����"))) {
			System.out.printf("%s, %s, ��",user,com);
		}else {
			System.out.printf("%s, %s, ��",user,com);
		}
//		System.out.printf("�� (%s) : COM (%s)\n",user,com);  // ���� �ʹ� ������!
//		switch(user) {
//			case "����": switch(com) {
//				case "����": System.out.print("��");break;
//				case "����": System.out.print("��");break;
//				case "��": System.out.print("��");break;
//				}break;
//			case "����": switch(com) {
//				case "����": System.out.print("��");break;
//				case "����": System.out.print("��");break;
//				case "��": System.out.print("��");break;
//				}break;
//			case "��": switch(com) {
//				case "����": System.out.print("��");break;
//				case "����": System.out.print("��");break;
//				case "��": System.out.print("��");break;
//				}break;
//		}
	}
}