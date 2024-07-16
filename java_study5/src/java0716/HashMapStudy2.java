package java0716;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class HashMapStudy2 {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		HashMap<String,ImageBoard> board=new HashMap<>();
		ImageBoard temp=new ImageBoard("�ڹټ�ġ","javava","��ġ.jpg");
		board.put(temp.getTitle(),temp);
		temp=new ImageBoard("mysql��ġ���","��ġ�λ�","mysql��ġ.jpg");
		board.put(temp.getTitle(),temp);
		temp=new ImageBoard("lotto����","������³�","�鸸�����.jpg");
		board.put(temp.getTitle(),temp);
		temp=new ImageBoard("�����ӱ�","����������","��ȥ��������.jpg");
		board.put(temp.getTitle(),temp);
		temp=new ImageBoard("mysql��ġ���2","��ġ�λ�","mysql��ġ2.jpg");
		board.put(temp.getTitle(),temp);
		System.out.println(board);
		System.out.println(board.get("�ڹټ�ġ"));
// �̹��� �Խ����� �� ������ ����ϰ�,
// ���� ���� ���� ������ �Է��ϸ� �ش� ���� ������ �� �� �ִ�.
		Set<String> titles=board.keySet();  // title�� ��Ƽ� set ��ȯ
		System.out.println(titles);
		System.out.println("=== �̹��� �Խ��� ��� ===");
		titles.forEach(title->System.out.println(title));
		System.out.println("�� ���� �Է� : ");
		String inputTitle=scan.nextLine();
		System.out.println(board.get(inputTitle));

	}
}
