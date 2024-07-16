package Service;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

import DAO.CoffeDAO;
import DAO.TeaDAO;
import DTO.Coffe;
import DTO.Tea;

public class SelectDrink implements Kiosk{

	private HashMap<Integer,Coffe> coffe;
	private HashMap<Integer,Tea> tea;
	public SelectDrink() {  // 생성자 메서드
		
	}

	@Override
	public void action() {
		Scanner scan=new Scanner(System.in);
		while(true) {
			System.out.print("1. 커피  2. 티 : ");
			int category=scan.nextInt();
			switch(category) {
				case 0: System.out.println("다음에 만나요"); return;
				case 1: selectCoffe(); break;
				case 2: selectTea(); break;
				default: System.out.println("다시 입력하세요");
			}
		} // while(true) 괄호 end
	}
	private void selectCoffe() {
		CoffeDAO dao=new CoffeDAO();
		coffe=dao.findAll();
		Set<Integer> ids=coffe.keySet();
		for(Integer id:ids) {
			System.out.println(id+". "+coffe.get(id));
		}
		Scanner sc=new Scanner(System.in);
		System.out.print("메뉴 선택 : ");
		int menu=sc.nextInt();
		Kiosk order=new Order(coffe.get(menu));
		order.action();
	}
	private void selectTea() {
		TeaDAO dao=new TeaDAO();
		tea=dao.findAll();
		Set<Integer> ids=tea.keySet();
//		for(Integer id:ids) {
//			System.out.println(id+". "+tea.get(id));
//		}
		tea.forEach((k,v)->System.out.println(k+". "+v));  // 위 세 줄과 동일 효과
		Scanner sc=new Scanner(System.in);
		System.out.print("메뉴 선택 : ");
		int menu=sc.nextInt();
		if(tea.get(menu)==null) return;  // 메뉴 번호가 아닐 경우 되돌리기
		Kiosk order=new Order(tea.get(menu));
		order.action();
		
	}  // findAll 메서드를 따로 만들어야 한다. 반납되는 타입이 다르기 때문
}
