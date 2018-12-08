package cw222ng_lab2;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String input = "";
		String palin = "";
		String inputFlipped = "";
		char temp;
		int length;
		
		System.out.println("Mata in en mening");
		input = scan.nextLine();
		length = input.length();
		
		for(int i=0; i<length; i++) {
			
		temp = input.charAt(i);
		temp =Character.toLowerCase(temp);
		if(Character.isLetter(temp)) {
			palin = palin + temp;
			}
		}
		length = palin.length();
		
		for(int i=1; i<=length; i++) {
			inputFlipped= inputFlipped + (palin.charAt(length-i));
		}

		if(inputFlipped.equals(palin)) {
			System.out.println("Inmatning :" + input +" är ett palindrom och blir: " + palin);
		}else {
			System.out.println("Inmatningen :" + input + " är inget palindrom");
		}
  }
}
