package cw222ng_lab1;
import java.util.Scanner;

public class SummaAvTre {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int inmat;
		int summa;
		
		System.out.println("Ange ett tresiffrigt heltal: ");
		inmat = scan.nextInt();
		if(inmat>999) {
			System.out.println("Talet är inte tresiffrigt, inmata ett nytt");
			inmat = scan.nextInt();
		}
		if(inmat<=999) {
			summa = (inmat / 100)  + ((inmat/10) % 10) + (inmat % 10);
			System.out.println("Summan av sifforna i heltalet är: " + summa);
		}


	}

}
