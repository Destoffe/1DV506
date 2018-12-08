package cw222ng_lab1;
import java.util.Scanner;

public class BMI {
	
	public static void main (String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double vikt;
		double längd;
		int BMI;
		
		System.out.println("Ange din längd i meter: ");
		längd = scan.nextDouble();
		System.out.println("Ange din vik i kilogram: ");
		vikt = scan.nextDouble();
		BMI = (int) Math.round( vikt / (Math.pow(längd, 2)));
	
		System.out.println("Ditt BMI är: " + BMI);
		
		
	}

}
