package cw222ng_lab2;

public class BytaPlats {

	public static void main(String[] args) {
	    char[] text = { 't', 't', 'ä', 'l', ' ', 'r', 'a', 'v', ' ', 'a', 
     			't', 't', 'e', 'D' };
	    int length;
	    char temp;
	    
	    length = text.length  -1;
	  
	    for(int i=0; i<text.length/2; i++) {
	    	temp = text[i];
	    	text[i] = text[length-i];
	    	text[length-i] = temp;
	    }
	     
	    for (int i=0; i<length+1; i++) {
	    	System.out.print(text[i]);
	    }

	}

}
