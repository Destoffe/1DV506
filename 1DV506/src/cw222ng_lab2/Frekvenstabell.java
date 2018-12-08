package cw222ng_lab2;

import java.util.Random;

public class Frekvenstabell {

	public static void main(String[] args) {
		
		int[] slag = new int[6];
		int kast = 0;
		Random rand = new Random();
		
		for(int i=0; i<6000; i++) {
			kast = rand.nextInt(6)+1;
			switch(kast) {
			
			case 1: slag[0]++;
			break;
			
			case 2: slag[1]++;
			break;
			
			case 3: slag[2]++;
			break;
			
			case 4: slag[3]++;
			break;
			
			case 5: slag[4]++;
			break;
			
			case 6: slag[5]++;
			break;
			}
		}
		System.out.println("Frezuencies when rolling a dice 6000 times.");
		for(int i=0; i<6; i++) {
			System.out.println(i+1 +": " +slag[i]);
		}
	}
}
