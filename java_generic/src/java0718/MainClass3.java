package java0718;

public class MainClass3 {

	public static void main(String[] args) {

		Thread3 th1=new Thread3(2000,"��õ");
		Thread3 th2=new Thread3(3000,"��õ");
// ������ ���� ����
//		th1.start();
//		th2.start();
//		while(true) {
//			System.out.print("");
//			int num=Thread3.num;  // �� ���� ����;;;
//			if(num==15) {
//				th1.stop();
//				th2.stop();
//				break;
//			}
//		}

// ������ ������ ����
		th1.start();
		try {
			th1.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		th2.start();

	}
}
// Thread3 Ŭ������ ����Ǿ� �� ���� �����带 ���� ����
// while���� �ִٸ� num�� 15�� �Ǹ� ��� �����带 ���ÿ� �����.