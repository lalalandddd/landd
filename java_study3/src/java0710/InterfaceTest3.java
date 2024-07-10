package java0710;

abstract class Terranunit{
	int hp;
}
interface Repairable{
	public abstract void repair();
}
interface Healing{
	public abstract void heal();
}
class Marine extends Terranunit implements Healing{  // ���
	Marine(){super.hp=50;}
	@Override
	public void heal() {System.out.println("�޵��� marine ��"); hp+=1;}
}
class Dropship extends Terranunit implements Repairable{  // ���
	Dropship(){super.hp=100;}
	@Override
	public void repair() {System.out.println("SCV�� dropship ����"); hp+=5;}
}
class Tank extends Terranunit implements Repairable{  // ���
	Tank(){super.hp=150;}
	@Override
	public void repair() {System.out.println("SCV�� tank ����"); hp+=5;}
}

public class InterfaceTest3 {

	public static void main(String[] args) {

		Marine m1=new Marine();
		Dropship d1=new Dropship();
		Tank t1=new Tank();
		
		m1.hp-=10;  // hp:40
		d1.hp-=20;  // hp:80
		t1.hp-=50;  // hp:100
		System.out.println(m1.hp+","+d1.hp+","+t1.hp);
		m1.heal();
		d1.repair();
		t1.repair();
		System.out.println(m1.hp+","+d1.hp+","+t1.hp);

	}
}
