package java0718_2;

public class Sync {

	public static void main(String[] args) throws InterruptedException{

		BankTh thread=new BankTh();
		Thread th1=new Thread(thread);
		Thread th2=new Thread(thread);
		th1.setName("박문수");
		th2.setName("김선달");
		th1.start();
		th2.start();
// 실행하면 하나의 변수를 두 개의 쓰레드가 동시에 쓰면서 이상하게 작동한다.
// 이를 막기 위해 임계 영역(synchronized)을 설정한다.
// 이후엔 하나씩 차례대로 진행되면서 작동이 잘 된다.
// 작동되지 않는 하나는 black(대기)상태가 된다.
	}
}
