package cw222ng_lab1;
import java.util.Scanner;

public class Sekunder {
	
	public static void main (String args[]) {
		
		Scanner scan = new Scanner(System.in);
		int timmar;
		int minuter;
		int sekunder;
		
		System.out.println("Mata in antal timmar: ");
		timmar = scan.nextInt();
		System.out.println("Mata in antal minuter: ");
		minuter = scan.nextInt();
		System.out.println("Mata in antal sekunder: ");
		sekunder = scan.nextInt();
		
		timmar = timmar * 3600;
		minuter = minuter * 60;
		sekunder = sekunder + timmar + minuter;
		System.out.println("Antalet sekunder är: " + sekunder);
	}

}
