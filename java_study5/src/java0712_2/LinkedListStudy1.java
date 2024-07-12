package java0712_2;

import java.util.LinkedList;

public class LinkedListStudy1 {

	public static void main(String[] args) {

		LinkedList<String> list=new LinkedList<>();
		list.add("제주도");
		list.add("독도");
		list.add("울릉도");
		list.add("백령도");
		list.add("마라도");
		list.add("거제도");
		System.out.println(list.indexOf("울릉도"));
		System.out.println(list.get(3));
		list.forEach(도->System.out.println(도));

	}
}

/*
자료구조
- 배열 기반(ArrayList)
	연속적인 작업에는 매우 빠르고 편함
	너무 많은 데이터의 경우, 중간 삭제/추가가 많으면 너무 많은 시간이 걸림
	이동시간이 너무 오래 걸림
- 링크드리스트 기반(LinkedList)
	중간의 삭제, 추가에서 발생하는 배열의 단점을 보완하기 위해 등장
	데이터를 저장할 때, 다른 데이터의 위치를 같이 저장함
	인터넷, 윈도우 폴더 등이 이 개념으로 연결되어 있음
		- 단일링크드 : 다음 데이터 위치만 저장
		- 더블링크드 : 전, 후 데이터 위치를 저장
		- 원형링크드 : 순환 구조로 데이터 위치를 저장(예: 국회의사당)

ArrayList와 사용 방법이 동일하다. 단, 배열이 아니다.
다른점 : LinkedList에만 있는 메서드(peek, poll, pop, push 등)
나중에 Queue라는 구조에서만 사용하는 메서드
사용이 다른 메서드만 제외하면 완전 동일하다.
즉 ArrayList를 철저히 공부해야 한다.

- 사용 : Node 당 데이터 1개를 가진다. 즉 데이터 10개면 Node도 10개를 만든다.

*/