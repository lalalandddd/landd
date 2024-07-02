package java0702_2;

import java.util.Arrays;
import java.util.Scanner;

public class ClassObject {

	static Scanner scan=new Scanner(System.in);

	public static void main(String[] args) {

//		System.out.println(Car.maker2);  // Ŭ���� �����̱� ������ �ٷ� ����� �� �ִ�.
//		// System.out.println(Car.maker1);  // maker1 ������ ���� �������� �ʾ����Ƿ� ����� �� ����.
//		Car car1;
//		// car1.fuelType="�ֹ���";  // ������ �������� �ʾ����Ƿ� ����� �� ����.
//		car1=new Car();  // carName, ��ⷮ, fuelType ���� ����
//		car1.carName="�Ÿ";
//		car1.fuelType="�ֹ���";
//		System.out.print(car1.maker1+car1.carName+car1.fuelType+car1.��ⷮ);
//		// �ٵ� ������ �ϳ��� �����͸� �־�� �ؼ� �����ϴ�...???
//		
//		Car car2=new Car("�׷���",3000,"�ֹ���");  // �Ʒ����� Car �Ű������� ������⿡ ������ ���� �����͸� ���� �� �ִ�.
		
		// ���Ҽ� �۰����� ������ ������ �Ҽ� �� Ƚ���� ���� ����Ʈ���� ������ ������ �� �ִ� Ŭ������ �����ϰ� ������ �Է� �� ����Ͻÿ�
		// (�Ű����� �ִ� ������ �޼���� �� �� �̻� ������ ��)
		// ������(�̸�, ����Ʈ, ����) : (��ǿ�,4580,4.3)(�����,3485,4.1)(�����,90930,2.7)(������,19200,3.1)
		Webnovel novel1=new Webnovel("��ǿ�",4580,4.3f);
		Webnovel novel2=new Webnovel("�����",3485,4.1f);
		Webnovel novel3=new Webnovel("�����",90930,2.7f);
		Webnovel novel4=new Webnovel("������",19200,3.1f);
		System.out.print("�۰��̸� �� Ƚ�� ����\n");
		System.out.println(" "+novel1);
		System.out.println(" "+novel2);
		System.out.println(" "+novel3);
		System.out.println(" "+novel4);

	}

}
class Webnovel{
	String name;  // �̸� - �ν��Ͻ� ���� (����)
	int point;  // ����Ʈ���� - �ν��Ͻ� ���� (����)
	float grade;  // ���� - �ν��Ͻ� ���� (�Ǽ�)
	Webnovel(){}
	Webnovel(String name,int point, float grade){
		this.name=name;
		this.point=point;
		this.grade=grade;
	}
	public String toString() { // public ��ȯŸ�� to��ȯŸ��(){��� ����(���ڿ�)}
		return name+" "+point+"�� "+grade;
	};
}

// class ���ο� ����Ǵ� ����(�Ǵ� �迭)�� �� ������ �ִ�.
// class ����(������� scanner�� ����), instance ����(ó�� ��� ������ ��� �ν��Ͻ��̴�.)
// class ������ static�� �����.
// instance ������ class ��ü ���� �� �޸𸮰� �Ҵ�ȴ�. class ��ü �ȿ����� ����ؾ� �Ѵ�. (�ڹٽ�ũ��Ʈ�� �������� let�� ���� �뵵)
// class ������ new �����ڸ� ���ؼ� ��ü�� �����Ѵ�.
// class ������ ���α׷� ������ �� �޸𸮿� �ε��ϸ鼭 �����ȴ�. �� class ��ü�� ����⵵ ���� �̹� �� �� �ִ�.
// ��� class ������ ��𼭵� ����� �� �ִ�. (���� �ڿ�)

//class Car{
//	String maker1="����";  // �ν��Ͻ� ����
//	String carName;  // �ν��Ͻ� ����
//	int ��ⷮ;  // �ν��Ͻ� ����
//	String fuelType;  // �ν��Ͻ� ����
//	static String maker2="���";  // Ŭ���� ����  car class�� maker2 ���� ������ ���� ����. �� ������ �����ϸ鼭 �����ȴ�.
	
	// ������ �޼��� - ��ü(�ν��Ͻ�)������ ������ ��, ������ �ʱ�ȭ���ִ� �޼���
	// ������ �޼����� ���� - �ν��Ͻ� ������ �ʱⰪ ����. �ƹ��͵� ������ �ٷ� ���� �ʱⰪ�� ����.
	// ������ �޼���� return�� �������� �ʾƼ� return Ÿ�� ������ �� �Ǳ� ������ return; �� ���� ���� ����(����)�� �����.

	// �����ε� - �ϳ��� �޼��� �̸����� ���� �޼��带 ����� ��. (�ڹٽ�ũ��Ʈ���� ���� �̸��� ���� �޼���� ������ ������.)
	// (�� : print() - �Ǽ�, ����, ���� ��� ��µǴµ� �� �Ű����� Ÿ���� ��� �޼��尡 print()�� �����ε� �Ǿ� �ֱ� �����̴�.
	// �����ε� ���� ���� 1. ���� Ŭ���������� ���� / 2. �޼����� �̸��� ���� / 3. �Ű������� Ÿ���� �޶�� ��
	//   ���� : �Ű������� ���ڰ� �ٸ���(O), �Ű������� �����ص� Ÿ���� �ٸ���(O), �Ű����� ����, Ÿ�� �����ص� �Ű����� ���ڰ� �ٸ���(O)
	//   ��� : �Ű������� ���� ����, �Ű����� Ÿ�� ����, �Ű����� �̸� ����....�ؾ߸� �����ε��� �� �ȴ�.
	// �����ε��� �󸶳� �� Ȱ���ϴ��Ŀ� ���� ������ �� �ִ� ������ �о�����.
//	Car(){
//		fuelType="�ֹ���";  // new �����ڷ� ��ü�� �����ϸ� ���� ������ �ֹ����� ����ȴ�. ���߿� ���� ����... �� �ʱⰪ ����?
//	}
//	Car(String name,int cc,String fuel){
//		this.carName=name;
//		��ⷮ=cc;
//		this.fuelType=fuel;
//	}
//	Car(String fuel){
//		this.fuelType=fuel;
//	}
//	// Car(String fuel){this.fuelType="����";}  // fuel ���� �Ű������� String ���� Ÿ���̹Ƿ� ������ ���.
//	Car(String fuel, String fuels){this.fuelType="����";this.fuelType="�⸧";}  // �Ű����� ���� �ٸ��Ƿ� ������ �ƴϴ�.
//	
//	// Car(String fuel, String fuels){this.fuelType="����";this.fuelType="�⸧";}  // �Ű����� Ÿ���� ������ 
//	// Car(String fuels, String fuel){this.fuelType="����";this.fuelType="�⸧";}  // ������ �޶� ������.
//	
//	Car(String fuel, int fuels){this.fuelType="����";this.fuelType="�⸧";}  // �Ű����� Ÿ���� �ٸ��Ƿ�
//	Car(int fuels, String fuel){this.fuelType="�⸧";this.fuelType="����";}  // ������ �ٲ� ������ �ƴϴ�.
//	
//}  // ���� class ������ ���� �����͸� ������ �� ����.

// Ŭ���� �� Car, �ν��Ͻ� ���� name, String, null ���赵�� �ָ�...
// Car(){String name=null;} �̶� ����� ���;� �Ѵ�.
