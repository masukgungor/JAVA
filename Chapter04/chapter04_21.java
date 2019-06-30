package chapter04;
/*
 * (Check SSN) Write a program that prompts the user to enter a Social Security
number in the format DDD-DD-DDDD, where D is a digit. Your program should
check whether the input is valid
 */

import java.util.Scanner;

public class chapter04_21 {
	public static void main(String[] args) {

		System.out.print("Enter a SSN: ");

		Scanner input = new Scanner(System.in);

		String key = input.nextLine();

		if (key.length() == 11 && Character.isDigit(key.charAt(0)) && Character.isDigit(key.charAt(0))
				&& Character.isDigit(key.charAt(1)) && Character.isDigit(key.charAt(2)) && key.charAt(3) == '-'
				&& Character.isDigit(key.charAt(4)) && Character.isDigit(key.charAt(5)) && key.charAt(6) == '-'
				&& Character.isDigit(key.charAt(7)) && Character.isDigit(key.charAt(8))
				&& Character.isDigit(key.charAt(9)) && Character.isDigit(key.charAt(10))) {

			System.out.println(key + " is valid social security number");

		} else {
			System.out.println(key + " is invalid social security number");
		}
		input.close();
	}
}
