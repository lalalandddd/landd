package java0718;

public class DaemonTh extends Thread{
	@Override
	public void run() {
		System.out.println("���� ������ ����");
		while(true) {
			System.out.println("�ڵ�����");
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
}
