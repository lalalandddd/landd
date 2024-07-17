package Java0717me;

public class Electronics extends Product{
	private String brand;
	public Electronics(String id, String name, int price, String brand) {
		super(id,name,price);
		this.brand=brand;
	}
	@Override
	public String toString() {
		return super.toString()+" , ºê·£µå : "+brand;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}

}
