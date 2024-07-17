package java0717_1;

public class Rental<T extends Media> {
// 제네릭 활용
	private T item;
	private String renter;
	public Rental(T item, String renter){
		this.item=item;
		this.renter=renter;
	}
	public T getItem(){
		return item;
	}
	public String getRenter(){
		return this.renter;
	}
	@Override
	public String toString() {
		return "대여자 : "+renter+", "+item.toString();
	}
	public void setItem(T item) {
		this.item = item;
	}
	public void setRenter(String renter) {
		this.renter = renter;
	}

// 부모 활용하면?
//	Media item;
//	Rental(Media item){
//		this.item=item;
//	}
//	Media getItem(){
//		return this.item;
//	}
//	@Override
//	public String toString() {
//		return item.toString();
//	}

// 제네릭 표현을 하지 않는다면......
//	Book book;
//	DVD dvd;
//	Rental(Book book){
//		this.book=book;
//	}
//	Rental(DVD dvd){
//		this.dvd=dvd;
//	}
//	void getBook(){
//		
//	}
//	void getDVD(){
//		
//	}
//	@Override
//	public String toString() {
//		if() {}
//	}

}
