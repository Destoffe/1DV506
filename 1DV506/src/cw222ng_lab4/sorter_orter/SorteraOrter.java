package cw222ng_lab4.sorter_orter;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SorteraOrter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File file = new File("C:\\Temp\\orter.txt"); // använder samma postnummer som i exemplet men i blandade

		ArrayList<Ort> ort = new ArrayList<>();
		String temp;
		Scanner scan;
	
		try {
			scan = new Scanner(file);
			while(scan.hasNextLine()) {
				temp=scan.nextLine();
				for(int i=0; i<temp.length(); i++) {
					if(temp.charAt(i) == ';') {
						ort.add(new Ort(Integer.parseInt(temp.substring(0, i)),temp.substring(i+1, temp.length())));
					}
				}	
			}
			
			System.out.println("Läser orter från filen: C:\\Temp\\orter.txt ");
			System.out.println("Antalet funna orter: " + ort.size());
			Collections.sort(ort);
			
			for(int i=0; i<ort.size(); i++) {
				System.out.println(ort.get(i).toString());
			}

		}catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
