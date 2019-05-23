package chapter05;
/*
 * (Display the first days of each month) Write a program that prompts the user to
enter the year and first day of the year, and displays the first day of each month
in the year. For example, if the user entered the year 2013, and 2 for Tuesday,
January 1, 2013, your program should display the following output:
January 1, 2013 is Tuesday
...
December 1, 2013 is Sunday
 */

import java.util.Scanner;

public class Chapter05_28 {

	public static void main(String[] args) {

		// create a scanner
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter the year , and the first day of theyear ( For example 2013 ,Tuesday)");

		int year = input.nextInt();

		String day = input.next().toLowerCase();

		String[] selectDay = "monday tuesday wednesday thursday friday saturday sunday".split(" ");

		String[] selectMounth = "January February March April May June July August September October November December"
				.split(" ");

		int indexOfDay = -1; // for index

		// to determine which index in week
		for (int i = 0; i < 7; i++) {
			if (day.contains(selectDay[i])) {

				indexOfDay = i;
			}
		}

		// 1 January year and day
		String firstDayOfMonth = "1 " + selectMounth[0] + "  " + year + "    :" + day;

		// determine leap year
		boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

		int temp = 0;
		int selectDayIndex = 0; // determine day

		for (int i = 1; i < 12; i++) {
			firstDayOfMonth += '\n';
			// 31 months
			if (i == 4 || i == 6 || i == 9 || i == 11) {
				temp = 2;
			} else if (i == 2 && isLeapYear) { // for february
				temp = 1;

			} else if (i == 2) {
				temp = 0;
			} else { // 30 months
				temp = 3;
			}

			// calculation of the week head
			if ((indexOfDay + temp) > 6) {
				selectDayIndex = indexOfDay + temp - 7;
				indexOfDay = selectDayIndex;
			} else {
				selectDayIndex = indexOfDay + temp;
				indexOfDay = selectDayIndex;
			}

			firstDayOfMonth += "1 " + selectMounth[i] + "  " + year + "  : " + selectDay[selectDayIndex];

		}

		// display result
		System.out.println(firstDayOfMonth);
	}

}
