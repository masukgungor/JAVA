package chapter02;
/*
 * (Financial application: monetary units) Rewrite Listing 2.10, ComputeChange
.java, to fix the possible loss of accuracy when converting a double value to an
int value. Enter the input as an integer whose last two digits represent the cents.
For example, the input 1156 represents 11 dollars and 56 cents.
 */

import java.util.Scanner;

public class Chapter02_22 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter an amount as integer, for example 1156 for 11.56: ");
		int amount = input.nextInt();
		
		double enterAmount=  amount /100.0;

		int oneDollars = amount / 100;
		amount %= 100;

		int quarters = amount / 25;
		amount %= 25;

		int dimes = amount / 10;
		amount %= 10;

		int nickels = amount / 5;
		amount %= 5;

		int pennies = amount;

		System.out.println("Your amount " + enterAmount + " $ :");
		System.out.println(" " + oneDollars + " dollars");
		System.out.println(" " + quarters + " quarters");
		System.out.println(" " + dimes + " dimes");
		System.out.println(" " + nickels + " nickels");
		System.out.println(" " + pennies + " pennies");
		input.close();
	}

}
