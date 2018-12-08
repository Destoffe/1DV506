package cw222ng_lab2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class OmvandOrdning {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		ArrayList<Integer> input = new ArrayList<Integer>();
		boolean check = false;
		int length;
		
		System.out.println("Mata in positiva heltal. Avsluta med ett negativt.");
		while(!check) {
		System.out.print("Tal "+(input.size()+1) +": ");
		input.add(scan.nextInt());
		length = input.size()-1;
		
		if(input.get(length) < 0) {
			input.remove(length);
			check = true;
			}
		}
		System.out.println("Antal positiva: " + input.size());
		System.out.print("Baklänges ");
		
		Collections.reverse(input);
		System.out.print(input);

		
	}
}