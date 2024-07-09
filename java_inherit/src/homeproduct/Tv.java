package homeproduct;

public class Tv extends House {
	
	private int channel=5;  // 채널과 소리는 tv만 있다.
	private int vol=10;  // 초기값은 여기다 두면 된다. 부모에 둘 필요 없다.
	public Tv(){  // 생성자 메서드
		super();
	}
	public Tv(String brand, int price){  // 매개변수 있는 생성자 메서드
		super(brand,price);  // 부모클래스 생성자 메서드 호출
		// 처음엔 빨간줄 > 부모(House)클래스에 매개변수가 있는 메서드가 없어서
		// 매개변수 있는 메서드를 만들면 빨간 줄이 사라진다.
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
	public void channelUp() {this.channel++;}  // 채널은 tv만 쓰므로 돌려줄 필요가 없어서 void
	public void channelDown() {this.channel--;}
	@Override  // @ = 주석(컴퓨터에게 설명)
	public void power() {
		super.onOff=!super.onOff;
		System.out.println("TV 전원 : "+super.onOff);
	}
//	boolean onOff;
//	Tv(){
//		this.onOff=false;
//	}
//	void power() {  // TV 전원 on off
////		if(this.onOff) this.onOff=false;
////		else this.onOff=true;
//		this.onOff=!this.onOff;  // 위 두 줄을 압축
//		System.out.println("TV 전원 "+this.onOff);
//	}
}
