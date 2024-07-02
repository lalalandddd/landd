package java0701;

import java.util.Arrays;
import java.util.Scanner;

public class BingoMake {

	static Scanner scan=new Scanner(System.in);
	
	public static void main(String[] args) {

		int[] bingo=new int[25];
		int input=0, bingoCount=0;
		for(int i=0;i<bingo.length;i++) {
			bingo[i]=(int)(Math.random()*50+1);
			for(int k=0;k<i;k++) {
				if(bingo[k]==bingo[i]) {
					i--;
					break;
				}
			}
		}
		while(true) {
			// 내가 만든 무식한 빙고판
//			System.out.println("┌──┬──┬──┬──┬──┐");
//			System.out.printf("│%2d│%2d│%2d│%2d│%2d│\n",bingo[0],bingo[1],bingo[2],bingo[3],bingo[4]);
//			System.out.println("├──┼──┼──┼──┼──┤");
//			System.out.printf("│%2d│%2d│%2d│%2d│%2d│\n",bingo[5],bingo[6],bingo[7],bingo[8],bingo[9]);
//			System.out.println("├──┼──┼──┼──┼──┤");
//			System.out.printf("│%2d│%2d│%2d│%2d│%2d│\n",bingo[10],bingo[11],bingo[12],bingo[13],bingo[14]);
//			System.out.println("├──┼──┼──┼──┼──┤");
//			System.out.printf("│%2d│%2d│%2d│%2d│%2d│\n",bingo[15],bingo[16],bingo[17],bingo[18],bingo[19]);
//			System.out.println("├──┼──┼──┼──┼──┤");
//			System.out.printf("│%2d│%2d│%2d│%2d│%2d│\n",bingo[20],bingo[21],bingo[22],bingo[23],bingo[24]);
//			System.out.println("└──┴──┴──┴──┴──┘");
			// 교사님이 만든 세련된 빙고판
			System.out.print("┌──┬──┬──┬──┬──┐\n│");
			for(int i=0;i<bingo.length;i++) {
				if(i>0&&i%5==0) {  // 5의 배수마다
					System.out.print("\n├──┼──┼──┼──┼──┤\n│");
				}
				if(bingo[i]==0) {
					System.out.printf("%2c│",'■');
				}else {
					System.out.printf("%2d│",bingo[i]);
				}
			}
			System.out.println("\n└──┴──┴──┴──┴──┘");
			System.out.println("10~50 사이의 정수를 입력해주세요 (현재 빙고 : "+bingoCount+"개)");
			int ans=scan.nextInt();
			bingoCount=0;
			input++;
			for(int i=0;i<bingo.length;i++) {
				if(ans==bingo[i]) {
					bingo[i]=0;
				}
			}
			int c=0, r=0, d1=0, d2=0;
			for(int i=0;i<5;i++) {
				c=0; r=0;
				for(int j=0;j<5;j++) {
					if(bingo[i*5+j]==0) {c++;}
					if(bingo[i+j*5]==0) {r++;}
					if(c==5) {bingoCount++;}
					if(r==5) {bingoCount++;}
				}
				if(bingo[(i+1)*4]==0) {d1++;}
				if(bingo[i*6]==0) {d2++;}
				if(d1==5) {bingoCount++;}
				if(d2==5) {bingoCount++;}
			}
			if(bingoCount==5) {
				System.out.println(input+"회 만에 빙고!");
				break;
			}else if(bingoCount>5) {
				System.out.println("게임 오버!!");
				break;
			}
		}

	}

}
