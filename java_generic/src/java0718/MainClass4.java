package java0718;

public class MainClass4 {

	public static void main(String[] args) {

		Web th1=new Web("ù°");
		Web th2=new Web("   ��°");
		Web th3=new Web("      ��°");
		Web th4=new Web("         ��°");
		
		th1.setPriority(Thread.MAX_PRIORITY);
		th2.setPriority(Thread.NORM_PRIORITY);
		th3.setPriority(Thread.MIN_PRIORITY);
		th4.setPriority(Thread.NORM_PRIORITY);
// ���� ������ Max-NORM-MIN ...�ε� Ȯ���� ���� ���̴�.
// CPU�� ��Ȳ ���� ������ �켱���� ��� �� ���� ���� ����

		th1.start();
		th2.start();
		th3.start();
		th4.start();

	}
}
