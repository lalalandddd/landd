package Java0717me;

import java.util.ArrayList;

public class Mall {

	public static void main(String[] args) {

		ArrayList<Electronics> elec=new ArrayList<>();
		ArrayList<Clothing> clt=new ArrayList<>();
		elec.add(new Electronics("E12001","�����",1702000,"�Ｚ"));
		elec.add(new Electronics("E24075","û�ұ�",800000,"���̽�"));
		clt.add(new Clothing("C12032","����",30000,"L"));
		clt.add(new Clothing("C33960","T����",30000,"XL"));
//		Electronics elec=new Electronics("E12001","�����",1702000,"�Ｚ");
//		Clothing clt=new Clothing("C12032","����",30000,"L");

		ShoppingCart shop=new ShoppingCart();
		shop.addCart(elec.get(0),3);  // �迭�� �ƴϸ� (elec,3) ���� ��
		shop.addCart(clt.get(1),2);
		shop.showCart();

	}
}
