package java0718;

public class Thread3 extends Thread{
	private static int num=10;
	private int time;  // sleep�� ������ �ð�
	public Thread3(int time,String name) {
		super(name);
		this.time=time;
		this.num=num;
	}
	@Override
	public void run() {
		for(int i=1;i<6;i++) {
			System.out.println("������� : "+Thread.currentThread().getName()+" ������ȣ : "+num);
			num++;
			if(num==17)break;
			try{
				Thread.sleep(time);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
// ������ �̸��� �����ϱ� ���� Thread0,1�̾����� �̸��� �����ϸ� ������ �̸��� ���´�.
// num==15�̸� 15�� ������ ��õ�� ��������� �� ���� 16�� �Ǹ鼭 ��õ�� ������ �ݺ��ȴ�.
// ������ ������ ��ƾ� �ϴ� �����̴�.
}
