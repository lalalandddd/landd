package java0710_2;

public class InnerClass1 {

	public static void main(String[] args) {

		Out out=new Out();
		out.num=100;
		out.obj.age=40;
		out.obj.setName("�̼���");
		Out.�ν��Ͻ�����Ŭ���� in=out.new �ν��Ͻ�����Ŭ����();  // ����Ŭ������ ���� ��� ���(��ҹ��� ����!)
		in.age=20;
		in.setName("������");

	}
}
class Out{
	static int count;  // Ŭ���� ����
	int num;  // �ν��Ͻ� ����
	private String job;  // �ν��Ͻ� ����
	�ν��Ͻ�����Ŭ���� obj=new �ν��Ͻ�����Ŭ����();
	class �ν��Ͻ�����Ŭ����{  // �տ� private ������ ���̸� class Out �ȿ����� ��� ���� > main�� ������ ���� ������
		public int age;  // ���� Ŭ���� ��� ����
		private String name;  // private�� �ܺ� ��� �Ұ���
		void setName(String name) {
			this.name=name;
		}
		void create() {
			count=10;  // static���� ����/������ ����/�޼���� �ν��Ͻ� �޼��忡�� ��� ���� <> �ν��Ͻ� ����/�޼���� static���� ��� �Ұ���
		}
	}
	static void save() {}
	static class ��������Ŭ����{  // static�̹Ƿ� Out class�� ������ �ʴ´�.
		int tall;
		static int birth;
		static void update() {}
	}
	void buyComputer() {  // �޼ҵ�
		class ��������Ŭ����{
			// �޼ҵ�(buyComputer) ���ο����� ��� ����. �޼ҵ尡 ����Ǹ� Ŭ����, ���� ����� ��� �Ҹ��Ѵ�
			// > �������� ���� > �ܺ� Ŭ�������� ���� ��� �Ұ���, ������ ���� �� ����(private, public, static ���)
			int weight;
			void del() {}
		}
		��������Ŭ���� ob=new ��������Ŭ����();
	}
	interface Car{  // ���� �������̽�
		void make();  // �޼���
	}
	void makeCar() {  // ��ü�� ���� �� ������ �͸���Ŭ������ ����ؼ� ����ϰ� ����� �� �ִ�.
		Car c=new Car() {  // �͸���Ŭ������ ���� ��ü
			@Override
			public void make() {
				System.out.println("�͸� Ŭ������ ���� �����");
			}
		};
	}
}
/* ���� Ŭ���� : Ŭ���� ���ο����� ��� ������ Ŭ���� (���� ����� Ŭ���� �ܺο��� ��� ����?)
1. �ν��Ͻ� ���� Ŭ����
2. ���� ���� Ŭ����
3. ���� ���� Ŭ����
4. �͸� ���� Ŭ����(�̸����� Ŭ����)
*/