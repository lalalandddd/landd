package java0709;

public class Game {
// ���� ����, �帣(�׼�, rpg, fps ��), �÷���(pc, ps5, switch, xbox, mobile ��)
	private String gameTitle;
	private String gameGenre;
	private String gamePlatform;
	public String getGameTitle() {
		return gameTitle;
	}
	public void setGameTitle(String gameTitle) {
		this.gameTitle = gameTitle;
	}
	public String getGameGenre() {
		return gameGenre;
	}
	public void setGameGenre(String gameGenre) {
		this.gameGenre = gameGenre;
	}
	public String getGamePlatform() {
		return gamePlatform;
	}
	public void setGamePlatform(String gamePlatform) {
		this.gamePlatform = gamePlatform;
	}
	public Game() {}
	public Game(String gameTitle, String gameGenre, String gamePlatform) {
		this.gameTitle=gameTitle;
		this.gameGenre=gameGenre;
		this.gamePlatform=gamePlatform;	
	}
	@Override
	public String toString() {
		return gameTitle+", "+gameGenre+", "+gamePlatform;
	}
}
