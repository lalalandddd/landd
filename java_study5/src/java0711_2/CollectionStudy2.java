package java0711_2;

import java.util.ArrayList;

public class CollectionStudy2 {

	public static void main(String[] args) {

		ArrayList<Member> list=new ArrayList<>();
		list.add(new Member("�̼���",25,"19990405"));
		list.add(new Member("�庸��",35,"19891218"));
		list.add(new Member("�縸��",31,"19930131"));
		list.add(new Member("������",26,"19980909"));
		list.add(new Member("���ڰ�",29,"19950412"));
		list.add(new Member("������",38,"19861027"));
// toString �������̵� �߱� ������ �ּҰ� �ƴ϶� �����Ͱ� ���������� ��µȴ�.
		System.out.println(list);
		for(Member m:list) {
			if(m.getAge()>=30) {  // 30�� �̻� ���
				System.out.print(m);
				System.out.println(m.getName());  // �̸��� ���
			}
		}
		System.out.println("1995�� ���� �¾ ����� ���");
		for(Member m:list) {
			String a=m.getBirth().substring(0,4);
			int year=Integer.parseInt(a);
			if(year>1995)System.out.println(m);
		}
		System.out.println("8~11���� �¾ ����� ���");
		for(Member m:list) {
			String a=m.getBirth().substring(4,6);
			int month=Integer.parseInt(a);
			if(month>7&&month<12)System.out.println(m);
		}
		list.add(2,new Member("�念��",34,""));
		System.out.println(list);
		System.out.println("��������� ���� ������� �⵵�� �ְ� 0��0�Ϸ� ����");
		for(Member m:list) {
			if(m.getBirth().isBlank()) {
				int year=2024-m.getAge();
				m.setBirth(year+"0000");
			}
		}
		System.out.println(list);
		System.out.println(list.get(2));
		
	}
}
