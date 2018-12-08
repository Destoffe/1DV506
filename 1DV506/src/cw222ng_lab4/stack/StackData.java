package cw222ng_lab4.stack;


import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Arrays;

public class StackData implements Stack {
	private Object[] dataBase = new Object[1];
	private Object tempObject;

	
	public StackData() {
		dataBase = new Object[1];
	}
	public int size() {

		return dataBase.length-1;
	}


	public boolean isEmpty() {
		
		if((size()<0))
			return true;
		
		return false;
	}


	public void push(Object element) {
		Object[] tempArray = new Object[dataBase.length+1];

		for(int i=0; i<dataBase.length; i++) {
			tempArray[i] = dataBase[i-1-i];
		}
		tempArray[0] = element;
		this.dataBase = Arrays.copyOf(tempArray, tempArray.length);
		
		for(int i=0; i<dataBase.length-1; i++) {
			System.out.println("Ordningen är nu: " + dataBase[i]);
		}
		System.out.println("\n");
		System.out.println("LENGTH: " + (dataBase.length-1));
		}

		
	


	public Object pop() {

		Object temp = topObject();
	
		if(!isEmpty()) {
			this.dataBase = Arrays.copyOf(dataBase, dataBase.length-1);
			for(int i=0; i<dataBase.length-1; i++) {
				System.out.println("Ordning efter0 pop: " + dataBase[i]);
			}
			return temp;
		}
		return null;
	}

	
	public Object peek() {
		if(!isEmpty())
		return topObject();
		
		System.out.print("Stack is empty cant peek: ");
		return null;
	}


	public Iterator<Object> iterator() {
		List<Object> it = Arrays.asList(dataBase);
		return (Iterator<Object>) it;
	}
	
	private Object topObject() {
		
		if(!isEmpty())
		return dataBase[dataBase.length-2];
		
		return null;
	}

}