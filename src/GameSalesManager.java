import java.util.ArrayList;

public class GameSalesManager {
	private ArrayList<GameSales> GameSaless=new ArrayList<GameSales>();
	public void add(GameSales gameSale) {
		this.GameSaless.add(gameSale);
		System.out.println("Yeni Sat�� Yap�ld�:"+gameSale.getGame().getGameName());
	}
	public void update(GameSales gameSale) {
		this.GameSaless.set(this.GameSaless.indexOf(gameSale), gameSale);
		System.out.println("Sat�� i�lemi g�ncellendi:"+gameSale.getGame().getGameName());
	}
	public void delete(GameSales gameSale) {
		this.GameSaless.remove(gameSale);
		System.out.println("Sat�� i�lemi iptal edildi:"+gameSale.getGame().getGameName());
	}
	public void list() {
		for(GameSales GameSales:this.GameSaless) {
			System.out.println("-----------------------------------");
			System.out.println("Sat�� Id:"+GameSales.getId());
			System.out.println("Oyun Ad�:"+GameSales.getGame().getGameName());
			System.out.println("Oyuncu :"+GameSales.getPlayer().getNickName());
			System.out.println("Kampanya :"+GameSales.getCampaign().getName());
			System.out.println("Sat�� Fiyat� :"+GameSales.getSalePrice());
			System.out.println("-----------------------------------");
		}
	}
}
