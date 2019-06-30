package chapter03;
/*
 * (Palindrome number) Write a program that prompts the user to enter a three-digit
integer and determines whether it is a palindrome number. A number is palindrome
if it reads the same from right to left and from left to right.
 */

import java.util.Scanner;

public class Chapter03_12 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("enter a three-digit integer");

		int number = input.nextInt();

		int digit1 = number % 10;

		int digit3 = number / 100;

		System.out.println(number + (digit1 == digit3 ? "  is a polindrome" : "  is not a polindrome"));
		input.close();

	}

}
