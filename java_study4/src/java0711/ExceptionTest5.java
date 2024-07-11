package java0711;

class PasswordException extends Exception{
	public PasswordException(String msg) {
		super(msg);
	}
}

public class ExceptionTest5 {

	static void setPassword(String password) throws PasswordException {  // 직접 만든 예외처리클래스
		if(password==null)throw new PasswordException("비밀번호를 입력하세요");
		if(password.length()<8)throw new PasswordException("비밀번호를 8자 이상 입력하세요");
		if(password.matches("[a-zA-Z]+"))throw new PasswordException("비밀번호는 숫자나 특수문자를 포함하여 입력하세요");
		// 위 if문 중에 하나라도 오류(throw)가 발생하지 않으면 비밀번호 저장하기 / 오류 발생하면 내용 출력하고 종료
		
	}

	public static void main(String[] args) {

		try {
			setPassword("123456");
		}catch(PasswordException e) {  // 직접 만든 예외처리클래스를 사용
			System.out.println(e.getMessage());
		}

	}
}

/*
사용자 정의 예외처리 클래스 만들기
*/
