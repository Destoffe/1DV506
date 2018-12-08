package cw222ng_lab1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Avstand {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//Skapar en array som innehåller 2 positioner
		int x[] = {0,0};
		int y[] = {0,0};
		double avstand;
		
		
	
		DecimalFormat decimalAmount = new DecimalFormat("#.000");
		
		System.out.println("Ange x-positionen för kordinat-1");
		x[0] = scan.nextInt();
		System.out.println("Ange y-positionen för kordinat-1");
		y[0] = scan.nextInt();
		System.out.println("Ange x-positionen för kordinat-2");
		x[1] = scan.nextInt();
		System.out.println("Ange y-positionen för kordinat-3");
		y[1] = scan.nextInt();
		
		avstand = Math.sqrt((Math.pow(x[0]-x[1],2))+(Math.pow(y[0]-y[1], 2)));
		System.out.print("Avståndet mellan punkerna är: ");
		System.out.print(decimalAmount.format(avstand)); //  

	}

}
