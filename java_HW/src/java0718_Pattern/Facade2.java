package java0718_Pattern;

public class Facade2 {
	Belt2 belt=new Belt2();
	Light light=new Light();
	Monitor monitor=new Monitor();
	Motor2 motor=new Motor2();
	public void startMachine() {
		belt.beltOn();
		light.lightOn();
		monitor.monitorOn();
		motor.motorOn();
	}
	public void endMachine() {
		belt.beltOff();
		light.lightOff();
		monitor.monitorOff();
		motor.motorOff();
	}
	public void speedUp() {
		belt.beltSpeedUp();
		motor.motorSpeedUp();
	}
	public void speedDown() {
		belt.beltSpeedDown();
		motor.motorSpeedDown();
	}
}
