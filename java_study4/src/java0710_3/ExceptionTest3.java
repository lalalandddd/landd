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

		Member member=new Member("�̼���",2027);  // �̸�, �¾�⵵
		try {
			member.setAge();
		}catch(RuntimeException e) {
			System.out.println(e.getMessage());
		}
		System.out.println(member.name+", "+member.birth+", "+member.age);

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
// setAge �޼��带 ȣ���Ͽ� age �������� �����ϴµ� age ������ ���̶� 0���� ������ �� �ȴ�.
// 0���� ���� ���� ���´ٸ� birth ������ �߸��Ǿ��⿡ �߻��� �����̹Ƿ�, setAge �޼��忡�� ó���ϴ°� �ƴ϶�
// ���� �ڵ忡�� �ذ��ؾ� �ϹǷ� ���� �߻���Ű�� �Ѱ��ֱ⸦ �Ѵ�.
	void setAge() throws RuntimeException {
		this.age=2024-birth;
		if(age<0) throw new RuntimeException("�¾ �⵵�� �߸��Ǿ����ϴ�.");
	}
//	void setAge() {
//		try {
//			this.age=2024-birth;
//			if(age<0) throw new RuntimeException("�¾ �⵵�� �߸��Ǿ����ϴ�.");
//		}catch(Exception e) {
//			e.printStackTrace();
//			System.out.println(e.getMessage()+"���� ��� ����");
//		}
//	}
}