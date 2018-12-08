package cw222ng_lab3;

public class MultiDisplay {
	
	private int displayCount;
	private String displayMessage;
	
	public MultiDisplay() {
		
	}
	
	public MultiDisplay(String message, int amount) {
		displayMessage = message;
		displayCount = amount;
	}
	
	public void setDisplaymessage(String message) {
		displayMessage = message;
	}
	
	public void setDisplayCount (int count) {
		displayCount = displayCount+count;
	}
	
	public void display(String message, int count) {
		for(int i=0; i<count; i++) {
			System.out.println(message);
		}
		displayMessage = message;
	}
	
	public void display() {
		for(int i=0; i<displayCount; i++) {
			System.out.println(displayMessage);
		}
	}
	public String getDisplayMessage() {
		return displayMessage;
	}
}
