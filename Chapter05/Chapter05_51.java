package chapter05;
/*
 * (Longest common prefix) Write a program that prompts the user to enter two
strings and displays the largest common prefix of the two strings. Here are some
sample runs:
 */

import java.util.Scanner;

public class Chapter05_51 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the first string:");

		String str1 = input.nextLine();

		System.out.println("Enter the second string:");

		String str2 = input.nextLine();

		int minLength = Math.min(str1.length(), str2.length());

		String commonStr = "";

		for (int i = 0; i < minLength; i++) {
			if (str1.charAt(i) != str2.charAt(i)) {
				break;

			} else if (str1.charAt(i) == str2.charAt(i)) {

				commonStr += str1.charAt(i);
			}

		}

		if (commonStr.length() == 0) {
			System.out.println(str1 + " and " + str2 + " have no common prefix");
		} else {
			System.out.println("The common prefix is : " + commonStr);
		}
	}
}
