package homeproduct;

public abstract class House {  // �߻� Ŭ����
// �߻� �޼���(abstract)�� ������ ������ �߻� Ŭ�������� �Ѵ�.	
	protected boolean onOff;
	protected String brand;  // ��ǰ �귣���
	protected int price;  // ��ǰ ���Ű���
	protected int year;  // ���� �⵵
	protected House(){
		this.onOff=false;
	}
	protected House(String brand,int price){
		this.brand=brand;
		this.price=price;  // �Ű����� �ִ� �޼��带 ����� ���� ���� �������.
	}
	protected abstract void power();  // �߻� �޼���(���� ���� �޼���) = �߻� Ŭ�������� �Ѵ�.
//	void power() {  // �������̵� �Ǿ����Ƿ� �Ʒ� ������ �ʿ䰡 ����.
//		this.onOff=!this.onOff;  // ���� ������ �ڽ� Ŭ������ �ִ�.
//		System.out.println(this+"���� : "+this.onOff);
//	}

}
