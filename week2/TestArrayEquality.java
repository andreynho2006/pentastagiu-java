/**
 * File: TestArrayEquality.java
 * 
 * Java  program that test whether 2 int arrays are equal. 
 * Equality in this case means that both arrays have the same 
 * number of elements an element on a specific index in first 
 * array is equal to the element on the same index in the second array
 * 
 * @author Andrei Cirlan
 * 14 Dec 201812:25:31

 */
import java.util.Arrays;
public class TestArrayEquality {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arrayInput1 = {1,2,3,4};
		int[] arrayInput2 = {1,2,3,4};
		int[] arrayInput3 = {};
		int[] arrayInput4 = {};
		int[] arrayInput5 = {1,3,2};
		int[] arrayInput6 = {1,3};
		int[] arrayInput7 = {1,2,3,4};
		int[] arrayInput8 = {1,2,4,3};
		
		System.out.println(compareArrays(arrayInput1, arrayInput2));
		System.out.println(compareArrays(arrayInput3, arrayInput4));
		System.out.println(compareArrays(arrayInput5, arrayInput6));
		System.out.println(compareArrays(arrayInput7, arrayInput8));
		

	}
	
	public static boolean compareArrays(int[] input1, int[] input2) {  // Method to test if first and last item of an array are equal
		int[] array1 = input1;
		int[] array2 = input2;
		
		if(Arrays.equals(array1, array2)) {
			return true;
		} 
		return false;	
	}

}

