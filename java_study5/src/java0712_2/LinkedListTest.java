package java0712_2;

public class LinkedListTest {

	public static void main(String[] args) {

		LinkedList2 list=new LinkedList2();
		list.add(20);
/*
첫번째 노드 만들고 헤드가 null 이니까
head에 20 저장, tail에 20 저장
*/
		list.add(50);
/*
두번째 노드 만들고, 헤드가 null 아니니까 else로
현재 tail의 next인 두번째 노드 head에 n값 50 저장
첫번째 tail에 50 저장
*/
		list.add(100);
/*
세번째 노드 만들고, 헤드가 null 아니니까 else로
현재 tail의 next인 세번째 노드 head에 n값 100 저장
두번째 tail에 100 저장
*/
		list.add(500);
/*
네번째 노드 만들고 헤드가 null 아니니까 else로
현재 tail의 next인 네번째 노드 head에 n값 500 저장
세번째 tail에 500 저장
*/

		System.out.println(list);
/*
전체 출력 과정
*/

	}
}
