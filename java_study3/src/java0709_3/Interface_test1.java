package java0709_3;

//class RestCustomer{  // 시장에 찾아오는 손님
//	String customer;  //  예약 손님
//	public void setCustomer(String customer) {
//		this.customer=customer;
//	}
//}
//class ReservCustomerA extends RestCustomer{}  // 예약손님 A
//class ReservCustomerB extends RestCustomer{}  // 예약손님 B
//class Owner{  // 사장
//	void food(ReservCustomerA cusA) {
//		System.out.println(cusA.customer+" 청국장 준다.");
//	}
//	void food(ReservCustomerB cusB) {
//		System.out.println(cusB.customer+" 돈가스 준다.");
//	}
//}
// 세 번째 예약 손님이 추가되면 예약손님C class, 음식 void, 출력 항목이 추가되어야 한다... 이를 간단하게 하면?

// 각 메서드 간 결합도를 낮게 하여 문제가 발생하면 하나의 메서드 안에서 해결이 가능하도록 해야 한다.
interface RestCustomer{
	public void setCustomer(String customer);  // 추상메서드
	public String food();
}
class ReservCustomerA implements RestCustomer{  // 독립 class로 활용하면 추가사항이 있을 때, 이 부분만 추가하면 된다.
	String customer;  //  예약 손님A
	@Override
	public void setCustomer(String customer) {
		this.customer=customer;
	}
	@Override
	public String food() {
		return customer+" 청국장 준다.";
	}
}  // 예약손님A
class ReservCustomerB implements RestCustomer{
	String customer;  //  예약 손님B
	@Override
	public void setCustomer(String customer) {
		this.customer=customer;
	}
	@Override
	public String food() {
		return customer+" 돈가스 준다.";
	}
}  // 예약손님B
class Owner{  // 사장
	void food(RestCustomer cus) {
		System.out.println(cus.food());
	}  // interface 사용하면 이 부분은 이렇게만 해두고 추가는 위의 class만 넣으면 된다.
}
public class Interface_test1 {

	public static void main(String[] args) {
		
		Owner open=new Owner();
		ReservCustomerA a=new ReservCustomerA();
		ReservCustomerB b=new ReservCustomerB();
		a.setCustomer("A-이순신");
		b.setCustomer("B-장보고");
		open.food(a);
		open.food(b);
	}
}

// 초등학생, 중학생, 고등학생, 대학생?
// 부모 클래스로 학생(공통점)
// 이름, 반, 키, 학년, 번호, 성적 등등의 class를 interface로 가면 모든 학생이 사용할 수 있다. - 다형성
// 변호사, 검사, 소방관, 의사, 미화원  >  부모class  이름, 나이, 근무지, 연봉, 업무....

// 단순 데이터 뿐 가공 메서드가 없다? interface를 할 필요가 없다. 상속관계를 맺지 않는다.
// 상속관계(interface)는 데이터에 더해서 데이터를 가공하는 기능이 있어야 적합하다.

// 사용자 요청 처리 class - 컨트롤 class
// 사용자 요청에 필요한 데이터를 가공 및 수집하여 실행하는 class - 서비스 class
// 데이터만 저장하는 class - 사용자에게 제공할 데이터 class(VO,DTO) / 데이터베이스에 저장하기 위한 class(Entity)
// 데이터베이스 처리 인터페이스 - repository
