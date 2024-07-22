package GameCharList;

public class CharReinforce {
	private String id;
	private String name;
	private int charPow;
	public CharReinforce() {
		this.id=id;
		this.name=name;
		this.charPow=charPow;
	}
	@Override
	public String toString() {
		return id+": "+name+"(ÀüÅõ·Â: "+charPow+")";
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCharPow() {
		return charPow;
	}
	public void setCharPow(int charPow) {
		this.charPow = charPow;
	}

}
