package java0709;

import java.util.Scanner;

public class ObjectArray1 {
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {

// ��ȭ ���� 10�� �Է�, 
		Movie[] movie=new Movie[10];  // �迭 ����
		movie[0]=new Movie("���˵���","�� ����",18);  // ��ü ����
		movie[1]=new Movie("�λ��̵�ƿ�","��Ʈ ����",1);
		movie[2]=new Movie("�λ��̵�ƿ�2","�̽� ��",1);
		movie[3]=new Movie("Ż��","�� ����",12);
		movie[4]=new Movie("����","�� ����",18);
		movie[5]=new Movie("������ŷ","�� ����",12);
		movie[6]=new Movie("�Ĺ�","�� ����",15);
		movie[7]=new Movie("Ȥ��Ż��","���� ��",12);
		movie[8]=new Movie("�� ��Ʈ2","��� �����",12);
		movie[9]=new Movie("��Ǫ�Ҵ�4","����ũ ��ÿ",12);

		for(int i=0;i<movie.length;i++) {  // ��ü ���ǥ����� 1
			System.out.println(movie[i]);
		}
		for(Movie mv:movie) {  // ��ü ��� ǥ����� 2
			System.out.println(mv);
		}

	}
}
/* �迭�� ����
������Ÿ��[][][] ... ([]�� ����)���� �迭
������Ÿ��[] �������� = new ������Ÿ��[�迭ũ��]; (������ Ÿ������ �̷���� ����'��')
��) int a=10;  /  int[] a=new int[10];
int[] arr=new int[];  - int Ÿ���� ����(��ü) 10�� ���� (�����͸� ���� ������ �� ����)
Ŭ������ - Movie : Movie[] mvName=new Movie[10];  - MovieŬ������ �������� 10�� ����(��ü ����)(�����͸� ���� ������ �� ����)
mvName[0]=new Movie(); ~ mvName[9]=new Movie();  ���������� �� ��ü 10���� ���� ��������� �Ѵ�. (�翬�� �ݺ����̸� ����.)

*/