package Java0717me;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	private List<CartItem<? extends Product>> list=new ArrayList<>();
	public <T extends Product> void addCart(T product, int quantity) {
		CartItem<T> cartItem=new CartItem<>(product,quantity);
		list.add(cartItem);
		System.out.println("판매수량 : "+quantity);
	}
	public void showCart() {
		for(CartItem<? extends Product> l:list) {
			System.out.println(l);
		}
	}
}
