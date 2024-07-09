package java0709_3;

//class RestCustomer{  // ���忡 ã�ƿ��� �մ�
//	String customer;  //  ���� �մ�
//	public void setCustomer(String customer) {
//		this.customer=customer;
//	}
//}
//class ReservCustomerA extends RestCustomer{}  // ����մ� A
//class ReservCustomerB extends RestCustomer{}  // ����մ� B
//class Owner{  // ����
//	void food(ReservCustomerA cusA) {
//		System.out.println(cusA.customer+" û���� �ش�.");
//	}
//	void food(ReservCustomerB cusB) {
//		System.out.println(cusB.customer+" ������ �ش�.");
//	}
//}
// �� ��° ���� �մ��� �߰��Ǹ� ����մ�C class, ���� void, ��� �׸��� �߰��Ǿ�� �Ѵ�... �̸� �����ϰ� �ϸ�?

// �� �޼��� �� ���յ��� ���� �Ͽ� ������ �߻��ϸ� �ϳ��� �޼��� �ȿ��� �ذ��� �����ϵ��� �ؾ� �Ѵ�.
interface RestCustomer{
	public void setCustomer(String customer);  // �߻�޼���
	public String food();
}
class ReservCustomerA implements RestCustomer{  // ���� class�� Ȱ���ϸ� �߰������� ���� ��, �� �κи� �߰��ϸ� �ȴ�.
	String customer;  //  ���� �մ�A
	@Override
	public void setCustomer(String customer) {
		this.customer=customer;
	}
	@Override
	public String food() {
		return customer+" û���� �ش�.";
	}
}  // ����մ�A
class ReservCustomerB implements RestCustomer{
	String customer;  //  ���� �մ�B
	@Override
	public void setCustomer(String customer) {
		this.customer=customer;
	}
	@Override
	public String food() {
		return customer+" ������ �ش�.";
	}
}  // ����մ�B
class Owner{  // ����
	void food(RestCustomer cus) {
		System.out.println(cus.food());
	}  // interface ����ϸ� �� �κ��� �̷��Ը� �صΰ� �߰��� ���� class�� ������ �ȴ�.
}
public class Interface_test1 {

	public static void main(String[] args) {
		
		Owner open=new Owner();
		ReservCustomerA a=new ReservCustomerA();
		ReservCustomerB b=new ReservCustomerB();
		a.setCustomer("A-�̼���");
		b.setCustomer("B-�庸��");
		open.food(a);
		open.food(b);
	}
}

// �ʵ��л�, ���л�, ����л�, ���л�?
// �θ� Ŭ������ �л�(������)
// �̸�, ��, Ű, �г�, ��ȣ, ���� ����� class�� interface�� ���� ��� �л��� ����� �� �ִ�. - ������
// ��ȣ��, �˻�, �ҹ��, �ǻ�, ��ȭ��  >  �θ�class  �̸�, ����, �ٹ���, ����, ����....

// �ܼ� ������ �� ���� �޼��尡 ����? interface�� �� �ʿ䰡 ����. ��Ӱ��踦 ���� �ʴ´�.
// ��Ӱ���(interface)�� �����Ϳ� ���ؼ� �����͸� �����ϴ� ����� �־�� �����ϴ�.

// ����� ��û ó�� class - ��Ʈ�� class
// ����� ��û�� �ʿ��� �����͸� ���� �� �����Ͽ� �����ϴ� class - ���� class
// �����͸� �����ϴ� class - ����ڿ��� ������ ������ class(VO,DTO) / �����ͺ��̽��� �����ϱ� ���� class(Entity)
// �����ͺ��̽� ó�� �������̽� - repository
