package java0703;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class JavaMethod2 {

	public static void main(String[] args) {

		Member member1=new Member("�̼���",31,"�ر��屳");
		Member member2=new Member("������",29,"�������");
		Member member3=new Member("�念��",45,"��������");
		// �¾ �⵵�� ����ϼ��� (���ش� 2024��)
		Date today=new Date();
		System.out.println(today);
		System.out.println(today.getYear()+1900);  // ��ǻ���� ��¥�� 1900���� ����... 124�� 124+1900=2024�� ���Ѵ�.
		System.out.printf("%4s ���� %2d�� �¾ �⵵ : %4d��\n",member1.name,member1.age,(today.getYear()+1900-member1.age));
		System.out.printf("%4s ���� %2d�� �¾ �⵵ : %4d��\n",member2.name,member2.age,(today.getYear()+1900-member2.age));
		System.out.printf("%4s ���� %2d�� �¾ �⵵ : %4d��\n",member3.name,member3.age,(today.getYear()+1900-member3.age));

		Calendar cal=Calendar.getInstance();
		int year=cal.get(Calendar.YEAR);  // ��
		int month=cal.get(Calendar.MONTH)+1;  // ��... �ε� +1�� �ؾ� �Ѵ�.
		int day=cal.get(Calendar.DAY_OF_MONTH);  // ��
		int week=cal.get(Calendar.DAY_OF_WEEK);  // ���� 1��,2ȭ,3��,4��,5��,6��,7��
		System.out.println(year+","+month+","+day+","+week+","+today);

//		LocalDate today1=LocalDate.now();  // void birthYear �޼���� �̵�
//		System.out.println(today1.getMonthValue());  // Data�� ����, LocalDate�� ��
//		int nowYear=today.getYear();  // void birthYear �޼���� �̵�
//		int birthYear1=nowYear-member1.age+1900;  // void birthYear �޼���� �̵�
//		System.out.printf("%4s ���� %2d�� �¾ �⵵ : %4d��\n",member1.name,member1.age,birthYear1);  // void birthYear �޼���� �̵�
		
		// �¾ �⵵
		member1.birthYear();
		member2.birthYear();
		member3.birthYear();
		
		// ���ɴ밡??? 20��? 30��? 40��? 50��?
		DataIdenti dataIdenti=new DataIdenti();  // ��ü�� ������ �޼��带 ����� �� �ִ�.
//		dataIdenti.ageGroup("������",27);  // ������ : 20��  �̻� ����
		dataIdenti.ageGroup(member1.name,member1.age);
		dataIdenti.ageGroup(member2.name,member2.age);
		dataIdenti.ageGroup(member3.name,member3.age);
		dataIdenti.jobClass(member1.name,member1.job);
		dataIdenti.jobClass(member2.name,member2.job);
		dataIdenti.jobClass(member3.name,member3.job);
		
		// ���� �з� - ���� ���� �з��� ���� ǥ��
		// ��� ���� - �ر��屳:05.���� ��������:15.��� �������:18.����
		
		
	}

}

class Member{  // �� Ŭ������ static ���θ� ����� �� �ִ�....
	String name;  // �̸�
	int age;  // ����
	String job;  // ����
	Member(){}  // �⺻ ������ �޼��� - �̰� �־�� �۵��Ѵ�!!
	Member(String name, int age, String job){  // �� �� �۵� �޼���
		this.name=name;
		this.age=age;
		this.job=job;
	}
	// �¾ �⵵�� �������� ����ϴ� �޼���
	void birthYear() {  // member ������ Member ���� �����;� ������ ���� �ʴ´�. �ٵ� �̷��� ������ ������ �߹Ƿ�
		LocalDate today=LocalDate.now();
		int nowYear=today.getYear();
		int birthYear=nowYear-this.age;  // ������ member1�� this�� �ٲ۴�.
		System.out.printf("%4s ���� %2d�� �¾ �⵵ : %4d��\n",this.name,this.age,birthYear);
	}
}
// �ڹٴ� �� �ϵ� class�� ���� �ؾ� �Ѵ�.
// ��Ʈ�� �� class(Controller), ��������� ���� class(Service), ������ class(DTO(VO)) ���...
// 
class DataIdenti{  // ���ɴ�, ���� �з� ��� ������ �з��� ���� Ŭ����
	void ageGroup(String name, int age) {
		String group=null;
		group=age/10+"0��";
		System.out.println(name+" : "+group);
	}
	void jobClass(String name, String job) {  // ��� ���� - �ر��屳:05.���� ��������:15.��� �������:18.����
		String jobClass=null;
		switch (job) {
		case "�ر��屳" : jobClass="05.����"; break;
		case "��������" : jobClass="15.���"; break;
		case "�������" : jobClass="18.����"; break;
		}
//		if(job=="�ر��屳")jobClass="05.����";
//		if(job=="��������")jobClass="15.���";
//		if(job=="�������")jobClass="18.����";
		System.out.println(name+" : "+jobClass);
	}
}

// �޼��峪 �Լ��� ����ϴ� ���� : 
// �迭, ���, �ܼ��� ��� - �ݺ��� ���
// �޼��带 ����ϸ� �ڵ��� ����, ��������, �������� ��������.
// �޼��带 ����ϸ� ����ȭ �� ���α׷����� �����ϴ�.