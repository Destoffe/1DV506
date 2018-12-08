package cw222ng_lab3;

public class Card {
	
	  private int cardRank;
	  private Suits cardSuit;
	  private final int KING = 13;
	  private final int QUEEN = 12;
	  private final int KNIGHT= 11;
	  private final int ACE= 1;
	  
	  public enum Suits{
		  SPADE,
		  HEART,
		  DIAMOND,
		  CLUB;
	  }

	public Card(Suits spade, int rank) {
		cardSuit = spade;
		
		   if(rank < 1 || rank > 13){
			      System.out.println("Highest rank is 13(or KING), lowest rank is 1(or ACE), following rank is not legit:  "+rank);
			   } 
		   cardRank = rank;
	}
	public String getSuit() {
		return cardSuit.toString();
	}
	
	public String getRank() {
		if(cardRank>1 && cardRank<11) {
		return Integer.toString(cardRank);
		}
		else if(cardRank == KNIGHT) 
			return "Knight";
		else if(cardRank == QUEEN) 
			return "Queen";
		else if(cardRank == KING) 
			return "King";
		else if(cardRank == ACE) 
			return "Ace";
		
		return "Will not come here";
	}


}



