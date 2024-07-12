package java0712_2;

import java.util.LinkedList;

public class LinkedListStudy1 {

	public static void main(String[] args) {

		LinkedList<String> list=new LinkedList<>();
		list.add("���ֵ�");
		list.add("����");
		list.add("�︪��");
		list.add("��ɵ�");
		list.add("����");
		list.add("������");
		System.out.println(list.indexOf("�︪��"));
		System.out.println(list.get(3));
		list.forEach(��->System.out.println(��));

	}
}

/*
�ڷᱸ��
- �迭 ���(ArrayList)
	�������� �۾����� �ſ� ������ ����
	�ʹ� ���� �������� ���, �߰� ����/�߰��� ������ �ʹ� ���� �ð��� �ɸ�
	�̵��ð��� �ʹ� ���� �ɸ�
- ��ũ�帮��Ʈ ���(LinkedList)
	�߰��� ����, �߰����� �߻��ϴ� �迭�� ������ �����ϱ� ���� ����
	�����͸� ������ ��, �ٸ� �������� ��ġ�� ���� ������
	���ͳ�, ������ ���� ���� �� �������� ����Ǿ� ����
		- ���ϸ�ũ�� : ���� ������ ��ġ�� ����
		- ����ũ�� : ��, �� ������ ��ġ�� ����
		- ������ũ�� : ��ȯ ������ ������ ��ġ�� ����(��: ��ȸ�ǻ��)

ArrayList�� ��� ����� �����ϴ�. ��, �迭�� �ƴϴ�.
�ٸ��� : LinkedList���� �ִ� �޼���(peek, poll, pop, push ��)
���߿� Queue��� ���������� ����ϴ� �޼���
����� �ٸ� �޼��常 �����ϸ� ���� �����ϴ�.
�� ArrayList�� ö���� �����ؾ� �Ѵ�.

- ��� : Node �� ������ 1���� ������. �� ������ 10���� Node�� 10���� �����.

*/