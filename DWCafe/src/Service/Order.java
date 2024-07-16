package Service;

import java.util.Scanner;

import DTO.Coffe;
import DTO.Tea;

public class Order implements Kiosk{

	Scanner ss=new Scanner(System.in);
	private Coffe orderCoffe;
	private Tea orderTea;
	public Order(Coffe orderCoffe) {
		this.orderCoffe=orderCoffe;
	}
	public Order(Tea orderTea) {
		this.orderTea=orderTea;
	}
	@Override
	public void action() {
// 주문 확인 및 결제 진행하기
		System.out.println("주문 메뉴 확인 ");
		System.out.println(orderCoffe!=null?orderCoffe:orderTea);
		System.out.println("=== 결제 ===");
		System.out.println("1. 결제 2. 닫기 : ");
		if(ss.nextInt()==2)return;
		Kiosk payment=new Payment(orderCoffe!=null?orderCoffe:orderTea);
		payment.action();
	}
}
