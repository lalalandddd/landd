package java0718;

import java.util.Scanner;

public class MainClass2 {

	public static void main(String[] args) throws InterruptedException {

		Th1 th=new Th1();  // 일반 클래스 객체 생성(쓰레드 클래스 객체가 아니다)
//		th.run();
		new Thread(th).start(); // 쓰레드 객체 생성
		for(int i=1;i<=5;i++) {
			System.out.println("비야 제발 오지 마라"+i);
			Thread.sleep(2000);  // 마우스 대고 throw 누를 것
		}

	}
}
class Th1 implements Runnable{
// 클래스에 추상메서드가 있다면 메서드를 정의 내리거나 추상클래스가 되어야만 한다. 그게 안 돼서 처음엔 Th1에 오류가 뜬다.
// 하지만 추상클래스는 객체를 생성할 수 없는데 객체를 생성해야 한다... 그래서 Th1에 마우스를 대고 첫번째 항목을 클릭한다.
// 그러면 오류가 사라진다.
	@Override
	public void run() {
		Scanner sc=new Scanner(System.in);
		System.out.print("숫자입력 : ");
		int a=sc.nextInt();
		System.out.print("입력숫자 : "+a+"\n");
	}
}