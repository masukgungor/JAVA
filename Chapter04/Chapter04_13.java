package chapter04;
/*
 * (Vowel or consonant?) Write a program that prompts the user to enter a letter and
check whether the letter is a vowel or consonant
 */

import java.util.Scanner;

public class Chapter04_13 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter a letter : ");

		String chr = input.next();

		String s = "a,e,i,ý,u,ü,o,ö";

		int decimal = chr.charAt(0);

		if (decimal < 'a' || decimal > 'z') {

			System.err.println("Invalid input");

			System.exit(0);
		}

		System.out.println(chr + (s.contains(chr.toLowerCase()) ? " is a vowel" : "  is a consonant"));

		input.close();
	}

}
