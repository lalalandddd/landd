package java0703;

public class JavaMethod4 {

	public static void main(String[] args) {
		
//	// �޼��带 ���ؼ� ���� 10�� �޾� ����ϱ�
//		ReturnMth rt=new ReturnMth();
//		int num=rt.get();
//		System.out.println(num);
		
//	// �޼��带 ���ؼ� �� ������ ���� ����� �޾Ƽ� ����ϱ�
//		Return1 rt=new Return1();
//		int num1=rt.plus();
//		int num2=rt.minus();
//		int num3=rt.times();
//		int num4=rt.div();
//		int num5=rt.rest();
//		System.out.printf("���ϱ� : %d\n���� : %d\n���ϱ� : %d\n������ : %d\n������ : %d",num1,num2,num3,num4,num5);
		
//	// ������ ����ǥ�� �� �ڵ带 �ۼ��Ͽ� �̸��� ���̰� ��µǰ� �����
//		// ? userName = ?;
//		Return2 rt=new Return2();
//		String userName=rt.getName();
//		int age=34;
//		System.out.println(userName+" "+age);
		
//	// ����(89), ����(78), ����(94) �� ������ ������ ���ϴ� �޼���, ����� ���ϴ� �޼���, ������ ����� ����ϼ���.
//		int kor=89, eng=78, mat=94;
//		Total tot=new Total();
//		Avg avg=new Avg();
//		int a=tot.total(kor,eng,mat);
//		float b=avg.avg(kor,eng,mat);
//		System.out.printf("���� : %d��\n���� : %d��\n���� : %d��\n���� : %d��\n��� : %.1f��",kor,eng,mat,a,b);
		
		/* ������ ����
		�ֻ��� ����
		j���ذ� s�����̰� �ֻ��� ������ �Ѵ�. �ֻ����� 6�� 1����. �ֻ����� ���� ū ���� �̱��.
		�ֻ����� ���� ���ϴ� �޼���, �ֻ����� ���� ���Ͽ� ���� �̰���� ����ϴ� �޼��� �� ���� �����.
		 */

	}
}
//// ����, ����, ���� �� ������ ������ ���ϴ� �޼���, ����� ���ϴ� �޼���, ������ ����� ����ϼ���.
//class Total{
//	int total(int a,int b,int c) {
//		int total=a+b+c;
//		return total;
//	}
//}
//class Avg{
//	float avg(int a, int b, int c) {
//		float avg=(a+b+c)/3f;
//		return avg;
//	}
//}

////������ ����ǥ�� �� �ڵ带 �ۼ��Ͽ� �̸��� ���̰� ��µǰ� �����
//class Return2{
//	String getName() {
//		String Name="�̼���";
//		return Name;
//	}
//}

////�޼��带 ���ؼ� �� ������ ���� ����� �޾Ƽ� ����ϱ�
//class Return1{
//	int num1=45, num2=10;
//	int plus=num1+num2;
//	int minus=num1-num2;
//	int times=num1*num2;
//	int div=num1/num2;
//	int rest=num1%num2;
//	int plus() {return plus;}
//	int minus() {return minus;}
//	int times() {return times;}
//	int div() {return div;}
//	int rest() {return rest;}
//}

////�޼��带 ���ؼ� ���� 10�� �޾� ����ϱ�
//class ReturnMth{
//	int a=10;
//	int get() {
//		return a;
//	}
//}