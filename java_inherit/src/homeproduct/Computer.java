package homeproduct;

public class Computer extends House {
	
	public Computer(){}
	public Computer(String brand, int price){
		super(brand,price);
	}
	public void power() {
		super.onOff=!super.onOff;
		System.out.println("��ǻ�� ���� : "+super.onOff);
	}
}
