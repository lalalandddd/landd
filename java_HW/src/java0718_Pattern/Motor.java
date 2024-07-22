package java0718_Pattern;

public class Motor {
	MachineMotor mm=new MachineMotor();
	RollerMotor rm=new RollerMotor();
	PressMotor pm=new PressMotor();

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
}

class MachineMotor{
	public void machineMotorOn() {
		System.out.println("��ü ���� �ѱ�");
	}
	public void machineMotorOff() {
		System.out.println("��ü ���� ����");
	}
}
class RollerMotor{
	public void rollerMotorOn() {
		System.out.println("�ѷ� ���� �ѱ�");
	}
	public void rollerMotorOff() {
		System.out.println("�ѷ� ���� ����");
	}
}
class PressMotor{
	public void pressMotorOn() {
		System.out.println("�������� ���� �ѱ�");
	}
	public void pressMotorOff() {
		System.out.println("�������� ���� ����");
	}
}