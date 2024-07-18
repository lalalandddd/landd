package java0718;

import java.util.Scanner;

public class MainClass1 {

	public static void main(String[] args) {

// 만들 수는 있지만 동작은 안 됨. 쓰레드를 받아서 임폴트해야 함...
		MyThread th=new MyThread();  // 쓰레드 객체 생성
		th.start();  // 쓰레드 실행
//		Scanner scan=new Scanner(System.in);
//		System.out.println("정수를 입력하세요");
//		int a=scan.nextInt();
//		System.out.println(a);
		for(int i=1;i<11;i++) {
			System.out.println("      나는야 Main "+i);
			try {
				Thread.sleep(1500);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}

//		for(int i=1;i<101;i++) {
//			System.out.print("\n0."+i+"초");
//			try {
//				Thread.sleep(100);
//			}catch(InterruptedException e) {
//				e.printStackTrace();
//			}
//		}

	}
}
class MyThread extends Thread{
	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("나는 쓰레드다!"+i);
			try {
				Thread.sleep(1000);  // 1초씩 실행을 중지, 메인의 내용과 별개로 실행
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
/*
프로세스 - CPU에 의해 메모리(ram)에 로드되어있는 프로그램을 말한다.
	즉 실행 중인 프로그램들이 프로세스이다.
	102개의 프로세스가 있다 = 102개의 프로그램 실행중이다
내컴퓨터에서 실행중인 프로세스 확인 방법
1. 하단 작업표시줄 우클릭, 작업관리자 선택, 프로세스
2. 명령프롬프트창(윈도우+R > cmd) 열고 tasklist 입력
3. Ctrl+Alt+Delete > 작업관리자
프로세스 종료 - 명령프롬프트 : taskkill /pid[pid값] (pid = 프로세스id)
			 작업관리자 : 우클릭 > 작업끝내기
쓰레드 - 프로세스 안에서 실제로 동작을 수행하는 단위
		쓰레드를 추가하면 동시에 여러 동작을 수행할 수 있다.
자바 쓰레드
쓰레드 생성자 (임폴트해야 함)
java api 구글 검색 > Overview (Java Platform SE 8 ) 클릭 > Thread 찾아서 클릭 > 다운 받아서 사용......
Thread() : 새로운 쓰레드 객체 할당 (x번 실행하면 x개 동시 처리 가능한 쓰레드가 만들어진다.) 
Thread("쓰레드이름")

쓰레드의 실행
실행 준비(new)
실행(run)
	쓰레드 상태 block, waiting, timeWating
		block(lock) : 블럭 상태
		waiting(대기) : 앞 쓰레드가 종료되어야 뒤 쓰레드가 실행된다.
		timawaiting(sleep) : 정해진 시간 동안 대기했다가 시간이 되면 실행
종료(dead)

쓰레드 실행 메서드
	- sleep(밀리세컨드) : 지정된 시간 만큼 대기
	- start() : 쓰레드 시작, run() 메서드에서 호출
	- join() : 해당 쓰레드가 끝날 때까지 다음 쓰레드 대기
	- run() : 쓰레드가 실행하는 메서드
	- stop() : 쓰레드 중단(권장하지 않음)
	- interrupt() : 쓰레드 중단(권장)
	- setPriority(정수값) : 쓰레드의 우선순위
	- setPriority() : 설정된 쓰레드의 우선순위값
	- isAlive() : 현재 쓰레드가 살아있냐(종료되지 않았냐 > 실행되거나 대기중인가)
	- suspend() : 쓰레드 일시정지(권장하지 않음)
	- yield() : 다른 쓰레드에게 실행상태를 양보하고 대기
	- resume() : 일시정지된 쓰레드를 실행(권장하지 않음)
	- notify() : 대기 상태에 있는 쓰레드를 실행 대기로 변환/실행 대기 상태에 있는 쓰레드를 실행
*/