package chapter02;

/*
 * (Current time) Listing 2.7, ShowCurrentTime.java, gives a program that displays
the current time in GMT. Revise the program so that it prompts the user to enter
the time zone offset to GMT and displays the time in the specified time zone
 */

import java.util.Scanner;

public class Chapter02_08 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the time zone offset to GMT:");

		int offset = input.nextInt();

		long totalMiliseconds = System.currentTimeMillis();

		long totalSeconds = totalMiliseconds / 1000;
		long curentSeconds = totalSeconds % 60;

		long totalMinuts = totalSeconds / 60;
		long currentMinuts = totalMinuts % 60;

		long totalHours = totalMinuts / 60;
		long curentHours = totalHours % 24 + offset;

		System.out.println("The current time is : " + curentHours + " : " + currentMinuts + " : " + curentSeconds);
		input.close();

	}
}
