package java0715_1;

import java.util.Scanner;
import java.util.Stack;

public class StackStudy {

	public static void main(String[] args) {

//		Stack<String> st=new Stack<>();
//		st.add("�̼���");  // ������ ����
//		st.push("������");  // stack ���� ������ ����
//		st.push("������");
//		st.push("������");
//		st.push("�庸��");
//		st.push("������");
//		st.push("�縸��");
//		System.out.println(st);  // ��� ����� �迭�� ����
//		System.out.println(st.pop());  // �縸�� ���, stack���� ����
//		System.out.println(st);  // �縸�� ���� ���
//		System.out.println(st.search("������"));  // 3���� ����
//		System.out.println(st.size());  // ���� ũ�� 6(0~5)
//		System.out.println(st.pop());  // ������ ���, stack���� ����
//		System.out.println(st.pop());  // �庸�� ���, stack���� ����
//		System.out.println(st.pop());  // ������ ���, stack���� ����
//		System.out.println(st.pop());  // ������ ���, stack���� ����
//		System.out.println(st);  // �̼���, ������ ���
//		System.out.println(st.isEmpty());  // ����.

		Stack<String> pre=new Stack<>();
		Stack<String> back=new Stack<>();
		String now="���̹�";
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.print("�̵������� �Է�(1.�� 2.��) : ");
			String temp=sc.nextLine();
			if(temp.equals("1")&&!back.isEmpty()) {  // ���������� �̵�
				pre.push(now);  // ���� �������� pre ��Ͽ� ����
				now=back.pop();  // ���� �������� �����´�
			}else if(temp.equals("2")&&!pre.isEmpty()) {  // �������� �̵�
				back.push(now);
				now=pre.pop();
			}else if(temp.equals("1")||temp.equals("2")) {  // �� ������ �̵�
				// �ڰ� ���� �� �ڷ� ����, ���� ���� �� ������ ����...�̹Ƿ� �ƹ��͵� ���� �ʴ´�.
			}else {
				back.push(now);  // ���� �������� back �������� ����
				pre.clear();  // �������� ���鼭 pre �������� ��� ����
				now=temp;  // ���� �������� ���� ������
			}
			System.out.println("���� ������ : "+now);
			System.out.println("back ������ ��� : "+back);
			System.out.println("pre ������ ��� : "+pre);
		}

	}
}
/*
�����͸� �����ϱ� ���� �Ա��� ����ϱ� ���� �ⱸ�� ����.
�� ���� ���� ����� ����� �̷������ �����̴�.
FILO, First In Last Out
ó�� ���� �����Ͱ� ���� ���߿� ������ �������� ���� �����Ͱ� ���� ������.
�ַ� ��� �۾�/�ֱٹ湮������(�ǵ��ư���)/Alt+Tab/������̼� ��ã�� � Ȱ��ȴ�.
��) 7+8+2+10 > 7����, 8����, 8����, 7����, ���15, 15����
2 ����, 2����, 15����, ���17, 17����, 10����, 10����, 17����, ��� 27, ���

*/