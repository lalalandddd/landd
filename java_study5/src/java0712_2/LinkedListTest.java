package java0712_2;

public class LinkedListTest {

	public static void main(String[] args) {

		LinkedList2 list=new LinkedList2();
		list.add(20);
/*
ù��° ��� ����� ��尡 null �̴ϱ�
head�� 20 ����, tail�� 20 ����
*/
		list.add(50);
/*
�ι�° ��� �����, ��尡 null �ƴϴϱ� else��
���� tail�� next�� �ι�° ��� head�� n�� 50 ����
ù��° tail�� 50 ����
*/
		list.add(100);
/*
����° ��� �����, ��尡 null �ƴϴϱ� else��
���� tail�� next�� ����° ��� head�� n�� 100 ����
�ι�° tail�� 100 ����
*/
		list.add(500);
/*
�׹�° ��� ����� ��尡 null �ƴϴϱ� else��
���� tail�� next�� �׹�° ��� head�� n�� 500 ����
����° tail�� 500 ����
*/

		System.out.println(list);
/*
��ü ��� ����
*/

	}
}
