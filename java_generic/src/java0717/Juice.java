package java0717;

public class Juice {
//	public void makeJuice(FruitBox<Apple> box) {
//	}
//	public void makeJuice(FruitBox<Banana> box) {
//	}  오버로딩이 안 된다. 매개변수 타입이 FruitBox로 같기 때문
// 바나나, 애플은 FruitBox 내부 변수이지 매개변수가 아니다.
	public void makeJuice(FruitBox<? extends Fruit> box) {
	}  // 부모만 넣으면 오류가 안 사라진다.  ? 넣으면 오류가 사라진다
// 여기서 ?(와일드카드: 뭐든 다 허용) = 과일들(Apple, Banana, Grape 등)
// 클래스 명에 제네릭이 없으므로 매개변수에서 제네릭 표현을 한 번 더 써야 한다.
// 제네릭에 제한이 있다면 와일드카드에도 제한을 거는 게 좋다.
}
