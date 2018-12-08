package cw222ng_lab4.sorter_orter;

public class Ort implements Comparable<Ort>{
	
	private  String ort;
	private  int postnummer;
	
	public Ort(int postnummer, String ort) {
		this.ort = ort;
		this.postnummer = postnummer;
	}
	
	public String getOrt() {
		return this.ort;
	}
	
	public int getPostnummer() {
		return this.postnummer;
	}
	
	public String toString() {
		return (postnummer + " " + ort);
	}
	

   public int compareTo(Ort o) {
	   
	   if(postnummer > o.postnummer) {
		   return 1;
	   }
	   else if(postnummer < o.postnummer) {
		   return -1;
	   }
	   return 0;
	}
}
