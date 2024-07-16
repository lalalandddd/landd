package Service;

import DTO.Coffe;
import DTO.Tea;

public class Payment implements Kiosk{

	private Coffe orderCoffe;
	private Tea orderTea;
	public Payment(Object drink) {
		if(drink instanceof Coffe)this.orderCoffe=(Coffe)drink;
		if(drink instanceof Tea)this.orderTea=(Tea)drink;
	}
	@Override
	public void action() {
		System.out.println("결제를 진행합니다.");
		int price=orderCoffe!=null?orderCoffe.getPrice():orderTea.getPrice();
		System.out.println("결제 금액 : "+price);
	}

}
