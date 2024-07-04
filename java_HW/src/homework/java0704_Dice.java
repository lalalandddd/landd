package homework;

import java.util.Scanner;

public class java0704_Dice {

	public static void main(String[] args) {
		
//		Dice j=new Dice();  // ���� ���� ��
//		Dice s=new Dice();
//		Versus vs=new Versus();
//		int j����=j.get();
//		int s����=s.get();
//		String a���=vs.vs(j����,s����);
//		System.out.printf("���� : ����\n%2d  : %2d\n%7s",j����,s����,a���);
		
//		Dice d=new Dice();  // ����� ���� �� 1
//		Versus vs=new Versus();
//		int j����=d.get("����");  // �̸��� �������ν� ���� �ֻ����� ������ �� ���� �پ���!!
//		int s����=d.get("����");
//		String a���=vs.vs(j����,s����);
//		System.out.printf("���� : ����\n%2d  : %2d\n%7s",j����,s����,a���);
		
		// ����� ���� �� 2  - �̷��� �� ������ ���߿� �̿� ����� �������� �Ǳ⸦ ġ��� �ϱ� ����...
		Dice game=new Dice();
		game.init();  // �ֻ��� ���� �ʱ� ���� (���� �ο�, ������ �̸�)
		game.diceThrow();  // �ֻ��� ������ X ���� �ο� ��
		game.result();  // �ֻ��� �� ��

	}
}

//class Dice{  // ���� ���� ��
//	int a=(int)(Math.random()*6+1);
//	int get() { return a; }
//}

//class Dice{  // ����� ���� �� 1
//	int get(String name) {  // �̸��� �������ν� ���� �ֻ����� ������ �� ���� �پ���!!
//		int a=(int)(Math.random()*6+1);
//		return a;
//	}
//}

class Dice{  // ����� ���� �� 2 (������ �ο��� ��� ���� class �ȿ��� �ֻ��� ���� �Ϸ��ϱ� - return ����)
	String[] names;
	int[] diceNum;
	void init() {
		Scanner scan=new Scanner(System.in);
		System.out.print("�ֻ��� ���� �����ο� : ");
		int cnt=scan.nextInt();
		scan.nextLine();  // ���� ���� - ����Ű, ������ ���� �Է¿� ������ ����. ���ϸ� ù��° ���ڰ� �Էµ��� �ʴ´�.
		this.names=new String[cnt];
		this.diceNum=new int[cnt];
		for(int i=0;i<names.length;i++) {
			System.out.print("������ �̸���? : ");
			names[i]=scan.nextLine();
		}
	}
	void diceThrow() {  // �ֻ��� ������
		for(int i=0; i<names.length;i++) {
			this.diceNum[i]=(int)(Math.random()*6+1);
			System.out.println(this.names[i]+"�ֻ��� : "+this.diceNum[i]);
		}
	}
	void result() {  // �ֻ��� ���� ���� ū ����� �̱��
		int max=0;
		for(int num : diceNum) {  // ���� ū �ֻ��� ���� ���� ã�´�.
			if(max<num) max=num;
		}
		boolean isSame=true;  // ��� �����ڵ��� �ֻ��� ���� ���ٸ�
		for(int num:diceNum) {
			if(num!=max) isSame=false;
		}
		if(isSame) {
			System.out.println("��� ������ �ֻ��� ���� ����. ���");
			return;
		}
		for(int i=0;i<diceNum.length;i++) {
			if(diceNum[i]==max) {
				System.out.println(names[i]+"�¸�!");
			}
		}
	}
}

//class Versus{  // ���� ���� ��
//	String vs(int j,int s) {
//		if(j>s) {
//			String a=" ��  :  ��";
//			return a;
//		}else if(j<s) {
//			String a=" ��  :  ��!";
//			return a;
//		}else {
//			String a="DRAW GAME!";
//			return a;
//		}
//	}
//}