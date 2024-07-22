package java0718_Pattern;

public class Light {
	Light1 l1=new Light1();
	Light2 l2=new Light2();
	Light3 l3=new Light3();

	public void lightOn() {
		l1.light1On();
		l2.light2On();
		l3.light3On();
		}
	public void lightOff() {
		l1.light1Off();
		l2.light2Off();
		l3.light3Off();
	}
}

class Light1{
	public void light1On() {
		System.out.println("작업등1 켜기");
	}
	public void light1Off() {
		System.out.println("작업등1 끄기");
	}
}
class Light2{
	public void light2On() {
		System.out.println("작업등2 켜기");
	}
	public void light2Off() {
		System.out.println("작업등2 끄기");
	}
}
class Light3{
	public void light3On() {
		System.out.println("작업등3 켜기");
	}
	public void light3Off() {
		System.out.println("작업등3 끄기");
	}
}