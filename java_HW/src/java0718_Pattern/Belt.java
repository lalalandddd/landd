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
		System.out.println("����� �����̾Ʈ ���� �ѱ�");
	}
	public void beltInOff() {
		System.out.println("����� �����̾Ʈ ���� ����");
	}
}
class BeltOut{
	public void beltOutOn() {
		System.out.println("��ǰ�� �����̾Ʈ ���� �ѱ�");
	}
	public void beltOutOff() {
		System.out.println("��ǰ�� �����̾Ʈ ���� ����");
	}
}