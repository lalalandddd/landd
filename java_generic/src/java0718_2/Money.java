package java0718_2;

public class Money {
	private int myMoney=10000;
	public int getMyMoney() {
		return myMoney;
	}
	public synchronized boolean widthdraw(int money) {
// widthdraw �޼��带 �Ӱ� ����(synchronized)���� ����
// ���� ���� �ݾ׺��� ��� �䱸 �ݾ��� �۰ų� ���ٸ� ���
		if(myMoney>=money) {
			try{
				Thread.sleep(1000);
			}catch(Exception e) {
				System.out.println("��� �ý��� ����");
			}
			// ���
			myMoney-=money;
			return true;
		}else {
			System.out.println("���� �ݾ� ����!");
			return false;
		}
	}

}
