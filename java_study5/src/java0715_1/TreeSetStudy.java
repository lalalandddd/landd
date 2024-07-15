package java0715_1;

import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetStudy {

	public static void main(String[] args) {

//		TreeSet<Integer> tree=new TreeSet<>();
//		tree.add(34); tree.add(45); tree.add(20);
//		tree.add(9); tree.add(40); tree.add(15);
//		tree.add(48); tree.add(2); tree.add(11);
//		tree.add(39); tree.add(2); tree.add(45);
//		System.out.println(tree);  // ��� �ڷ�
//		System.out.println(tree.first());  // ù��° ������
//		System.out.println(tree.last());  // ������ ������
//		System.out.println(tree.higher(38));  // �Է°����� ū �� �߿��� ���� ����� ��
//		System.out.println(tree.lower(19));  // �Է°����� ���� �� �߿��� ���� ����� ��
//		System.out.println(tree.headSet(35));  // �Է°����� ���� �� ���
//		System.out.println(tree.tailSet(35));  // �Է°����� ū �� ���
//		System.out.println(tree.subSet(10,39));  // �Է��� �� �� ������ �� ���
//
//		TreeSet<String> word=new TreeSet<>();
//		word.add("�̼���"); word.add("������"); word.add("�庸��");
//		word.add("������"); word.add("����ȯ"); word.add("�ż���");
//		word.add("�Ѹ���"); word.add("���س�"); word.add("������");
//		word.add("����"); word.add("���ƾ�"); word.add("����ȭ");
//		System.out.println(word);
//		System.out.println(word.higher("��"));
//		System.out.println(word.lower("��"));
//		System.out.println(word.headSet("��"));
//		System.out.println(word.tailSet("��"));
//		System.out.println(word.subSet("��","��"));
//		System.out.println(word.subSet("��","��"));  // ???

// 90�� �̻� ����10%, 70�� �̻� ����30%, 40�� �̻� ����80%
// ���� ������ �Է��Ͽ� ���� ���������� ����ϼ���
		Scanner sc=new Scanner(System.in);
		TreeSet<Integer> rank=new TreeSet<>();
		rank.add(90); rank.add(70); rank.add(40);
		System.out.println("���� ������?");
		int me=sc.nextInt();
		switch(rank.lower(me+1)) {
		case 90: System.out.println("���� 10%"); break;
		case 70: System.out.println("���� 30%"); break;
		case 40: System.out.println("���� 80%"); break;
		default: break;
		}

		TreeSet<String> score=new TreeSet<>();
		score.add("89�� �̼���"); score.add("67�� ������");
		score.add("45�� ������"); score.add("98�� �Ѽ���");
		score.add("73�� �ڹ���"); score.add("81�� ������");
		score.add("59�� �̼���"); score.add("32�� �����");
// ���� ������ �Է��ϰ� ������ ������ ���� ������� ����ϼ���
		Scanner scan=new Scanner(System.in);
		System.out.println("���� ������?");
		String my=scan.nextLine();
		System.out.println(score.tailSet(my));

	}
}
/*
Tree ������ �̿��Ͽ� ���� �����Ű�� TreeSet
 - ���������� �����͸� �������� �ʴ´�.
 - �ߺ��� ������� �ʴ´�.
 - ����Ʈ���� ����ϱ� ������ �����Ͱ� ���ĵǾ� ��µȴ�.
 - ���� �˻� �Ǵ� ������ �ߺ� ���� �� ���Ŀ� �����ϴ�.
*/