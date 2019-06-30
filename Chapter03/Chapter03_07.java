package chapter03;
/*
 * (Financial application: monetary units) Modify Listing 2.10, ComputeChange
.java, to display the nonzero denominations only, using singular words for single
units such as 1 dollar and 1 penny, and plural words for more than one unit such
as 2 dollars and 3 pennies.
 */

import java.util.Scanner;

public class Chapter03_07 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter an amount as integer, for example 1156 for 11.56: ");
		int amount = input.nextInt();

		double enterAmount = amount / 100.0;

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
		if (oneDollars != 0) {
			System.out.println((oneDollars > 1) ? oneDollars + " dollars" : oneDollars + " dollar");
		}
		if (quarters != 0) {
			System.out.println((quarters > 1) ? quarters + " quarters" : quarters + "quarter ");
		}
		if (dimes != 0) {
			System.out.println((dimes > 1) ? dimes + " dimes " : dimes + " dime");
		}
		if (nickels != 0) {
			System.out.println((nickels > 1) ? nickels + " nickels " : nickels + " nickel");
		}
		if (pennies != 0) {
			System.out.println((pennies > 1) ? pennies + "  pennies " : pennies + " pennie");
		}
		input.close();

	}

}
