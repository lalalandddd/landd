package java0717_1;

import java.util.ArrayList;

public class GenericStudy2 {

	public static void main(String[] args) {

		ArrayList<Book> book=new ArrayList<>();
		ArrayList<DVD> dvd=new ArrayList<>();
		book.add(new Book("��0023","�����ٶ󸶹ٻ��","�豹��"));
		book.add(new Book("��0854","�ڹٿ�������","�赿��"));
		book.add(new Book("��0052","�����������ӿ�ũ","�̻��"));
		book.add(new Book("H0227","HarryPotter","���طѸ�"));
		book.add(new Book("D0015","Dune","����ũ���Ʈ"));
		dvd.add(new DVD("0A2001","���ϸ�ǻ�","������"));
		dvd.add(new DVD("0D3301","��","��Ϻ�����"));
		dvd.add(new DVD("0L0172","���׸�","������"));
		dvd.add(new DVD("0��3175","�Ʊ��������","�˶�����"));
		dvd.add(new DVD("0��0027","�ǻǻ�","MBC"));
// �뿩�ϱ�
		Library lib=new Library();
		lib.addRental(book.get(1),"�̼���");
		lib.addRental(dvd.get(2),"������");
		lib.showRentalList();

//		Rental<DVD> rent=new Rental<>(dvd.get(0),"�̼���");
//		System.out.println(rent);
//		Rental<Book> rent1=new Rental<>(book.get(1),"������");
//		System.out.println(rent1);

	}
}
// ���׸� ǥ���� ������� ���� ��쵵 �غ���!
// ��� ��� �������̽��� �������� �Ѵ�.
// Library�� ���׸� �� �� ����� ���ʰ� ������ �װ� ��������...
// �̷��� Ŭ�������� �ٷ�� ���� �Ǿ�� ���⼭ �ڷḦ ���� �� ��� �� �ִ�.