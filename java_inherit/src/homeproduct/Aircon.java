package homeproduct;

public class Aircon extends House {
	
	static final String[] windText= {"��ǳ","��ǳ","��ǳ","��ǳ"};
	int wind=0;
	int temperation=20;
	public Aircon(){}
	public Aircon(String brand, int price){
		super(brand,price);
	}
	public void windControl() {
		wind++;
		if(wind==windText.length)wind=0;
		System.out.println("���� �ٶ� ���� : "+windText[wind]);
	}
	public void tempUp() {this.temperation++;}
	public void tempDown() {this.temperation--;}
	public void power() {
		super.onOff=!super.onOff;
		System.out.println("������ ���� : "+super.onOff);
	}
}
