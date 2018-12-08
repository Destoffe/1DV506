package cw222ng_lab3;

import java.util.Scanner;

public class Pnr {

	public static void main(String[] args) {
		
		String pnr1 = "960216-0112"; // Ett korrekt personnummer
		String pnr2 = "920322-0523"; // Ett falskt personnummer
		System.out.println("F�rsta delen: " + getFirstPart(pnr1));
		System.out.println("Andra delen: " +getSecondPart(pnr1));
		System.out.println("Kvinnas personnummer? " + isFemaleNumber(pnr1));
		System.out.println("Mans? personnummer? " + isMaleNumber(pnr1));
		System.out.println("�r dessa lika? " + areEqual(pnr1,pnr2));
		System.out.println("�r detta ett riktigt personnummer?" + isCorrect(pnr1));

	}
	
	static String getFirstPart (String first) {
		String result;
		result = first.substring(0,6);
		return result;
	}
	
	static String getSecondPart (String second) {
		String result;
		result = second.substring(7,11);
		return result;
	}
	
	static boolean isFemaleNumber(String pnr) {
		int temp = Integer.parseInt(pnr.substring(9,10));
		if(temp%2 == 0) {
			return true;
		}
		return false;
	}
	
	static boolean isMaleNumber(String pnr) {
		int temp = Integer.parseInt(pnr.substring(9,10));
		if(temp %2 >0) {
			return true;
		}
		return false;
	}
	static boolean areEqual(String pnr1, String pnr2) {
		 if(pnr1.equals(pnr2)) 
			 return true;
		 
		return false;
	}
	
	static boolean isCorrect(String pnr) {
		boolean correct = false;
		String firstPart = pnr.substring(0,6);
		String secondPart = pnr.substring(7,11);
		int length = firstPart.length() + secondPart.length()-1;
		int[] check = new int[length+1];
		int temp = 0;
		String[] tempNumber = new String[length];
		String converter = "";
		String character[] = new String[length+1];
		int kontrollSiffra = 0;
		for(int i=0; i<firstPart.length(); i++) { // L�gger i de 6 f�rsta siffrorna i String Array f�r l�ttare hantering
			character[i] = ""+firstPart.charAt(i);
			check[i] = Integer.parseInt(character[i]);// L�gger sedan i dessa siffror 1 och 1 i en int array
		}
		for(int i=firstPart.length(); i<length+1; i++) { // Samma som ovanst�ende fast de 4 sista sifforna
			character[i] = ""+secondPart.charAt(temp);
			check[i] = Integer.parseInt(character[firstPart.length()+temp]); //Samma fast med de 4 sista
			temp++;
		}
		for(int i=0; i<length+1; i=i+2) { // H�r g�r jag Luhn-algoritm och multiplicerar 2 med varannan siffra
			check[i] = check[i] *2;

		}
		for(int i=0; i<length+1; i++) {
			converter = converter +""+ Integer.toString(check[i]); // L�gger tillbaka allt i en string f�r att f� r�tt storlek
			
			}

		int[]luhnAlgInt = new int[converter.length()]; // Delar upp siffrorna s� jag kan addera ihop alla produkter fr�n ovanst�ende multiplication
		String[]luhnAlgString = new String[converter.length()];
		for(int i=0; i<converter.length()-1; i++) {
			luhnAlgString[i] = ""+converter.charAt(i);
			luhnAlgInt[i] = Integer.parseInt(luhnAlgString[i]);
			kontrollSiffra = kontrollSiffra + luhnAlgInt[i]; // r�knar ut summan
			}
		kontrollSiffra = (10-(kontrollSiffra%10)) % 10; // Luhn-algotirmen igen f�r att r�kna ut vad kontrollsiffran �r, dubbelkollar nedan s� att jag f�r ut samma kontrollsiffra som jag hade i b�rjan
		if(kontrollSiffra == check[length] && Integer.parseInt(firstPart.substring(2,4)) <=12 && Integer.parseInt(firstPart.substring(4,6)) <=31 ) { // Kollar s� att m�naderna �r mindre eller lika med 12, samt dagar mindre lika med 31.
			return true;
		}

		return false;
	}
}
