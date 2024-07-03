package java0703;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class JavaMethod2 {

	public static void main(String[] args) {

		Member member1=new Member("이순신",31,"해군장교");
		Member member2=new Member("문익점",29,"농업학자");
		Member member3=new Member("장영실",45,"기계공학자");
		// 태어난 년도를 출력하세요 (올해는 2024년)
		Date today=new Date();
		System.out.println(today);
		System.out.println(today.getYear()+1900);  // 컴퓨터의 날짜는 1900부터 시작... 124는 124+1900=2024를 뜻한다.
		System.out.printf("%4s 나이 %2d세 태어난 년도 : %4d년\n",member1.name,member1.age,(today.getYear()+1900-member1.age));
		System.out.printf("%4s 나이 %2d세 태어난 년도 : %4d년\n",member2.name,member2.age,(today.getYear()+1900-member2.age));
		System.out.printf("%4s 나이 %2d세 태어난 년도 : %4d년\n",member3.name,member3.age,(today.getYear()+1900-member3.age));

		Calendar cal=Calendar.getInstance();
		int year=cal.get(Calendar.YEAR);  // 년
		int month=cal.get(Calendar.MONTH)+1;  // 월... 인데 +1을 해야 한다.
		int day=cal.get(Calendar.DAY_OF_MONTH);  // 일
		int week=cal.get(Calendar.DAY_OF_WEEK);  // 요일 1월,2화,3수,4목,5금,6토,7일
		System.out.println(year+","+month+","+day+","+week+","+today);

//		LocalDate today1=LocalDate.now();  // void birthYear 메서드로 이동
//		System.out.println(today1.getMonthValue());  // Data는 못씀, LocalDate는 씀
//		int nowYear=today.getYear();  // void birthYear 메서드로 이동
//		int birthYear1=nowYear-member1.age+1900;  // void birthYear 메서드로 이동
//		System.out.printf("%4s 나이 %2d세 태어난 년도 : %4d년\n",member1.name,member1.age,birthYear1);  // void birthYear 메서드로 이동
		
		// 태어난 년도
		member1.birthYear();
		member2.birthYear();
		member3.birthYear();
		
		// 연령대가??? 20대? 30대? 40대? 50대?
		DataIdenti dataIdenti=new DataIdenti();  // 객체를 만들어야 메서드를 사용할 수 있다.
//		dataIdenti.ageGroup("김유신",27);  // 김유신 : 20대  이상 없음
		dataIdenti.ageGroup(member1.name,member1.age);
		dataIdenti.ageGroup(member2.name,member2.age);
		dataIdenti.ageGroup(member3.name,member3.age);
		dataIdenti.jobClass(member1.name,member1.job);
		dataIdenti.jobClass(member2.name,member2.job);
		dataIdenti.jobClass(member3.name,member3.job);
		
		// 직업 분류 - 국가 직무 분류에 따라 표기
		// 출력 내용 - 해군장교:05.국방 기계공학자:15.기계 농업학자:18.섬유
		
		
	}

}

class Member{  // 이 클래스는 static 으로만 사용할 수 있다....
	String name;  // 이름
	int age;  // 나이
	String job;  // 직업
	Member(){}  // 기본 생성자 메서드 - 이게 있어야 작동한다!!
	Member(String name, int age, String job){  // 값 별 작동 메서드
		this.name=name;
		this.age=age;
		this.job=job;
	}
	// 태어난 년도가 언제인지 출력하는 메서드
	void birthYear() {  // member 변수를 Member 에서 가져와야 오류가 뜨지 않는다. 근데 이러면 위에서 오류가 뜨므로
		LocalDate today=LocalDate.now();
		int nowYear=today.getYear();
		int birthYear=nowYear-this.age;  // 여기의 member1을 this로 바꾼다.
		System.out.printf("%4s 나이 %2d세 태어난 년도 : %4d년\n",this.name,this.age,birthYear);
	}
}
// 자바는 뭘 하든 class를 만들어서 해야 한다.
// 컨트롤 용 class(Controller), 실제기능의 동작 class(Service), 데이터 class(DTO(VO)) 등등...
// 
class DataIdenti{  // 연령대, 직업 분류 등등 데이터 분류를 위한 클래스
	void ageGroup(String name, int age) {
		String group=null;
		group=age/10+"0대";
		System.out.println(name+" : "+group);
	}
	void jobClass(String name, String job) {  // 출력 내용 - 해군장교:05.국방 기계공학자:15.기계 농업학자:18.섬유
		String jobClass=null;
		switch (job) {
		case "해군장교" : jobClass="05.국방"; break;
		case "기계공학자" : jobClass="15.기계"; break;
		case "농업학자" : jobClass="18.섬유"; break;
		}
//		if(job=="해군장교")jobClass="05.국방";
//		if(job=="기계공학자")jobClass="15.기계";
//		if(job=="농업학자")jobClass="18.섬유";
		System.out.println(name+" : "+jobClass);
	}
}

// 메서드나 함수를 사용하는 이유 : 
// 배열, 계산, 단순한 출력 - 반복문 사용
// 메서드를 사용하면 코드의 재사용, 유지보수, 가독성이 좋아진다.
// 메서드를 사용하면 구조화 된 프로그래밍이 가능하다.