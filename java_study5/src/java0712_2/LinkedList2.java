package java0712_2;

public class LinkedList2 {
	Node head;  // 링크드리스트의 첫번째 노드의 주소
	Node tail;  // 링크드리스트의 마지막 노드의 주소
	void add(int n) {  // 새 데이터 저장 메서드
		Node temp=new Node(n);
		if(head==null) {
			head=temp;
			tail=temp;
		}else {
			tail.next=temp;
			tail=temp;
		}
	}
	void remove(int index) {  // 지정한 위치의 데이터 삭제 메서드
		
	}
	@Override
	public String toString() {  // 전체 출력 메서드
		String out="[";
		Node move=head;  // 첫번째 노드의 주소
		while(move!=null) {
			out+=move.num+", ";
			move=move.next;
		}
		out=out.substring(0,out.length()-2);
		out+="]";
		return out;
	}
	int get(int index) {  // 지정한 위치의 데이터 출력 메서드
		return 0;
	}
}

/*
새 데이터 저장 - add
데이터 삭제 - remove
전체 출력 - toString
데이터 하나 출력 - get

*/