package chapter05;
/*
 * (Display pyramid) Write a program that prompts the user to enter an integer from
1 to 15 and displays a pyramid, as shown in the following sample run:
 */

import java.util.Scanner;

public class Chapter05_17 {

	public static void main(String[] args) {
		// Create a Scanner object
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter an  integer number ( 1 - 15 )");

		int number = input.nextInt();

		int fittingspace = 0; // to space adjustment

		// Display pyramid
		for (int i = 0; i < number; i++) {
			// Create spaces in each row
			for (int j = i; j < 2 * number - fittingspace; j++) {

				System.out.print(" ");
			}
			// control for two digit number
			if (i >= 8) {
				fittingspace++;
			}
			fittingspace++;

			// Create descending numbers in each row
			for (int k = i; k >= 0; k--) {
				System.out.print(" " + (k + 1));

			}
			// Create ascending number in each row
			for (int l = 0; l < i; l++) {
				System.out.print(" " + (l + 2));

			}

			System.out.println();

		}

	}
}
