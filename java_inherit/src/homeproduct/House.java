package homeproduct;

public class House {
	
	boolean onOff;
	String brand;  // ��ǰ �귣���
	int price;  // ��ǰ ���Ű���
	int year;  // ���� �⵵
	House(){
		this.onOff=false;
	}
	void power() {
		this.onOff=!this.onOff;
		System.out.println(this+"���� : "+this.onOff);
	}

}
