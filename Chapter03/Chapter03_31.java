package chapter03;
/*
 * (Financials: currency exchange) Write a program that prompts the user to enter
the exchange rate from currency in U.S. dollars to Chinese RMB. Prompt the user
to enter 0 to convert from U.S. dollars to Chinese RMB and 1 to convert from
Chinese RMB and U.S. dollars. Prompt the user to enter the amount in U.S. dollars
or Chinese RMB to convert it to Chinese RMB or U.S. dollars, respectively.
 */

import java.util.Scanner;

public class Chapter03_31 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter the exchange rate from dollars to RMB: ");
		double exchange = input.nextDouble();

		System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa: ");

		int convert = input.nextInt();

		if (convert == 0) {
			System.out.print("Enter the dollar amount: ");

			double amount = input.nextDouble();

			System.out.println(amount + "$ is  : " + (exchange * amount) + " yuan ");

		} else if (convert == 1) {
			System.out.print("Enter the RMB amount:");

			double amount = input.nextDouble();

			System.out.println(amount + " yuan : " + (amount / exchange) + "$");

		} else {
			System.out.println("Incorrect input ");
		}
		input.close();
	}

}
