package java0717_1;

import java.util.ArrayList;

public class GenericStudy2 {

	public static void main(String[] args) {

		ArrayList<Book> book=new ArrayList<>();
		ArrayList<DVD> dvd=new ArrayList<>();
		book.add(new Book("ㄱ0023","가나다라마바사아","김국어"));
		book.add(new Book("ㅈ0854","자바완전정복","김동형"));
		book.add(new Book("ㅅ0052","스프링프레임워크","이상민"));
		book.add(new Book("H0227","HarryPotter","조앤롤링"));
		book.add(new Book("D0015","Dune","프랭크허버트"));
		dvd.add(new DVD("0A2001","포켓몬실사","전형준"));
		dvd.add(new DVD("0D3301","듄","드니빌뇌브"));
		dvd.add(new DVD("0L0172","런닝맨","조동오"));
		dvd.add(new DVD("0아3175","아기상어극장판","알란포맨"));
		dvd.add(new DVD("0ㅂ0027","뽀뽀뽀","MBC"));
// 대여하기
		Library lib=new Library();
		lib.addRental(book.get(1),"이순신");
		lib.addRental(dvd.get(2),"김춘추");
		lib.showRentalList();

//		Rental<DVD> rent=new Rental<>(dvd.get(0),"이순신");
//		System.out.println(rent);
//		Rental<Book> rent1=new Rental<>(book.get(1),"김춘추");
//		System.out.println(rent1);

	}
}
// 제네릭 표현을 사용하지 않은 경우도 해보자!
// 상속 대신 인터페이스로 만들어봐야 한다.
// Library에 제네릭 안 쓸 경우의 기초가 있으니 그걸 응용하자...
// 이렇게 클래스들을 다루는 것이 되어야 여기서 자료를 빼는 걸 배울 수 있다.