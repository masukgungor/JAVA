package chapter02;
/*
 * (Find the number of years) Write a program that prompts the user to enter the
minutes (e.g., 1 billion), and displays the number of years and days for the minutes.
For simplicity, assume a year has 365 days.
 */

import java.util.Scanner;

public class Chapter02_07 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the number of minutes:");

		int numberOfMinutes = input.nextInt();

		int year = numberOfMinutes / (60 * 24 * 365);
		int day = (numberOfMinutes % 525600) / (24 * 60);

		System.out.println(numberOfMinutes + " minutes is approximately " + year + " years and " + day + "  days");

	}

}
