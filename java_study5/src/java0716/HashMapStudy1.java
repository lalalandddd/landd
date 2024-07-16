package java0716;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HashMapStudy1 {

	public static void main(String[] args) {

		HashMap<String,Integer> map=new HashMap<>();
//		map.put("이순신",19990405); map.put("장보고",19880702);
//		map.put("김춘추",19990101); map.put("장영실",20110718);
		map.put("이도",20051103); map.put("방정환",19701129);
		map.put("황희",19920814); map.put("맹사성",19930630);
		map.put("김춘추",20090101);  // key 중복 안 됨(나중것만 저장-덮어씀)
		map.put("이성계",19701129);  // value 중복 됨
		System.out.println(map);
		map.putIfAbsent("방정환",1222);  // map에 key가 존재한다면 저장 안함
		map.putIfAbsent("을지문덕",19880317);  // key가 없다면 저장
		System.out.println(map);
		System.out.println(map.get("이도"));  // key값 넣으면 value값 출력
		map.replace("이성계",19760505);  // 수정
		System.out.println(map);
		System.out.println(map.containsKey("을지문덕")+" "+map.containsKey("김정호"));  // key 확인
		System.out.println(map.containsValue(1222)+" "+map.containsValue(20051103));  // value 확인
		System.out.println(map.isEmpty());  // 비어있는지 확인
		System.out.println(map.size());  // 크기 확인
		Set<String> keys=map.keySet();  // set 또는 collection 변환
		System.out.println(keys);
		for(String name:keys) {  // 반복문 써서 모두 출력하려면 set 변환 후 이렇게 만들어야만 한다.
			System.out.println(map.get(name));
		}
		List<Integer> birth=new ArrayList<>(map.values());
		System.out.println(birth);
		Set<Map.Entry<String,Integer>> entry=map.entrySet();
		System.out.println(entry);  // key=value 형식의 배열로 변환
		map.forEach((k,v)->System.out.println(k+" "+v));

	}
}
/*
HashMap
 - 순차적으로 저장되지 않는다.
 - key : value (javascript와 입력 방식이 같다.)
 - key의 중복을 허용하지 않는다. value는 중복 가능
 - Map은 색인 검색에 특화되어있다. (대신 메모리 공간을 많이 소비한다.)
*/