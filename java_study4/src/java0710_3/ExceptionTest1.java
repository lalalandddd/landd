package java0710_3;

public class ExceptionTest1 {

	public static void main(String[] args) {

		try {
			String name=null;
			String a="aaa";
			String b="bbb";
			String c="ccc";
			name.length();
			a.length();
			b.length();
			c.length();
			System.out.println(10/3);
		}catch(NullPointerException n) {
			n.printStackTrace();  // 오류메시지 확인 테스트 용, 완성된 프로그램엔 넣으면 안 된다.
			System.out.println("문자열을 입력하시오!");
			System.out.println(n.getMessage());
			System.out.println(n.getClass());
		}catch(Exception e) {
			System.out.println(" 0 으로 나눌 수 없다!");
		}
		System.out.println(" 여기가 프로그램 끝");

	}
}
/*
예외처리
- 프로그램 실행 중 에러가 발생하면 즉시 프로그램이 종료되고 저장 못한 자료가 날아간다.
- 예외처리를 해주면 에러가 발생해도 프로그램이 종료되지 않는다.
- 사용자가 잘못된 값을 입력하는 경우에 알려줄 수 있다.
- 에러나 오류를 해결하지 못하고 회피하는 방법이다.
*/