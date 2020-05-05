
public class Card {
	public int maa;
	public int rank;
	
	
//Constructor	
	public Card(int maa, int rank) {
		this.maa = maa;
		this.rank = rank;
	}
	
	public String getMaa() {
		if(maa==0) {
			return "SPADE";
		}
		else if(maa==1) {
			return "CLUB";
		}
		else if(maa==2) {
			return "HEART";
		}
		else if(maa==3) {
			return "DIAMOND";
		}
		else {
			return "ERROR";
		}
	}
	
	public int getrank() {
		return rank;
	}

}
