package java0701;

import java.util.Arrays;
import java.util.Scanner;

public class StringMethod {

	static Scanner scan=new Scanner(System.in);

	public static void main(String[] args) {

	// �ڹٿ��� ���ڿ��� ����Ϸ��� String Ŭ������ ����ؾ� �Ѵ�.
	// String Ŭ������ ���������� char �⺻ ������ Ÿ���� �迭�� �����ǵ��� �Ǿ� �ִ�.
	// char Ÿ������ ������ �迭�� ���� �迭�� ������ �Ѵ�. (�߰� ����)
	// ���α׷����� ���Ǵ� �������� 70% ������ ���ڿ� �������̴�.
	// �׷��� ���ڿ� ���� �޼���� �ݵ�� ������ �Ѵ�.
		
	// ���ڿ� �����͸� �����ϴ� ���
		String word="i like banana";
		System.out.println(word);
//	// ���ڿ� �� - ���� ���ڿ��ΰ�?  equals
//		System.out.println("equals : "+(word.equals("i like banana")));
//		System.out.println("equals : "+(word.equals("i like orange")));
//	// ���ڿ� ���� ����  indexOf
//		System.out.println("indexOf : "+word.indexOf("orange"));
//		System.out.println("indexOf : "+word.indexOf("banana"));
//	// ���ڿ� ��ġ��  '+'
//		System.out.println(word+" ��ġ��");
//		System.out.println(word.concat("��ġ�� "));
//	// Ư�� ���� �Ǵ� ���ڿ� ��ġ ã��  indexOf(��) / lastIndexOf(��)
//		System.out.println(word.indexOf('b'));
//		System.out.println(word.indexOf('a'));
//		System.out.println(word.lastIndexOf('a'));
//	// ���ڿ����� Ư�� ���� ����  charAt
//		System.out.println(word.charAt(5));
//	// Ű����� ���� �Է� �ޱ�  nextLine
//		System.out.print("���ĺ� �ϳ� �Է� : ");
//		char alp=scan.nextLine().charAt(0);
//		System.out.println("�Է��� ���� : "+alp);
//		char ch1=65;
//		System.out.println(ch1);
//		char ch2='A';
//		System.out.println(ch2);
//		System.out.println(ch1+4);
//		char ch3='��';
//		System.out.println(ch3);
//		System.out.println(ch3+4);
//	// ���ڿ��� ����  length()
//		System.out.println("���ڿ� ���ڼ� : "+word.length());
//	// ���ڿ��� ��/�ҹ��� ��ȯ  toUpperCase(), toLowerCase()
//		String �빮��=word.toUpperCase();
//		String �ҹ���=word.toLowerCase();
//		System.out.println(�빮��);
//		System.out.println(�ҹ���);
//	// ���� ���� - �� ���� ���� ����  trim()
//		String word2="  i hate java  ";
//		System.out.println(word2);
//		System.out.println(word2.trim());
//	// ���ڿ� ����  split()
//		System.out.println(Arrays.toString(word.split(" ")));
//		String name="�̼���@������@������@";
//		String[] names=name.split("@");
//		System.out.println(names[1]);
//		System.out.println(Arrays.toString(names));
//	// ���ڿ� �ڸ���(����)  substring()
//		System.out.println(word.substring(0));
//		System.out.println(word.substring(2));
//		System.out.println(word.substring(6));
//		System.out.println(word.substring(2,6));
//	// ���ڿ� ��ȯ  replace, replaceAll
//		String �ǻǻ�="�ƺ��� ����Ҷ� �ǻǻ� ������ �Ⱦ��൵ �ǻǻ� ������ �ݰ��ٰ� �ǻǻ� ������� �Ǹ����� �ǻǻ�";
//		String ����=�ǻǻ�.replace("�ǻǻ�","�׻׻�");
//		System.out.println(����);
//		����=����.replaceAll("�׻׻�", "�ѿ��");
//		System.out.println(����);
	// replaceAll������ ����ǥ���� ��� ����
	/* ����ǥ���� =
		^ - ���ڿ��� ����
		$ - ���ڿ��� ����
		. - ������ �� ����
		* - �� ���ڰ� �ְų� ���ų� (*�� : ���� ������ �ܾ�)
		+ - �� ���ڰ� �ϳ� �̻�
		? - �� ���ڰ� ���ų� �ϳ� ����
		[] - ������ �����̳� ����
		{} - Ƚ�� �Ǵ� ����
		() - �Ұ�ȣ�� ���ڸ� �ϳ��� ���ڷ� �ν�
		| - ���� �ȿ��� or ���� ����
		\s - ���� ����
		\S - ���� ���ڰ� �ƴ� ������ ����
		\w - ���ĺ��̳� ����
		\W - ���ĺ��̳� ���ڸ� ������ ����
		\d - ����
		\D - ���ڸ� ������ ��� ����    \�� Ư�������̹Ƿ� \�ڿ� ��� �Ѵ�.
		���ڿ����� ���ڸ� ���� [0-9] �Ǵ� [\\d]
		���ڿ����� �ѱ۸� ���� [��-�H]
		��ȭ��ȣ 
	*/
//		String aa="abcd1234efgh5678ij90";
//		System.out.println(aa.replaceAll("[0-9]",""));  // [0-9] ���ڸ� �����Ѵ�.
//		System.out.println(aa.replaceAll("[\\d]",""));  // \d ���ڸ� �����Ѵ�.
//		System.out.println(aa.replaceAll("[\\D]",""));  // \D ���ڸ� ������ ���ڸ� �����Ѵ�.
		
		// 206�� ���� Ǯ���
		String str="�� �̸��� [ȫ�浿]�Դϴ�. ���̴� [15]�� �Դϴ�";
		String name;
		int age;
		name=str.substring(str.indexOf('[')+1,str.indexOf(']'));
		String temp=str.substring(str.lastIndexOf('[')+1,str.lastIndexOf(']'));
		age=Integer.parseInt(temp);
		System.out.println(name);  // ȫ�浿
		System.out.println(age);   // 15

	}

}
