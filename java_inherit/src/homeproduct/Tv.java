package homeproduct;

public class Tv extends House {
	
	int channel=5;  // ä�ΰ� �Ҹ��� tv�� �ִ�.
	int vol=10;  // �ʱⰪ�� ����� �θ� �ȴ�. �θ� �� �ʿ� ����.
	Tv(){  // ������ �޼���
		super();
	}
	Tv(String brand, int price){  // �Ű����� �ִ� ������ �޼���
		super(brand,price);  // �θ�Ŭ���� ������ �޼��� ȣ��
		// ó���� ������ > �θ�(House)Ŭ������ �Ű������� �ִ� �޼��尡 ���
		// �Ű����� �ִ� �޼��带 ����� ���� ���� �������.
	}
	void channelUp() {this.channel++;}  // ä���� tv�� ���Ƿ� ������ �ʿ䰡 ��� void
	void channelDown() {this.channel--;}
	
//	boolean onOff;
//	Tv(){
//		this.onOff=false;
//	}
//	void power() {  // TV ���� on off
////		if(this.onOff) this.onOff=false;
////		else this.onOff=true;
//		this.onOff=!this.onOff;  // �� �� ���� ����
//		System.out.println("TV ���� "+this.onOff);
//	}

}
