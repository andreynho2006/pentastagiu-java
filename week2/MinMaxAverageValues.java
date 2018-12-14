/**
 * File: MinMaxAverageValues.java
 * 
 * Java program that will return the min, max and average values in a given array.
 * 
 * @author Andrei Cirlan
 * 14 Dec 201812:25:31

 */
public class MinMaxAverageValues {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arrayInput1 = {13,20,14,5,2,8};
		
		// Calling getMax() method for getting max value
	    int max = getMax(arrayInput1);
	    System.out.println("Max: "+ max);
	 
	    // Calling getMin() method for getting min value
	    int min = getMin(arrayInput1);
	    System.out.println("Min: "+ min);
	    
	 // Calling getAverage() method for getting average value
	    float average = getAverage(arrayInput1);
	    System.out.printf("Average: %.2f", average);
	}
	
	// Method for getting the maximum value
	  public static int getMax(int[] inputArray){ 
	    int maxValue = inputArray[0]; 
	    for(int i=1; i < inputArray.length; i++){ 
	      if(inputArray[i] > maxValue){ 
	         maxValue = inputArray[i]; 
	      } 
	    } 
	    return maxValue; 
	  }
	 
	  // Method for getting the minimum value
	  public static int getMin(int[] inputArray){ 
	    int minValue = inputArray[0]; 
	    for(int i=1; i<inputArray.length; i++){ 
	      if(inputArray[i] < minValue){ 
	        minValue = inputArray[i]; 
	      } 
	    } 
	    return minValue; 
	  } 
	  
	// Method for getting the average value
		  public static float getAverage(int[] inputArray){ 
			int sum = 0;
		    for(int i=1; i < inputArray.length; i++){     
		         sum += inputArray[i];    
		    } 
		    float average = (float)sum /  inputArray.length; 
		    return average; 
		  }
}
