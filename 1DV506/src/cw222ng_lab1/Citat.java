package cw222ng_lab1;
import java.util.Scanner;

public class Citat {

	public static void main (String [] args) {
		char citat = '"';
		String inputText;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Skriv in en rad text: ");
		
		inputText = scan.nextLine();
		System.out.println(citat + inputText + citat);
		
	}
}
