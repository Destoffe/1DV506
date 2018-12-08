package cw222ng_lab1;
import java.util.Scanner;

public class Tid {
	
	public static void main (String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int sekunder = 0;
		int minuter = 0;
		int timmar = 0;
		int temp;
		
		System.out.println("Ange antal sekunder");
		sekunder = scan.nextInt();
		//Sätter sätter minuter och sekunder värdet rest av %60.
		//Tar jag sedan resten - ursprungsvärdet / 60 får jag ur antalet minuter/timmar
		temp = sekunder;
		sekunder = sekunder%60;
		
		minuter = (temp - sekunder) / 60;
		temp = minuter;
		minuter = minuter %60;
		
		timmar = (temp-minuter) / 60;
		
		
		System.out.println("Detta motsvarar i timmar: " + timmar +" timmar, " + minuter + " minuter, " + sekunder+" sekunder, ");

		
		
	
		
	}

}
