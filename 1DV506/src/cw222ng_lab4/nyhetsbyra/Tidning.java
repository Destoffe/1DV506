package cw222ng_lab4.nyhetsbyra;

import java.util.ArrayList;

public class Tidning {
	
	private ArrayList<String> news = new ArrayList<>(); // H�r lagras alla nyheter hos tidningen

	public Tidning() {
	}
	
	public void addNews(String newNews) { // L�gger till en nyhtet till tidningen
		news.add(newNews);
	}
	public int amountOfNews () { //H�r kan man f� ut antalet nyheter tidningen har lagrade just nu
		return news.size();
	}
	public String printNews (int number) { //Printa nyheter
		return news.get(number);
	}
	
	public void removeNews(int number) { // Ta bort en nyhet
		news.remove(number);
	}

}
