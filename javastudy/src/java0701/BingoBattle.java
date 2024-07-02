package java0701;

import java.util.Arrays;
import java.util.Scanner;

public class BingoBattle {

	static Scanner scan=new Scanner(System.in);

	public static void main(String[] args) {

		int[] userBingo=new int[25];
		int[] comBingo=new int[25];
		int input=0, userBingoCount=0, comBingoCount=0;
		for(int i=0;i<userBingo.length;i++) {
			userBingo[i]=(int)(Math.random()*50+1);
			for(int k=0;k<i;k++) {
				if(userBingo[k]==userBingo[i]) {
					i--;
					break;
				}
			}
		}for(int i=0;i<comBingo.length;i++) {
			comBingo[i]=(int)(Math.random()*50+1);
			for(int k=0;k<i;k++) {
				if(comBingo[k]==comBingo[i]) {
					i--;
					break;
				}
			}
		}
		while(true) {
			System.out.println("──────user──────  ──────com───────");
			System.out.println("┌──┬──┬──┬──┬──┐  ┌──┬──┬──┬──┬──┐");
			for(int i=0;i<userBingo.length;i++) {
				if(i>0&&i%5==0) {  // 5의 배수마다
					System.out.println("│");  // 줄바꾸기 해라
					System.out.println("├──┼──┼──┼──┼──┤  ├──┼──┼──┼──┼──┤");
				}
				if(userBingo[i]==0) {
					System.out.printf("│%2c",'■');
				}else {
					System.out.printf("│%2d",userBingo[i]);
				}
				if(i%5==4) {
					System.out.print("│  ");
					for(int j=0;j<5;j++) {
						if(comBingo[i-4+j]==0) {
							System.out.printf("│%2c",'□');
						}else {
							System.out.printf("│%2d",comBingo[i-4+j]);
						}
					}
				}
			}
			System.out.println("│\n└──┴──┴──┴──┴──┘  └──┴──┴──┴──┴──┘");
			System.out.println("USER 빙고 : "+userBingoCount+"개  /  COM 빙고 : "+comBingoCount+"개");
			if(userBingoCount==5||comBingoCount>5) {
				System.out.println(input+"회 만에 USER 빙고!"+"USER 승리!!\n");
				break;
			}else if(userBingoCount>5||comBingoCount==5) {
				System.out.println(input+"회 만에 COM 빙고!"+"COM 승리!!\n");
				break;
			}
			System.out.println("10~50 사이의 정수를 입력해주세요");
			int ans=scan.nextInt();
			int ans2=0, ansCom=0, ansCom2=0;
			input++;
			userBingoCount=0;
			comBingoCount=0;
			while(true) {
				ansCom=(int)(Math.random()*25);
				if(comBingo[ansCom]!=ans&&comBingo[ansCom]!=0) {
					ansCom2=comBingo[ansCom];
					comBingo[ansCom]=0;
					break;
				}
			}
			for(int i=0;i<comBingo.length;i++) {
				if(ans==comBingo[i]) {
					comBingo[i]=0;
					break;
				}
			}
			for(int i=0;i<userBingo.length;i++) {
				if(ans==userBingo[i]) {
					ans2=userBingo[i];
					userBingo[i]=0;
				}
				if(ansCom2==userBingo[i]) {
					userBingo[i]=0;
				}
			}
			System.out.println("USER : "+ans2+" / COM : "+ansCom2);
			int c=0, r=0, d1=0, d2=0, cc=0, cr=0, cd1=0, cd2=0;
			for(int i=0;i<5;i++) {
				c=0; r=0; cc=0; cr=0;
				for(int j=0;j<5;j++) {
					if(userBingo[i*5+j]==0) {c++;}
					if(userBingo[i+j*5]==0) {r++;}
					if(c==5) {userBingoCount++;}
					if(r==5) {userBingoCount++;}
					if(comBingo[i*5+j]==0) {cc++;}
					if(comBingo[i+j*5]==0) {cr++;}
					if(cc==5) {comBingoCount++;}
					if(cr==5) {comBingoCount++;}
				}
				if(userBingo[(i+1)*4]==0) {d1++;}
				if(userBingo[i*6]==0) {d2++;}
				if(d1==5) {userBingoCount++;}
				if(d2==5) {userBingoCount++;}
				if(comBingo[(i+1)*4]==0) {cd1++;}
				if(comBingo[i*6]==0) {cd2++;}
				if(cd1==5) {comBingoCount++;}
				if(cd2==5) {comBingoCount++;}
			}
		}

	}

}
