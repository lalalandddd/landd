package test;

public class Music {  // �ڹٺ� Ŭ���� �����
	private String title;
	private String singer;
	private int year;
//	public Music(String title, String singer, int year) {
//		this.title=title;
//		this.singer=singer;
//		this.year=year;
//	}
//	@Override
//	public String toString() {
//		return "�� ���� : "+title+" , ���� : "+singer+" , ���� : "+year;
//	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}

}
