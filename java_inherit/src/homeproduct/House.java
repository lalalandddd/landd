package homeproduct;

public class House {
	
	boolean onOff;
	String brand;  // ��ǰ �귣���
	int price;  // ��ǰ ���Ű���
	int year;  // ���� �⵵
	House(){
		this.onOff=false;
	}
	House(String brand,int price){
		this.brand=brand;
		this.price=price;  // �Ű����� �ִ� �޼��带 ����� ���� ���� �������.
	}
	void power() {
		this.onOff=!this.onOff;
		System.out.println(this+"���� : "+this.onOff);
	}

}
