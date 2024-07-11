package java0711;
import java.util.Scanner;

class InfoException extends Exception{
	public InfoException(String a) {
		super(a);
	}
}

public class ExceptionQuestion {
	
	static void setUserInfo(String name, int age, String userInfo) throws InfoException {
		if(name==null)throw new InfoException("�̸��� �Է��ϼ���");
		if(age==0)throw new InfoException("���̸� �Է��ϼ���");
		if(age<0||age>999)throw new InfoException("������ �Է��ϼ���");
		if(userInfo==null)throw new InfoException("�ڱ�Ұ��� �Է��ϼ���");
		if(userInfo.length()<10)throw new InfoException("10�� �̻� �Է��ϼ���");
	}

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		String name=null;
		int age=0;
		String userInfo=null;
		
		try {
			System.out.print("�̸� : ");
			name=scan.nextLine();
		}catch(InfoException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			System.out.print("���� : ");
			age=scan.nextInt();
			scan.nextLine();
		}catch(InfoException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			if(age>=20) {
				System.out.print("�ڱ�Ұ� : ");
				userInfo=scan.nextLine();
			}
		}catch(InfoException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println(age+"�� "+name+"���� ");
		System.out.println(userInfo.substring(0,10));

	}
}

//����� ���� ����ó�� Ŭ������ ���� ������.