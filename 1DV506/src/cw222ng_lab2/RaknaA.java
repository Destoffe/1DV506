package cw222ng_lab2;

import java.util.Scanner;

public class RaknaA {
	
	public static void main (String [] args) {
		
		Scanner scan = new Scanner(System.in);
		String inmat;
		int antala = 0;
		int antalA = 0;

		System.out.println("Skriv in en mening");
		inmat = scan.nextLine();
		
		for (int i=0; i<inmat.length(); i++) {
			if(inmat.charAt(i) == 'a') {
				antala++;		
			}
			if(inmat.charAt(i) == 'A') {
				antalA++;	
			}
		}
		System.out.println("Antal a: " + antala);
		System.out.println("Antal A : " + antalA);
	}
}
