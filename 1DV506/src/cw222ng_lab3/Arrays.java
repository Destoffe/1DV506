package cw222ng_lab3;

public class Arrays {

	public static void main(String[] args) {
		 
		
	    int[] sub = {8,4,3};
		int[] arr = {2,1,8,4,3};
		System.out.println("Sum = " + sum(arr));
		System.out.println("Array content = " + toString(arr));
		System.out.println("After AddN = " + toString(addN(arr,2)));
		System.out.println("Reverse = " + Arrays.toString(reverse(arr)));
		System.out.println("Has N, true or false?"  + hasN(arr,3));
		replaceAll(arr,2,9);
		System.out.println("Sorted array = "  +Arrays.toString(sort(arr)));
		System.out.println("Subsequence true or false?  " +hasSubsequence(arr,sub));
	}

	static int sum(int[] arr)  {
		int summa = 0;
		for(int i=0; i<arr.length; i++) {
			summa = summa + arr[i];
		}
		return summa;
	}
	
	static String toString(int[] arr) {
		String result = ""; 

		for(int i=0; i<arr.length; i++) {
			result = result + " "+ Integer.toString(arr[i]);
		}
		 return result;
	 }
	
	static int[] addN(int[] arr,int n) {
		
		int[] temp = new int[arr.length];
		for(int i=0; i<arr.length; i++) {
			temp[i] = arr[i] + n;
		}
		return temp;
	}
	
	static int[] reverse (int[]arr) {
		int length = arr.length -1;
		int[] temp = new int[arr.length];
		for(int i=length; i>=0; i--) {
			temp[i] = arr[length-i];
		}
		return temp;
	}
	
	static boolean hasN(int[] arr, int n) {
		boolean temp = false;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == n) {
				temp = true;
			}
		}
		return temp;
	}
	
	static void replaceAll(int[] arr, int old, int nw) {
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == old) {
				arr[i] = nw;
			}
		}
		System.out.println("New array = " + Arrays.toString(arr) );
	}
	
	static int[] sort(int[] arr) {
		int[] temp = new int[arr.length];
		for(int i=0; i<arr.length; i++) {
			temp[i] = arr[i];
		}
		for(int i=(arr.length-1); i>=0; i--) {
			for(int j=1; j<=arr.length-1; j++) {
				if(temp[j-1] > temp[j] ) {
					int second = temp[j-1];
					temp[j-1] = temp[j];
					temp[j] = second;
				}
			}
		}
		return temp;
	}
	static boolean hasSubsequence(int[] arr, int[] sub) {
		int check = 0;
		boolean temp = false;
		
		for(int i=0; i<arr.length; i++) {
			if(sub[0] == arr[i]) {
				for(int j=0; j<sub.length; j++) {
					if(sub[j] == arr[i+j]) {
						check ++;
					}
				}
			}
		}
		if(check==3) {
			temp = true;
		}
		System.out.println(check);
		return temp;
	}
}

