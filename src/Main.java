
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PlayerManager playerManager=new PlayerManager();
		playerManager.add(new Player(1,"Player1","Argon","000","Mustafa","Kuş","1111",1980,0));
		playerManager.add(new Player(2,"Player2","Yuan","000","Muzaffer","Övün","2222",1984,0));
		playerManager.list();
		GameManager gameManager=new GameManager();
		gameManager.add(new Game(1,"PUBG",50));
		gameManager.add(new Game(2,"Theif",20));
		gameManager.add(new Game(3,"NFS",10));
		gameManager.list();
		CampaignManager campaignManager=new CampaignManager();
		campaignManager.add(new Campaign(1,"19 Mayıs",10));
		campaignManager.add(new Campaign(2, "Hoşgeldin Yaz", 15));
		campaignManager.list();
		GameSalesManager gameSalesManager=new GameSalesManager();
		gameSalesManager.add(new GameSales(1,gameManager.getGame("NFS"), playerManager.getPlayer("Yuan"), campaignManager.getCampaign("Hoşgeldin Yaz"), 1000));
		gameSalesManager.list();
	}

}
