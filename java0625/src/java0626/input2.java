package java0626;

import java.util.Scanner;

public class input2 {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		
		// ���� �̸�, �ҼӺμ���, �� �޿����� Ű����� �Է¹޴´�.
		// ������ 8%�� �� ��, �Ǽ��ɾ��� ���ΰ�? �̸�, �μ�, �Ǽ��ɾ��� ����϶�
		// �� ��°�� �غ���?
		// Integer.parseInt(scan.nextLine());
		String name=null, dept=null;
		int pay=0;
		float tax=0, netPay=0;
		tax=0.08f;
		System.out.print("�̸��� �Է��ϼ���");
		name=scan.nextLine();
		System.out.print("�ҼӺμ����� �Է��ϼ���");
		dept=scan.nextLine();
		System.out.print("�� �޿���(����)�� �Է��ϼ���");
		pay=scan.nextInt();
		netPay=pay-pay*tax;
		System.out.printf("ù��° ���� �̸� : %s, �ҼӺμ� : %s, �Ǽ��ɾ� : %.1f����\n",name,dept,netPay);
		scan.nextLine();  // �� �ٿ��� pay ������ �����ִ� ����Ű ���ڿ��� �������.
		System.out.print("�̸��� �Է��ϼ���");
		name=scan.nextLine();
		System.out.print("�ҼӺμ����� �Է��ϼ���");
		dept=scan.nextLine();
		System.out.print("�� �޿���(����)�� �Է��ϼ���");
		pay=scan.nextInt();
		netPay=pay-pay*tax;
		System.out.printf("�ι�° ���� �̸� : %s, �ҼӺμ� : %s, �Ǽ��ɾ� : %.1f����\n",name,dept,netPay);

	}

}
