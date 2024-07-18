package java0718;

public class Thread3 extends Thread{
	private static int num=10;
	private int time;  // sleep에 적용할 시간
	public Thread3(int time,String name) {
		super(name);
		this.time=time;
		this.num=num;
	}
	@Override
	public void run() {
		for(int i=1;i<6;i++) {
			System.out.println("쓰레드명 : "+Thread.currentThread().getName()+" 공유번호 : "+num);
			num++;
			if(num==17)break;
			try{
				Thread.sleep(time);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
// 쓰레드 이름을 지정하기 전엔 Thread0,1이었으나 이름을 지정하면 지정한 이름이 나온다.
// num==15이면 15의 순간인 삼천은 종료되지만 그 이후 16이 되면서 이천은 무한히 반복된다.
// 조건을 조심히 잡아야 하는 이유이다.
}
