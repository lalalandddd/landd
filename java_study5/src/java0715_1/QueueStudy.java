package java0715_1;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueStudy {

	public static void main(String[] args) {
// ���Լ���, ���� ���°� ���� ��������.
		Queue<String> q=new LinkedList<>();
		q.add("�ڵ�");
		q.offer("����");
		q.offer("����");
		q.offer("�챸");
		q.offer("����");
		q.offer("����");
		System.out.println(q);
		System.out.println(q.poll());  // ù��° �ڵ� ����ϰ� q���� ����
		System.out.println(q);
		System.out.println(q.size());  // ���� q�� ����
		System.out.println(q.contains("������"));  // �����ư� �ֳ�? ������ false
		System.out.println(q.contains("����"));  // ���Ⱑ �ֳ�? ������ true
		System.out.println(q.element());  // q�� ���� ��� ���� Ȯ��
		System.out.println(q.peek());  // q�� ���� ��� ���� Ȯ��
		System.out.println(q.poll());  // ù��° ���� ����ϰ� q���� ����
		System.out.println(q);
		System.out.println(q.poll());  // ù��° ���� ����ϰ� q���� ����
		System.out.println(q);
		System.out.println(q.poll());  // ù��° �챸 ����ϰ� q���� ����
		System.out.println(q);
		System.out.println(q.poll());  // ù��° ���� ����ϰ� q���� ����
		System.out.println(q);
		System.out.println(q.poll());  // ù��° ���� ����ϰ� q���� ����
		System.out.println(q);
//		System.out.println(q.element());  // ������� ��� ���� �߻�
		System.out.println(q.peek());  // �ƹ��͵� ���ٸ� null ���

		PriorityQueue<Integer> pq=new PriorityQueue<>();
		pq.offer(56);
		pq.offer(100);
		pq.offer(5);
		pq.offer(30);
		pq.offer(2);
		pq.offer(8);
		System.out.println(pq);  // ������ ���׹���������...
		System.out.println(pq.size());
		for(int i=0;i<6;i++) {  // �켱���� : ���ڰ� ������ ����(�Է¼��� ����)
			System.out.println(pq.poll());
		}
// ������ ���� Ŭ���� ��ü���� �켱������ ���Ϸ��� Compare �޼��带 �����ؾ� �Ѵ�.
// �������̽� Comparator�� implements�ؾ� �ȴ�.
// 

	}
}
/*
Queue - ť
FIFO - First In First Out
*/