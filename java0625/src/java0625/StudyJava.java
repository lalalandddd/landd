package java0625;

public class StudyJava {

	public static void main(String[] args) {
		// �ڹ� �⺻ ���� : ������Ʈ(java0625[landd main��1]) - ��Ű��(java0625) - Ŭ����(Studyjava)
		
		System.out.println("�ڹ��׽�Ʈ");  // ��� ���
		// �ڵ� ���� : Lctrl+F11  �׳� F11 : ���� ���� ���������� �ڵ� ����

		// �ڹٴ� ������ ������ ���� ������ �����.
		// �ڹ� ���� ���� �� ������Ÿ��(�ݵ�� �ٿ��� ��) �����̸� = ������;
		// ������Ÿ��:����,�Ǽ�,���� (�ѹ� ���� ������ ������Ÿ���� ���� �ٲ� �� ����)
		// ���� : byte(1byte �ִ� 127), short(2byte), (int)(4byte �ִ� 40��...), long(8byte), char
		// �Ǽ� : (float)(�Ҽ��� 6�ڸ�), (double)(�Ҽ��� 15�ڸ�), longdouble(�Ҽ��� 30�ڸ�)
		// ���� : char            () 3���� ���� ���� ����ϰ� �ȴ�.
		byte num1=127;  // ���� num�� ���� 10 �̴�.
		short num2=200;  // ������ ���� �ؿ� ������� �ߴµ� �ǹ̴� (�� ������ ����� ���� ����.)
		int num3=2323;
		long num4=234;
		
		// �Ǽ��� �Ҽ��� ���� 2������ ��ȯ�ϴ� �������� ������ �� �� �ִ�. ��Ȯ�� 99.9999% ��)�Ǽ�34 ���� = 34.00003(??)
		float fnum=3.14f;  // f�� ������ �ٿ��� �Ѵ�. �Ⱥ��̸� ���� (����� �� double�� �ٲ㼭 ����� �� �ٽ� float�� �ٲٱ� ���� fǥ���� ����)
		double dnum=12.345;
		
		char ch1='a';  // ''��������ǥ:����  ""ū����ǥ:���ڿ�
//		char ch2='ab';  // ���ڴ� ���� �ϳ���... ab�� ���ڰ� �ΰ��̹Ƿ� ���� ����(����)�� ���.
		
		boolean isTrue=false;  // true / false �� �ϳ� ���� �Լ�
		
		String word="�̼���";  // class(�⺻ ���� �ٸ���.) ����� ���� Ÿ��. ��ü�� ���� ���� �������� ��� ����
		
		// �簢���� ���̸� ���Ͻÿ� (�غ��� ���̴� ����)
		int bottom=15;
		int high=20;
		int area=bottom*high;
		System.out.println("�غ� : "+bottom+", ���� : "+high+", �簢���� ���� : "+area);
		
		// Ű���� 30���� �����ؾ� �Ѵ�. hp���̹�Ű������ ������ 8000��, �� ���� �ݾ���?
		int purchase=30;
		int keyboardPrise=8000;
		int allPrise=purchase*keyboardPrise;
		System.out.println("Ű���� ���� : "+keyboardPrise+", ���� ���� : "+purchase+", �� ���� �ݾ� : "+allPrise);
		

	}

}
