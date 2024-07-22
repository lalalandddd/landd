package GameCharList;

public class CharEquip extends CharReinforce{
	private String charEquipMain;
	private String charEquipSub;
	public CharEquip(String id, String name, int charPow, String charEquipMain, String charEquipSub) {
		super(id,name,charPow);
		this.charEquipMain=charEquipMain;
		this.charEquipSub=charEquipSub;
	}
	@Override
	public String toString() {
		return "주장비: "+charEquipMain+" , 보조장비: "+charEquipSub+" , 전투력: "+super.toString();
	}
	public String getCharEquipMain() {
		return charEquipMain;
	}
	public void setCharEquipMain(String charEquipMain) {
		charEquipMain = charEquipMain;
	}
	public String getCharEquipSub() {
		return charEquipSub;
	}
	public void setCharEquipSub(String charEquipSub) {
		charEquipSub = charEquipSub;
	}
}
