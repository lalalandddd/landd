package java0628;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayStudy2 {

	static Scanner scan=new Scanner(System.in);

	public static void main(String[] args) {

		// question!! 문제!!
		// 과자 배열에 좋아하는 과자 5개의 판매가격을 입력하여 저장하세요.
		// 저장한 과자의 판매가격에서 총합과 평균을 구하세요.
//		int sum=0, avg=0;
//		int[] cracker=new int[5];
//		System.out.println("좋아하는 과자 5개의 판매가격을 입력하세요");
//		for(int i=0;i<cracker.length;i++) {
//			cracker[i]=scan.nextInt();
//		}
//		for(int i=0;i<cracker.length;i++) {
//			sum=sum+cracker[i];
//		}
//		avg=sum/cracker.length;
//		System.out.println(Arrays.toString(cracker));
//		System.out.printf("과자 가격의 총합은 %d원, 평균은 %d원",sum,avg);
		
		// 6명의 키를 tall 배열에 저장하였다. 키 175 미만을 출력하세요.
//		float[] tall=new float[] {173.4f, 175.1f, 169.5f, 181.4f, 178.8f, 185.3f};
//		int j=0;
//		System.out.println(Arrays.toString(tall));
//		System.out.println("키 175 미만");
//		for(int i=0;i<tall.length;i++) {
//			if(tall[i]<175) {
//				System.out.print(tall[i]+" ");
//				j++;
//			}
//		}
//		System.out.println(j+"명");
		
		// name 배열 문자열 중에서 이성계, 문익점, 정도전, 최영을 선발대(advParty) 배열에 저장하고 출력하세요.
//		String[] name=new String[] {"이순신","김유신","장보고","이성계","문익점","정도전","최영","안중근","양만춘","세종이오"};
//		String[] advParty=new String[4];
//		System.arraycopy(name, 3, advParty, 0, 4);
//		System.out.println("선발대는 "+Arrays.toString(advParty));
		
		// 문자열에서 특정 문자나 문자열의 위치 찾기 : indexOf (여러 개 있을 경우 제일 처음 하나만 찾는다.)
		// 문자열에서 특정 문자나 문자열의 존재 유무 확인 : contains
//		String word="I like banana";  // 문장은 배열이다.
//		word.indexOf("like");  // 자바에서 indexOf는 문장에만 쓸 수 있다. [] 배열은 쓸 수 없다.
//		System.out.print(word.indexOf("like"));  // 2
//		System.out.print(word.indexOf("l"));  // 2
//		System.out.print(word.indexOf("a"));  // 8
//		System.out.print(word.indexOf("I"));  // 0
//		System.out.print(word.contains("orange"));  // false
//		System.out.print(word.contains("banana"));  // true
//		System.out.print(word.contains("ba"));  // true
//		System.out.print(word.contains("bn"));  // false
		
//		String[] a=new String[] {"orange","banana","apple","tomato"};
//		System.out.println(a[1].indexOf("na"));
//		System.out.println(a[0].contains("ge"));
//		a[0].indexOf("na");  // 2
//		a[1].contains("ge");  // true
		
//		String[] name=new String[] {"김유신","한석봉","신사임당","양만춘","김춘추","유성룡","안중근","정도전","정약용","이순신","이사부","이사람","한가인","장포스"};
//		System.out.print("이름 검색 : ");
//		String search=scan.nextLine();
//		for(int i=0;i<name.length;i++) {
//			if(name[i].contains(search)) {  // 이 자체가 true/false 조건문이 된다.
//				System.out.println("검색 결과 : "+name[i]);
//			}
//		}
		
		// 문제 : 음료를 검색하여 음료 이름과 금액을 출력하세요
		// 배열에 없는 음료는 검색 시 (죄송합니다 준비중입니다) 라고 출력
		String[] cafe=new String[] {"아메리카노 : 2000원","화이트 아메리카노 : 2500원","카페라떼 : 3000원","돌체라떼 : 3000원","카페모카 : 3500원","화이트라떼 : 3000원","수박주스 : 5000원","망고주스 : 5000원","오렌지주스 : 4500원","써머아이스티 : 4000원","오렌지아이스티 : 4500원","복숭아아이스티 : 5000원","자두아이스티 : 5000원","유자에이드 : 6000원","복숭아에이드 : 6000원","고구마에이드 : 7000원","레몬에이드 : 6000원","청포도에이드 : 6500원"};
		System.out.print("음료 검색 : ");
		String drink=scan.nextLine();
		boolean j=true;
		for(int i=0;i<cafe.length;i++) {
			if(cafe[i].contains(drink)) {
				System.out.print("음료 : "+cafe[i]+"원 / 가격 : "+cafe[i]+"원\n");
				j=false;
			}
		}
		if(j) {
			System.out.print("죄송합니다 준비중입니다");
		}

	}

}
