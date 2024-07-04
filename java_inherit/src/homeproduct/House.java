package homeproduct;

public class House {
	
	boolean onOff;
	String brand;  // 제품 브랜드명
	int price;  // 제품 구매가격
	int year;  // 생산 년도
	House(){
		this.onOff=false;
	}
	House(String brand,int price){
		this.brand=brand;
		this.price=price;  // 매개변수 있는 메서드를 만들면 빨간 줄이 사라진다.
	}
	void power() {
		this.onOff=!this.onOff;
		System.out.println(this+"전원 : "+this.onOff);
	}

}
