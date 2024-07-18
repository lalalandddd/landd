package java0718;

public class DaemonTh extends Thread{
	@Override
	public void run() {
		System.out.println("데몬 쓰레드 실행");
		while(true) {
			System.out.println("자동저장");
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
}
