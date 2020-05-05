import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CardGame {

	public static void main(String[] args) {
		Deck deck = new Deck();
		ArrayList<Card> hand;
		deck.Create();
		deck.Shuffle();
		hand = deck.Deal();

		for(Card card: hand) {
			System.out.print(card.getMaa() + " " + card.getrank());
			System.out.println();
			}

			CheckHand(hand);
		
	}

	private static void CheckHand(ArrayList<Card> hand) {
		if(IsFlush(hand)) {
			System.out.println("FLUSH");			
		}
		else if(IsStraight(hand)){
			System.out.println("STRAIGHT");			
		}
		else if(IsPair(hand)) {
			System.out.println("PAIR");
		}
		else {
			System.out.println("High Card");		
		}
		
	}

	private static boolean IsPair(ArrayList<Card> hand) {
		for (int i = 0; i < hand.size(); i++) {
			for (int j = i+1; j < hand.size(); j++) {
				if (hand.get(i).getrank() == hand.get(j).getrank()) {
					return true;
				}
			}
		}
		return false;
	}
	private static boolean IsFlush(ArrayList<Card> hand) {
		if(hand.get(0).getMaa().equals(hand.get(1).getMaa()) && hand.get(1).getMaa().equals(hand.get(2).getMaa()) &&hand.get(2).getMaa().equals(hand.get(3).getMaa())) {
			return true;
		}
		return false;
	}
	
	private static boolean IsStraight(ArrayList<Card> hand) {
		Collections.sort(hand, Comparator.comparing(Card::getrank));
			for(int i = 0; i<hand.size();i++){
				if (hand.get(i).getrank()-1 != hand.get(i+1).getrank()){
					return false;
				}
			}	
		return true;	
	}
	


}
