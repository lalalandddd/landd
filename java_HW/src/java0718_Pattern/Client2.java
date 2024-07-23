package java0718_Pattern;

import java.util.Scanner;

public class Client2 {

	public static void main(String[] args) {

		boolean power=true;
		Scanner sc=new Scanner(System.in);
		Facade2 you=new Facade2();
		while(true) {
			System.out.println("\n1.전원버튼 2.스피드업 3.스피드다운");
			int bt=sc.nextInt();
			if(bt==1&&power) {
				you.startMachine();
				power=false;
			}else if(bt==1&&!power){
				you.endMachine();
				power=true;
			}
			if(bt==2&&!power) you.speedUp();
			if(bt==3&&!power) you.speedDown();
		}
	}
}
