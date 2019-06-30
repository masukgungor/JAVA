package chapter03;
/*
 * (Science: day of the week) Zeller’s congruence is an algorithm developed by
Christian Zeller to calculate the day of the week.
 */

import java.util.Scanner;

public class Chapter03_21 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter year: (e.g., 2012): ");
		int year = input.nextInt();

		System.out.print("Enter month: 1-12:");
		int month = input.nextInt();

		System.out.print("Enter the day of the month:");
		int dayOfMonth = input.nextInt();

		if (month == 1) {
			month = 13;
			year--;
		}
		if (month == 2) {
			month = 14;
			year--;
		}

		int j = year / 100;
		int k = year % 100;

		int h = (dayOfMonth + ((26 * (month + 1)) / 10) + k + k / 4 + j / 4 + 5 * j) % 7;

		switch (h) {
		case 0:
			System.out.println("Day of the week is saturday");
			break;
		case 1:
			System.out.println("Day of the week is  sunday");
			break;
		case 2:
			System.out.println("Day of the week is monday");
			break;
		case 3:
			System.out.println("Day of the week is tuesday");
			break;
		case 4:
			System.out.println("Day of the week is wednesday");
			break;
		case 5:
			System.out.println("Day of the week is thursday");
			break;
		case 6:
			System.out.println("Day of the week is friday");
			break;

		}
		input.close();
	}

}
