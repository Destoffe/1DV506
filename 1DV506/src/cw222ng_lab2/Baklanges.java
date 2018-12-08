package cw222ng_lab2;

import java.util.Scanner;

public class Baklanges {
	
	public static void main (String [] args) {
		
		Scanner scan = new Scanner(System.in);
		String inmat;
		String utmat="";
		int max;
		
		System.out.println("Skriv in en mening");
		inmat = scan.nextLine();
		max = inmat.length();
		
		for(int i=1; i<=inmat.length(); i++) {
			utmat= utmat + (inmat.charAt(max-i));
		}
		System.out.println(utmat);
	}

}
