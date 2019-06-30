package chapter04;
/*
 * (Decimal to hex) Write a program that prompts the user to enter an integer between
0 and 15 and displays its corresponding hex number.
 */

import java.util.Scanner;

public class Chapter04_11 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter a decimal value (0 to 15):");

		int number = input.nextInt();

		if (number < 0 || number > 15) {
			System.err.println("Invalid input ");
			System.exit(0);
		}

		String hex = Integer.toHexString(number);

		System.out.println("The hex value is  " + hex.toUpperCase());

		input.close();

	}

}
