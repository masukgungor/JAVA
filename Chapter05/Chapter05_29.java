package chapter05;
/*
 * (Display calendars) Write a program that prompts the user to enter the year and
first day of the year and displays the calendar table for the year on the console. For
example, if the user entered the year 2013, and 2 for Tuesday, January 1, 2013,
your program should display the calendar for each month in the year, as follows:
 */

import java.util.Scanner;

public class Chapter05_29 {
	public static void main(String[] args) {

		// create a scanner
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter the year , and the first day of theyear ( For example 2013 ,Tuesday)");

		int year = input.nextInt();

		String day = input.next().toLowerCase();

		System.out.println("Please enter the month you want to see the calendar table ");

		String calendarMonth = input.next().toLowerCase();

		String[] selectDay = "monday tuesday wednesday thursday friday saturday sunday".split(" ");

		String[] selectMounth = "January February March April May June July August September October November December"
				.split(" ");
		String[] showMounth = "January February March April May June July August September October November December"
				.split(" ");

		int determineMonthDayNumber = 0;
		if (selectMounth[0].toLowerCase().contentEquals(calendarMonth)) {
			determineMonthDayNumber = 31;
		}
		int indexOfDay = -1; // for index

		// to determine which index in week
		for (int i = 0; i < 7; i++) {
			if (day.contains(selectDay[i])) {

				indexOfDay = i;
			}
		}

		// 1 January year and day
		String[] dayOfmonth = selectMounth;
		dayOfmonth[0] = day;

		// determine leap year
		boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

		int temp = 0;
		int selectDayIndex = 0; // determine day


		if (isLeapYear) {
			for (int i = 1; i < 12; i++) {
				// 31 months
				if (i == 4 || i == 6 || i == 9 || i == 11) {
					if (selectMounth[i].toLowerCase().contentEquals(calendarMonth))
						determineMonthDayNumber = 30;
					temp = 2;
				} else if (i == 2) { // for february
					if (selectMounth[i].toLowerCase().contentEquals(calendarMonth))
						determineMonthDayNumber = 31;
					temp = 1;

				} else { // 30 months
					if (selectMounth[i].toLowerCase().contentEquals(calendarMonth))
						determineMonthDayNumber = 31;
					temp = 3;

				}
				if (i == 1) {
					if (selectMounth[i].toLowerCase().contentEquals(calendarMonth))
						determineMonthDayNumber = 29;
				}

				// calculation of the week head
				if ((indexOfDay + temp) > 6) {
					selectDayIndex = indexOfDay + temp - 7;
					indexOfDay = selectDayIndex;
				} else {
					selectDayIndex = indexOfDay + temp;
					indexOfDay = selectDayIndex;
				}

				dayOfmonth[i] = selectDay[selectDayIndex];
			}

		} else {
			for (int i = 1; i < 12; i++) {
				// 31 months
				if (i == 4 || i == 6 || i == 9 || i == 11) {
					if (selectMounth[i].toLowerCase().contentEquals(calendarMonth))
						determineMonthDayNumber = 30;
					temp = 2;
				} else if (i == 2) {// for february
					if (selectMounth[i].toLowerCase().contentEquals(calendarMonth))
						determineMonthDayNumber = 31;
					temp = 0;
				} else {// 30 months
					if (selectMounth[i].toLowerCase().contentEquals(calendarMonth))
						determineMonthDayNumber = 31;
					temp = 3;
				}
				if (i == 1) {
					if (selectMounth[i].toLowerCase().contentEquals(calendarMonth))
						determineMonthDayNumber = 28;
				}

				// calculation of the week head
				if ((indexOfDay + temp) > 6) {
					selectDayIndex = indexOfDay + temp - 7;
					indexOfDay = selectDayIndex;
				} else {
					selectDayIndex = indexOfDay + temp;
					indexOfDay = selectDayIndex;
				}
				dayOfmonth[i] = selectDay[selectDayIndex];
			}

		}
		
		int indexOfdayTheMounth = 0;
		for (int i = 1; i < 12; i++) {

			if (showMounth[i].toLowerCase().contentEquals(calendarMonth)) {
				indexOfdayTheMounth = i;
			}
		}

		System.out.printf("\t\t%5s %d \n", showMounth[indexOfdayTheMounth], year);
		System.out.println("-------------------------------------------");
		int counter = 0;
		System.out.println("Sun Mon Tue Wed Thu Fri Sat");
		for (int i = 1; i <= determineMonthDayNumber; i++) {
			if (dayOfmonth[indexOfdayTheMounth].contentEquals(selectDay[6])) {
				System.out.printf("%-4d", i);
				counter++;
				if (counter % 7 == 0) {
					System.out.println();
					counter = 0;
				}
			} else if (dayOfmonth[indexOfdayTheMounth].contentEquals(selectDay[0])) {

				if (i == 1) {
					System.out.print("    ");
					counter++;
				}
				System.out.printf("%-4d", i);
				counter++;
				if (counter % 7 == 0) {
					System.out.println();
					counter = 0;
				}
			} else if (dayOfmonth[indexOfdayTheMounth].contentEquals(selectDay[1])) {

				if (i == 1) {
					System.out.print("        ");
					counter += 2;
				}
				System.out.printf("%-4d", i);
				counter++;
				if (counter % 7 == 0) {
					System.out.println();
					counter = 0;
				}
			} else if (dayOfmonth[indexOfdayTheMounth].contentEquals(selectDay[2])) {

				if (i == 1) {
					System.out.print("            ");
					counter += 3;
				}
				System.out.printf("%-4d", i);
				counter++;
				if (counter % 7 == 0) {
					System.out.println();
					counter = 0;
				}
			} else if (dayOfmonth[indexOfdayTheMounth].contentEquals(selectDay[3])) {

				if (i == 1) {
					System.out.print("                ");
					counter += 4;
				}
				System.out.printf("%-4d", i);
				counter++;
				if (counter % 7 == 0) {
					System.out.println();
					counter = 0;
				}
			} else if (dayOfmonth[indexOfdayTheMounth].contentEquals(selectDay[4])) {

				if (i == 1) {
					System.out.print("                    ");
					counter += 5;
				}
				System.out.printf("%-4d", i);
				counter++;
				if (counter % 7 == 0) {
					System.out.println();
					counter = 0;
				}
			} else if (dayOfmonth[indexOfdayTheMounth].contentEquals(selectDay[5])) {

				if (i == 1) {
					System.out.print("                        ");
					counter += 6;
				}
				System.out.printf("%-4d", i);
				counter++;
				if (counter % 7 == 0) {
					System.out.println();
					counter = 0;
				}
			}
		}

	}

}
