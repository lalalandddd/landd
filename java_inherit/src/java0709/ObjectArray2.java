package java0709;

public class ObjectArray2 {
	public static void main(String[] args) {
// 7���� ���� ������ ���� ��ü�� �����ϰ� ����ϼ���
		Game[] game=new Game[10];
		game[0]=new Game("�Ͼ���丶Ÿ","�׼�RPG","PS5/XBOX ONE/SWITCH/PC");
		game[1]=new Game("��Ʋ�׶���","��Ʋ�ξ�","PC/MOBILE/PS4/XBOX");
		game[2]=new Game("â������2","RPG","PC");
		game[3]=new Game("���򷯽�","RPG","PC");
		game[4]=new Game("����������","FPS","PC/PS2");
		game[5]=new Game("�������","FPS","PC");
		game[6]=new Game("������������","MORPG","PC/MOBILE");
		game[7]=new Game("��Ÿũ����Ʈ","RTS","PC");
		game[8]=new Game("��ƺ��2","�׼�RPG","PC");
		game[9]=new Game("���оظ���Ƽ","MMORPG","PC");

		for(int i=0;i<game.length;i++) {
			System.out.println(game[i]);
		}
		for(Game gm:game) {
			System.out.println(gm);
		}
	}
}
