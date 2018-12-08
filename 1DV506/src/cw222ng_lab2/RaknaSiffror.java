package cw222ng_lab2;

import java.util.ArrayList;
import java.util.Scanner;

public class RaknaSiffror {
	
	public static void main (String [] args) {
		
		Scanner scan = new Scanner(System.in);
		int heltal;
		int temp;
		int nollor = 0;
		int jamn =0;
		int udda= 0;

		String tempString;
		
		System.out.println("Mata in ett heltal");
		heltal = scan.nextInt();
		
		tempString = Integer.toString(heltal);
		temp = tempString.length();
		
		int tempInt[] = new int [temp];
		String character[] = new String[temp];
		
		for(int i=0; i<temp; i++) {
			character[i] = ""+ tempString.charAt(i);
			tempInt[i] = Integer.parseInt(character[i]);
		}
		for(int i=0; i<temp; i++) {
			if(tempInt[i] ==0) 
				nollor++;
			
			if(tempInt[i] %2 ==0 && tempInt[i] !=0) 
				jamn++;
			
			if(tempInt[i] %2 ==1) 
				udda++;
		}
		System.out.println("Nollor: "+nollor);
		System.out.println("Udda: "+udda);
		System.out.println("Jämna: "+jamn);
	}
}
