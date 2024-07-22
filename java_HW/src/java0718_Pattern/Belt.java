package java0718_Pattern;

public class Belt {
	BeltIn bIn=new BeltIn();
	BeltOut bOut=new BeltOut();

	public void beltOn() {
		bIn.beltInOn();
		bOut.beltOutOn();
	}
	public void beltOff() {
		bIn.beltInOff();
		bOut.beltOutOff();
	}
}

class BeltIn{
	public void beltInOn() {
		System.out.println("자재용 컨베이어벨트 전원 켜기");
	}
	public void beltInOff() {
		System.out.println("자재용 컨베이어벨트 전원 끄기");
	}
}
class BeltOut{
	public void beltOutOn() {
		System.out.println("제품용 컨베이어벨트 전원 켜기");
	}
	public void beltOutOff() {
		System.out.println("제품용 컨베이어벨트 전원 끄기");
	}
}