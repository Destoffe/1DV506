package cw222ng_lab2;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int bas;
		int rad = 0;
		int mellanslag;

		int antalBas =1;
		System.out.println("Mata in ett ojämt heltal;");
		bas = scan.nextInt();
		
		mellanslag = bas;
		
		if(bas>0 && bas % 2 != 0) {
		System.out.println("Rätvinklig triangel:");
		for(int i=0; i<bas; i++) {
			
			for(int k=0; k<mellanslag-1; k++) {
				System.out.print(" ");
			}
					System.out.print("*");
					rad++;
	
			for(int j=0; j<rad-1; j++) {
				System.out.print("*");
			}
				mellanslag--;
				System.out.println("");
			}
			mellanslag = (bas/2)*2;

		System.out.println("Likbent triangel");
		
		for(int i=0; i<bas; i =i+2) {
			for(int k=0; k<mellanslag; k++) {
				System.out.print(" ");
			}
			for(int l=0; l<antalBas; l++) {
				System.out.print("*");
				
			}
			for(int j=0; j<mellanslag; j++) {
				System.out.print(" ");
			}
			mellanslag--;
			antalBas = antalBas +2;
			
			System.out.println("");
				}		
		
			}else {
			System.out.println("Du matade in ett jämt tal eller ett negativt, försök igen.");
		}
	}
}