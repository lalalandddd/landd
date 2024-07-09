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
class ReservCustomerA implements RestCustomer{
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
	}
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
