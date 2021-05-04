import java.util.ArrayList;

public class CampaignManager {
	private ArrayList<Campaign> campaigns=new ArrayList<Campaign>();
	public void add(Campaign campaing) {
		this.campaigns.add(campaing);
		System.out.println("Kampanya Eklendi:"+campaing.getName());
	}
	public void update(Campaign campaing) {
		this.campaigns.set(this.campaigns.indexOf(campaing), campaing);
		System.out.println("Kampnaya güncellendi:"+campaing.getName());
	}
	public void delete(Campaign campaing) {
		this.campaigns.remove(campaing);
		System.out.println("Kampanya Silindi:"+campaing.getName());
	}
	public Campaign getCampaign(String campaignName) {
		for(Campaign campaign:this.campaigns) {
			if (campaign.getName()==campaignName) {
				return campaign;
			} 
		}
		return new Campaign();
	}
	public void list() {
		for(Campaign campaign:this.campaigns) {
			System.out.println("-----------------------------------");
			System.out.println("Kampanya Id:"+campaign.getId());
			System.out.println("Kampanya Adý:"+campaign.getName());
			System.out.println("Ýndirim Oraný:"+campaign.getDiscountRate());
			System.out.println("-----------------------------------");
		}
	}
	
}
