package cw222ng_lab2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Lonerevision {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> input = new ArrayList<>();
		int length;
		int median;
		int medel = 0;
		int spridning;
		double temp;
		
		System.out.println("Mata in löner (och avsluta med 'X'):");
		
		while(scan.hasNextInt()) {
		input.add(scan.nextInt());
		}
		Collections.sort(input);
		length = input.size() ;
		
		temp = (double)length/2;
		System.out.println("legnth" + length);
		if(temp %1 != 0) {
			temp = temp -0.5;
			median = input.get((int) temp);
		}else {
			temp = (input.get((length/2)-1)) + (input.get((length/2)));
			median = (int) (temp / 2);
		}
		for(int i=0; i<length; i++) {
			medel = medel + input.get(i);
		}
		medel = medel / length;
		spridning = (input.get(length-1) - input.get(0));
		System.out.println("Medianlön: " + median);
		System.out.println("Medellön: " + medel);
		System.out.println("Lönespridning: " + spridning);
	}
}
