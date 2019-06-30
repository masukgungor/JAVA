package chapter03;
/*
 * (Current time) Revise Programming Exercise 2.8 to display the hour using a
12-hour clock.
 */

import java.util.Scanner;

public class Chapter03_30 {

	public static void main(String[] args) {

		System.out.print("Enter the time zone offset to GMT: ");
		Scanner input = new Scanner(System.in);

		long gmtChange = input.nextLong();

		long totalMiliSecond = System.currentTimeMillis();

		long totalSecond = totalMiliSecond / 1000;

		long currentSecond = totalSecond % 60;

		long totalMinute = totalSecond / 60;

		long currentMinute = totalMinute % 60;

		long totalHour = totalMinute / 60;

		long currentHour = (totalHour) % 24 + gmtChange;

		System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond
				+ ((currentHour >= 12 && currentHour < 24) ? " PM" : " AM"));

		input.close();

	}

}
