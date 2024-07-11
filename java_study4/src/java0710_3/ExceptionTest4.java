package java0710_3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ExceptionTest4 {

	public static void main(String[] args) {

		// ���Ͽ� ����
//		BufferedWriter br=null;
//		try {
//			br=new BufferedWriter(new FileWriter("c:/test/data.txt"));
//			String name="�̼���";
//			br.write("�̼��� 34 ����"+name.substring(10));
//// ��������� �ϰ� �����ϸ� data.txt ������ ��������� ������ ������ ������ ���� �ʴ´�.
////			br.close();
//// ������ �ݾ���� data.txt ���� �ȿ� "�̼��� 34 ����" �� ����ȴ�.
//		}catch(Exception e) {
//			System.out.println("���� ����/���� ����!");
////			try {
////			br.close();  // ������ ���� ������ �ݾƾ� �Ѵ�.
////			}catch(IOException e1) {  // �ٵ� ������ �ȿ��� ���� �ֱ� ������ ����ó���� �� �ؾ� �Ѵ�.
////				System.out.println("���� �ݱ� ����!");
////			}
//		}finally {  // �׷��� ��¥�� �ݾƾ� �ϴ� ������ �ൿ�� �ִ´�.
//			try {
//				br.close();  // ������ ���� ������ �ݾƾ� �Ѵ�.
//				}catch(IOException e1) {
//					System.out.println("���� �ݱ� ����!");
//				}
//		}
		
		// ��ȯ ����� ���� �ʾƵ� �ڵ����� ��ȯ�Ǵ� ������ ���� ����
		try(BufferedReader br=new BufferedReader(new FileReader("c:/test/data.txt"))) {
			String text=br.readLine();
			System.out.println(text);
		}catch(Exception e) {
			System.out.println("���� ����/���� ����");
		}

	}
}
/*
���� ó�� - �ڵ��ڿ���ȯ
���� �б�, ���⸦ �Ϸ��� ������ ����� �Ѵ�. (�޸� ���� ���) ����� �������� ����� �ڿ��� �ݳ��ؾ� �Ѵ�.
�ݳ����� ������ �޸� ������ ������� �ʰ�, �̰��� ��ӵǸ� �ᱹ �ý��ۿ� ������ ����� �ȴ�.
���� �ݱ⸦ ����� �Ѵ�. �����ͺ��̽��� �����͸� �������ų� �����ߴٸ� �ݱ⸦ ����� �Ѵ�.
*/