package java0717_1;

import java.util.ArrayList;
import java.util.List;

public class Library {  // ���׸� Ÿ�� ǥ�� ����
	private List<Rental<? extends Media>> list=new ArrayList<>();
	public <T extends Media> void addRental(T item, String renter) {
// �޼��忡���� ���׸� ����� �� ǥ�� ���
		Rental<T> rental=new Rental<>(item,renter);
		list.add(rental);
		System.out.println("�뿩-> "+renter);
	}
	public void showRentalList() {
		for(Rental<? extends Media> r:list) {
			System.out.println(r);
		}
	}
}
