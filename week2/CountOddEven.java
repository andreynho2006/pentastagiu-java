/**
 * File: CountOddEven.java
 * 
 *  Java program to find the number of even and odd integers in a given array of integers
 * 
 * @author Andrei Cirlan
 * 14 Dec 201812:25:31

 */


public class CountOddEven {

	public static void main(String[] args) {
		int[] arrayInput = {13,20,14,5,2,8};
		int oddElements = 0;
		int evenElements = 0;
		
		for (int i = 0; i < arrayInput.length; i++) {
			if(arrayInput[i] % 2 == 0) {
				evenElements++;
			} else {
				oddElements++;
			}		
		}
		System.out.println("Odd elements count :" + oddElements);
		System.out.println("Even elements count :" + evenElements);
	}	
}
