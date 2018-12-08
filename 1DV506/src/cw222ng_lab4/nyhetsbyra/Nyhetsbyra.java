package cw222ng_lab4.nyhetsbyra;

import java.util.ArrayList;

public class Nyhetsbyra {
	
	private ArrayList<Tidning> regTidning = new ArrayList<>(); // H�r sparas alla registrerade tidningar.
	private ArrayList<Tidning> registeredBy = new ArrayList<>();//H�r sparas numret p� vem som registrerade tidningen s� jag vet vem som la ut vilken nyhet
	private ArrayList<String> nyheter = new ArrayList<>(); //Str�ng som har alla nyheter samlade fr�n alla tidningar


	

	 // H�r skickas alla nyheter ut som har skickats in av tidningarna.
	private void shareNews() {
		for(int i=0; i<regTidning.size(); i++) {
			for(int j=0; j<nyheter.size(); j++) {
				if(regTidning.get(i) != registeredBy.get(j)) { // H�r dubbelkollar jag s� tidningen inte f�r sin egen nyhet
					regTidning.get(i).addNews(nyheter.get(j));
				}
			}
		}
	}
	
	
	//H�r registreras tidningen sig hos nyhetsbyron
	public void registerNewspaper(Tidning tidning) {
		int temp = 0;
		if(regTidning.size() !=0) { //F�rsta tidningen l�gs till p� ett speciellts�tt d� den ej kan loopa fr�n den ej kan kolla om 0<0.
		for(int i=0; i<regTidning.size(); i++) {
			if(tidning != regTidning.get(i)) { // Loopar igenom och kollar ifall tidnignen redan finns.
				temp++;
			}
		}
		if(temp == regTidning.size()) { //�r temp=storleken hade tidningen inte samma namn som n�gon annan d�rmed kan den registreras.
			regTidning.add(tidning);
		}
		}else {
			regTidning.add(tidning);
		}
	}
	
	public void gatherNews() { //H�r samlar jag in alla nyheter fr�n alla tidningar som sedan ska delas ut
		for(int i=0; i<regTidning.size(); i++) {
			for(int j=0; j<regTidning.get(i).amountOfNews(); j++) {
				nyheter.add(regTidning.get(i).printNews(j));
				registeredBy.add(regTidning.get(i));
			}
		}
		shareNews(); //Delar ut nyheterna till alla tidningar
	}
}
