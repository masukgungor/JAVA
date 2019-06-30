package chapter03;
/*
 * (Use the &&, || and ^ operators) Write a program that prompts the user to enter
an integer and determines whether it is divisible by 5 and 6, whether it is divisible
by 5 or 6, and whether it is divisible by 5 or 6, but not both.
 */

import java.util.Scanner;

public class Chapter03_26 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter an integer: ");

		int number = input.nextInt();

		if ((number % 5 == 0) && (number % 6 == 0)) {
			System.out.println("IS " + number + " divisible by 5 and 6");

		}
		if ((number % 5 == 0) || (number % 6 == 0)) {
			System.out.println("IS " + number + " divisible by 5 or 6");

		}
		if ((number % 5 == 0) ^ (number % 6 == 0)) {
			System.out.println("Is " + number + " divisible by 5 or 6, but not both?");
		}
		input.close();
	}

}
