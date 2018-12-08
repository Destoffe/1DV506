package cw222ng_lab3;

public class MultiDisplayMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiDisplay md = new MultiDisplay();
		md.setDisplaymessage("Hello World");
		md.setDisplayCount(3);
		md.display();
		
		md.display("Goodbye cruel world!",2);
		
		System.out.println("Current Message: " + md.getDisplayMessage());
		
	}

}
