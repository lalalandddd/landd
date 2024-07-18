package java0628;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayStudy {

	static Scanner scan=new Scanner(System.in);
	
	public static void main(String[] args) {

		// 배열 - [{(같은 타입)}]의 데이터가 저장되는 공간이 연속적으로 되어있는 구조
//		int[] array1= {10,20,30};  // 자바스크립트는 array1=[10,20,30];
//		System.out.println(array1[0]+" "+array1[1]);
//		int b[] = {40,50,60};  // 자바스크립트는 b=[40,50,60];
//		System.out.println(b[0]+" "+b[1]);
		// 자바스크립트는 push로 데이터 추가할 수 있지만, 여기서는 추가하는 method가 없음
		// 자바스크립트와 동일한 것은 length 뿐, 즉 indexOf로 빼내는 것도 불가능하다. 이렇게 작동하는 함수를 일일이 만들어야 한다.
//		System.out.println(array1+"\n"+b);  // 배열 b의 메모리 주소(16진수)가 나온다.
//		System.out.println(Arrays.toString(array1));  // Arrays도 import해야 하네...
//		int[] arr=new int[10];  // 배열의 공간 10개 생성 (변경이 안되므로 넉넉한 숫자로 만들어야 한다)
//		int[] brr=new int[] {10,20,30,40,50,60};  // 가장 좋은 방법
		// int[] arr2=new int[];  // 오류 발생!!! 배열의 크기를 지정해야만 한다.
		
//		int size=15;
//		int[] arr2=new int[size];  // 변수(size)의 수(15) 만큼의 공간을 가진 배열
//		System.out.println(arr2[0]);
		
		// 정적 배열은 주 데이터 보관소로 사용하지 않는다. 확장이 되지 않기 때문이다. 특정 용도로만 쓴다.
		// 자바에서도 동적 배열을 사용할 수 있는 방법이 있다.
		
		// 배열 생성 방법
		// 데이터타입[] 배열이름=new 데이터타입[배열크기];
//		int[] money=new int[5];
//		money[0]=5000;
//		money[1]=12000;
//		money[2]=4000;
//		money[3]=43000;
//		money[4]=50000;
//		for(int i=0;i<money.length;i++){
//			System.out.println(money[i]);
//		}
//		for(int i=0;i<money.length;i++) {
//			if(money[i]>=10000) {  // 10000 이상의 값 출력
//				System.out.println(money[i]);
//			}
//		}
		
		int[] AClass=new int[3];
		AClass[0]=89; AClass[1]=78; AClass[2]=93;
		int[] BClass=new int[3];
		BClass[0]=56; BClass[1]=84; BClass[2]=72;
		System.out.println("A반 성적 : "+Arrays.toString(AClass));
		System.out.println("B반 성적 : "+Arrays.toString(BClass));
		// 두 반 성적 중에서 80점 이상만 출력1
//		for(int i=0;i<AClass.length;i++) {
//			if(AClass[i]>=80) {
//				System.out.print(AClass[i]+" ");
//			}
//			if(BClass[i]>=80) {
//				System.out.print(BClass[i]+" ");
//			}
//		}
		
		// 두 반 성적 중에서 80점 이상만 출력2 if문은 한번만
		int[] AB=new int[AClass.length+BClass.length];
//		for(int i=0;i<AB.length;i++) {  // 조건문으로 넣기 (6회 반복)
//			if(i<3) {
//				AB[i]=AClass[i];
//			}else {
//				AB[i]=BClass[i-3];
//			}
//		}
		
//		for(int i=0;i<AClass.length;i++) {  // 조건문 없이 넣기 (3회 반복)
//			AB[i]=AClass[i];
//			AB[i+3]=BClass[i];
//		}
		
		System.arraycopy(AClass, 0, AB, 0, AClass.length);  // arraycopy로 넣기 (복사할 배열, 복사시작인덱스, 저장할배열, 저장위치인덱스, 복사 갯수)
		System.arraycopy(BClass, 0, AB, AClass.length, BClass.length);  // BClass 0번부터 AB 3번에 3개 저장

		for(int i=0;i<AB.length;i++) {  // 80점 이상 출력
			if(AB[i]>=80) {
				System.out.print(AB[i]+" ");
			}
		}
		
		Arrays.sort(AB);  // 정렬
		System.out.println(Arrays.toString(AB));
		
		boolean same=Arrays.equals(AClass,BClass);  // 배열이 같은가? 다르면 false
		System.out.println("A반, B반 배열이 같은가? "+same);

	}
}
