package java0710_3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ExceptionTest4 {

	public static void main(String[] args) {

		// 파일에 쓰기
//		BufferedWriter br=null;
//		try {
//			br=new BufferedWriter(new FileWriter("c:/test/data.txt"));
//			String name="이순신";
//			br.write("이순신 34 군인"+name.substring(10));
//// 여기까지만 하고 실행하면 data.txt 파일이 만들어지고 문제는 없지만 저장은 되지 않는다.
////			br.close();
//// 파일을 닫아줘야 data.txt 파일 안에 "이순신 34 군인" 이 저장된다.
//		}catch(Exception e) {
//			System.out.println("파일 열기/쓰기 실패!");
////			try {
////			br.close();  // 오류가 떠도 파일은 닫아야 한다.
////			}catch(IOException e1) {  // 근데 파일이 안열릴 수도 있기 때문에 예외처리를 또 해야 한다.
////				System.out.println("파일 닫기 실패!");
////			}
//		}finally {  // 그래서 어짜피 닫아야 하니 마지막 행동에 넣는다.
//			try {
//				br.close();  // 오류가 떠도 파일은 닫아야 한다.
//				}catch(IOException e1) {
//					System.out.println("파일 닫기 실패!");
//				}
//		}
		
		// 반환 명령을 넣지 않아도 자동으로 반환되는 형태의 파일 열기
		try(BufferedReader br=new BufferedReader(new FileReader("c:/test/data.txt"))) {
			String text=br.readLine();
			System.out.println(text);
		}catch(Exception e) {
			System.out.println("파일 열기/쓰기 실패");
		}

	}
}
/*
예외 처리 - 자동자원반환
파일 읽기, 쓰기를 하려면 파일을 열어야 한다. (메모리 공간 사용) 사용이 끝났으면 사용한 자원을 반납해야 한다.
반납하지 않으면 메모리 공간이 비워지지 않고, 이것이 계속되면 결국 시스템에 문제가 생기게 된다.
파일 닫기를 해줘야 한다. 데이터베이스에 데이터를 가져오거나 저장했다면 닫기를 해줘야 한다.
*/