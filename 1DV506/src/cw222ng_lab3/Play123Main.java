package cw222ng_lab3;

public class Play123Main {

	public static void main(String[] args) {
		int loses = 0;
		int wins = 0;
		double sannolikhet;
		for(int i=0; i<10000; i++) {
		if(!play123()){ //om jag returnerar false(F�rlust) �ka antalet f�rluster annars �ka p� vinster.
			loses ++;
		}else {
			wins++;
		}
	}
		 sannolikhet =(double) wins/10000 *100 ; //Antalet vinster/summan g�r procentuellt sannolikheten.
		 System.out.println("WINS: " +wins);
		 System.out.println("LOST: " +loses);
		 System.out.println("Sannolikheten att winna �r: " + sannolikhet + "% chans");
	}
	
	public static boolean play123() {
		Deck deck = new Deck();
		deck.shuffle(false);
		int count = 1; // Detta �r variabeln som r�knas 1.2.3..
		
		for(int i=0; i<52; i++) { // h�r delar jag ut kort tills jag f�rlorat eller vunnit.
			int cardValue = deck.getCurrentCardValue(); //H�r tar jag v�rdet p� kortet som delas ut just nu och j�mf�r med 1,2,3..
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
