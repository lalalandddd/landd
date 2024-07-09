package homeproduct;

public abstract class House {  // 추상 클래스
// 추상 메서드(abstract)를 가졌기 때문에 추상 클래스여야 한다.	
	protected boolean onOff;
	protected String brand;  // 제품 브랜드명
	protected int price;  // 제품 구매가격
	protected int year;  // 생산 년도
	protected House(){
		this.onOff=false;
	}
	protected House(String brand,int price){
		this.brand=brand;
		this.price=price;  // 매개변수 있는 메서드를 만들면 빨간 줄이 사라진다.
	}
	protected abstract void power();  // 추상 메서드(내용 없는 메서드) = 추상 클래스여야 한다.
//	void power() {  // 오버라이딩 되었으므로 아래 내용은 필요가 없다.
//		this.onOff=!this.onOff;  // 같은 내용이 자식 클래스에 있다.
//		System.out.println(this+"전원 : "+this.onOff);
//	}

}
