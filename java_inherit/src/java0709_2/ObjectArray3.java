package java0709_2;

import java.util.Scanner;

public class ObjectArray3 {
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
// �Է��� ��ü�� �߿��� ������ �ɰ� �ʿ��� ��ü�� ����ϰڴ�...
		BoardDao dao=new BoardDao();
		Board[] list=dao.findByAll();
		for(Board board:list) {  // title�� Ư�� ���ڳ� ���ڿ� ���� �˻�
			if(board.getTitle().contains("��")) {
				System.out.println(board);
			}
		}
		System.out.println("");
		for(Board board:list) {  // hit���� 150 �̻� ���
			if(board.getHit()>=150) {
				System.out.println(board);
			}
		}
		System.out.println("");
		for(Board board:list) {  // ����ġ ���� ���� ���븸 ���
			if(board.getWriter().contains("����ġ")) {
				System.out.println(board);
			}
		}
		System.out.println("");
		for(Board board:list) {  // title�� 10�� �̻� ���
			if(board.getTitle().length()>=10) {
				System.out.println(board);
			}
		}
		System.out.println("");
		for(Board board:list) {  // title�� writer�� ���
			System.out.println(board.getTitle()+" : "+board.getWriter());
		}
		// title�� 10�� ������ title�� writer�� ���
		System.out.println("");
		for(Board board:list) {
			if(board.getTitle().length()<=10) {
				System.out.println(board.getTitle()+" : "+board.getWriter());
			}
		}
		System.out.println("");
		// hit���� 1000 �̻��̸� hot �迭�� ����
		Board[] hot=new Board[list.length];
		int i=0;
		for(Board board:list) {
			if(board.getHit()>=1000) {
				hot[i]=board;
				i++;
			}
		}
		for(Board data:hot) {
			if(data==null) break;
			System.out.println(data);
		}
		System.out.println("");
		// write�� '��'�� ���Ե� ��ü�� �����Ͽ� sin �迭�� ���� �� ����ϼ���
		Board[] sin=new Board[list.length];
		int j=0;
		for(Board board:list) {
			if(board.getWriter().contains("��")) {
				sin[j]=board;
				j++;
			}
		}
		for(Board data:sin) {
			if(data==null) break;
			System.out.println(data);
		}

	}
}
