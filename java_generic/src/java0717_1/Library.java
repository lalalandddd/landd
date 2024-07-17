package java0717_1;

import java.util.ArrayList;
import java.util.List;

public class Library {  // 제네릭 타입 표시 안함
	private List<Rental<? extends Media>> list=new ArrayList<>();
	public <T extends Media> void addRental(T item, String renter) {
// 메서드에서만 제네릭 사용할 때 표시 방법
		Rental<T> rental=new Rental<>(item,renter);
		list.add(rental);
		System.out.println("대여-> "+renter);
	}
	public void showRentalList() {
		for(Rental<? extends Media> r:list) {
			System.out.println(r);
		}
	}
}
