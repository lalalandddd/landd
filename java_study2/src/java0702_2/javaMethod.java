package java0702_2;

public class javaMethod {

	public static void main(String[] args) {

	// ���� 228p �޼��� ����......
	// �ڹ� �޼���
	// ��ȯŸ�� �޼����̸�(�Ű�����){  }
	// ��ȯŸ�� - int, short, float, double, char, boolean, String, void(��ȯ�Ǵ� ���� ����)
	// return 10;  �� ��ȯŸ�� int, short, long
	// return income;  �� income ������ Ÿ���� ��ȯŸ������

	/*�ֹε�Ϲ�ȣ�� �������� �������� ��������
		String gender(String �ֹ�){
		String gen=�ֹ�.substring(7,8);
		if(gen.equals("1")||gen.equals("3")){
			return "����";
		}else if(gen.equals("2")||gen.equals("4")){
			return "����";
		}
		return "ȥ��";
		}
	*/

		// Ŭ���� �޼��忡���� ���� Ŭ���� ������ Ŭ���� �޼��常 ����, �޸𸮿� �ε�(����)�Ǵ� ���� �ν��Ͻ����� ���� �̷������
		// ������ �ν��Ͻ� ������ �ν��Ͻ� �޼���� �� �ȴ�.
		
//		output();  // void�� ���� output���� ���ƿ��� ������ ������ ����
//		JavaMethod ja=new JavaMethod();
//		ja.out();
		int num=300;
		output(num);  // num�� �Ѱ��ش�.

	}
	
	// num�� ���� Ÿ���� ������ �����;߸� {} �ۿ��� ����� �� �ִ�.
	// num�� main{} �ȿ��� ������� ���������̹Ƿ� {} �ۿ��� �� �� ����.
	static void output(int a) {  // num�� ���� Ÿ�� int�� �޾Ƽ� a�� �����Ѵ�.
		System.out.println(a);  // ������ a�� ����Ѵ�.
		System.out.println("���� �޼��� �Դϴ�.");
	}

}
class a{
	int num=10;
	static void out() {
		System.out.println(num);
	}
}
