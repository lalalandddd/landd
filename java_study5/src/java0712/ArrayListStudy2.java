package java0712;

import java.util.ArrayList;

import java0711_2.Member;

public class ArrayListStudy2 {

	public static void main(String[] args) {

		ArrayList<Asset> list=new ArrayList<>();
		list.add(new Asset("�츮����", 3450000, "1004-91-123455", "�̼���"));
		list.add(new Asset("����", 513350, "34-123-34939", "������"));
		list.add(new Asset("��������", 891003, "394-3412-2323", "���س�"));
		list.add(new Asset("��������", 899900, "39-2384-19939", "�ֹ���"));
		list.add(new Asset("�츮����", 28300, "1002-93-878888", "������"));
		list.add(new Asset("��������", 98000, "293-0123-1234", "������"));
		list.add(new Asset("�츮����", 1920000, "1006-23-123456", "��ù�"));
		list.add(new Asset("��������", 932000, "23-2555-29991", "������"));
		System.out.println(list);
		System.out.println("\n��1 ====�츮������ �̿��ϴ� ����� ����====");
		for(Asset a:list) {
			if(a.getBank().equals("�츮����")) {
				System.out.print(a);
				System.out.print(a.getHolder());
			}
		}
		System.out.println("\n��2 ====�ܾ��� 100���� �̻��� ����� ������ ���====");
//		for(Asset a:list) {  // ���1
//			if(a.getBalance()>=1000000) {
//				System.out.println(a);
//				System.out.println(a.getHolder());
//			}
//		}
		list.forEach(a->{  // ���2
			if(a.getBalance()>=1000000) {
				System.out.println(a);
				System.out.println(a.getHolder());
		}
		});
		System.out.println("\n��3-1 ====�ֹ����� �츮���� ���� �ִ��� Ȯ��====");
		System.out.println("��3-2 ====������ ���� ����(1007-23-128954)====");
		System.out.println("��3 ====�翬�� �ܾ��� 0��====");
//		// ���� ���
//		int b=0;
//		for(Asset a:list) {
//			if(a.getHolder().equals("�ֹ���")&&a.getBank().equals("�츮����")) b++;
//		}
//		if(b!=0) {
//			System.out.println("�����ִ�");
//		}else {
//			System.out.println("���¾���. ���¸� �����Ѵ�!");
//			list.add(new Asset("�츮����",0,"1007-23-128954","�ֹ���"));
//		}
//		list.forEach(a->System.out.println(a));
		// ������ ���  - �ڽ�Ŭ������ public boolean equals(Object o) �����
		Asset asset=new Asset("�츮����",0,"1007-23-128954","�ֹ���");
		if(!list.contains(asset)) {
			list.add(asset);
		}
		list.forEach(a->System.out.println(a));

	}
}
/* Asset�� ó�� ���� ���� �������� ���� �ʿ��ϸ� �޼ҵ�� ������ �߰��� �� ��
�ϴ� �ڷ� �Է�
�츮����, 1004-91-123455, �̼���, 3450000
����, 34-123-349393, ������, 513350
��������, 394-3412-2323, ���س�, 891003
��������, 39-2384-19939, �ֹ���, 899900
�츮����, 1002-93-878888, ������, 28300
��������, 293-0123-1234, ������, 98000
�츮����, 1006-23-123456, ��ù�, 1920000
��������, 23-2555-29991, ������, 932000
���� 1 �츮������ �̿��ϴ� ����� ������ ���
���� 2 �ܾ��� 100���� �̻��� ����� ������ ���
���� 3 �ֹ����� �츮���� ���¸� ������ �ִ��� Ȯ���ϰ� ������ �츮���� ���� ����
  �ֹ��� �츮���� ���� (1007-23-128954) �翬�� �ܾ� 0��
*/