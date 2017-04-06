package pkgExceptions;

import java.util.ArrayList;

import pkgPokerBLL.Card;

public class DeckException extends Exception {
	private ArrayList<Card> DeckCards;
	
	public DeckException(ArrayList<Card> DeckCards) {
		this.DeckCards = DeckCards;
	}
	
	public ArrayList<Card> getCardsInHand() {
		return DeckCards;
	}
	
}
