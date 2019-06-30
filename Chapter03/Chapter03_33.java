package chapter03;
/*
 * (Financial: compare costs) Suppose you shop for rice in two different packages.
You would like to write a program to compare the cost. The program prompts the
user to enter the weight and price of the each package and displays the one with
the better price.
 */

import java.util.Scanner;

public class Chapter03_33 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter weight and price for package 1: ");

		double package1 = input.nextDouble();
		double price1 = input.nextDouble();

		double sum1 = price1 / package1;

		System.out.print("Enter weight and price for package 2: ");
		double package2 = input.nextDouble();
		double price2 = input.nextDouble();

		double sum2 = price2 / package2;

		if (sum1 > sum2) {
			System.out.println("Package 2 has a better price.");

		} else if (sum1 < sum2) {

			System.out.println("Package 1 has a better price.");
		} else {
			System.out.println("Two Packages have the same price.");
		}

		input.close();
	}

}
