package java0718_2;

public class Sync {

	public static void main(String[] args) throws InterruptedException{

		BankTh thread=new BankTh();
		Thread th1=new Thread(thread);
		Thread th2=new Thread(thread);
		th1.setName("�ڹ���");
		th2.setName("�輱��");
		th1.start();
		th2.start();
// �����ϸ� �ϳ��� ������ �� ���� �����尡 ���ÿ� ���鼭 �̻��ϰ� �۵��Ѵ�.
// �̸� ���� ���� �Ӱ� ����(synchronized)�� �����Ѵ�.
// ���Ŀ� �ϳ��� ���ʴ�� ����Ǹ鼭 �۵��� �� �ȴ�.
// �۵����� �ʴ� �ϳ��� black(���)���°� �ȴ�.
	}
}
