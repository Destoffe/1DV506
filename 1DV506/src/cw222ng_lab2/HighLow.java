package cw222ng_lab2;

import java.util.Random;
import java.util.Scanner;

public class HighLow {

	public static void main(String[] args) {
		 
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		int antalGissningar = 1;
		int gissning = 0;
		int svar = rand.nextInt(100);
		System.out.println("Gissa p� ett tal mellan 0-100\n" );
		
		while(gissning != svar && antalGissningar <11) {
			
		System.out.print("Gissning " + antalGissningar+ ": ");
		gissning = scan.nextInt();
		
		if(gissning > svar) {
			System.out.println("Ledstr�d: l�gre ");
			antalGissningar++;
			
		}else if(gissning < svar) {
			System.out.println("Ledstr�d: H�gre ");
			antalGissningar++;
		}
	}
			if(gissning == svar) {
			System.out.println("R�tt svar efter bara " + antalGissningar + " gissningar - Str�lande!");
			}else
			System.out.println("Du gissade fel 10 g�nger, f�rs�k igen!");
			
		}
	}


