package java0711_2;

import java.util.Comparator;

public class Member implements Comparable<Member>{
	private String name;
	private int age;
	private String birth;

	public Member(String name, int age, String birth) {
		this.name=name;
		this.age=age;
		this.birth=birth;
	}

	@Override
	public String toString() {
		return name+", "+age+", "+birth;
	}
	@Override
	public boolean equals(Object o) {  // 어떤 데이터로 비교할 것인가?
		Member tmp=(Member)o;  // member 타입으로 o(주소)를 저장
//		return this.name.equals(tmp.name);  // 이름 비교
//		return this.age==tmp.age;  // 나이 비교
		boolean isSame=this.age==tmp.age;
		if(isSame)
			isSame=this.name.equals(tmp.name);
		if(isSame)
			isSame=this.birth.equals(tmp.birth);
//		if(isSame) // 왜 이게 있으면 문제가 생기지?
			return isSame; // 이름, 나이, 생일 모두 일치?
	}  // 이걸 만들었기에 indexOf 등을 쓸 수 있다.
	@Override
	public int compareTo(Member o) {
//		return this.age - o.age;  // 나이 오름차순 정렬
//		return (this.age - o.age)*-1;  // 나이 내림차순 정렬 1
//		return (o.age - this.age);  // 나이 내림차순 정렬 2
//		return this.name.compareTo(o.name);  // 이름 오름차순 정렬
//		return this.name.compareTo(o.name)*-1;  // 이름 내림차순 정렬
		int age=this.age-o.age;
		if(age==0)age=this.name.compareTo(o.name)*-1;
		return age;
//		int age=Integer.compare(this.age,o.age);
//		if(age!=0) {
//			return age;
//		}
//		return this.name.compareTo(o.name)*-1;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
}
