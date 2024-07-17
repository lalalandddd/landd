package Java0717me;

import java.util.ArrayList;

public class Mall {

	public static void main(String[] args) {

		ArrayList<Electronics> elec=new ArrayList<>();
		ArrayList<Clothing> clt=new ArrayList<>();
		elec.add(new Electronics("E12001","≥√¿Â∞Ì",1702000,"ªÔº∫"));
		elec.add(new Electronics("E24075","√ªº“±‚",800000,"¥Ÿ¿ÃΩº"));
		clt.add(new Clothing("C12032","πŸ¡ˆ",30000,"L"));
		clt.add(new Clothing("C33960","Tº≈√˜",30000,"XL"));
//		Electronics elec=new Electronics("E12001","≥√¿Â∞Ì",1702000,"ªÔº∫");
//		Clothing clt=new Clothing("C12032","πŸ¡ˆ",30000,"L");

		ShoppingCart shop=new ShoppingCart();
		shop.addCart(elec.get(0),3);  // πËø≠¿Ã æ∆¥œ∏È (elec,3) ¿∏∑Œ ≤˝
		shop.addCart(clt.get(1),2);
		shop.showCart();

	}
}
