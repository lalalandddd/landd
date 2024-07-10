package java0710_3;

public class ExceptionTest3 {

	public static void main(String[] args) {
// 일부러 오류를 발생시키는 방법.
//		try {
//			// 코드들...
//			// if() 여기서 문제 발생 조건을 잡고
//			throw new NullPointerException("aa");  // 문제가 발생하면 오류 던지기
//			// 코드들... 문제가 없으면 그냥 진행
//		}catch(Exception e) {  // 오류가 나면 받기
//			System.out.println("강제 오류 발생");
//		}
	}
}

// 예외 던지기를 위한 메소드를 만들기
class Member{
	String name;
	int age;
	int birth;
	Member(String name, int birth){
		this.name=name;
		this.birth=birth;
	}
	void setAge() {
		this.age=2024-birth;
	}
}