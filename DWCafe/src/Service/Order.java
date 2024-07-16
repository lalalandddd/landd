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
// �ֹ� Ȯ�� �� ���� �����ϱ�
		System.out.println("�ֹ� �޴� Ȯ�� ");
		System.out.println(orderCoffe!=null?orderCoffe:orderTea);
		System.out.println("=== ���� ===");
		System.out.println("1. ���� 2. �ݱ� : ");
		if(ss.nextInt()==2)return;
		Kiosk payment=new Payment(orderCoffe!=null?orderCoffe:orderTea);
		payment.action();
	}
}
