package java0712;

import java.util.ArrayList;

import java0711_2.Member;

public class ArrayListStudy2 {

	public static void main(String[] args) {

		ArrayList<Asset> list=new ArrayList<>();
		list.add(new Asset("우리은행", 3450000, "1004-91-123455", "이순신"));
		list.add(new Asset("농협", 513350, "34-123-34939", "김유신"));
		list.add(new Asset("신한은행", 891003, "394-3412-2323", "박팽년"));
		list.add(new Asset("국민은행", 899900, "39-2384-19939", "최무선"));
		list.add(new Asset("우리은행", 28300, "1002-93-878888", "문익점"));
		list.add(new Asset("신한은행", 98000, "293-0123-1234", "이율곡"));
		list.add(new Asset("우리은행", 1920000, "1006-23-123456", "김시민"));
		list.add(new Asset("국민은행", 932000, "23-2555-29991", "이율곡"));
		System.out.println(list);
		System.out.println("\n문1 ====우리은행을 이용하는 사람들 정보====");
		for(Asset a:list) {
			if(a.getBank().equals("우리은행")) {
				System.out.print(a);
				System.out.print(a.getHolder());
			}
		}
		System.out.println("\n문2 ====잔액이 100만원 이상인 사람들 정보만 출력====");
//		for(Asset a:list) {  // 방법1
//			if(a.getBalance()>=1000000) {
//				System.out.println(a);
//				System.out.println(a.getHolder());
//			}
//		}
		list.forEach(a->{  // 방법2
			if(a.getBalance()>=1000000) {
				System.out.println(a);
				System.out.println(a.getHolder());
		}
		});
		System.out.println("\n문3-1 ====최무선이 우리은행 계좌 있는지 확인====");
		System.out.println("문3-2 ====없으면 계좌 개설(1007-23-128954)====");
		System.out.println("문3 ====당연히 잔액은 0원====");
//		// 나의 방법
//		int b=0;
//		for(Asset a:list) {
//			if(a.getHolder().equals("최무선")&&a.getBank().equals("우리은행")) b++;
//		}
//		if(b!=0) {
//			System.out.println("계좌있다");
//		}else {
//			System.out.println("계좌없다. 계좌를 개설한다!");
//			list.add(new Asset("우리은행",0,"1007-23-128954","최무선"));
//		}
//		list.forEach(a->System.out.println(a));
		// 선생님 방법  - 자식클래스에 public boolean equals(Object o) 만들기
		Asset asset=new Asset("우리은행",0,"1007-23-128954","최무선");
		if(!list.contains(asset)) {
			list.add(asset);
		}
		list.forEach(a->System.out.println(a));

	}
}
/* Asset에 처음 넣은 것은 수정하지 말고 필요하면 메소드와 변수를 추가만 할 것
일단 자료 입력
우리은행, 1004-91-123455, 이순신, 3450000
농협, 34-123-349393, 김유신, 513350
신한은항, 394-3412-2323, 박팽년, 891003
국민은행, 39-2384-19939, 최무선, 899900
우리은행, 1002-93-878888, 문익점, 28300
신한은행, 293-0123-1234, 이율곡, 98000
우리은행, 1006-23-123456, 김시민, 1920000
국민은행, 23-2555-29991, 이율곡, 932000
문제 1 우리은행을 이용하는 사람들 정보만 출력
문제 2 잔액이 100만원 이상인 사람들 정보만 출력
문제 3 최무선이 우리은행 계좌를 가지고 있는지 확인하고 없으면 우리은행 계좌 개설
  최무선 우리은행 계좌 (1007-23-128954) 당연히 잔액 0원
*/