package cw222ng_lab3;

public class AlarmMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AlarmClock clock = new AlarmClock(23,48);
		
		clock.setAlarm(6, 15);
		clock.displayTime();
		for(int i=0; i<500; i++) {
		clock.timeTick();
		}
		clock.displayTime();
	}

}
