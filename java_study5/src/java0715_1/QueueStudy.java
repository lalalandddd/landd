package java0715_1;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueStudy {

	public static void main(String[] args) {
// 선입선출, 먼저 들어온걸 먼저 내보낸다.
		Queue<String> q=new LinkedList<>();
		q.add("자두");
		q.offer("수박");
		q.offer("참외");
		q.offer("살구");
		q.offer("딸기");
		q.offer("참외");
		System.out.println(q);
		System.out.println(q.poll());  // 첫번째 자두 출력하고 q에서 삭제
		System.out.println(q);
		System.out.println(q.size());  // 현재 q의 길이
		System.out.println(q.contains("복숭아"));  // 복숭아가 있나? 없으니 false
		System.out.println(q.contains("딸기"));  // 딸기가 있나? 있으니 true
		System.out.println(q.element());  // q의 다음 출력 내용 확인
		System.out.println(q.peek());  // q의 다음 출력 내용 확인
		System.out.println(q.poll());  // 첫번째 수박 출력하고 q에서 삭제
		System.out.println(q);
		System.out.println(q.poll());  // 첫번째 참외 출력하고 q에서 삭제
		System.out.println(q);
		System.out.println(q.poll());  // 첫번째 살구 출력하고 q에서 삭제
		System.out.println(q);
		System.out.println(q.poll());  // 첫번째 딸기 출력하고 q에서 삭제
		System.out.println(q);
		System.out.println(q.poll());  // 첫번째 참외 출력하고 q에서 삭제
		System.out.println(q);
//		System.out.println(q.element());  // 비어있을 경우 오류 발생
		System.out.println(q.peek());  // 아무것도 없다면 null 출력

		PriorityQueue<Integer> pq=new PriorityQueue<>();
		pq.offer(56);
		pq.offer(100);
		pq.offer(5);
		pq.offer(30);
		pq.offer(2);
		pq.offer(8);
		System.out.println(pq);  // 정리가 뒤죽박죽이지만...
		System.out.println(pq.size());
		for(int i=0;i<6;i++) {  // 우선순위 : 숫자가 작은것 먼저(입력순서 무시)
			System.out.println(pq.poll());
		}
// 개발자 정의 클래스 객체에서 우선순위를 정하려면 Compare 메서드를 구현해야 한다.
// 인터페이스 Comparator을 implements해야 된다.
// 

	}
}
/*
Queue - 큐
FIFO - First In First Out
*/