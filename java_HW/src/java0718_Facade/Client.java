package java0718_Facade;

import java.util.Scanner;

public class Client {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.println("��ǻ�͸� �����Ϸ��� ���� ��ư�� �����ʽÿ�");

        String input = scan.nextLine();

        // Computer Ŭ���� �޼��� ȣ�� ����

        Computer pc = new Computer();  

        pc.startup();

	}

}
