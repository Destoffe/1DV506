package cw222ng_lab4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RaknaTecken {

	public static void main(String[] args) throws FileNotFoundException {
		
		File file = new File("C:\\Temp\\testText.txt");
		
		Scanner scan = new Scanner(file);
		
		int lowerCase =0,upperCase = 0,numbers=0,whiteSpaces=0,rest=0;
		String temp;
		
		while (scan.hasNextLine()) {
			temp = scan.nextLine();
			char[] character = temp.toCharArray();
			for(int i=0; i<character.length; i++) {
				if(Character.isDigit(character[i])) {
					numbers++;
				}
				else if(Character.isLetter(character[i]) && Character.isUpperCase(character[i])) {
					upperCase++;
				}
				else if(Character.isLetter(character[i]) && Character.isLowerCase(character[i])) {
					lowerCase++;
				}
				else if(Character.isWhitespace(character[i]) || character[i] =='\n') {
					whiteSpaces++;
				}
				else
					rest++;
				}
			}
		System.out.println("Antal stora bokstäver: " + upperCase);
		System.out.println("Antal små bokstäver: " + lowerCase);
		System.out.println("Antal siffror: " + numbers);
		System.out.println("Antal whitespaces " + whiteSpaces); 
		System.out.println("Antal övriga: " + rest);
		/*
		 * Får inte riktigt samma resultat på whitespaces vilket troligtvis beror på att jag använder
		 * en MacBook som kanske använder någon annan standarn i textdokument.
		 */
		
	}
}
