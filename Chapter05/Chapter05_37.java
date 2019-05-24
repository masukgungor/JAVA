package chapter05;

import java.util.Scanner;

/*
 * (Decimal to binary) Write a program that prompts the user to enter a decimal
integer and displays its corresponding binary value. Don’t use Java’s Integer
.toBinaryString(int) in this program.
 */

public class Chapter05_37 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter decimal integer number");

		int number = input.nextInt();

		String decimalToBinary = "";
		int remain = 0;

		while (1 < number) {
			remain = number % 2;
			number /= 2;
			decimalToBinary = remain + decimalToBinary;

		}

		System.out.println(number + decimalToBinary);
	}

}
