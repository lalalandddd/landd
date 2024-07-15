package java0715_1;

import java.util.Scanner;
import java.util.Stack;

public class StackStudy {

	public static void main(String[] args) {

//		Stack<String> st=new Stack<>();
//		st.add("이순신");  // 데이터 저장
//		st.push("강감찬");  // stack 전용 데이터 저장
//		st.push("김유신");
//		st.push("김춘추");
//		st.push("장보고");
//		st.push("김종서");
//		st.push("양만춘");
//		System.out.println(st);  // 출력 결과는 배열로 보임
//		System.out.println(st.pop());  // 양만춘 출력, stack에서 제거
//		System.out.println(st);  // 양만춘 제외 출력
//		System.out.println(st.search("김춘추"));  // 3번에 있음
//		System.out.println(st.size());  // 현재 크기 6(0~5)
//		System.out.println(st.pop());  // 김종서 출력, stack에서 제거
//		System.out.println(st.pop());  // 장보고 출력, stack에서 제거
//		System.out.println(st.pop());  // 김춘추 출력, stack에서 제거
//		System.out.println(st.pop());  // 김유신 출력, stack에서 제거
//		System.out.println(st);  // 이순신, 강감찬 출력
//		System.out.println(st.isEmpty());  // 비운다.

		Stack<String> pre=new Stack<>();
		Stack<String> back=new Stack<>();
		String now="네이버";
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.print("이동페이지 입력(1.뒤 2.앞) : ");
			String temp=sc.nextLine();
			if(temp.equals("1")&&!back.isEmpty()) {  // 이전페이지 이동
				pre.push(now);  // 현재 페이지는 pre 목록에 저장
				now=back.pop();  // 이전 페이지를 가져온다
			}else if(temp.equals("2")&&!pre.isEmpty()) {  // 앞페이지 이동
				back.push(now);
				now=pre.pop();
			}else if(temp.equals("1")||temp.equals("2")) {  // 새 페이지 이동
				// 뒤가 없을 때 뒤로 가기, 앞이 없을 때 앞으로 가기...이므로 아무것도 하지 않는다.
			}else {
				back.push(now);  // 이전 페이지를 back 페이지에 저장
				pre.clear();  // 새페이지 가면서 pre 페이지는 모두 제거
				now=temp;  // 지금 페이지가 현재 페이지
			}
			System.out.println("현재 페이지 : "+now);
			System.out.println("back 페이지 목록 : "+back);
			System.out.println("pre 페이지 목록 : "+pre);
		}

	}
}
/*
데이터를 저장하기 위한 입구와 출력하기 위한 출구가 같다.
한 곳을 통해 저장과 출력이 이루어지는 구조이다.
FILO, First In Last Out
처음 들어온 데이터가 가장 나중에 나가고 마지막에 들어온 데이터가 먼저 나간다.
주로 계산 작업/최근방문페이지(되돌아가기)/Alt+Tab/내비게이션 길찾기 등에 활용된다.
예) 7+8+2+10 > 7넣음, 8넣음, 8빼감, 7빼감, 계산15, 15넣음
2 넣음, 2빼감, 15빼감, 계산17, 17넣음, 10넣음, 10빼감, 17빼감, 계산 27, 출력

*/