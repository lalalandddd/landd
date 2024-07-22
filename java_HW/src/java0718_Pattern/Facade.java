package java0718_Pattern;

public class Facade {
	Belt belt=new Belt();
	Light light=new Light();
	Monitor monitor=new Monitor();
	Motor motor=new Motor();
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
}
