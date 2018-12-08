package cw222ng_lab2;

public class TartLjus {

	public static void main(String[] args) {
		
		int boxes=0;
		int candles=0;
		int year = 0;
		int temp =0;
		for(int i=0; i<100; i++) {
			
			if(year < 100) {
				year++;
				//System.out.println(ljus);
				while(candles<year) {
					boxes++;
					temp++;
					candles = candles +24;
				}
				if(temp>0) {
				System.out.println("Before birthday " + year + ", buy " + temp +" box(es)");
				}
				temp =0;
				candles = candles - year;
			}
		}
		System.out.println("Total number of boxes: " + boxes +", Remaining candels: " + candles);
	}
}
