package chapter03;

/*
 * (Find future dates) Write a program that prompts the user to enter an integer for
today’s day of the week (Sunday is 0, Monday is 1, …, and Saturday is 6). Also
prompt the user to enter the number of days after today for a future day and display
the future day of the week.
 */
import java.util.Scanner;

public class Chapter03_05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter today's day:");
		int today = input.nextInt();

		System.out.print(
				"Enter the number of days elapsed since today (Sunday is 0, Monday is 1, …, and Saturday is 6).: ");

		int tempNextDay = input.nextInt();

		tempNextDay %= 7;

		String day = "";
		switch (today) {
		case 0:
			day = "sunday";
			break;
		case 1:
			day = "monday";
			break;
		case 2:
			day = "tuesday";
			break;
		case 3:
			day = "wednesday";
			break;
		case 4:
			day = "thursday";
			break;
		case 5:
			day = "friday";
			break;
		case 6:
			day = "saturday";
			break;
		}

		String nextDay = "";
		switch (tempNextDay) {
		case 0:
			nextDay = "sunday";
			break;
		case 1:
			nextDay = "monday";
			break;
		case 2:
			nextDay = "tuesday";
			break;
		case 3:
			nextDay = "wednesday";
			break;
		case 4:
			nextDay = "thursday";
			break;
		case 5:
			nextDay = "friday";
			break;
		case 6:
			nextDay = "saturday";
			break;
		}

		System.out.println("today is :" + day + "  next day : " + nextDay);

		input.close();
	}

}
