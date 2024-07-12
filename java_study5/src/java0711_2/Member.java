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
	public boolean equals(Object o) {  // � �����ͷ� ���� ���ΰ�?
		Member tmp=(Member)o;  // member Ÿ������ o(�ּ�)�� ����
//		return this.name.equals(tmp.name);  // �̸� ��
//		return this.age==tmp.age;  // ���� ��
		boolean isSame=this.age==tmp.age;
		if(isSame)
			isSame=this.name.equals(tmp.name);
		if(isSame)
			isSame=this.birth.equals(tmp.birth);
//		if(isSame) // �� �̰� ������ ������ ������?
			return isSame; // �̸�, ����, ���� ��� ��ġ?
	}  // �̰� ������⿡ indexOf ���� �� �� �ִ�.
	@Override
	public int compareTo(Member o) {
//		return this.age - o.age;  // ���� �������� ����
//		return (this.age - o.age)*-1;  // ���� �������� ���� 1
//		return (o.age - this.age);  // ���� �������� ���� 2
//		return this.name.compareTo(o.name);  // �̸� �������� ����
//		return this.name.compareTo(o.name)*-1;  // �̸� �������� ����
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
