/**
 * File: FibonacciNumbers.java
 * 
 * program that will print the first x fibonacci numbers. Also calculate the average value. 
 * 
 * @author Andrei Cirlan
 * 14 Dec 201811:38:31

 */
import java.util.Scanner;

public class FibonacciNumbers {

	public static void main(String[] args) {
		
		int sumFibonacci = 1;
		int firstNumber = -1;
		int secondNumber;
		float average = 0;
		
		System.out.println("Adauga un numar :  ");			
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		if(number == 0) {
			System.out.print("Suma este: " + firstNumber);
		} else {
			System.out.println("The first " + number + " Fibonacci numbers are: ");
			for (int i = 1; i <= number; i++) {
				secondNumber = firstNumber + sumFibonacci;
				firstNumber = sumFibonacci;
				sumFibonacci = secondNumber;
				System.out.print(sumFibonacci + " ");
				average = (float)(sumFibonacci / i);
			}
			System.out.println();
			System.out.println("The average is: " + average);
		}
		
		
	}

}
