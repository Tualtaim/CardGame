import java.util.ArrayList;
import java.util.Collections;

public class Deck {
	ArrayList<Card> deck = new ArrayList<Card>();

	public void Create() {
		//Creates deck
		for(int i = 0; i<4; i++) {				
			for(int j = 2; j<15; j++) {
				Card card = new Card(i,j);
				deck.add(card);
			}
		} 
	}
	
	public void Shuffle() {
		Collections.shuffle(deck);
	}
	
	public ArrayList<Card> Deal() {
		ArrayList<Card> tmp = new ArrayList<Card>();	
		for (int i = 0; i<5; i++) {
			tmp.add(deck.get(i));		
		}
		return tmp;
	}
}
