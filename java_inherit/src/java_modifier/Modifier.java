package java_modifier;

public class Modifier {

	public static void main(String[] args) {
		
		Book book1=new Book();  // �޼ҵ带 ����ؼ� ������ ����!!
		book1.setTitle("�ڹ� �Ӽ�");
		book1.setAuthor("������");
		book1.setPage(786);
		// ������ set, �������°� get
		System.out.println(book1.getTitle());
		System.out.println(book1.getAuthor());
		System.out.println(book1.getPage());
		
		Book book2=new Book("�ڹ� ��","�̺���",564);
		// toString �޼��带 �������̵� �ؼ� ǥ�ð� ��������!!
		System.out.println(book2.toString());

	}

}

/*
Ŭ����
	- ����, �޼���
	- �ν��Ͻ�, Ŭ����
	- ������ �޼���
	- �ν��Ͻ� ����, Ŭ���� ���� �ʱ�ȭ
	- �����ε�
	- �������̵�
	- ���
	- ������
	- ������
	- �߻�ȭ
	- �������̽�
	- ����Ŭ����(�͸�Ŭ����, ����Ŭ����)
	- ������

�÷��� - �ڷ� ������ �˰��� (������ �̰� �߿���)
	- collection, List, Map, Set
	- ArrayList, Vector, LinkedList
	- Queue, stack, HashSet, TreeSet
	- HashMap, treeMap, ���

���׸� (���丸)
�ֳ����̼� (����� ���� �� ������ �˾ƾ� ��)
��Ʈ�� (��¼�ٰ� �ѹ� ��)
������ (���� ����)
(JAVA �⺻ ���� ��)

JSP - ���尴ü, MVC ����
�����������ӿ�ũ - ������ ��Ʈ
MVC����
������ ���θ�����Ʈ
������Ʈ(��)
*/