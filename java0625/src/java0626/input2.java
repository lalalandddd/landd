package java0626;

import java.util.Scanner;

public class input2 {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		
		// ���� �̸�, �ҼӺμ���, �� �޿����� Ű����� �Է¹޴´�.
		// ������ 8%�� �� ��, �Ǽ��ɾ��� ���ΰ�? �̸�, �μ�, �Ǽ��ɾ��� ����϶�
		String name, sect;
		int pay, netPay;
		float netPay2;
		System.out.println("�̸��� �Է��ϼ���");
		name=scan.next();
		System.out.println("�ҼӺμ����� �Է��ϼ���");
		sect=scan.next();
		System.out.println("�� �޿���(����)�� �Է��ϼ���");
		pay=scan.nextInt();
		netPay=pay*92/100;
		netPay2=pay*0.92f;
		System.out.printf("�̸� : %s, �ҼӺμ� : %s, �Ǽ��ɾ� : %d����\n",name,sect,netPay);
		System.out.printf("�̸� : %s, �ҼӺμ� : %s, �Ǽ��ɾ� : %.1f����",name,sect,netPay2);

	}

}
