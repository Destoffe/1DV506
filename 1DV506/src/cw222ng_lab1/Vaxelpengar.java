package cw222ng_lab1;
import java.util.Scanner;

public class Vaxelpengar {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	double kostnad = 0;
	int belopp = 0;
	int pengarTillbaka = 0;
	int tusen = 0;
	int femHundra = 0;
	int hundra = 0;
	int femtio = 0;
	int tjugo = 0;
	int tio = 0;
	int fem = 0;
	int ett = 0;
	
	System.out.println("Ange kostnad: ");
	kostnad = scan.nextDouble();
	System.out.println("Ange erhållet belopp: ");
	belopp = scan.nextInt();
	
	if(belopp < kostnad) {
		System.out.println("Du har inte tillräckligt med pengar. Försök igen");
	}
	if(belopp>kostnad) {
	pengarTillbaka = (int) Math.round(belopp - kostnad);
	System.out.println("Tillbaka: " + pengarTillbaka);
	
	while(pengarTillbaka>= 1000) {
		tusen++;
		pengarTillbaka = pengarTillbaka - 1000;
	}
	while(pengarTillbaka>= 500) {
		femHundra++;
		pengarTillbaka = pengarTillbaka - 500;
	}
	
	while(pengarTillbaka>= 100) {
		hundra++;
		pengarTillbaka = pengarTillbaka - 100;
	}
	while(pengarTillbaka>= 50) {
		femtio++;
		pengarTillbaka = pengarTillbaka - 50;
	}
	while(pengarTillbaka>= 20) {
		tjugo++;
		pengarTillbaka = pengarTillbaka - 20;
	}
	
	while(pengarTillbaka>= 10) {
		tio++;
		pengarTillbaka = pengarTillbaka - 10;
	}
	while(pengarTillbaka>= 5) {
		fem++;
		pengarTillbaka = pengarTillbaka - 5;
	}
	while(pengarTillbaka>= 1) {
		ett++;
		pengarTillbaka = pengarTillbaka - 1;
	}
	
	System.out.println("1000-lappar:" + tusen);
	System.out.println("500-lappar:" + femHundra);
	System.out.println("100-lappar:" + hundra);
	System.out.println("50-lappar:" + femtio);
	System.out.println("20-lappar:" + tjugo);
	System.out.println("10-lappar:" + tio);
	System.out.println("5-lappar:" + fem);
	System.out.println("1-lappar:" + ett);
		
	}
	
	
	}

}
