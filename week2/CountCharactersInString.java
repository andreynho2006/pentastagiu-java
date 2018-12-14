/**
 * File: CountCharactersInString.java
 * 
 *  Java program that will count how many times a character appears in a String
 * 
 * @author Andrei Cirlan
 * 14 Dec 201812:25:31

 */

public class CountCharactersInString {

	public static void main(String[] args) {
		String base = "Hello java world";
		char test = 'a';
		
		System.out.println(countOccurences(base, test));
		
	}
	public static int countOccurences(String haystack, char needle) {
		int count = 0;
		for(int i = 0; i < haystack.length(); i++) {
			if(haystack.charAt(i) == needle) {
				count++;
			}
		}
		return count;
	}
}
