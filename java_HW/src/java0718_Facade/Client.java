package java0718_Facade;

import java.util.Scanner;

public class Client {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.println("컴퓨터를 시작하려면 전원 버튼을 누르십시오");

        String input = scan.nextLine();

        // Computer 클래스 메서드 호출 실행

        Computer pc = new Computer();  

        pc.startup();

	}

}
