package GameCharList;

public class CharReinforce {
	private int charPow;
	public CharReinforce() {
		this.charPow=charPow;
	}
	@Override
	public String toString() {
		return "전투력: "+charPow+"점";
	}
	public int getCharPow() {
		return charPow;
	}
	public void setCharPow(int charPow) {
		this.charPow = charPow;
	}

}
