import java.util.ArrayList;

public class PlayerManager {
	private ArrayList<Player> players=new ArrayList<Player>();
	public void add(Player player) {
		if (checkNationalId(player.getNationalId())) {
			this.players.add(player);
			System.out.println("Yeni Oyuncu Eklendi:"+player.getNickName());
		} else {
			System.out.println("Yeni Oyuncu Gerçek Kiþi Olmadýðý Ýçin Eklenemedi.");
		}
	}
	public void update(Player player) {
		this.players.set(players.indexOf(player),player);
		System.out.println("Oyuncu Güncellendi:"+player.getNickName());
	}
	public void delete(Player player) {
		this.players.remove(player);
		System.out.println("Oyuncu Silindi:"+player.getNickName());
	}
	public Player getPlayer(String nickName) {
		for(Player player:this.players) {
			if (player.getNickName()==nickName) {
				return player;
			} 
		}
		return new Player();
	}
	public void list() {
		for(Player player:this.players) {
			System.out.println("-------------------------------------------");
			System.out.println("Player Id    : "+player.getId());
			System.out.println("Player Nick  : "+player.getNickName());
			System.out.println("Player Credit: "+player.getCreditValue());
			System.out.println("-------------------------------------------");
		}
	}
	public boolean checkNationalId(String nationalId) {
		return true;
	}
}
