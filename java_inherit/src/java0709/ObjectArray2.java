package java0709;

public class ObjectArray2 {
	public static void main(String[] args) {
// 7개의 게임 정보를 가진 객체를 생성하고 출력하세요
		Game[] game=new Game[10];
		game[0]=new Game("니어오토마타","액션RPG","PS5/XBOX ONE/SWITCH/PC");
		game[1]=new Game("배틀그라운드","배틀로얄","PC/MOBILE/PS4/XBOX");
		game[2]=new Game("창세기전2","RPG","PC");
		game[3]=new Game("악츄러스","RPG","PC");
		game[4]=new Game("하프라이프","FPS","PC/PS2");
		game[5]=new Game("서든어택","FPS","PC");
		game[6]=new Game("던전앤파이터","MORPG","PC/MOBILE");
		game[7]=new Game("스타크래프트","RTS","PC");
		game[8]=new Game("디아블로2","액션RPG","PC");
		game[9]=new Game("쓰론앤리버티","MMORPG","PC");

		for(int i=0;i<game.length;i++) {
			System.out.println(game[i]);
		}
		for(Game gm:game) {
			System.out.println(gm);
		}
	}
}
