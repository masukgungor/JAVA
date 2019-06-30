package chapter04;
/*
 * (Check substring) Write a program that prompts the user to enter two strings and
reports whether the second string is a substring of the first string.
 */

import java.util.Scanner;

public class Chapter04_22 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter string s1: ");

		String s1 = input.nextLine();
		System.out.print("Enter string s2: ");

		String s2 = input.nextLine();

		if (s1.contains(s2)) {
			System.out.println(s2 + "is substring " + s1);
		} else {
			System.out.println(s2 + "is not substring " + s1);
		}
		input.close();

	}

}
