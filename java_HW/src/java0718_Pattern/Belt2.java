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
		System.out.println("����� �����̾Ʈ ���� �ѱ�");
	}
	public void beltInOff() {
		System.out.println("����� �����̾Ʈ ���� ����");
	}
	public void beltInSpeedUp() {
		System.out.println("����� �����̾Ʈ ���ǵ� ��");
	}
	public void beltInSpeedDown() {
		System.out.println("����� �����̾Ʈ ���ǵ� �ٿ�");
	}
}
class Belt2Out{
	public void beltOutOn() {
		System.out.println("��ǰ�� �����̾Ʈ ���� �ѱ�");
	}
	public void beltOutOff() {
		System.out.println("��ǰ�� �����̾Ʈ ���� ����");
	}
	public void beltOutSpeedUp() {
		System.out.println("��ǰ�� �����̾Ʈ ���ǵ� ��");
	}
	public void beltOutSpeedDown() {
		System.out.println("��ǰ�� �����̾Ʈ ���ǵ� �ٿ�");
	}
}