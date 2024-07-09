package java0709;

import java.util.Scanner;

public class ObjectArray1 {
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {

// 영화 정보 10개 입력, 
		Movie[] movie=new Movie[10];  // 배열 생성
		movie[0]=new Movie("범죄도시","강 윤성",18);  // 객체 저장
		movie[1]=new Movie("인사이드아웃","피트 닥터",1);
		movie[2]=new Movie("인사이드아웃2","켈시 만",1);
		movie[3]=new Movie("탈주","이 종필",12);
		movie[4]=new Movie("레옹","뤽 베송",18);
		movie[5]=new Movie("하이재킹","김 성한",12);
		movie[6]=new Movie("파묘","장 재현",15);
		movie[7]=new Movie("혹성탈출","웨스 볼",12);
		movie[8]=new Movie("듄 파트2","드니 뷜뇌브",12);
		movie[9]=new Movie("쿵푸팬더4","마이크 미첼",12);

		for(int i=0;i<movie.length;i++) {  // 객체 출력표현방식 1
			System.out.println(movie[i]);
		}
		for(Movie mv:movie) {  // 객체 출력 표현방식 2
			System.out.println(mv);
		}

	}
}
/* 배열의 생성
데이터타입[][][] ... ([]의 숫자)차원 배열
데이터타입[] 참조변수 = new 데이터타입[배열크기]; (데이터 타입으로 이루어진 공간'들')
예) int a=10;  /  int[] a=new int[10];
int[] arr=new int[];  - int 타입의 공간(객체) 10개 생성 (데이터를 직접 저장할 수 있음)
클래스명 - Movie : Movie[] mvName=new Movie[10];  - Movie클래스의 참조변수 10개 생성(객체 없음)(데이터를 직접 저장할 수 없음)
mvName[0]=new Movie(); ~ mvName[9]=new Movie();  참조변수에 들어갈 객체 10개를 각각 설정해줘야 한다. (당연히 반복문이면 쉽다.)

*/