package java0717_1;

public class Rental<T extends Media> {
// ���׸� Ȱ��
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
		return "�뿩�� : "+renter+", "+item.toString();
	}
	public void setItem(T item) {
		this.item = item;
	}
	public void setRenter(String renter) {
		this.renter = renter;
	}

// �θ� Ȱ���ϸ�?
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

// ���׸� ǥ���� ���� �ʴ´ٸ�......
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
