package cw222ng_lab4;

import java.util.Random;

public class RandomWalk {
	
	private int x = 0;
	private int y = 0;
	private int maxSteps;
	private int currentStep = 0;
	private int playSize;
	private Random rand = new Random();
	
	public RandomWalk(int maxSteps, int size) {
		this.maxSteps = maxSteps;
		playSize = size;
	}
	
	public String toString() {
		return "Currently on step: " + currentStep + "and current position is: " +"("+x+","+y+")";
	}
	
	public void takeStep() {
		
		int stepWay = rand.nextInt(4)+1;
		switch(stepWay) {
			case 1: x++;
					currentStep++;
					break;
			case 2: x--;
					currentStep++;
					break;
			case 3: y++;
					currentStep++;
					break;
			case 4: y--;
					currentStep++;
					break;
		}
	}
	
	public boolean moreSteps() {
		if(currentStep<maxSteps)
			return true;
		
		return false;
	}
	
	public boolean inBounds() {
		if((x<=playSize && y<=playSize) && (x>=-playSize && y>=-playSize)) {
			return true;
		}
		return false;
	}
	
	public void walk() {
		while(inBounds() && moreSteps()) {
			takeStep();
		}
	}

}
