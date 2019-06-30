package chapter02;
/*
 *(Physics: finding runway length) Given an airplane’s acceleration a and take-off
speed v, you can compute the minimum runway length needed for an airplane to
take off using the following formula:
length =v2/2a
Write a program that prompts the user to enter v in meters/second (m/s) and the
acceleration a in meters/second squared (m/s2), and displays the minimum runway
length.
 */

import java.util.Scanner;;

public class Chapter02_12 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter speed and acceleration:");

		double speed = input.nextDouble();
		double eacceleration = input.nextDouble();

		double lenght = (speed * speed) / (2 * eacceleration);

		System.out.printf("The minimum runway length for this airplane is :%.3f", lenght);
		input.close();
	}

}
