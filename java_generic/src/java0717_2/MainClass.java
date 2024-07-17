package java0717_2;

import java.util.Date;

@FunctionalInterface
interface moveable{  // 메서드를 딱 하나만 가지는 인터페이스 : 함수형 인터페이스
	public void move();
}
class A<T>{
	T item;
	@SafeVarargs  // 이 한줄이 들어가면 경고줄이 사라진다.
	final void get(T... add) {  // 가변인자 add에 경고줄이 뜬다.
		
	}
}

public class MainClass {
	@Deprecated
	static void aaa() {}

	public static void main(String[] args) {

		aaa();
		Date today=new Date();
		@SuppressWarnings("all")
		ArrayList ist=new ArrayList();
		@SuppressWarnings("deprecation")
		today.getYear();

	}
}
/*
annotation 애너테이션(어노테이션) - 주석
개발자를 위한 메모/주석을 의미한다. 즉, 없어도 동작에 문제는 없다.
그러나 주석을 적으면 변수의 용도를 빠르게 알아차릴 수 있다. 실행이 빠르게 된다.
컴퓨터에게 특정 코드의 정보를 제공
표준 annotation
	- @Override : 컴파일러에게 메서드를 오버라이딩 하는 것이라고 알려준다.
	- @Deprecated : 앞으로 사용하지 않을 대상이라고 알려준다.
	- @SuppressWarnings("") : 컴파일러 경고를 출력하지 않게 설정. () 안에 text를 넣어야 한다.
		> all : 모든 경고 억제
		> deprecation : 권장되지않는 기능 경고(취소선) 억제
		> null : null 관련 경고 억제
		> unchecked : 미확인 오퍼레이션 경고(노란줄) 억제
		> unused : 사용하지 않는 코드/불필요한 코드에 대한 경고 억제
	- @FunctionalInterface : 함수형 인터페이스라는 것을 알려준다.
	- @SafeVarargs : 제네릭과 같은 가변 인자의 매개변수를 사용할 때 경고 억제
메타 annotation
	- @Target : 애너테이션을 정의할 때 적용할 대상을 지정
	- @Documented : javadoc로 작성된 문서에 포함
	- @Inherited : 하위클래스에 상속되도록 할 때 사용
	- @Retention : 애너테이션 기간 설정
	- @Repeatable : 애너테이션 반복 설정
*/