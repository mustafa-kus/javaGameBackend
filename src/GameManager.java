import java.util.ArrayList;

public class GameManager {
	private ArrayList<Game> games=new ArrayList<Game>();
	public void add(Game game) {
		this.games.add(game);
		System.out.println("Yeni Oyun Eklendi:"+game.getGameName());
	}
	public void update(Game game) {
		this.games.set(this.games.indexOf(game), game);
		System.out.println("Oyun Güncellendi:"+game.getGameName());
	}
	public void delete(Game game) {
		this.games.remove(game);
		System.out.println("Oyun Silindi:"+game.getGameName());
	}
	public Game getGame(String gameName) {
		for(Game game:this.games) {
			if (game.getGameName()==gameName) {
				return game;
			} 
		}
		return new Game();
	}
	public void list() {
		for(Game game:this.games) {
			System.out.println("-----------------------------------");
			System.out.println("Oyun Id:"+game.getId());
			System.out.println("Oyun Adý:"+game.getGameName());
			System.out.println("Oyun Kredisi:"+game.getGameCredit());
			System.out.println("-----------------------------------");
		}
	}
}
