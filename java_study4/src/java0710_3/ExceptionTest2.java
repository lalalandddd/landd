package java0710_3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest2 {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		int num=0;
		boolean is=true;
		do {
			try {
				System.out.println("���� �Է� : ");
				num=scan.nextInt();  // ���� �ϳ� �Է¿� �̷��Ա��� �ؾ� ������ ����.
				is=false;
				if(is) break;
			}catch(InputMismatchException e) {  // InputMismatchException �̰͵� import!!
				System.out.println("������ �Է��ϼ���!");
			}finally {  // ���� �߻� ���� ��� ���� ���������� �����ϱ�
				scan.nextLine();  // ���� ����ֱ�(�̰� ������ �߸� �Է��� ���� ���Ƽ� ���ѹݺ�)
			}
		}while(is);
		System.out.println(num+100);
		System.out.println("�̸� : ");
		String name=scan.nextLine();
		System.out.println("�̸� : "+name);
	}
}

