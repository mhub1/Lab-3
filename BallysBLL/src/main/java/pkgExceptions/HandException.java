package pkgExceptions;

import java.util.ArrayList;

import pkgPokerBLL.Card;

public class HandException extends Exception {
	private ArrayList<Card> CardsInHand;
	
	public HandException(ArrayList<Card> CardsInHand) {
		this.CardsInHand = CardsInHand;
	}
	
	public ArrayList<Card> getCardsInHand() {
		return CardsInHand;
	}
	
}