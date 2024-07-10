package java0710_2;

interface Runnable{
	public void run();
}

class BankAccount{  // Ŭ���� �⺻ ����
	private int balance;  // �ܾ�
	private static String bankName="ZYX Bank";
	public BankAccount(int balance) {  // ������ �޼���
		this.balance=balance;
	}
	public void showBalance() {  // �ܾ� Ȯ�� �޼���
		System.out.println("���� �ܾ� : "+balance);
	}
	// �ν��Ͻ�����Ŭ���� : Transaction(�ŷ� ǥ��)
	class Transaction{  // �ŷ� - �Ա�/���
		void deposit(int amount) {  // �Ա�
			balance=balance+amount;
			System.out.println("�Ա� �ݾ� : "+amount);
		}
		void withdraw(int amount) {  // ���
			if(balance>=amount) {
				balance=balance-amount;
				System.out.println("��� �ݾ� : "+amount);
			}else {  // ��ݾ��� �����ϴ�!
				System.out.println("�ܾ� ����! ��� �Ұ�!");
			}
		}
	}
	// ��������Ŭ���� : BankInfo(��������)
	static class BankInfo{
		void showBankName() {
			System.out.println("���� �̸� : "+bankName);
		}
	}
	// ��������Ŭ���� : Loan(����)
	public void applyLoan(int amount) {  // ���� ��û
		class Loan{  // ��������Ŭ����-����
			void progress() {
				System.out.println("���� ��û �ݾ� : "+amount);
			}
		}
		Loan loan=new Loan();
		loan.progress();
	}
	// �͸���Ŭ���� : Runnable (able=�������̽� �̸�)
	public void interestCalc(){
		Runnable interest=new Runnable() {
			@Override
			public void run() {
				int interestMoney=(int)(balance*0.03);
				balance+=interestMoney;
				System.out.println("���� ���� : "+interestMoney);
				System.out.println("���� �ܾ� : "+balance);
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
		// ��������Ŭ���� ��ü ����
		BankAccount.BankInfo info=new BankAccount.BankInfo();
		// ��������Ŭ���� ���
		info.showBankName();
		// ��������Ŭ���� ���
		account.applyLoan(200000);
		// �͸���Ŭ���� ���
		account.interestCalc();

	}
}

/*
Ŭ���� : BankAccount;
BankAccount ����Ŭ����
	> �ν��Ͻ�����Ŭ���� : Transaction(�ŷ� ǥ��)
	> ��������Ŭ���� : BankInfo(��������)
	> ��������Ŭ���� : Loan(����)
	> �͸���Ŭ���� : Runnable (able=�������̽� �̸�)
*/