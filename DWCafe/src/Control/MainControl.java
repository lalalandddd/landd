package Control;

import java.util.TreeMap;
import Service.Kiosk;
import Service.SelectDrink;

public class MainControl {

	public static void main(String[] args) {

//		TreeMap<Integer,String> tree=new TreeMap<>();
//		tree.put(20,"�ڵ�"); tree.put(54,"���"); tree.put(9,"����");
//		tree.put(33,"����"); tree.put(5,"�丶��"); tree.put(15,"��");
//		System.out.println(tree);
//		System.out.println(tree.headMap(20));  // �� ��ȣ �̸� ��ȣ ���� ����
//		System.out.println(tree.tailMap(20));  // �� ��ȣ �̻� ��ȣ ���� ����
//		System.out.println(tree.floorKey(30));  // �� ��ȣ ���� ��ȣ �� ����� �� �˻�
//		System.out.println(tree.floorEntry(20));  // ���� ��ȣ �˻�
//		System.out.println(tree.subMap(15,33));  // �̻�, �̸� �˻�
//		System.out.println(tree.lowerKey(15));  // �� ��ȣ �̸� ��ȣ �� ����� �� �˻�
//		System.out.println(tree.higherKey(15));  // �� ��ȣ �ʰ� ��ȣ �� ����� �� �˻�
// TreeSet�� �����ϰ� ����, �˻� ��
// ���������� �������� ����, Ű�� �ߺ��� ������� ����
// map�� ���� �� ������ �����ϰ� Ȱ���� �� ����

		System.out.println("=== DW ī�� �ֹ� Ű����ũ ===\n");
		System.out.println("=== ȭ���� ��ġ���� ������===\n");
		Kiosk kiosk=new SelectDrink();
		kiosk.action();

	}

}
