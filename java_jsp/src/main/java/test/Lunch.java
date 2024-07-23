package test;

public class Lunch {
	private String menu;
	private int price;
	private String restaurant;
	
	public Lunch() {}  
// useBean은 이걸 가져온다. 아래 생성자 메서드만 있으면 못가져오기 때문에 오류가 뜬다.
// useBean을 사용하려면 생성자 메서드를 둘 다 만들거나, 만들지 말아야 한다.
	public Lunch(String menu, int price, String restaurant) {
		this.menu=menu;
		this.price=price;
		this.restaurant=restaurant;
	}
	@Override
	public String toString() {
		return "점심메뉴 : "+menu+" , 가격 : "+price+" , 식당 : "+restaurant;
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
