package java0718;

public class MainClass5 {

	public static void main(String[] args) throws InterruptedException {

//		DaemonTh dt=new DaemonTh();
//		dt.setDaemon(true);  // 데몬쓰레드로 변경
//		dt.start();
		NormalTh th=new NormalTh("일반");
		th.start();
		Thread.sleep(6000);  // 주쓰레드 6초간 살아있음
		System.out.println("main 종료");

	}
}
/*
데몬쓰레드
주 쓰레드를 보조하는 쓰레드
주 쓰레드가 종료되면 데몬 쓰레드도 종료된다.
예) 엑셀/ppt/word 등 작업 중 갑자기 꺼지면, 나중에 다시 불러올 수 있게 하는 자동 저장 기능
	- 당연히 엑셀/ppt/word를 종료하면 자동저장도 종료된다.
예) 작업관리자의 백그라운드 프로세스 중 일부
주 쓰레드는 직접 제어해야 하지만 데몬 쓰레드는 주 쓰레드의 영향을 받기 때문에 별도의 제어가 필요하지 않다.
*/