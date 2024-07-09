package java0709_2;

import java.util.Scanner;

public class ObjectArray3 {
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
// 입력한 객체들 중에서 조건을 걸고 필요한 객체만 사용하겠다...
		BoardDao dao=new BoardDao();
		Board[] list=dao.findByAll();
		for(Board board:list) {  // title에 특정 문자나 문자열 포함 검색
			if(board.getTitle().contains("윤")) {
				System.out.println(board);
			}
		}
		System.out.println("");
		for(Board board:list) {  // hit값이 150 이상만 출력
			if(board.getHit()>=150) {
				System.out.println(board);
			}
		}
		System.out.println("");
		for(Board board:list) {  // 김정치 기자 취재 내용만 출력
			if(board.getWriter().contains("김정치")) {
				System.out.println(board);
			}
		}
		System.out.println("");
		for(Board board:list) {  // title이 10자 이상만 출력
			if(board.getTitle().length()>=10) {
				System.out.println(board);
			}
		}
		System.out.println("");
		for(Board board:list) {  // title과 writer만 출력
			System.out.println(board.getTitle()+" : "+board.getWriter());
		}
		// title이 10자 이하인 title과 writer만 출력
		System.out.println("");
		for(Board board:list) {
			if(board.getTitle().length()<=10) {
				System.out.println(board.getTitle()+" : "+board.getWriter());
			}
		}
		System.out.println("");
		// hit값이 1000 이상이면 hot 배열에 저장
		Board[] hot=new Board[list.length];
		int i=0;
		for(Board board:list) {
			if(board.getHit()>=1000) {
				hot[i]=board;
				i++;
			}
		}
		for(Board data:hot) {
			if(data==null) break;
			System.out.println(data);
		}
		System.out.println("");
		// write에 '정'이 포함된 객체만 추출하여 sin 배열에 저장 후 출력하세요
		Board[] sin=new Board[list.length];
		int j=0;
		for(Board board:list) {
			if(board.getWriter().contains("정")) {
				sin[j]=board;
				j++;
			}
		}
		for(Board data:sin) {
			if(data==null) break;
			System.out.println(data);
		}

	}
}
