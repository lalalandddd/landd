package java0711;
import java.util.Scanner;

class InfoException extends Exception{
	public InfoException(String a) {
		super(a);
	}
}

public class ExceptionQuestion {
	
	static void setUserInfo(String name, int age, String userInfo) throws InfoException {
		if(name==null)throw new InfoException("이름을 입력하세요");
		if(age==0)throw new InfoException("나이를 입력하세요");
		if(age<0||age>999)throw new InfoException("정수만 입력하세요");
		if(userInfo==null)throw new InfoException("자기소개를 입력하세요");
		if(userInfo.length()<10)throw new InfoException("10자 이상 입력하세요");
	}

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		String name=null;
		int age=0;
		String userInfo=null;
		
		try {
			System.out.print("이름 : ");
			name=scan.nextLine();
		}catch(InfoException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			System.out.print("나이 : ");
			age=scan.nextInt();
			scan.nextLine();
		}catch(InfoException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			if(age>=20) {
				System.out.print("자기소개 : ");
				userInfo=scan.nextLine();
			}
		}catch(InfoException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println(age+"살 "+name+"님은 ");
		System.out.println(userInfo.substring(0,10));

	}
}

//사용자 정의 예외처리 클래스를 직접 만들어보자.