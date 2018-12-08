package cw222ng_lab3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;


public class Deck {
	private ArrayList<Card> cards = new ArrayList<>();
	private int cardsLeft = 52;
	private int currentCard;
	
	public Deck() {

		for(int i=0; i<13; i++) {
			Card card = new Card(Card.Suits.valueOf("SPADE"),i+1);
			cards.add(card);
		}
		
		for(int i=0; i<13; i++) {
			Card card = new Card(Card.Suits.valueOf("HEART"),i+1);
			cards.add(card);
		}
		
		for(int i=0; i<13; i++) {
			Card card = new Card(Card.Suits.valueOf("DIAMOND"),i+1);
			cards.add(card);
		}
		
		for(int i=0; i<13; i++) {
			Card card = new Card(Card.Suits.valueOf("CLUB"),i+1);
			cards.add(card);
		}
	}
	public void shuffle(boolean showShuffle) { //Show shuffle är till för att bestämma om man vill se att det shufflas
		if(cards.size()==52) {
			Collections.shuffle(cards);
			if(showShuffle)
				System.out.println("Deck shuffled");
		}else
			System.out.println("Can't shuffle, deck is not full.");
	}
	
	public int getCurrentCardValue() { //Var tvungen att göra en till funktion för att få värdets kort i int värde pga jag har de i sträng i "Card" classen med ACE osv.
		int value;
		switch(cards.get(0).getRank()) {
			case"Ace":
				value = 1;
				break;
			case"Knight":
				value=11;
				break;
			case"Queen":
				value=12;
				break;
			case"King":
				value=13;
				break;
			default:
				value = Integer.parseInt(cards.get(0).getRank());
		}
		return value;
	}
	
	public void dealCard(boolean showDeal) { //showDeal är till för att bestämma om man vill se vad som dealas i mainmetoden
		if(!cards.isEmpty()) {
			if(showDeal)
				System.out.println("Dealing Card: " +  cards.get(0).getSuit() +" " +  cards.get(0).getRank());
		cardsLeft--;
		cards.remove(0);
			if(showDeal)
				System.out.println(cardsLeft +" cards left in the deck.");
		}else
			System.out.println("No cards left in the deck, cant deal more cards");
	}

}
