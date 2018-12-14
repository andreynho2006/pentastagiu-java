import java.util.Scanner;
/**
 * File: AverageSum.java
 * 
 * Program that will calculate the average and sum of all numbers between the range of 2 numbers.
 * @author Andrei Cirlan
 * 14 Dec 201811:21:14
 */
public class AverageSum {

	public static void main(String[] args) {
		
		int sum = 0;
		float average = 0;

		System.out.println("Adauga doua numere pentru a calcula "
						 + "suma tuturor numerelor cuprinse intre "
						 + "ele si media celor doua numere:  ");                 
		
		Scanner in = new Scanner(System.in);	          
		int number1 = in.nextInt();                                 
		int number2 = in.nextInt();
		
		int firstNumber;
		int secondNumber;
		
		// verificam care numar introdus este mai mic
		if(number1 < number2) {
			firstNumber = number1;
			secondNumber = number2;
		} else if(number1 == number2) {
			firstNumber = number1;
			secondNumber = number2;
		} else {
			firstNumber = number2;
			secondNumber = number1;
		}
		
		for(int i = firstNumber; i <= secondNumber; i++) {
			sum += i;
		}
		if(number1 == number2) sum = number1 + number2;
		System.out.println("Suma numerelor cuprinse intre cele 2 numere este: " + sum);
		average = (float)(firstNumber + secondNumber) / 2;
		System.out.println("Media celor 2 numere este: " + average);
	}

}
