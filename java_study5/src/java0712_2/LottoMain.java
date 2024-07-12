package java0712_2;

import java.util.ArrayList;
import java.util.Scanner;

public class LottoMain {

	public static void main(String[] args) {

		int[] first=new int[] {8,12,23,29,35,41};
		ArrayList<Lotto> list=new ArrayList<>();
		Scanner scan=new Scanner(System.in);
		System.out.print("�ڵ� �� ��? : ");
		int howMany=scan.nextInt();
		for(int i=1;i<=howMany;i++) {
			int[] temp=new int[6];
			for(int k=0;k<temp.length;k++) {
				temp[k]=(int)(Math.random()*45+1);
				for(int j=0;j<k;j++) {
					if(temp[k]==temp[j]) {
						k--; break;
					}
				}
			}
			list.add(new Lotto(temp));
		}
		list.forEach(lt->System.out.println(lt));
// ���� ������ �ζ� ��ȣ�� �߿� 1,3,4,5���� �� �� ������? (2���� ���� ���ʽ� ��ȣ�� ���...)
// 1���� 6�� ���� ��ġ, 3���� 5�� ��ġ, 4���� 4�� ��ġ, 5���� 3�� ��ġ
//		System.out.println(list.get(1));  // �̷��� ù��° 6���� ��µȴ�....
		int �ϵ�=0, ���=0, ���=0, ����=0;
		for(Lotto lotto:list) {
			int[] num=lotto.getNum();
			int cnt=0;
			for(int i:num) {
				for(int k:first) {
					if(i==k) cnt++;
				}
			}
			switch(cnt) {
			case 6:�ϵ�++;
			case 5:���++;
			case 4:���++;
			case 3:����++;
			}
//			if(cnt==6) �ϵ�++;
//			if(cnt==5) ���++;
//			if(cnt==4) ���++;
//			if(cnt==3) ����++;
		}
		System.out.println("�ϵ� "+�ϵ�+"��, ��� "+���+"��, ���"+���+"��, ���� "+����+"�� ��÷!");
// ���߿� �̵ ������??? 1�� ��ȣ �������� ����� �ؼ� �غ���??
	}
}
