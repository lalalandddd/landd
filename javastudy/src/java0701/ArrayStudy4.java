package java0701;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayStudy4 {

	static Scanner scan=new Scanner(System.in);
	
	public static void main(String[] args) {

		// 많은 양의 데이터를 다룰 때는 배열을 사용한다. 상황에 따라서는 배열을 쓰면 안 되는 경우도 있지만...
		// 보통은 배열의 구조에 데이터를 저장한다.
		
		// 동적 배열 만들기
		// 기존의 배열 크기를 늘리거나 줄여서 사용하는 배열
		
//		int[] a=new int[5];
//		a[0]=10; a[1]=20; a[4]=40;
//		System.out.println(Arrays.toString(a));
//		a=new int[7];
//		a[5]=100;
//		System.out.println(Arrays.toString(a));
		
		// 데이터를 추가로 더 저장하려면 배열의 크기를 늘려야 한다.
//		int[] num=new int[] {10,20,30,40,50};
//		System.out.print(Arrays.toString(num));
//		// num[5]=60; 하면 인덱스 범위를 벗어나므로 오류가 뜬다... 근데 추가하고 싶다면 배열의 크기를 늘려야 한다.
//		int size=num.length;  // 기존 배열 크기
//		int[] temp=new int[size+1];  // 기존 배열 크기 +1인 새로운 배열을 만든다.
//		for(int i=0;i<size;i++) {
//			temp[i]=num[i];
//		}
//		num=temp;
//		num[5]=60;
//		System.out.print(Arrays.toString(num));
		
		// 문자열에서 같다 비교는 .equals() 로 한다.
		// 문자열에 특정 문자나 문자열 포함 여부는 .contains() 로 한다.
		
		// 다음 주소 중에서 선화동만 추출하여 배열에 저장하세요. 확인 출력은 Arrays 이용할 것
//		String[] addr=new String[] {"대전 중구 선화동 25","대전 중구 선화동 92","대전 서구 둔산동 111","대전 서구 둔산동 1023","대전 대덕구 덕암동 15","대전 대덕구 신탄진동 222","대전 유성구 노은동 93","대전 중구 대흥동 932","대전 중구 태평동 24","대전 동구 가양동 945","대전 중구 선화동 1234","대전 중구 대흥동 23","대전 중구 선화동 984"};
//		String[] search=new String[1];
//		int j=0;
//		for(int i=0;i<addr.length;i++) {
//			if(addr[i].contains("선화동")) {
//				String[] a=new String[j+1];
//				if(j!=0) {
//					for(int k=0;k<j;k++) {
//						a[k]=search[k];
//					}
//				}
//				a[j]=addr[i];
//				search=a;
//				j++;
//			}
//		}
//		System.out.print(Arrays.toString(search));
		
		// 2차원 배열 : 1차원 배열의 공간에 1차원 배열을 연결한 구조
//		int[][] arr=new int[2][3];  // 3의 크기를 가진 1차원 배열이 2개 있다.
//		arr[0][0]=10;
//		arr[0][1]=20;
//		arr[0][2]=30;
//		arr[1][0]=40;
//		arr[1][1]=50;
//		arr[1][2]=60;
		
		// 고등학교 1학년 1~6반 학생들의 성적? → new int[6][30];
		
		// 2차원 배열 쉽게 만들기...?
//		int[] a=new int[] {10,20,30,40,50,60,70,80,90,100};
//		// for(int i=0;i<a.length;i++){  // 이걸 간략하게 줄이면 ↓
//		for(int data:a) {   // 이 for 반복문...의 이름은 forEach, each로... 배열 전용 반복문이다.
//			System.out.println(data);  // 인덱스(위치)를 알지 못한다는게 단점
//		}
		// 교재 184p 2차원 배열 관련 문장 확인

	}

}
