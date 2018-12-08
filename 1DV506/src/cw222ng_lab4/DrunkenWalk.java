package cw222ng_lab4;

import java.util.Scanner;

public class DrunkenWalk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int size,steps,drunks,drunksInWater=0;
		double procent;
		RandomWalk simulation;
		
		System.out.println("Hur stor ska plattformen vara? t.ex 15 �r -15 till 15.");
		size=scan.nextInt();
		System.out.println("Hur m�nga steg ska ett fyllo max f� ta?");
		steps=scan.nextInt();
		System.out.println("Hur m�nga fyllon skall simuleras?");
		drunks=scan.nextInt();
		
		for(int i=0; i<drunks; i++) {
			simulation = new RandomWalk(steps,size);
			simulation.walk();
			if(!simulation.inBounds() ) {
				drunksInWater++;
			}
		}
		System.out.println("ANTAL "+drunksInWater);
		procent = (double) drunksInWater/drunks *100;
		System.out.println("Av " + drunks +" onyktra personer, f�ll "+ drunksInWater +"( " + procent + ") i vattnet.");

	}

}
