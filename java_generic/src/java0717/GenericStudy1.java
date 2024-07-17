package java0717;

public class GenericStudy1 {

	public static void main(String[] args) {
		FruitBox<Apple> appleBox=new FruitBox<>();
		appleBox.setFruit(new Apple());
		FruitBox<Banana> bananaBox=new FruitBox<>();
		bananaBox.setFruit(new Banana());
		FruitBox<Grape> grapeBox=new FruitBox<>();
		grapeBox.setFruit(new Grape());
		FruitBox<Mango> mangoBox=new FruitBox<>();
		mangoBox.setFruit(new Mango());
		FruitBox<Tomato> tomatoBox=new FruitBox<>();
		tomatoBox.setFruit(new Tomato());

		Apple apple=appleBox.getFruit();
// Apple apple=(Apple)appleBox.getFruit();
// ���ʸ����� ��������Ƿ� ����ȯ�� �ʿ� ����.

//		FruitBox<Toy> toyBox=new FruitBox<>();
//		toyBox.setFruit(new Toy());
// �峭���� ������ �ƴѵ��� ����???
// Ư�� Ŭ����(����)�� ����� ���׸��� �ʿ��ϴ�! & ����� Ȱ���Ѵ�!
// Fruit Ŭ���� �����, ����� �ϸ� FruitBox�� ���� ������ ���׸� �� �� �ִ�! �峭���� ����.
		Juice j=new Juice();
		j.makeJuice(appleBox);
		j.makeJuice(bananaBox);
		j.makeJuice(grapeBox);
		j.makeJuice(mangoBox);
		j.makeJuice(tomatoBox);

		A<String> a=new A<>();  // AŬ������ ���ʸ� Ÿ�� T�� String���� ���� > item�� String Ÿ������ ���ȴ�.
		a.item="�̼���";
		A<Integer> b=new A<>();  // AŬ������ ���ʸ� Ÿ�� T�� Integer���� ���� > item�� Integer Ÿ������ ���ȴ�.
		b.item=233;

	}
}
// �� �̸��� �ٸ� Ÿ���� ������ class�� ���� ������ �ߴ�.
class A<T> {  // ���׸� Ÿ���� ���� �̷��� ������.
	T item;  // � Ÿ���� ������ ������ ���Ѵ�.
	void setItem(T item) {
		this.item=item;
	}
//	T[] arr=new T[3];  �迭�� ���� �������, �׷����� Ÿ�԰� ũ�Ⱑ �����Ǿ�� ��. ���ʸ��� Ÿ���� �� ���ϹǷ� �迭�� �� ����
}
class B{  // ���׸� Ÿ���� �� ���� �Ʒ��� ���� �ؾ� ��
	String item1;
	int item2;
	float item3;
	char item4;  // ���� ������ ������ �� �߰�...
	void setItem(String item) {
		this.item1=item;
	}
	void setItem(int item) {
		this.item2=item;
	}
	void setItem(float item) {
		this.item3=item;
	}
	void setItem(char item) {
		this.item4=item;
	}
}

/*
generic
 - Ŭ���� ������ Ÿ���� �����ϴ� ���. Ŭ������ ���� ���� �� �ְ� ���ش�.
 - �ϳ��� Ŭ������ ���� ������ ������ ����� �� �ְ� ������ش�.
 - ���ʸ��� �ܾ�� ��ҹ��� ����, ���ڼ� ����, �ѱ��� �ȵ�
 - �Ϲ������� ����ϴ� ���ʸ� �ܾ� 5��
 - T(type), K(key), V(value), N(number), E(element)
 - Ŭ������ ���׸� ǥ�� ��� : class A<T>  (<> ���� �ȿ� ���ʸ� �ܾ �ִ´�.)
 - ���׸� Ÿ���� Ŭ���� Ÿ�Ը� ������ �� �ִ�. Ŭ������� ���� ���� �����ϴ�.
 - ���׸� Ÿ�� ��� Ŭ������ ������ �δ� ��� : class A<T extends Parent>
 	-> �θ� Ŭ������ �ڽ� Ŭ������ ���׸� Ÿ������ ������ �� �ִ�.
 	-> ���� Ÿ������ ������ ������ �� �ִ�. : class A<T extends Parent1 & Parent2>
 	-> �������̽��� ���� Ÿ�� ����(���� ���) ����, Ŭ������ ������ 1���
 - ���׸� ���ϵ� ī�� <?>
 	���׸� Ÿ���� �Ѱ踦 �����ϱ� ���� ����ϴ� �Ű�����
 	�޼����� �Ű�����Ÿ������ ���׸� Ÿ�� ǥ���Ǵ� Ŭ������ ����Ѵٸ� 
 	Ŭ������ ǥ���� ���׸��� ����� ǥ������ �ʱ� ������(Ŭ������ �ٸ�) 
 	�ٽ� �� �� ���׸� ������ �ؾ� �Ѵ�. ���� ���� ����Ѱ� �ؼ� ?�� ǥ��
 - ���ϵ� ī���� ����
 	<? extends T> : T Ŭ������ �� �ڽı��� ����
 	<? super T> : T Ŭ������ �� ������� ����(�ڽ� �� ��)
 	���׸��� ������ �ɰ� ���ϵ�ī�忡 ������ �� �ɸ� Ÿ�� ���̷� ������ �߻��� �� �ִ�
 	�׷��� ���ϵ�ī��� ���׸��� ���� ������ �δ� �� ����.
*/