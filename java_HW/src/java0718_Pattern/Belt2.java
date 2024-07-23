package java0718_Pattern;

public class Belt2 {
	Belt2In bIn=new Belt2In();
	Belt2Out bOut=new Belt2Out();

	public void beltOn() {
		bIn.beltInOn();
		bOut.beltOutOn();
	}
	public void beltOff() {
		bIn.beltInOff();
		bOut.beltOutOff();
	}
	public void beltSpeedUp() {
		bIn.beltInSpeedUp();
		bOut.beltOutSpeedUp();
	}
	public void beltSpeedDown() {
		bIn.beltInSpeedDown();
		bOut.beltOutSpeedDown();
	}
}

class Belt2In{
	public void beltInOn() {
		System.out.println("자재용 컨베이어벨트 전원 켜기");
	}
	public void beltInOff() {
		System.out.println("자재용 컨베이어벨트 전원 끄기");
	}
	public void beltInSpeedUp() {
		System.out.println("자재용 컨베이어벨트 스피드 업");
	}
	public void beltInSpeedDown() {
		System.out.println("자재용 컨베이어벨트 스피드 다운");
	}
}
class Belt2Out{
	public void beltOutOn() {
		System.out.println("제품용 컨베이어벨트 전원 켜기");
	}
	public void beltOutOff() {
		System.out.println("제품용 컨베이어벨트 전원 끄기");
	}
	public void beltOutSpeedUp() {
		System.out.println("제품용 컨베이어벨트 스피드 업");
	}
	public void beltOutSpeedDown() {
		System.out.println("제품용 컨베이어벨트 스피드 다운");
	}
}