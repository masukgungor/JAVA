package chapter04;
/*
 * (Financial application: monetary units) Rewrite Listing 2.10, ComputeChange.
java, to fix the possible loss of accuracy when converting a float value to an int
value. Read the input as a string such as "11.56". Your program should extract
the dollar amount before the decimal point and the cents after the decimal amount
using the indexOf and substring methods.
 */

import java.util.Scanner;

public class Chapter04_26 {

	public static void main(String[] args) {

		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Receive the amount
		System.out.print("Enter an amount in double, for example 11.56: ");
		String str = input.nextLine();

		int amount;

		if (str.indexOf('.') == -1) {
			amount = Integer.parseInt(str);
		} else {

			String dollars = str.substring(0, str.indexOf('.'));
			String cents = str.substring(str.indexOf('.') + 1);
			amount = Integer.parseInt(dollars + cents);
		}

		int remainingAmount = amount;

		// Find the number of one dollars
		int numberOfOneDollars = remainingAmount / 100;
		remainingAmount = remainingAmount % 100;

		// Find the number of quarters in the remaining amount
		int numberOfQuarters = remainingAmount / 25;
		remainingAmount = remainingAmount % 25;

		// Find the number of dimes in the remaining amount
		int numberOfDimes = remainingAmount / 10;
		remainingAmount = remainingAmount % 10;

		// Find the number of nickels in the remaining amount
		int numberOfNickels = remainingAmount / 5;
		remainingAmount = remainingAmount % 5;

		// Find the number of pennies in the remaining amount
		int numberOfPennies = remainingAmount;

		// Display results
		System.out.println("Your amount " + amount + " consists of");
		System.out.println("    " + numberOfOneDollars + " dollars");
		System.out.println("    " + numberOfQuarters + " quarters ");
		System.out.println("    " + numberOfDimes + " dimes");
		System.out.println("    " + numberOfNickels + " nickels");
		System.out.println("    " + numberOfPennies + " pennies");

		input.close();
	}

}
