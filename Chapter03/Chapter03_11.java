package chapter03;

/*
 * (Find the number of days in a month) Write a program that prompts the user
to enter the month and year and displays the number of days in the month. For
example, if the user entered month 2 and year 2012, the program should display
that February 2012 had 29 days. If the user entered month 3 and year 2015, the
program should display that March 2015 had 31 days.
 */
import java.util.Scanner;

public class Chapter03_11 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("enter the mounth and the year as integer");

		int month = input.nextInt();
		int year = input.nextInt();

		boolean leapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

		switch (month) {
		case 1:
			System.out.println("january  " + year + " had " + 31 + "  day");
			break;
		case 2:
			System.out.println("february " + year + (leapYear ? " had " + 29 + "  day" : " had " + 28 + "  day"));
			break;
		case 3:
			System.out.println("march  " + year + " had " + 31 + "  day");
			break;
		case 4:
			System.out.println("april  " + year + " had " + 30 + "  day");
			break;
		case 5:
			System.out.println("May  " + year + " had " + 31 + "  day");
			break;
		case 6:
			System.out.println("june  " + year + " had " + 30 + "  day");
			break;
		case 7:
			System.out.println("july  " + year + " had " + 31 + "  day");
			break;
		case 8:
			System.out.println("augst  " + year + " had " + 31 + "  day");
			break;
		case 9:
			System.out.println("september  " + year + " had " + 30 + "  day");
			break;
		case 10:
			System.out.println("october  " + year + " had " + 31 + "  day");
			break;
		case 11:
			System.out.println("november  " + year + " had " + 30 + "  day");
			break;
		case 12:
			System.out.println("december  " + year + " had " + 31 + "  day");
			break;

		}
		input.close();
	}

}
