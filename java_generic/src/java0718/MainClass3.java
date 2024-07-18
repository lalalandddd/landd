package java0718;

public class MainClass3 {

	public static void main(String[] args) {

		Thread3 th1=new Thread3(2000,"이천");
		Thread3 th2=new Thread3(3000,"삼천");
// 쓰레드 동시 실행
//		th1.start();
//		th2.start();
//		while(true) {
//			System.out.print("");
//			int num=Thread3.num;  // 왜 오류 뜨지;;;
//			if(num==15) {
//				th1.stop();
//				th2.stop();
//				break;
//			}
//		}

// 순차적 쓰레드 실행
		th1.start();
		try {
			th1.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		th2.start();

	}
}
// Thread3 클래스와 연계되어 두 개의 쓰레드를 동시 실행
// while문이 있다면 num이 15가 되면 모든 쓰레드를 동시에 멈춘다.