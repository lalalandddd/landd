package java0715_1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class SetStudy1 {

	public static void main(String[] args) {

//		HashSet<String> hash=new HashSet<>();
//		hash.add("짜장면");
//		hash.add("짬뽕");
//		hash.add("탕수육");
//		hash.add("순대국밥");
//		hash.add("잔치국수");
//		hash.add("곰탕");
//		hash.add("오무라이스");
//		System.out.println(hash);  // 하나를 골라서 출력은 불가능
//		hash.remove("오무라이스");  // 하나를 골라서 지우는 건 가능
//		System.out.println(hash);
//		for(String food:hash) {
//			System.out.println(food);  // 하나씩 모두 출력은 가능
//		}
//		ArrayList<String> list=new ArrayList<>(hash);  // 배열 구조로 변환
//		System.out.println(list);
//		System.out.println(list.get(3));

		HashSet<String> 재학=new HashSet<>();
		HashSet<String> 상민=new HashSet<>();
		재학.add("짜장면");
		재학.add("볶음밥");
		재학.add("돈가스");
		재학.add("쭈꾸미볶음");
		상민.add("김치볶음밥");
		상민.add("떡볶이");
		상민.add("짜장면");
		상민.add("돈가스");
		System.out.println(재학);
		System.out.println(상민);
		HashSet<String> 공통=new HashSet<>();  // 교집합
		// 컬렉션 프레임워크 안의 데이터를 활용하기 위한 것.
		Iterator<String> it=재학.iterator();  // 1회용
		while(it.hasNext()) {
			String 재학food=it.next();
			if(상민.contains(재학food)) {
				공통.add(재학food);
			}
		}
		System.out.println(공통);

		HashSet<String> 차이=new HashSet<>();  // 차집합
		it=재학.iterator();
		while(it.hasNext()) {
			String 재학food=it.next();
			if(!상민.contains(재학food)) {
				차이.add(재학food);
			}
		}
		System.out.println(차이);

//		HashSet<String> 전부=new HashSet<>();  // 합집합 나
//		Iterator<String> up=재학.iterator();
//		Iterator<String> up2=상민.iterator();
//		while(up.hasNext()) {
//			String 재학food=up.next();
//			전부.add(재학food);
//			String 상민food=up2.next();
//			전부.add(상민food);
//		}
//		System.out.println(전부);

		HashSet<String> 합=new HashSet<>();  // 합집합 선생님
		합=(HashSet<String>)재학.clone();
		합.addAll(상민);
		System.out.println(합);

// 합집합 : addAll
// 교집합 : retainAll   재학.retainAll(상민)
// 차집합 : removeAll   재학.removeAll(상민)

//		HashSet<Integer> num1=new HashSet<>();
//		while(num1.size()<10) {
//			num1.add(Integer.valueOf((int)(Math.random()*50+1)));
//		}
//		System.out.println(num1);
		
// num1, num2, num3 세 개의 집합을 만들고 각각 1~50의 랜덤값 15개씩 저장
// num1과 num3의 교집합, num1과 num2의 차집합, num2와 num3의 교집합, num1, num2, num3의 합집합 만들기
		HashSet<Integer> num1=new HashSet<>();
		HashSet<Integer> num2=new HashSet<>();
		HashSet<Integer> num3=new HashSet<>();
		while(num1.size()<15) {
			num1.add(Integer.valueOf((int)(Math.random()*50+1)));
		}
		while(num2.size()<15) {
			num2.add(Integer.valueOf((int)(Math.random()*50+1)));
		}
		while(num3.size()<15) {
			num3.add(Integer.valueOf((int)(Math.random()*50+1)));
		}
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
// 선생님이 적은 내용
		HashSet<Integer> 교집합1, 교집합2, 차집합1, 합집합1;
		교집합1=(HashSet)num1.clone();
		교집합1.retainAll(num3);
		System.out.println(교집합1);
		차집합1=(HashSet)num1.clone();
		차집합1.removeAll(num2);
		System.out.println(차집합1);
		교집합2=(HashSet)num2.clone();
		교집합2.retainAll(num3);
		System.out.println(교집합2);
		합집합1=(HashSet)num1.clone();
		합집합1.addAll(num2);
		합집합1.addAll(num3);
		System.out.println(합집합1);
// 내가 적은 내용 (결과는 동일)
//		HashSet<Integer> 교집합1=new HashSet<>(num1);
//		교집합1.retainAll(num3);
//		System.out.println(교집합1);
//		HashSet<Integer> 차집합1=new HashSet<>(num1);
//		차집합1.removeAll(num2);
//		System.out.println(차집합1);
//		HashSet<Integer> 교집합2=new HashSet<>(num2);
//		교집합2.retainAll(num3);
//		System.out.println(교집합2);
//		HashSet<Integer> 합집합1=new HashSet<>(num1);
//		합집합1.addAll(num2);
//		합집합1.addAll(num3);
//		System.out.println(합집합1);

	}
}
/*
Set 인터페이스
 - HashSet, TreeSet
 - 순차적으로 저장되지 않는다.
 - 중복 저장을 허용하지 않는다. (교집합, 차집합을 확인할 수 있다)
 - 인덱스가 없다.
 - Set은 집합(데이터의 그룹)을 다룰 때 사용된다.
 - HashSet > 집합을표현
 - TreeSet > 범위검색에 특화
*/