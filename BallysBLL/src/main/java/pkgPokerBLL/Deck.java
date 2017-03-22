package pkgPokerBLL;

import java.util.ArrayList;
import java.util.Collections;
import java.util.UUID;

import pkgPokerEnum.eRank;
import pkgPokerEnum.eSuit;

public class Deck {

	private UUID DeckID;
	private ArrayList<Card> DeckCards = new ArrayList<Card>();

	public Deck() {

		super();
		int iCardNbr = 0;
		for (eSuit suit : eSuit.values()) {
			for (eRank rank : eRank.values()) {
				//if ((suit != eSuit.JOKER) && (rank != eRank.JOKER)) {
					DeckCards.add(new Card(rank, suit, ++iCardNbr));
				//}
			}
		}
		Collections.shuffle(DeckCards);
	}
	
	public Deck(int numJokers){
		this();
		int iCardNbr = DeckCards.size();
		for(int i = 0; i < numJokers; i++){
			Card newJoker = new Card(eRank.JOKER, eSuit.JOKER, ++iCardNbr);
			newJoker.setWild(true);
			DeckCards.add(newJoker);
		}
			Collections.shuffle(DeckCards);
	}

	public Card DrawCard() {

		return DeckCards.remove(0);
	}
}
