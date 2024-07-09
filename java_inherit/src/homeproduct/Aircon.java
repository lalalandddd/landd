package homeproduct;

public class Aircon extends House {
	
	static final String[] windText= {"무풍","미풍","약풍","강풍"};
	int wind=0;
	int temperation=20;
	public Aircon(){}
	public Aircon(String brand, int price){
		super(brand,price);
	}
	public void windControl() {
		wind++;
		if(wind==windText.length)wind=0;
		System.out.println("현재 바람 세기 : "+windText[wind]);
	}
	public void tempUp() {this.temperation++;}
	public void tempDown() {this.temperation--;}
	public void power() {
		super.onOff=!super.onOff;
		System.out.println("에어컨 전원 : "+super.onOff);
	}
}
