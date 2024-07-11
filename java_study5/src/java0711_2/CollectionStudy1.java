package java0711_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionStudy1 {

	public static void main(String[] args) {

		int[] a=new int[5];  // 배열이지만 class가 아니다.
		ArrayList<Integer> list1=new ArrayList<Integer>();  // 타입명을 양쪽에 다 넣어줘야 노란줄이 사라진다
		list1.add(89);
		list1.add(230);
		list1.add(2543);
		list1.add(4578);
		list1.add(11942);
		System.out.println(list1);  // 배열 전체를 한번에 출력
		System.out.println(list1.get(2));  // 배열이지만 class이기 때문에 get으로 가져와야 한다.
		for(int i=0;i<list1.size();i++) {  // class이므로 배열 크기도 length > size() 이다.
			System.out.print(list1.get(i)+", ");
		}
		System.out.println(list1.indexOf(2543));  // indexOf()의 숫자가 있다면 위치, 없다면 -1이 출력
		System.out.println(list1.indexOf(230));
		System.out.println(list1.contains(11));  // contains()의 숫자가 있다면 true, 없다면 false
		list1.remove(3);  // remove()의 숫자 위치에 있는 데이터 제거  (3) = 4578
		System.out.println(list1);
		System.out.println(list1.isEmpty());  // isEmpty로 list1 안의 데이터를 모두 지웠기에 아무것도 없어서 false
		list1.add(1,450);  // list1의 1번째 배열에 450 추가
		System.out.println(list1);
		System.out.println(list1.indexOf(230));  // 위에선 1이었으나, 450이 1번째 배열에 추가되어 밀려서 2가 되었다.
		
//		for(int i=0;i<list1.size();i++) {
//			System.out.print(list1.get(i)+", ");
//		}
//		for(Integer n:list1) {System.out.print(n+", ");}  // 반복문(위의 for문을 간략하게)
		list1.forEach(n->System.out.print(n+", "));  // 반복문(위의 for문을 더 간략하게)

		System.out.println(list1);
		list1.set(3, 15);  // set(a,b) a위치의 데이터를 b로 변경
		System.out.println(list1);  // 2543 → 15
		
		Collections.sort(list1);  // 오름차순 정렬
		System.out.println(list1);
		
		list1.remove(Integer.valueOf(89));  // 89값을 가진 위치의 데이터 제거
		System.out.println(list1);
		
		Integer[] number=list1.toArray(new Integer[list1.size()]);
		Integer[] aa=new Integer[3];
		aa[0]=10;
		aa[1]=20;
		aa[2]=30;
		ArrayList<Integer> alist=new ArrayList<Integer>(Arrays.asList(aa));
		
		// 김춘추, 장영실, 이성계, 정몽주, 정도전, 김정호  : 이 이름을 ArrayList에 저장하고 출력하세요
		// 방법1
		ArrayList<String> names=new ArrayList<String>();
		names.add("김춘추");
		names.add("장영실");
		names.add("이성계");
		names.add("정몽주");
		names.add("정도전");
		names.add("김정호");
		System.out.println(names);
		// 방법2
		ArrayList<String> names2=new ArrayList<>(Arrays.asList(new String[] {"김춘추", "장영실", "이성계", "정몽주", "정도전", "김정호"}));
		System.out.println(names2);
		for(String name:names)System.out.print(name+" ");  // 출력방법1
		names2.forEach(name2->System.out.print(name2+" "));  // 출력방법2
		
		// 이름이 저장되어있는 배열에 이순신이 없으면 추가 저장하고 있으면 저장 안하기
		if(!names.contains("이순신")) names.add("이순신");
		System.out.println(names);

	}
}

/*
자바 컬렉션 프레임워크
데이터를 저장, 관리하기 위한 자료 구조와
데이터를 가공 처리하는 알고리즘이 구현되어있는 클래스들의 집합체

Collection, Map 인터페이스
Collection 인터페이스
	- List 인터페이스
		ArrayList 클래스 * (대부분 사용)
		vector
		LinkedList * (대부분 사용)
		Stack *
		Queue *
	- Set 인터페이스
		HashSet *
		TreeSet *
		LinkedHashSet
Map 인터페이스
	- HashMap *
	- TreeMap *
	- LinkedHashMap
	
ArrayList<String>  : <> 안에 데이터의 타입을 넣는다. 이를 제네릭이라 한다. 제네릭은 class이다. 나중에 배운다.
제네릭 들어갈 타입 : 
	Byte - byte
	Short - short
	Integer(정수) - int
	Long - long
	Float - float
	Double - double
	Character - char
	Boolean - boolean
	String(문자열)
		
타입 지정을 하면 타입이 맞지 않는 항목에 오류가 뜬다.
*/