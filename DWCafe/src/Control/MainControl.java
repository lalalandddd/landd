package Control;

import java.util.TreeMap;
import Service.Kiosk;
import Service.SelectDrink;

public class MainControl {

	public static void main(String[] args) {

//		TreeMap<Integer,String> tree=new TreeMap<>();
//		tree.put(20,"자두"); tree.put(54,"사과"); tree.put(9,"수박");
//		tree.put(33,"참외"); tree.put(5,"토마토"); tree.put(15,"귤");
//		System.out.println(tree);
//		System.out.println(tree.headMap(20));  // 이 번호 미만 번호 전부 나열
//		System.out.println(tree.tailMap(20));  // 이 번호 이상 번호 전부 나열
//		System.out.println(tree.floorKey(30));  // 이 번호 이하 번호 중 가까운 것 검색
//		System.out.println(tree.floorEntry(20));  // 지정 번호 검색
//		System.out.println(tree.subMap(15,33));  // 이상, 미만 검색
//		System.out.println(tree.lowerKey(15));  // 이 번호 미만 번호 중 가까운 것 검색
//		System.out.println(tree.higherKey(15));  // 이 번호 초과 번호 중 가까운 것 검색
// TreeSet과 동일하게 정렬, 검색 용
// 순차적으로 저장하지 않음, 키의 중복을 허용하지 않음
// map을 만들 수 있으면 동일하게 활용할 수 있음

		System.out.println("=== DW 카페 주문 키오스크 ===\n");
		System.out.println("=== 화면을 터치하지 마세요===\n");
		Kiosk kiosk=new SelectDrink();
		kiosk.action();

	}

}
