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

		Member member=new Member("이순신",2027);  // 이름, 태어난년도
		try {
			member.setAge();
		}catch(RuntimeException e) {
			System.out.println(e.getMessage());
		}
		System.out.println(member.name+", "+member.birth+", "+member.age);

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
// setAge 메서드를 호출하여 age 변수값을 저장하는데 age 변수는 나이라서 0보다 작으면 안 된다.
// 0보다 작은 값이 나온다면 birth 변수가 잘못되었기에 발생한 문제이므로, setAge 메서드에서 처리하는게 아니라
// 상위 코드에서 해결해야 하므로 예외 발생시키고 넘겨주기를 한다.
	void setAge() throws RuntimeException {
		this.age=2024-birth;
		if(age<0) throw new RuntimeException("태어난 년도가 잘못되었습니다.");
	}
//	void setAge() {
//		try {
//			this.age=2024-birth;
//			if(age<0) throw new RuntimeException("태어난 년도가 잘못되었습니다.");
//		}catch(Exception e) {
//			e.printStackTrace();
//			System.out.println(e.getMessage()+"나이 계산 오류");
//		}
//	}
}