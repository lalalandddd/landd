package Java0717me;

public class CartItem<T extends Product> {
	private T product;
	private int quantity;
	public CartItem(T product, int quantity) {
		this.product=product;
		this.quantity=quantity;
	}
	@Override
	public String toString() {
		return product+" 구매수량 : "+quantity;
	}
	public T getProduct() {
		return this.product;
	}
	public void setProduct(T product) {
		this.product = product;
	}
	public int getQuantity() {
		return this.quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}
