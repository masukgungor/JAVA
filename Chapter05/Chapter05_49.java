package chapter05;
/*
 * (Count vowels and consonants) Assume letters A, E, I, O, and U as the vowels.
Write a program that prompts the user to enter a string and displays the number
of vowels and consonants in the string.
 */

import java.util.Scanner;

public class Chapter05_49 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter a string:");

		String str = input.nextLine().toLowerCase();

		String vowels = "aeiou";
		int counterVowel = 0;
		int counterWhitespace= 0;

		for (int i = 0; i < vowels.length(); i++) {
			for (int j = 0; j < str.length(); j++) {
				
				if (str.charAt(j) == vowels.charAt(i)) {
					counterVowel++;
				}
				
				if (!(Character.isLetter(str.charAt(j)))&& i ==0) {
					counterWhitespace++;
					
				}
				
			}
			
		}
		System.out.println("The number of vowels is : " + counterVowel);
		System.out.println("The number of consonants is : " + (str.length()-counterWhitespace - counterVowel));
	}

}
