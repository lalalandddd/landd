package java0718;

public class MainClass4 {

	public static void main(String[] args) {

		Web th1=new Web("첫째");
		Web th2=new Web("   둘째");
		Web th3=new Web("      셋째");
		Web th4=new Web("         넷째");
		
		th1.setPriority(Thread.MAX_PRIORITY);
		th2.setPriority(Thread.NORM_PRIORITY);
		th3.setPriority(Thread.MIN_PRIORITY);
		th4.setPriority(Thread.NORM_PRIORITY);
// 종료 순서는 Max-NORM-MIN ...인데 확률만 높일 뿐이다.
// CPU의 상황 등의 이유로 우선순위 대로 안 나올 수도 있음

		th1.start();
		th2.start();
		th3.start();
		th4.start();

	}
}
