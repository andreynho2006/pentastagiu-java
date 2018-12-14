/**
 * File: SameArrayItems.java
 * 
 * Java program that will test whether the first and the last element of an int array are the same
 * 
 * @author Andrei Cirlan
 * 14 Dec 201812:25:31

 */
public class SameArrayItems {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arrayInput1 = {13,6,2,8,2,3};
		int[] arrayInput2 = {13,6,2,8,2,13};
		
		System.out.println(compareArrays(arrayInput1));
		System.out.println(compareArrays(arrayInput2));
		

	}
	
	public static boolean compareArrays(int[] input) {  // Method to test if first and last item of an array are equal
		int[] array = input;
		
		int arrayLength = array.length;                // get the length of the array
		
		int a1 = array[0];                             // first element
		int a2 = array[arrayLength - 1];               // last element equal to the length of the array minus 1 (starts count from zero)
		
		if( a1 == a2 ) {
			return true;
		}
		return false;
		
	}

}
