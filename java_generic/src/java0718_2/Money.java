package java0718_2;

public class Money {
	private int myMoney=10000;
	public int getMyMoney() {
		return myMoney;
	}
	public synchronized boolean widthdraw(int money) {
// widthdraw 메서드를 임계 영역(synchronized)으로 설정
// 현재 보유 금액보다 출금 요구 금액이 작거나 같다면 출금
		if(myMoney>=money) {
			try{
				Thread.sleep(1000);
			}catch(Exception e) {
				System.out.println("출금 시스템 오류");
			}
			// 출금
			myMoney-=money;
			return true;
		}else {
			System.out.println("보유 금액 부족!");
			return false;
		}
	}

}
