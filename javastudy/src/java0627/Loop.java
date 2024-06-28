package java0627;

import java.util.Scanner;

public class Loop {

	static Scanner scan=new Scanner(System.in);  // void main 밖에 scan

	public static void main(String[] args) {

//		Scanner scan=new Scanner(System.in);  // void main 안에 scan

		// 반복문 for, while, do~while  (java와 종류, 사용방법 모두 동일)
		// for(초기값;조건식;증감식){반복내용} 초기값에 var이 아니라 변수 타입을 써야 한다.
		// 조건식이 거짓이 될 때까지(참이면) 반복내용을 계속 실행, 조건식이 거짓이면 종료
		// 배열과 연결해서 자주 쓰인다.
		
//		for(int i=1;i<=9;i++) {
//			System.out.printf("아... 반복문....%d\n",i*2-1);
//		}
		
//		int num=1;
//		num=num+1;
//		System.out.println(num);  // 2
//		num=num+2;
//		System.out.println(num);  // 4
//		num=num+3;
//		System.out.println(num);  // 7
		
//		int num=1, a=1;
//		num=num+a;
//		System.out.println(num);  // 2
//		a++;
//		num=num+a;
//		System.out.println(num);  // 4
//		a++;
//		num=num+a;
//		System.out.println(num);  // 7
//		a++;
		
		// 위 루틴을 반복문으로 만들어보자?
//		int num=1;
//		for(int a=1;a<4;a++) {
//			num=num+a;
//			System.out.println(num);
//		}
		
		// 내가 입력한 숫자까지의 총 합을 구하세요
//		Scanner scan=new Scanner(System.in);
//		System.out.println("정수를 입력하세요");
//		int a=scan.nextInt();
//		int c=0;
//		for(int b=1;b<=a;b++) {
//			c=c+b;
//		}
//		System.out.printf("1부터 %d까지의 총 합은 %d이다.",a,c);
		
		// for(;;){} || for(;true;){} = 조건식이 이렇게 되면 무한루프 Terminate 누르면 강제종료
		
		// 반복문 작성 시, 반복 횟수, 종료 시기(조건식) 등을 생각해야 한다.
		// 무한루프 종료 방법
		// 1. 조건문 조건식 참→반복문의 break; 실행 (if문은 단독으로 break를 쓸 수 없다)
		// 2. 반복문 조건식 거짓
		// 3. return; 반복문 메서드를 종료시킨다.
		
//		for(;true;) {  // 1. 조건문
//			System.out.print("정수 입력 : ");
//			int num=scan.nextInt();
//			if (num==0) {
//				System.out.println("0? 종료!!");
//				break;
//			}
//		}

//		Scanner scan=new Scanner(System.in);	
//		int num1=1;
//		for(;num1!=0;) {  // 2. 반복문
//			System.out.print("정수 입력 : ");
//			int num1=scan.nextInt();
//			if (num1==0) {
//			}
//			System.out.println("0? 종료!!");
//		}

//		for(int i=1;i<=10;i++) {
//			System.out.println(i+"번째 반복 시작");
//			if(i%3==0){continue;}  // continue는 반복문을 다음으로 그냥 넘겨버린다. 아래 생략
//			System.out.println(i+"번째 반복 진행중");
//			System.out.println(i+"번째 반복 마지막 내용");
//		}
		
		// 자바의 랜덤
//		int random=(int)Math.floor(Math.random()*10+1);
//		System.out.println(random);
		
		// 랜덤 값 계속 출력하라. (1~50) 단, 11의 배수가 나오면 종료하라.
//		for(int i=1;true;i++) {
//			int random=(int)(Math.random()*50+1);
//			System.out.println(random);
//			if(random%11==0) {
//				System.out.printf("%d회에서 종료!",i);
//				break;
//			}
//		}
		
		// up / down 만들기
		// 컴퓨터가 제시한 숫자(20~100 랜덤) 맞추기
		int cpu=(int)(Math.random()*81+20);
		System.out.println("Up/Down 20~100 맞추기");
		for(int j=1;true;j++) {
			System.out.print("20~100 사이의 숫자를 입력하세요 : ");
			int user=scan.nextInt();
			if(user<20||user>100) {
				System.out.println("20~100 사이의 숫자를 정확히 입력하세요!");
			}else if(user==cpu) {
				System.out.printf("컴퓨터가 제시한 %d %d회 만에 정답!",cpu,j);
				break;
			}else if(user>cpu) {
				System.out.println("Down!");
			}else {
				System.out.println("Up!");
			}
		}
		
		// up / down 만들기 역습의 CPU!!
//		int cpu1=0, user1=0, max=150, min=50;
//		System.out.println("Up/Down 50~150 맞추기 - 역습의 CPU!!");
//		for(;true;) {
//			System.out.print("50~150 사이의 숫자를 입력하세요 : ");
//			user1=scan.nextInt();
//			if(user1>150||user1<50) {
//				System.out.println("50~150 사이의 숫자를 정확하게 입력하세요!");
//			}else {break;}
//		}
//		for(int j1=1;true;j1++) {
//			cpu1=(int)(Math.random()*(max-min+1)+min);
//			if(user1==cpu1) {
//				System.out.printf("유저가 제시한 %d CPU가 %d회 만에 정답!",user1,j1);
//				break;
//			}
//			if(user1>cpu1) {
//				System.out.printf("%d, Up\n",cpu1);
//				min=cpu1+1;
//			}else {
//				System.out.printf("%d, Down\n",cpu1);
//				max=cpu1-1;
//			}
//		}

		// 이름을 가진 반복문
//		int sum=0;
//		출력:  // 반복문의 이름
//		for(int i=0;i<=10;i++) {
//			sum=sum+i;
//			System.out.printf("%d, %d\n",i,sum);
//			if(sum>20) {
//				break 출력;  // 출력이란 이름을 가진 반복문을 종료
//			}
//		}
		
//		int sum=0;
//		더하기: for(int i=1;i<=10;i++) {
//			for(int k=1;k<=4;k++) {
//				if(sum+k>40)break 더하기;
//				sum=sum+k;
//				System.out.println("      "+k);
//			}
//			System.out.println(i);
//			sum=sum+i;
//		}
//		if(sum<40) {
//			System.out.println("sum 출력 : "+sum);
//		}
		
		// 베스킨라빈스 31! com과 user가 같이 한다. 이름 있는 반복문을 사용한다.
		// 한 번에 제시할 수 있는 숫자는 최소 1개 최대 3개
		// 31을 입력하는 순간 패배한다!
//		int num=0, user=0, com=0, win=0;
//		베스킨: for(;;) {  // while(true)  도 동일한 동작을 한다.
//			System.out.println("User 숫자 몇개? (1~3개) : ");
//			user=scan.nextInt();
//			System.out.print("나 : ");
//			for(int u=1;u<=user;u++) {
//				System.out.print(num+" ");
//				if(num==31) break 베스킨;
//				num++;
//			}
//			win=1;
////			break;  // for 문이 두개이므로 원래는 break가 두번 쓰여야 하지만, 위에서 상위 for문 이름을 멈췄으므로 필요가 없어졌다
//			System.out.println();
//		
//			com=(int)(Math.random()*3+1);
//			System.out.print("Com : ");
//			for(int c=1;c<=com;c++) {
//				System.out.print(num+" ");
//				if(num==31) break 베스킨;
//				num++;
//			}
//			win=2;
//		}
//		if(win==2) {
//		System.out.println("\nCom이 이겼다!");
//		}else {System.out.println("\n내가 이겼다!");}

	}

}
