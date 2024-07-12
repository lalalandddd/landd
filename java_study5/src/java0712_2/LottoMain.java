package java0712_2;

import java.util.ArrayList;
import java.util.Scanner;

public class LottoMain {

	public static void main(String[] args) {

		int[] first=new int[] {8,12,23,29,35,41};
		ArrayList<Lotto> list=new ArrayList<>();
		Scanner scan=new Scanner(System.in);
		System.out.print("자동 몇 장? : ");
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
// 내가 구매한 로또 번호들 중에 1,3,4,5등이 몇 개 있을까? (2등은 아직 보너스 번호가 없어서...)
// 1등은 6개 전부 일치, 3등은 5개 일치, 4등은 4개 일치, 5등은 3개 일치
//		System.out.println(list.get(1));  // 이러면 첫번째 6개가 출력된다....
		int 일등=0, 삼등=0, 사등=0, 오등=0;
		for(Lotto lotto:list) {
			int[] num=lotto.getNum();
			int cnt=0;
			for(int i:num) {
				for(int k:first) {
					if(i==k) cnt++;
				}
			}
			switch(cnt) {
			case 6:일등++;
			case 5:삼등++;
			case 4:사등++;
			case 3:오등++;
			}
//			if(cnt==6) 일등++;
//			if(cnt==5) 삼등++;
//			if(cnt==4) 사등++;
//			if(cnt==3) 오등++;
		}
		System.out.println("일등 "+일등+"개, 삼등 "+삼등+"개, 사등"+사등+"개, 오등 "+오등+"개 당첨!");
// 나중에 이등도 만들어보자??? 1등 번호 랜덤으로 만들게 해서 해보자??
	}
}
