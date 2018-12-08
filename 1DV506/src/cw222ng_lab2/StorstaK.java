
package cw222ng_lab2;

import java.util.Scanner;

public class StorstaK {
	
	public static void main (String [] args) {
		
		Scanner scan = new Scanner(System.in);
		int N;
		int K = 0;
		int total = 0;
		int counter;
		System.out.println("Mata in ett positivt heltal: ");
		N = scan.nextInt();
		if(N>=0) {
		while(total<N) {
			K = K +2;
			total = total + K;
		}
		total = total - K;
		if(K !=0) {
		K = K -2;
		}
		System.out.print("Största tal K sådant att 0+2+4+6+...+K < " +N + " => " +"+K="+K);
		
		System.out.println("");

		System.out.println("K är: " + K);
	}else {
		System.out.println("Du matade in ett negativt tal, försök igen.");
	}
	}
}
