package java0710_3;

public class ExceptionTest1 {

	public static void main(String[] args) {

		try {
			String name=null;
			String a="aaa";
			String b="bbb";
			String c="ccc";
			name.length();
			a.length();
			b.length();
			c.length();
			System.out.println(10/3);
		}catch(NullPointerException n) {
			n.printStackTrace();  // �����޽��� Ȯ�� �׽�Ʈ ��, �ϼ��� ���α׷��� ������ �� �ȴ�.
			System.out.println("���ڿ��� �Է��Ͻÿ�!");
			System.out.println(n.getMessage());
			System.out.println(n.getClass());
		}catch(Exception e) {
			System.out.println(" 0 ���� ���� �� ����!");
		}
		System.out.println(" ���Ⱑ ���α׷� ��");

	}
}
/*
����ó��
- ���α׷� ���� �� ������ �߻��ϸ� ��� ���α׷��� ����ǰ� ���� ���� �ڷᰡ ���ư���.
- ����ó���� ���ָ� ������ �߻��ص� ���α׷��� ������� �ʴ´�.
- ����ڰ� �߸��� ���� �Է��ϴ� ��쿡 �˷��� �� �ִ�.
- ������ ������ �ذ����� ���ϰ� ȸ���ϴ� ����̴�.
*/