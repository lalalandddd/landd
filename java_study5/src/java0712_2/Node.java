package java0712_2;

public class Node {

	int num;  // 데이터 저장
	Node next;  // 다음 노드의 주소 저장
	
	public Node(int num) {
		this.num=num;
		this.next=null;  // 다음 노드가 없어서 null
	}
}  // 이게 노드 끗!