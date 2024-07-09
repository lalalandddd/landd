package java0708;

import java.util.Scanner;

public class DbTest {

	static Scanner scan=new Scanner(System.in);

	public static void main(String[] args) {

		Dao dao=new Dao();  // �����ͺ��̽��� ���� �޼���(Dao) ����
		System.out.print("1. �Է�, 2. ��� : ");
		int menu=scan.nextInt();
		Member[] list;  // Member class Ÿ�� �迭 �ּҸ� ������ ��������
		
		switch(menu) {
			case 1:  // ������ �Է�
				System.out.print("�л� �̸� : ");
				String name=scan.nextLine();
				System.out.print("���� ���� : ");
				int kor=scan.nextInt();
				System.out.print("���� ���� : ");
				int eng=scan.nextInt();
				System.out.print("���� ���� : ");
				int mat=scan.nextInt();
				
				Member member=new Member(name,kor,eng,mat);
//				System.out.println(member);  // �߰� Ȯ�� [0, �̸�, kor, eng, mat, 0, 0]
				total_avg(member);  // ����, ��� ��� �� ���� �޼��� ����!
//				System.out.println(member);  // �߰� Ȯ�� [0, �̸�, kor, eng, mat, total, std_avg]
				dao.insert(member);  // member �迭 �����͸� ����
				break;
			case 2:  // �����ͺ��̽��� ������ ���� �ҷ��ͼ� ���
				list=dao.select();  // �����ͺ��̽��� �����͸� Member class �迭�� ��������
				for(Member data:list) {
					System.out.println(data);
				}
				break;
		}

	}
	
	static void total_avg(Member m) {  // ����, ��� ��� �� ���� �޼���
		int total=m.getKor()+m.getEng()+m.getMat();
		m.setTotal(total);
		m.setStd_avg(total/3);
	}
}
