package java0717_1;

public class Media {
	private String id;  // ����,dvd ������ȣ
	private String title;  // ����,dvd ����
	public Media(String id, String title) {  // ������ �޼���
		this.id=id;
		this.title=title;
	}
	@Override
	public String toString() {  // ��ü ������
		return "ID : "+id+" , ���� : "+title;
	}
	public String getId() {  // �ټ�
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	

}
