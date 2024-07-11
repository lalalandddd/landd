package java0711;

class PasswordException extends Exception{
	public PasswordException(String msg) {
		super(msg);
	}
}

public class ExceptionTest5 {

	static void setPassword(String password) throws PasswordException {  // ���� ���� ����ó��Ŭ����
		if(password==null)throw new PasswordException("��й�ȣ�� �Է��ϼ���");
		if(password.length()<8)throw new PasswordException("��й�ȣ�� 8�� �̻� �Է��ϼ���");
		if(password.matches("[a-zA-Z]+"))throw new PasswordException("��й�ȣ�� ���ڳ� Ư�����ڸ� �����Ͽ� �Է��ϼ���");
		// �� if�� �߿� �ϳ��� ����(throw)�� �߻����� ������ ��й�ȣ �����ϱ� / ���� �߻��ϸ� ���� ����ϰ� ����
		
	}

	public static void main(String[] args) {

		try {
			setPassword("123456");
		}catch(PasswordException e) {  // ���� ���� ����ó��Ŭ������ ���
			System.out.println(e.getMessage());
		}

	}
}

/*
����� ���� ����ó�� Ŭ���� �����
*/
