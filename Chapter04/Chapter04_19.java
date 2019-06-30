package chapter04;
/*
 * (Business: check ISBN-10) Rewrite the Programming Exercise 3.9 by entering the
ISBN number as a string.
 */

import java.util.Scanner;

public class Chapter04_19 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first 9 digits of an ISBN as integer: ");

		String integer = input.nextLine();

		int a = Character.getNumericValue(integer.charAt(0));
		int b = Character.getNumericValue(integer.charAt(1));
		int c = Character.getNumericValue(integer.charAt(2));

		int d = Character.getNumericValue(integer.charAt(3));
		int e = Character.getNumericValue(integer.charAt(4));
		int f = Character.getNumericValue(integer.charAt(5));

		int g = Character.getNumericValue(integer.charAt(6));
		int h = Character.getNumericValue(integer.charAt(7));
		int i = Character.getNumericValue(integer.charAt(8));

		int sum = (a * 1 + b * 2 + c * 3 + d * 4 + e * 5 + f * 6 + g * 7 + h * 8 + i * 9) % 11;

		if (sum == 10) {
			System.out.println("The ISBN-10 number is : " + a + b + c + d + e + f + g + h + i + "X");
		} else {
			System.out.println("The ISBN-10 number is : " + a + b + c + d + e + f + g + h + i + sum);
		}
		input.close();

	}

}
