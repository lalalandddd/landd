package java0718;

public class MainClass5 {

	public static void main(String[] args) throws InterruptedException {

//		DaemonTh dt=new DaemonTh();
//		dt.setDaemon(true);  // ���󾲷���� ����
//		dt.start();
		NormalTh th=new NormalTh("�Ϲ�");
		th.start();
		Thread.sleep(6000);  // �־����� 6�ʰ� �������
		System.out.println("main ����");

	}
}
/*
���󾲷���
�� �����带 �����ϴ� ������
�� �����尡 ����Ǹ� ���� �����嵵 ����ȴ�.
��) ����/ppt/word �� �۾� �� ���ڱ� ������, ���߿� �ٽ� �ҷ��� �� �ְ� �ϴ� �ڵ� ���� ���
	- �翬�� ����/ppt/word�� �����ϸ� �ڵ����嵵 ����ȴ�.
��) �۾��������� ��׶��� ���μ��� �� �Ϻ�
�� ������� ���� �����ؾ� ������ ���� ������� �� �������� ������ �ޱ� ������ ������ ��� �ʿ����� �ʴ�.
*/