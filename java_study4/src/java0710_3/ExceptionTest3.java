package java0710_3;

public class ExceptionTest3 {

	public static void main(String[] args) {
// �Ϻη� ������ �߻���Ű�� ���.
//		try {
//			// �ڵ��...
//			// if() ���⼭ ���� �߻� ������ ���
//			throw new NullPointerException("aa");  // ������ �߻��ϸ� ���� ������
//			// �ڵ��... ������ ������ �׳� ����
//		}catch(Exception e) {  // ������ ���� �ޱ�
//			System.out.println("���� ���� �߻�");
//		}
	}
}

// ���� �����⸦ ���� �޼ҵ带 �����
class Member{
	String name;
	int age;
	int birth;
	Member(String name, int birth){
		this.name=name;
		this.birth=birth;
	}
	void setAge() {
		this.age=2024-birth;
	}
}