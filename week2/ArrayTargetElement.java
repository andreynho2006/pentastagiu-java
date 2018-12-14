/**
 * File: ArrayTargetElement.java
 * 
 *  Java program to return the index of a target element
 * 
 * @author Andrei Cirlan
 * 14 Dec 201812:25:31

 */
import java.util.Scanner;

public class ArrayTargetElement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arrayInput = {13,20,14,5,2,8};
		int target;
		do {
			System.out.println("Adauga indexul elementului( < " + arrayInput.length + ") :  ");			
			Scanner in = new Scanner(System.in);
			
			target = in.nextInt();
		} while (target >= arrayInput.length);
		
		
		
		System.out.println("The element at location " + target + " is " + arrayInput[target] + ".");
	}	
}	