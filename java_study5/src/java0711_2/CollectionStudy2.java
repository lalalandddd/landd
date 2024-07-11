package java0711_2;

import java.util.ArrayList;

public class CollectionStudy2 {

	public static void main(String[] args) {

		ArrayList<Member> list=new ArrayList<>();
		list.add(new Member("이순신",25,"19990405"));
		list.add(new Member("장보고",35,"19891218"));
		list.add(new Member("양만춘",31,"19930131"));
		list.add(new Member("김유신",26,"19980909"));
		list.add(new Member("아자개",29,"19950412"));
		list.add(new Member("김장해",38,"19861027"));
// toString 오버라이드 했기 때문에 주소가 아니라 데이터가 정상적으로 출력된다.
		System.out.println(list);
		for(Member m:list) {
			if(m.getAge()>=30) {  // 30세 이상만 출력
				System.out.print(m);
				System.out.println(m.getName());  // 이름만 출력
			}
		}
		System.out.println("1995년 이후 태어난 사람만 출력");
		for(Member m:list) {
			String a=m.getBirth().substring(0,4);
			int year=Integer.parseInt(a);
			if(year>1995)System.out.println(m);
		}
		System.out.println("8~11월에 태어난 사람만 출력");
		for(Member m:list) {
			String a=m.getBirth().substring(4,6);
			int month=Integer.parseInt(a);
			if(month>7&&month<12)System.out.println(m);
		}
		list.add(2,new Member("장영실",34,""));
		System.out.println(list);
		System.out.println("생년월일이 없는 사람에게 년도를 넣고 0월0일로 저장");
		for(Member m:list) {
			if(m.getBirth().isBlank()) {
				int year=2024-m.getAge();
				m.setBirth(year+"0000");
			}
		}
		System.out.println(list);
		System.out.println(list.get(2));
		
	}
}
