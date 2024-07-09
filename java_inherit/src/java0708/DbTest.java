package java0708;

import java.util.Scanner;

public class DbTest {

	static Scanner scan=new Scanner(System.in);

	public static void main(String[] args) {

		Dao dao=new Dao();  // 데이터베이스에 저장 메서드(Dao) 실행
		System.out.print("1. 입력, 2. 출력 : ");
		int menu=scan.nextInt();
		Member[] list;  // Member class 타입 배열 주소를 저장할 참조변수
		
		switch(menu) {
			case 1:  // 데이터 입력
				System.out.print("학생 이름 : ");
				String name=scan.nextLine();
				System.out.print("국어 성적 : ");
				int kor=scan.nextInt();
				System.out.print("영어 성적 : ");
				int eng=scan.nextInt();
				System.out.print("수학 성적 : ");
				int mat=scan.nextInt();
				
				Member member=new Member(name,kor,eng,mat);
//				System.out.println(member);  // 중간 확인 [0, 이름, kor, eng, mat, 0, 0]
				total_avg(member);  // 총점, 평균 계산 및 저장 메서드 실행!
//				System.out.println(member);  // 중간 확인 [0, 이름, kor, eng, mat, total, std_avg]
				dao.insert(member);  // member 배열 데이터를 저장
				break;
			case 2:  // 데이터베이스의 데이터 전부 불러와서 출력
				list=dao.select();  // 데이터베이스의 데이터를 Member class 배열로 가져오기
				for(Member data:list) {
					System.out.println(data);
				}
				break;
		}

	}
	
	static void total_avg(Member m) {  // 총점, 평균 계산 및 저장 메서드
		int total=m.getKor()+m.getEng()+m.getMat();
		m.setTotal(total);
		m.setStd_avg(total/3);
	}
}
