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
		System.out.println("본체 전원 켜기");
	}
	public void machineMotorOff() {
		System.out.println("본체 전원 끄기");
	}
}
class RollerMotor{
	public void rollerMotorOn() {
		System.out.println("롤러 전원 켜기");
	}
	public void rollerMotorOff() {
		System.out.println("롤러 전원 끄기");
	}
}
class PressMotor{
	public void pressMotorOn() {
		System.out.println("프레스기 전원 켜기");
	}
	public void pressMotorOff() {
		System.out.println("프레스기 전원 끄기");
	}
}