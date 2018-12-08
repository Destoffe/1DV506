package cw222ng_lab3;

public class DeckMain {

	public static void main(String[] args) {
		
		Deck deck = new Deck();
		deck.shuffle(true);
		for(int i=0; i<53; i++) 
			deck.dealCard(true);
		
		deck.shuffle(true);
	}

}
