package java0711_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionStudy1 {

	public static void main(String[] args) {

		int[] a=new int[5];  // �迭������ class�� �ƴϴ�.
		ArrayList<Integer> list1=new ArrayList<Integer>();  // Ÿ�Ը��� ���ʿ� �� �־���� ������� �������
		list1.add(89);
		list1.add(230);
		list1.add(2543);
		list1.add(4578);
		list1.add(11942);
		System.out.println(list1);  // �迭 ��ü�� �ѹ��� ���
		System.out.println(list1.get(2));  // �迭������ class�̱� ������ get���� �����;� �Ѵ�.
		for(int i=0;i<list1.size();i++) {  // class�̹Ƿ� �迭 ũ�⵵ length > size() �̴�.
			System.out.print(list1.get(i)+", ");
		}
		System.out.println(list1.indexOf(2543));  // indexOf()�� ���ڰ� �ִٸ� ��ġ, ���ٸ� -1�� ���
		System.out.println(list1.indexOf(230));
		System.out.println(list1.contains(11));  // contains()�� ���ڰ� �ִٸ� true, ���ٸ� false
		list1.remove(3);  // remove()�� ���� ��ġ�� �ִ� ������ ����  (3) = 4578
		System.out.println(list1);
		System.out.println(list1.isEmpty());  // isEmpty�� list1 ���� �����͸� ��� �����⿡ �ƹ��͵� ��� false
		list1.add(1,450);  // list1�� 1��° �迭�� 450 �߰�
		System.out.println(list1);
		System.out.println(list1.indexOf(230));  // ������ 1�̾�����, 450�� 1��° �迭�� �߰��Ǿ� �з��� 2�� �Ǿ���.
		
//		for(int i=0;i<list1.size();i++) {
//			System.out.print(list1.get(i)+", ");
//		}
//		for(Integer n:list1) {System.out.print(n+", ");}  // �ݺ���(���� for���� �����ϰ�)
		list1.forEach(n->System.out.print(n+", "));  // �ݺ���(���� for���� �� �����ϰ�)

		System.out.println(list1);
		list1.set(3, 15);  // set(a,b) a��ġ�� �����͸� b�� ����
		System.out.println(list1);  // 2543 �� 15
		
		Collections.sort(list1);  // �������� ����
		System.out.println(list1);
		
		list1.remove(Integer.valueOf(89));  // 89���� ���� ��ġ�� ������ ����
		System.out.println(list1);
		
		Integer[] number=list1.toArray(new Integer[list1.size()]);
		Integer[] aa=new Integer[3];
		aa[0]=10;
		aa[1]=20;
		aa[2]=30;
		ArrayList<Integer> alist=new ArrayList<Integer>(Arrays.asList(aa));
		
		// ������, �念��, �̼���, ������, ������, ����ȣ  : �� �̸��� ArrayList�� �����ϰ� ����ϼ���
		// ���1
		ArrayList<String> names=new ArrayList<String>();
		names.add("������");
		names.add("�念��");
		names.add("�̼���");
		names.add("������");
		names.add("������");
		names.add("����ȣ");
		System.out.println(names);
		// ���2
		ArrayList<String> names2=new ArrayList<>(Arrays.asList(new String[] {"������", "�念��", "�̼���", "������", "������", "����ȣ"}));
		System.out.println(names2);
		for(String name:names)System.out.print(name+" ");  // ��¹��1
		names2.forEach(name2->System.out.print(name2+" "));  // ��¹��2
		
		// �̸��� ����Ǿ��ִ� �迭�� �̼����� ������ �߰� �����ϰ� ������ ���� ���ϱ�
		if(!names.contains("�̼���")) names.add("�̼���");
		System.out.println(names);

	}
}

/*
�ڹ� �÷��� �����ӿ�ũ
�����͸� ����, �����ϱ� ���� �ڷ� ������
�����͸� ���� ó���ϴ� �˰����� �����Ǿ��ִ� Ŭ�������� ����ü

Collection, Map �������̽�
Collection �������̽�
	- List �������̽�
		ArrayList Ŭ���� * (��κ� ���)
		vector
		LinkedList * (��κ� ���)
		Stack *
		Queue *
	- Set �������̽�
		HashSet *
		TreeSet *
		LinkedHashSet
Map �������̽�
	- HashMap *
	- TreeMap *
	- LinkedHashMap
	
ArrayList<String>  : <> �ȿ� �������� Ÿ���� �ִ´�. �̸� ���׸��̶� �Ѵ�. ���׸��� class�̴�. ���߿� ����.
���׸� �� Ÿ�� : 
	Byte - byte
	Short - short
	Integer(����) - int
	Long - long
	Float - float
	Double - double
	Character - char
	Boolean - boolean
	String(���ڿ�)
		
Ÿ�� ������ �ϸ� Ÿ���� ���� �ʴ� �׸� ������ ���.
*/