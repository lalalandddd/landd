package java0717;

public class Juice {
//	public void makeJuice(FruitBox<Apple> box) {
//	}
//	public void makeJuice(FruitBox<Banana> box) {
//	}  �����ε��� �� �ȴ�. �Ű����� Ÿ���� FruitBox�� ���� ����
// �ٳ���, ������ FruitBox ���� �������� �Ű������� �ƴϴ�.
	public void makeJuice(FruitBox<? extends Fruit> box) {
	}  // �θ� ������ ������ �� �������.  ? ������ ������ �������
// ���⼭ ?(���ϵ�ī��: ���� �� ���) = ���ϵ�(Apple, Banana, Grape ��)
// Ŭ���� �� ���׸��� �����Ƿ� �Ű��������� ���׸� ǥ���� �� �� �� ��� �Ѵ�.
// ���׸��� ������ �ִٸ� ���ϵ�ī�忡�� ������ �Ŵ� �� ����.
}
