package chapter05;
/*
 * (Find the factors of an integer) Write a program that reads an integer and displays
all its smallest factors in increasing order. For example, if the input integer is
120, the output should be as follows: 2, 2, 2, 3, 5.
 */

import java.util.Scanner;

public class Chapter05_16 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Please enter one  integer number");

		int number = input.nextInt();

		int divider = 2;

		String factorOfNumber = "";

		while (divider < number) {

			if (number % divider != 0) {
				divider++;
			}

			if (number % divider == 0) {
				factorOfNumber += divider + " ";
				number /= divider;
			}
		}

		System.out.println(" Factor of " + number + " : " + factorOfNumber + " ");
	}

}
