package homeproduct;

public class Tv extends House {
	
	private int channel=5;  // ä�ΰ� �Ҹ��� tv�� �ִ�.
	private int vol=10;  // �ʱⰪ�� ����� �θ� �ȴ�. �θ� �� �ʿ� ����.
	public Tv(){  // ������ �޼���
		super();
	}
	public Tv(String brand, int price){  // �Ű����� �ִ� ������ �޼���
		super(brand,price);  // �θ�Ŭ���� ������ �޼��� ȣ��
		// ó���� ������ > �θ�(House)Ŭ������ �Ű������� �ִ� �޼��尡 ���
		// �Ű����� �ִ� �޼��带 ����� ���� ���� �������.
	}
	
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		this.channel = channel;
	}
	public int getVol() {
		return vol;
	}
	public void setVol(int vol) {
		this.vol = vol;
	}
	public void channelUp() {this.channel++;}  // ä���� tv�� ���Ƿ� ������ �ʿ䰡 ��� void
	public void channelDown() {this.channel--;}
	@Override  // @ = �ּ�(��ǻ�Ϳ��� ����)
	public void power() {
		super.onOff=!super.onOff;
		System.out.println("TV ���� : "+super.onOff);
	}
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
