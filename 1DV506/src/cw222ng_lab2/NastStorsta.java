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
			if(temp>nastHogsta) { // S�tter temp som n�st h�gsta v�rdet endast om det jag matade in �r st�rre �n det f�rra
				nastHogsta = temp;
			}
			
			if(nastHogsta>hogsta) { // S�tter temp v�rdet av h�gsta s� de inte f�r samma v�rde n�r det byts
				temp = hogsta;
				hogsta = nastHogsta;
				nastHogsta = temp;
			}
		}
		System.out.println(nastHogsta);
 }
}
