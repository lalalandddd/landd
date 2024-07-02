package java0702_2;

public class javaMethod {

	public static void main(String[] args) {

	// 교재 228p 메서드 참고......
	// 자바 메서드
	// 반환타입 메서드이름(매개변수){  }
	// 반환타입 - int, short, float, double, char, boolean, String, void(반환되는 값이 없다)
	// return 10;  → 반환타입 int, short, long
	// return income;  → income 변수의 타입을 반환타입으로

	/*주민등록번호로 남자인지 여자인지 구별하자
		String gender(String 주민){
		String gen=주민.substring(7,8);
		if(gen.equals("1")||gen.equals("3")){
			return "남자";
		}else if(gen.equals("2")||gen.equals("4")){
			return "여자";
		}
		return "혼란";
		}
	*/

		// 클래스 메서드에서는 오직 클래스 변수나 클래스 메서드만 실행, 메모리에 로드(적재)되는 때가 인스턴스보다 먼저 이루어지기
		// 때문에 인스턴스 변수나 인스턴스 메서드는 안 된다.
		
//		output();  // void로 인해 output에서 돌아오는 변수가 때문에 오류
//		JavaMethod ja=new JavaMethod();
//		ja.out();
		int num=300;
		output(num);  // num을 넘겨준다.

	}
	
	// num과 같은 타입의 변수를 가져와야만 {} 밖에서 사용할 수 있다.
	// num은 main{} 안에서 만들어진 지역변수이므로 {} 밖에서 쓸 수 없다.
	static void output(int a) {  // num과 같은 타입 int로 받아서 a로 지정한다.
		System.out.println(a);  // 지정한 a를 출력한다.
		System.out.println("나는 메서드 입니다.");
	}

}
class a{
	int num=10;
	static void out() {
		System.out.println(num);
	}
}
