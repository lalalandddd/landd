package java0710_2;

interface Runnable{
	public void run();
}

class BankAccount{  // 클래스 기본 내용
	private int balance;  // 잔액
	private static String bankName="ZYX Bank";
	public BankAccount(int balance) {  // 생성자 메서드
		this.balance=balance;
	}
	public void showBalance() {  // 잔액 확인 메서드
		System.out.println("계좌 잔액 : "+balance);
	}
	// 인스턴스내부클래스 : Transaction(거래 표현)
	class Transaction{  // 거래 - 입금/출금
		void deposit(int amount) {  // 입금
			balance=balance+amount;
			System.out.println("입금 금액 : "+amount);
		}
		void withdraw(int amount) {  // 출금
			if(balance>=amount) {
				balance=balance-amount;
				System.out.println("출금 금액 : "+amount);
			}else {  // 출금액이 부족하다!
				System.out.println("잔액 부족! 출금 불가!");
			}
		}
	}
	// 정적내부클래스 : BankInfo(은행정보)
	static class BankInfo{
		void showBankName() {
			System.out.println("은행 이름 : "+bankName);
		}
	}
	// 지역내부클래스 : Loan(대출)
	public void applyLoan(int amount) {  // 대출 신청
		class Loan{  // 지역내부클래스-대출
			void progress() {
				System.out.println("대출 신청 금액 : "+amount);
			}
		}
		Loan loan=new Loan();
		loan.progress();
	}
	// 익명내부클래스 : Runnable (able=인터페이스 이름)
	public void interestCalc(){
		Runnable interest=new Runnable() {
			@Override
			public void run() {
				int interestMoney=(int)(balance*0.03);
				balance+=interestMoney;
				System.out.println("이자 지급 : "+interestMoney);
				System.out.println("현재 잔액 : "+balance);
			}
		};
		interest.run();
	}
}

public class InnerClass2 {

	public static void main(String[] args) {

		BankAccount account=new BankAccount(300000);
		account.showBalance();
		BankAccount.Transaction tran=account.new Transaction();
		tran.deposit(100000);
		account.showBalance();
		tran.withdraw(200000);
		account.showBalance();
		// 정적내부클래스 객체 생성
		BankAccount.BankInfo info=new BankAccount.BankInfo();
		// 정적내부클래스 사용
		info.showBankName();
		// 지역내부클래스 사용
		account.applyLoan(200000);
		// 익명내부클래스 사용
		account.interestCalc();

	}
}

/*
클래스 : BankAccount;
BankAccount 내부클래스
	> 인스턴스내부클래스 : Transaction(거래 표현)
	> 정적내부클래스 : BankInfo(은행정보)
	> 지역내부클래스 : Loan(대출)
	> 익명내부클래스 : Runnable (able=인터페이스 이름)
*/