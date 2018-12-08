package cw222ng_lab3;

public class Point {
	
	private int x = 0;
	private int y = 0;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Point() {

	}
	
	public boolean isEqualTo( Point p2) {
		if(x == p2.x && y == p2.y) 
			return true;
		
		return false;
	}
	
	public String toString() {
		String cordinate = "(" + x + "," + y +")";
		return cordinate;
	}
	
	public double distanceTo( Point p2){	
		double distance;
		distance = Math.sqrt((Math.pow(x-p2.x,2))+(Math.pow(y-p2.y, 2)));
		return distance;
	}
	
	public void move(int x, int y) {
		this.x = this.x +x;
		this.y = this.y +y;
	}
	public void moveToXY (int x, int y) {
		this.x = x;
		this.y = y;
	}
	
}
