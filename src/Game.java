
public class Game {
	private int id;
	private String gameName;
	private double gameCredit;
	public Game() {
		this.id = 1000;
		this.gameName = "GameShop";
		this.gameCredit = 0;
	}
	public Game(int id, String gameName, double gameCredit) {
		this.id = id;
		this.gameName = gameName;
		this.gameCredit = gameCredit;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGameName() {
		return gameName;
	}
	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
	public double getGameCredit() {
		return gameCredit;
	}
	public void setGameCredit(double gameCredit) {
		this.gameCredit = gameCredit;
	}
}
