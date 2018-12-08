package cw222ng_lab3;

public class Play123Main {

	public static void main(String[] args) {
		int loses = 0;
		int wins = 0;
		double sannolikhet;
		for(int i=0; i<10000; i++) {
		if(!play123()){ //om jag returnerar false(Förlust) öka antalet förluster annars öka på vinster.
			loses ++;
		}else {
			wins++;
		}
	}
		 sannolikhet =(double) wins/10000 *100 ; //Antalet vinster/summan gör procentuellt sannolikheten.
		 System.out.println("WINS: " +wins);
		 System.out.println("LOST: " +loses);
		 System.out.println("Sannolikheten att winna är: " + sannolikhet + "% chans");
	}
	
	public static boolean play123() {
		Deck deck = new Deck();
		deck.shuffle(false);
		int count = 1; // Detta är variabeln som räknas 1.2.3..
		
		for(int i=0; i<52; i++) { // här delar jag ut kort tills jag förlorat eller vunnit.
			int cardValue = deck.getCurrentCardValue(); //Här tar jag värdet på kortet som delas ut just nu och jämför med 1,2,3..
			deck.dealCard(false);
			if(count ==cardValue) 
				return false;
			
			if(count<4) 
				count++;
			
			else
				count =1;
		}
		return true;
	}

}
