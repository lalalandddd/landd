package homeproduct;

import java.sql.Date;

public class MainClass {

	public static void main(String[] args) {

		Tv tv=new Tv();
		tv.brand="�Ｚ";
		tv.power();
		tv.power();
		Aircon aircon=new Aircon();
		System.out.println(tv.brand);
		System.out.println(aircon.brand);
		aircon.power();
		aircon.power();
		Computer com=new Computer();
		com.power();
		com.power();

	}

}

// Ŭ���� ���
// ����Ϸ��� (�ڽ�Ŭ���� �̸�) �ڿ� extends (�θ�Ŭ���� �̸�)
// �ڽ�Ŭ������ �θ�Ŭ������ �޼��嵵 ����� �� �ְ� �ȴ�.
// ��) Tv extends House : �ڽ�Ŭ����(Tv)�� �θ�Ŭ����(House) �޼��带 ���
// class �� �������� �޼��尡 �־�� ����ϴ� �ǹ̰� �ִ�.
// ����� ���� : ������(�ڵ� ���� ���� �ڵ� ���� �ٰ�� ���� �̾߱�)
// ������ : �ϳ��� Ÿ������ �ٸ� ���� Ÿ���� ����/����ϱ� ����
//        �θ� Ŭ������ �ν��Ͻ� ����, �ν��Ͻ� �޼���, Ŭ���� ����, Ŭ���� �޼��� ��� ��� ����
//        �Ϻ� ������� ���ϴ� ���� �ִ�. ������(static, public ������� �� �� ��)
//        ���̵��� �����Ƿ� �������� ��� ���� ��)toString
