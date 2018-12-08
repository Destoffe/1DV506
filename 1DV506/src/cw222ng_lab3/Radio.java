package cw222ng_lab3;

public class Radio {
	
	private boolean active = false;;
	private int volume = 1;
	private int channel = 1;
	
	public void turnOff() {
		if(active) {
			active = false;
			volume = 1;
			channel = 1;
		}else 
			System.out.println("Radio is already off!");
	}
	
	public void turnOn() {
		if(!active) 
			active = true;
		else 
			System.out.println("Radio already on!");
	}
	public void setVolume(int input) {
		if(volumeCheck(input)){
			volume = input;
		}
	}
	public void channelUp() {
		if(channelCheck(channel+1)) {
			channel++;
		}
	}
	
	public void channelDown() {
		if(channelCheck(channel-1)) {
			channel--;
		}
	}
	
	public void setChannel(int input) {
		if(channelCheck(input)) {
			channel = input;
		}
	}
	
	public void volumeDown() {
		if(volumeCheck(volume-1)) 
			volume --;
	}
	
	public void volumeUp() {
			if(volumeCheck(volume+1)) 
				volume ++;
	}
	public String getSettings() {
		String settings = "Settings: " + "On " + active + "," +" Channel " + channel +"," + "Volume " + volume;
		return settings;
	}
	private boolean volumeCheck(int input) {
		
		if(isOn()) {
			if(input>=0 && input <=5) {
				return true;
			}else {
				System.out.println("New volume not within range!");
				return false;
			}
		}
		
		return false;
	}
	
	private boolean channelCheck(int input) {
		
		if(isOn()) {
			if(input>=1 && input <=10) {
				return true;
			}else {
				System.out.println("New Channel not within range!");
				return false;
			}
		}
		
		return false;
	}
	private boolean isOn() {
		if(active) {
			return true;
		}
		System.out.println("Radio off ==> No adjustment possible");
		return false;
	}
}
