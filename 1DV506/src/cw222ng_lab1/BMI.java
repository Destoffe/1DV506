package cw222ng_lab1;
import java.util.Scanner;

public class BMI {
	
	public static void main (String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double vikt;
		double l�ngd;
		int BMI;
		
		System.out.println("Ange din l�ngd i meter: ");
		l�ngd = scan.nextDouble();
		System.out.println("Ange din vik i kilogram: ");
		vikt = scan.nextDouble();
		BMI = (int) Math.round( vikt / (Math.pow(l�ngd, 2)));
	
		System.out.println("Ditt BMI �r: " + BMI);
		
		
	}

}
