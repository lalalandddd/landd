package java0715_1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class SetStudy1 {

	public static void main(String[] args) {

//		HashSet<String> hash=new HashSet<>();
//		hash.add("¥���");
//		hash.add("«��");
//		hash.add("������");
//		hash.add("���뱹��");
//		hash.add("��ġ����");
//		hash.add("����");
//		hash.add("�������̽�");
//		System.out.println(hash);  // �ϳ��� ��� ����� �Ұ���
//		hash.remove("�������̽�");  // �ϳ��� ��� ����� �� ����
//		System.out.println(hash);
//		for(String food:hash) {
//			System.out.println(food);  // �ϳ��� ��� ����� ����
//		}
//		ArrayList<String> list=new ArrayList<>(hash);  // �迭 ������ ��ȯ
//		System.out.println(list);
//		System.out.println(list.get(3));

		HashSet<String> ����=new HashSet<>();
		HashSet<String> ���=new HashSet<>();
		����.add("¥���");
		����.add("������");
		����.add("������");
		����.add("�޲ٹ̺���");
		���.add("��ġ������");
		���.add("������");
		���.add("¥���");
		���.add("������");
		System.out.println(����);
		System.out.println(���);
		HashSet<String> ����=new HashSet<>();  // ������
		// �÷��� �����ӿ�ũ ���� �����͸� Ȱ���ϱ� ���� ��.
		Iterator<String> it=����.iterator();  // 1ȸ��
		while(it.hasNext()) {
			String ����food=it.next();
			if(���.contains(����food)) {
				����.add(����food);
			}
		}
		System.out.println(����);

		HashSet<String> ����=new HashSet<>();  // ������
		it=����.iterator();
		while(it.hasNext()) {
			String ����food=it.next();
			if(!���.contains(����food)) {
				����.add(����food);
			}
		}
		System.out.println(����);

//		HashSet<String> ����=new HashSet<>();  // ������ ��
//		Iterator<String> up=����.iterator();
//		Iterator<String> up2=���.iterator();
//		while(up.hasNext()) {
//			String ����food=up.next();
//			����.add(����food);
//			String ���food=up2.next();
//			����.add(���food);
//		}
//		System.out.println(����);

		HashSet<String> ��=new HashSet<>();  // ������ ������
		��=(HashSet<String>)����.clone();
		��.addAll(���);
		System.out.println(��);

// ������ : addAll
// ������ : retainAll   ����.retainAll(���)
// ������ : removeAll   ����.removeAll(���)

//		HashSet<Integer> num1=new HashSet<>();
//		while(num1.size()<10) {
//			num1.add(Integer.valueOf((int)(Math.random()*50+1)));
//		}
//		System.out.println(num1);
		
// num1, num2, num3 �� ���� ������ ����� ���� 1~50�� ������ 15���� ����
// num1�� num3�� ������, num1�� num2�� ������, num2�� num3�� ������, num1, num2, num3�� ������ �����
		HashSet<Integer> num1=new HashSet<>();
		HashSet<Integer> num2=new HashSet<>();
		HashSet<Integer> num3=new HashSet<>();
		while(num1.size()<15) {
			num1.add(Integer.valueOf((int)(Math.random()*50+1)));
		}
		while(num2.size()<15) {
			num2.add(Integer.valueOf((int)(Math.random()*50+1)));
		}
		while(num3.size()<15) {
			num3.add(Integer.valueOf((int)(Math.random()*50+1)));
		}
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
// �������� ���� ����
		HashSet<Integer> ������1, ������2, ������1, ������1;
		������1=(HashSet)num1.clone();
		������1.retainAll(num3);
		System.out.println(������1);
		������1=(HashSet)num1.clone();
		������1.removeAll(num2);
		System.out.println(������1);
		������2=(HashSet)num2.clone();
		������2.retainAll(num3);
		System.out.println(������2);
		������1=(HashSet)num1.clone();
		������1.addAll(num2);
		������1.addAll(num3);
		System.out.println(������1);
// ���� ���� ���� (����� ����)
//		HashSet<Integer> ������1=new HashSet<>(num1);
//		������1.retainAll(num3);
//		System.out.println(������1);
//		HashSet<Integer> ������1=new HashSet<>(num1);
//		������1.removeAll(num2);
//		System.out.println(������1);
//		HashSet<Integer> ������2=new HashSet<>(num2);
//		������2.retainAll(num3);
//		System.out.println(������2);
//		HashSet<Integer> ������1=new HashSet<>(num1);
//		������1.addAll(num2);
//		������1.addAll(num3);
//		System.out.println(������1);

	}
}
/*
Set �������̽�
 - HashSet, TreeSet
 - ���������� ������� �ʴ´�.
 - �ߺ� ������ ������� �ʴ´�. (������, �������� Ȯ���� �� �ִ�)
 - �ε����� ����.
 - Set�� ����(�������� �׷�)�� �ٷ� �� ���ȴ�.
 - HashSet > ������ǥ��
 - TreeSet > �����˻��� Ưȭ
*/