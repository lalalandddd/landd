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
// 제너릭으로 만들었으므로 형변환이 필요 없다.

//		FruitBox<Toy> toyBox=new FruitBox<>();
//		toyBox.setFruit(new Toy());
// 장난감은 과일이 아닌데도 들어간다???
// 특정 클래스(과일)만 사용할 제네릭이 필요하다! & 상속을 활용한다!
// Fruit 클래스 만들고, 상속을 하면 FruitBox는 과일 종류만 제네릭 할 수 있다! 장난감은 오류.
		Juice j=new Juice();
		j.makeJuice(appleBox);
		j.makeJuice(bananaBox);
		j.makeJuice(grapeBox);
		j.makeJuice(mangoBox);
		j.makeJuice(tomatoBox);

		A<String> a=new A<>();  // A클래스의 제너릭 타입 T에 String으로 지정 > item은 String 타입으로 사용된다.
		a.item="이순신";
		A<Integer> b=new A<>();  // A클래스의 제너릭 타입 T에 Integer으로 지정 > item은 Integer 타입으로 사용된다.
		b.item=233;

	}
}
// 한 이름에 다른 타입을 쓰려면 class를 따로 만들어야 했다.
class A<T> {  // 제네릭 타입을 쓰면 이렇게 끝난다.
	T item;  // 어떤 타입이 들어갈지는 위에서 정한다.
	void setItem(T item) {
		this.item=item;
	}
//	T[] arr=new T[3];  배열은 힙에 만들어짐, 그러려면 타입과 크기가 지정되어야 함. 제너릭은 타입을 안 정하므로 배열은 못 만듦
}
class B{  // 제네릭 타입을 안 쓰면 아래와 같이 해야 됨
	String item1;
	int item2;
	float item3;
	char item4;  // 변수 종류가 많으면 더 추가...
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
 - 클래스 내부의 타입을 지정하는 방법. 클래스의 양을 줄일 수 있게 해준다.
 - 하나의 클래스로 여러 종류의 변수를 사용할 수 있게 만들어준다.
 - 제너릭의 단어는 대소문자 무관, 글자수 무관, 한글은 안됨
 - 일반적으로 사용하는 제너릭 단어 5종
 - T(type), K(key), V(value), N(number), E(element)
 - 클래스에 제네릭 표현 방법 : class A<T>  (<> 꺽쇠 안에 제너릭 단어를 넣는다.)
 - 제네릭 타입은 클래스 타입만 지정할 수 있다. 클래스라면 제한 없이 가능하다.
 - 제네릭 타입 사용 클래스에 제한을 두는 방법 : class A<T extends Parent>
 	-> 부모 클래스와 자식 클래스만 제네릭 타입으로 지정할 수 있다.
 	-> 다중 타입으로 제한을 설정할 수 있다. : class A<T extends Parent1 & Parent2>
 	-> 인터페이스만 다중 타입 설정(다중 상속) 가능, 클래스는 무조건 1상속
 - 제네릭 와일드 카드 <?>
 	제네릭 타입의 한계를 보완하기 위해 사용하는 매개변수
 	메서드의 매개변수타입으로 제네릭 타입 표현되는 클래스를 사용한다면 
 	클래스에 표현된 제네릭이 제대로 표현되지 않기 때문에(클래스가 다름) 
 	다시 한 번 제네릭 지정을 해야 한다. 예외 없이 허용한고 해서 ?로 표현
 - 와일드 카드의 제한
 	<? extends T> : T 클래스와 그 자식까지 가능
 	<? super T> : T 클래스와 그 조상까지 가능(자식 안 됨)
 	제네릭에 제한을 걸고 와일드카드에 제한을 안 걸면 타입 차이로 오류가 발생할 수 있다
 	그래서 와일드카드는 제네릭과 같은 제한을 두는 게 좋다.
*/