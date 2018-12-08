package cw222ng_lab2;

import java.util.Scanner;

public class NastStorsta {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int hogsta = 0;
		int nastHogsta = 0;
		int temp = 0;
		int amount =10;

		System.out.println("Mata in 10 heltal:");
		
		for(int i=0; i<amount; i++) {
			temp = scan.nextInt();
			if(temp>nastHogsta) { // Sätter temp som näst högsta värdet endast om det jag matade in är större än det förra
				nastHogsta = temp;
			}
			
			if(nastHogsta>hogsta) { // Sätter temp värdet av högsta så de inte får samma värde när det byts
				temp = hogsta;
				hogsta = nastHogsta;
				nastHogsta = temp;
			}
		}
		System.out.println(nastHogsta);
 }
}
