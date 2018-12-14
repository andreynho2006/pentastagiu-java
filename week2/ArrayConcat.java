/**
 * File: ArrayConcat.java
 * 
 * A rogram that will concatenate 2 arrays. 
 * 
 * @author Andrei Cirlan
 * 14 Dec 201812:25:31

 */
import java.util.Arrays;

public class ArrayConcat {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arrayInput1 = {1,2,3,4};
		int[] arrayInput2 = {5,6,7,8};
		
		int concat[] = new int[arrayInput1.length + arrayInput2.length];

		//copy first array into the new array
		for (int i = 0; i < arrayInput1.length; i++) {
			concat[i] = arrayInput1[i];
		}
		
		//copy second array into the new array
		for ( int i = 0; i < arrayInput2.length; i++) {
			concat[arrayInput1.length + i] = arrayInput2[i];
		}
		System.out.println(Arrays.toString(concat));
	}
}

