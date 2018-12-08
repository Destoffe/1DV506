package cw222ng_lab4.stack;

import java.util.ArrayList;

public class StackMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StackData2 stack = new StackData2();
		Object test = "Tja";
		stack.push(test);
		Object test2 = "bajjjs";
		stack.push(test2);
		Object test3 = "KISS";
		stack.push(test3);
		System.out.println(stack.size());
		System.out.println("Poppar ut " +stack.pop());
		System.out.println(stack.size());
		System.out.println(stack.peek());
		
		/*
		Stack stack = new StackData();
		Object test = "tja";
		Object test2 = 5;
		stack.push(test);
		stack.push(test2);
		System.out.println("Size: " +stack.size());
		System.out.println("Peeking at: " +stack.peek());
		System.out.println("Pop out: " + stack.pop());
		System.out.println("Pop out: " + stack.pop());
		System.out.println("Peeking at: " + stack.peek());
		stack.iterator();
		
		if(stack.isEmpty()) 
			System.out.println("Stack is empty");
		else
			System.out.println("Stack is not empty");
			*/				
	}
	
	

}
