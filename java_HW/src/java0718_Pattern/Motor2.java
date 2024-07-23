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
		System.out.println("본체 모터 켜기");
	}
	public void machineMotorOff() {
		System.out.println("본체 모터 끄기");
	}
	public void machineMotorSpeedUp() {
		System.out.println("본체 모터 스피드 업");
	}
	public void machineMotorSpeedDown() {
		System.out.println("본체 모터 스피드 다운");
	}
}
class RollerMotor2{
	public void rollerMotorOn() {
		System.out.println("롤러 모터 켜기");
	}
	public void rollerMotorOff() {
		System.out.println("롤러 모터 끄기");
	}
	public void rollerMotorSpeedUp() {
		System.out.println("롤러 스피드 업");
	}
	public void rollerMotorSpeedDown() {
		System.out.println("롤러 스피드 다운");
	}
}
class PressMotor2{
	public void pressMotorOn() {
		System.out.println("프레스기 모터 켜기");
	}
	public void pressMotorOff() {
		System.out.println("프레스기 모터 끄기");
	}
	public void pressMotorSpeedUp() {
		System.out.println("프레스기 스피드 업");
	}
	public void pressMotorSpeedDown() {
		System.out.println("프레스기 스피드 다운");
	}
}