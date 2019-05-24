package chapter05;
/*
 * (Business application: checking ISBN ) Use loops to simplify Programming
Exercise 3.9
 */

import java.util.Scanner;

public class Chapter05_36 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 9 number (0-9) ");

		String number = input.nextLine();

		String[] tempNumber = number.split("");

		int total = 0;
		for (int i = 0, j = 1; i < 9; i++, j++) {

			total += Integer.parseInt(tempNumber[i]) * j;

		}

		if (total % 11 == 10) {
			number += "X";

		} else {
			number += total % 11;
		}

		System.out.println(number);
	}

}
