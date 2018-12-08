package cw222ng_lab1;

import java.util.Scanner;

public class Konvertera {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double F = 0;
		double C = 0;
		double temp = 0;
		
		System.out.println("Ange temperaturen i Fahrenheit: ");
		F = scan.nextDouble();
		temp = (F-32) * 5/9;
		C = Math.round(temp*10) / 10.0;
		
		System.out.println("Antalet grader är: " + C);

	}

}
