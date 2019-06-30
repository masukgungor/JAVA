package chapter04;
/*
 * (Days of a month) Write a program that prompts the user to enter a year and the
first three letters of a month name (with the first letter in uppercase) and displays
the number of days in the month
 */

import java.util.Scanner;

public class Chapter04_17 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter a year: ");

		int year = input.nextInt();

		boolean leapyear = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));

		System.out.print("Enter a month: ");

		String month = input.next();

		String month1 = month.substring(0, 1).toUpperCase() + month.substring(1, 3).toLowerCase();

		System.out.println(month1);
		switch (month1) {
		case "Jan":
		case "Mar":
		case "May":
		case "July":
		case "Aug":
		case "Oct":
		case "Dec":
			System.out.println(month1 + " " + year + " has 31 days");
			break;
		case "Apr":
		case "Jun":
		case "Sep":
		case "Nov":
			System.out.println(month1 + " " + year + " has 30 days");
			break;
		case "Feb":
			System.out.println(month1 + " " + year + " has " + (leapyear ? 29 : 28) + " days");

		}
		input.close();

	}

}
