package cw222ng_lab1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class VindAvkylning {

	public static void main(String[] args) {
		
		double temp;
		double vind;
		double effektivTemp;
		DecimalFormat decimalAmount = new DecimalFormat("#.0");
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Ange temperaturen");
		temp = scan.nextDouble();
		
		System.out.println("Ange vindhastigheten");
		vind = scan.nextDouble();
		vind = vind * 3.6;
		effektivTemp = 13.12 +0.6215*temp - 11.37*Math.pow(vind, 0.16)+0.3965*temp * Math.pow(vind, 0.16);
			
		System.out.println(decimalAmount.format(effektivTemp));;

	}

}
