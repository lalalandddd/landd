package GameCharList;

public class CharStat extends CharReinforce{
	private int charStatFire;
	private int charStatHelt;
	private int charStatHeal;
	public CharStat(String id, String name, int charPow, int charStatFire, int charStatHelt, int charStatHeal) {
		super(id,name,charPow);
		this.charStatFire=charStatFire;
		this.charStatHelt=charStatHelt;
		this.charStatHeal=charStatHeal;
	}
	@Override
	public String toString() {
		return super.toString()+" 사격: "+charStatFire+" , 체력: "+charStatHelt+" , 회복: "+charStatHeal;
	}
	public int getCharStatFire() {
		return charStatFire;
	}
	public void setCharStatFire(int charStatFire) {
		charStatFire = charStatFire;
	}
	public int getCharStatHelt() {
		return charStatHelt;
	}
	public void setCharStatHelt(int charStatHelt) {
		charStatHelt = charStatHelt;
	}
	public int getCharStatHeal() {
		return charStatHeal;
	}
	public void setCharStatHeal(int charStatHeal) {
		charStatHeal = charStatHeal;
	}
}
