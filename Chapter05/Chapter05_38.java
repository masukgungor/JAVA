package chapter05;

import java.util.Scanner;

/*
 * (Decimal to octal) Write a program that prompts the user to enter a decimal
integer and displays its corresponding octal value. Don’t use Java’s Integer
.toOctalString(int) in this program.
 */
public class Chapter05_38 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter decimal integer number");

		int number = input.nextInt();

		String decimalToBinary = "";
		int remain = 0;

		while (7 < number) {
			remain = number % 8;
			number /= 8;
			decimalToBinary = remain + decimalToBinary;

		}

		System.out.println(number + decimalToBinary);
	}

}
