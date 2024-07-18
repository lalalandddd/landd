package GameCharList;

public class CharStat extends CharReinforce{
	private int charStatFire;
	private int charStatHelt;
	private int charStatHeal;
	public CharStat(int charStatFire, int charStatHelt, int charStatHeal) {
		this.charStatFire=charStatFire;
		this.charStatHelt=charStatHelt;
		this.charStatHeal=charStatHeal;
	}
	@Override
	public String toString() {
		return "사격: "+charStatFire+" , 체력: "+charStatHelt+" , 회복: "+charStatHeal;
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
