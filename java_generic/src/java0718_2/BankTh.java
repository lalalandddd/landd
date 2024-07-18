package java0718_2;

public class BankTh implements Runnable{
	Money my=new Money();
	@Override
	public void run() {
		while(my.getMyMoney()>0) {  // 잔액이 0원보다 크면 반복
			// 출금금액
			int money=(int)((Math.random()*3)+1)*1000;
			if(my.widthdraw(money)) {
				System.out.println(Thread.currentThread().getName()+" -> 출금 : "+money+", 잔액 : "+my.getMyMoney());
			}else {  // 잔액 부족으로 출금 실패
				System.out.println("출금 거부 - 잔액 부족");
			}
		}
	}

}
