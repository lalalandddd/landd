package test;

public class Lunch {
	private String menu;
	private int price;
	private String restaurant;
	
	public Lunch() {}  
// useBean�� �̰� �����´�. �Ʒ� ������ �޼��常 ������ ���������� ������ ������ ���.
// useBean�� ����Ϸ��� ������ �޼��带 �� �� ����ų�, ������ ���ƾ� �Ѵ�.
	public Lunch(String menu, int price, String restaurant) {
		this.menu=menu;
		this.price=price;
		this.restaurant=restaurant;
	}
	@Override
	public String toString() {
		return "���ɸ޴� : "+menu+" , ���� : "+price+" , �Ĵ� : "+restaurant;
	}
	public String getMenu() {
		return menu;
	}
	public void setMenu(String menu) {
		this.menu = menu;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getRestaurant() {
		return restaurant;
	}
	public void setRestaurant(String restaurant) {
		this.restaurant = restaurant;
	}
}
