package cw222ng_lab1;

import java.util.Random;

public class TelefonNummer {

	public static void main(String[] args) {

		int riktNummer;
		int lokalNummer;
		int firstLokal;
		
		Random rand = new Random();
		
		riktNummer = rand.nextInt(999)+100;
		lokalNummer = rand.nextInt(99999)+10000;
		firstLokal = rand.nextInt(9)+1;
		
		System.out.println("0" + riktNummer + "-" + firstLokal + lokalNummer);


	}

}
