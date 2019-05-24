package chapter05;
/*
 * (Count uppercase letters) Write a program that prompts the user to enter a string
and displays the number of the uppercase letters in the string.
 */

import java.util.Scanner;

public class Chapter05_50 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a string:");

		String str = input.nextLine();
		int counterUpperCase = 0 ;
		String upperCaseLetters="";
				
				for (int i = 0 ; i< str.length(); i++) {
					
					if (str.charAt(i)<= 90 &&str.charAt(i)>= 65 ) {
						counterUpperCase++;
						upperCaseLetters +=str.charAt(i);
					}
				}
				System.out.println("The number of uppercase letters is : " +counterUpperCase);
				System.out.println("The uppercase letter are :" + upperCaseLetters);

	}

}
