package java0702;

public class ClassBasic {

	public static void main(String[] args) {

	// ����ü(struct) : �Ǽ�, ����, ���ڿ� ���� �ϳ��� �迭�� ���� ���� ��� - �ٵ� �ڹٿ��� �̰� ����... �迭�� ������ ���� Ÿ�Ը�.
	// ���� Ÿ�Ը� �����ϴ� ����, ���� ������ ���� �����ϰ� �Ǿ� ������ �� ����ü ���� �Լ����� ��������� �� (�� ��� �� �ϳ��� class)
	// class ����ü�� ������ ������ ��, �Լ��� ���� ���������ν� ���� Ÿ���� ������ �ϳ��� �迭�� ���� �� �ְ� ��
	// ���� [age, age, age...], [tall, tall, tall...] [wg, wg, wg...]
	// struct [int.age float.tall float.wg] [int.age float.tall float.wg] ...

		// ��ȭ ���� �������� ��ƺ��Ҵ�
		// String ����; String �帣; String ����; int[] ������; int ������; long �Ѽ���?;
		// ��ü ��� �޼���? ������ ��� �޼���?

	// ���ǵ� class Ÿ���� ������ �����Ѵ�. ������ ������ �����͸� �����Ѵ�.
	// class Ÿ������ ������ ������ ��ü �Ǵ� �ν��Ͻ���� �Ѵ�.

		// class �ν��Ͻ� ����

//		Member member1=new Member();
//		Member member2=new Member();
//		System.out.println(member1);  // ���̴� �� ������ �ּ�... �����Ͱ� �ƴϴ�
//		member1.name="�̼���";  // �Ʒ����� class�� ���� �����ؾ� �����͸� �Է��� �� �ִ�.
//		member1.age=23;
//		System.out.println(member1.name);  // �̼���
//		System.out.println(member1.age);  // 23
//		System.out.println(member2.name);  // null (��������� �ƹ� ���� ����)
//		System.out.println(member2.age);  // 0 (��������� �ƹ� ���� ����)
//		member2.name="������";
//		member2.age=34;
//		System.out.println(member2.name);  // ������
//		System.out.println(member2.age);  // 34

//		// java, 495p / �޸� ����ȭ���, 893p
//		Book book1=new Book();
//		Book book2=new Book();
//		book1.title="java";
//		book1.pageEnd=495;
//		book2.title="�޸� ����ȭ���";
//		book2.pageEnd=893;
//		System.out.println(book1.title+" "+book1.pageEnd+"p");
//		System.out.println(book2.title+" "+book2.pageEnd+"p");

		// ����Ʈ�� ��ǰ��, �ü��, �޸� ũ�⸦ ������ �� �ִ� Ŭ������ �����ϰ� �ν��Ͻ� �����Ͽ� �� ����, ����ϼ���(3��)
		SmartPhone sp1=new SmartPhone();
		SmartPhone sp2=new SmartPhone();
		SmartPhone sp3=new SmartPhone();
		sp1.name="galaxy24";
		sp1.system="android";
		sp1.ram=2048;
		sp2.name="googlephone";
		sp2.system="android";
		sp2.ram=1024;
		sp3.name="Iphone24";
		sp3.system="IOS16";
		sp3.ram=2048;
		System.out.printf("%15s %8s %5s\n","phone name","system","ram");
		System.out.printf("%15s %8s %5smb\n",sp1.name,sp1.system,sp1.ram);
		System.out.printf("%15s %8s %5smb\n",sp2.name,sp2.system,sp2.ram);
		System.out.printf("%15s %8s %5smb\n",sp3.name,sp3.system,sp3.ram);

	}
}
// class�� ����� ���� ������ Ÿ�� �̶�� �Ѵ�.
//class Member{  // Member ��� �̸��� Ŭ���� ����
//	String name;  // �̸� ����
//	int age;  // ���� ����
//	Member(){}
//}
//class Book{  // å ����� �� ������ ���� �����ϱ� ���� Ŭ���� ����
//	String title;
//	int pageEnd;
//}
class SmartPhone{
	String name;
	String system;
	int ram;
}