package java0718_Pattern;

import java.util.Scanner;

public class Client {

	public static void main(String[] args) {

		boolean power=true;
		Scanner sc=new Scanner(System.in);
		Facade you=new Facade();
		while(true) {
			System.out.println("전원버튼");
			String pw=sc.nextLine();
			if(power) {
				you.startMachine();
				power=false;
			}else {
				you.endMachine();
				power=true;
			}
		}

	}
}
