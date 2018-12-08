package cw222ng_lab4.nyhetsbyra;

import java.util.ArrayList;

public class Nyhetsbyra {
	
	private ArrayList<Tidning> regTidning = new ArrayList<>(); // Här sparas alla registrerade tidningar.
	private ArrayList<Tidning> registeredBy = new ArrayList<>();//Här sparas numret på vem som registrerade tidningen så jag vet vem som la ut vilken nyhet
	private ArrayList<String> nyheter = new ArrayList<>(); //Sträng som har alla nyheter samlade från alla tidningar


	

	 // Här skickas alla nyheter ut som har skickats in av tidningarna.
	private void shareNews() {
		for(int i=0; i<regTidning.size(); i++) {
			for(int j=0; j<nyheter.size(); j++) {
				if(regTidning.get(i) != registeredBy.get(j)) { // Här dubbelkollar jag så tidningen inte får sin egen nyhet
					regTidning.get(i).addNews(nyheter.get(j));
				}
			}
		}
	}
	
	
	//Här registreras tidningen sig hos nyhetsbyron
	public void registerNewspaper(Tidning tidning) {
		int temp = 0;
		if(regTidning.size() !=0) { //Första tidningen lägs till på ett specielltsätt då den ej kan loopa från den ej kan kolla om 0<0.
		for(int i=0; i<regTidning.size(); i++) {
			if(tidning != regTidning.get(i)) { // Loopar igenom och kollar ifall tidnignen redan finns.
				temp++;
			}
		}
		if(temp == regTidning.size()) { //är temp=storleken hade tidningen inte samma namn som någon annan därmed kan den registreras.
			regTidning.add(tidning);
		}
		}else {
			regTidning.add(tidning);
		}
	}
	
	public void gatherNews() { //Här samlar jag in alla nyheter från alla tidningar som sedan ska delas ut
		for(int i=0; i<regTidning.size(); i++) {
			for(int j=0; j<regTidning.get(i).amountOfNews(); j++) {
				nyheter.add(regTidning.get(i).printNews(j));
				registeredBy.add(regTidning.get(i));
			}
		}
		shareNews(); //Delar ut nyheterna till alla tidningar
	}
}
