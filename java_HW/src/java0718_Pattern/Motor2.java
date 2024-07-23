package java0718_Pattern;

public class Motor2 {
	MachineMotor2 mm=new MachineMotor2();
	RollerMotor2 rm=new RollerMotor2();
	PressMotor2 pm=new PressMotor2();

	public void motorOn() {
		mm.machineMotorOn();
		rm.rollerMotorOn();
		pm.pressMotorOn();
	}
	public void motorOff() {
		mm.machineMotorOff();
		rm.rollerMotorOff();
		pm.pressMotorOff();
	}
	public void motorSpeedUp() {
		mm.machineMotorSpeedUp();
		rm.rollerMotorSpeedUp();
		pm.pressMotorSpeedUp();
	}
	public void motorSpeedDown() {
		mm.machineMotorSpeedDown();
		rm.rollerMotorSpeedDown();
		pm.pressMotorSpeedDown();
	}
}

class MachineMotor2{
	public void machineMotorOn() {
		System.out.println("��ü ���� �ѱ�");
	}
	public void machineMotorOff() {
		System.out.println("��ü ���� ����");
	}
	public void machineMotorSpeedUp() {
		System.out.println("��ü ���� ���ǵ� ��");
	}
	public void machineMotorSpeedDown() {
		System.out.println("��ü ���� ���ǵ� �ٿ�");
	}
}
class RollerMotor2{
	public void rollerMotorOn() {
		System.out.println("�ѷ� ���� �ѱ�");
	}
	public void rollerMotorOff() {
		System.out.println("�ѷ� ���� ����");
	}
	public void rollerMotorSpeedUp() {
		System.out.println("�ѷ� ���ǵ� ��");
	}
	public void rollerMotorSpeedDown() {
		System.out.println("�ѷ� ���ǵ� �ٿ�");
	}
}
class PressMotor2{
	public void pressMotorOn() {
		System.out.println("�������� ���� �ѱ�");
	}
	public void pressMotorOff() {
		System.out.println("�������� ���� ����");
	}
	public void pressMotorSpeedUp() {
		System.out.println("�������� ���ǵ� ��");
	}
	public void pressMotorSpeedDown() {
		System.out.println("�������� ���ǵ� �ٿ�");
	}
}