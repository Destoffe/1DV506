package cw222ng_lab1;

import java.util.Scanner;

public class KortNamn {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String fornamn = "";
		String efternamn = "";
		String kortNamn = "";
		
		System.out.println("Ange f�rnamn");
		fornamn = scan.nextLine();
		
		System.out.println("Ange efternamn");
		efternamn = scan.nextLine();
		
		fornamn = fornamn.substring(0,1);
		if(efternamn.length()>=4) {
		efternamn = efternamn.substring(0,4);
		}else {
			efternamn = efternamn.substring(0,efternamn.length()); // G�r att jag tar fr�n punkt 0-namnets slut om namnet �r f�r kort
		}
		kortNamn = fornamn + " " + efternamn;
		System.out.println("Ditt kortnamn �r: " + kortNamn);
		

	}

}
