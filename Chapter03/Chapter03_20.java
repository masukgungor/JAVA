package chapter03;

import java.util.Scanner;

/*
 * (Science: wind-chill temperature) Programming Exercise 2.17 gives a formula
to compute the wind-chill temperature. The formula is valid for temperatures in
the range between -58ºF and 41ºF and wind speed greater than or equal to 2.
Write a program that prompts the user to enter a temperature and a wind speed.
The program displays the wind-chill temperature if the input is valid; otherwise,
it displays a message indicating whether the temperature and/or wind speed is
invalid.
 */
public class Chapter03_20 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the temperature in Fahrenheit between -58°F and 41°F:");

		double temp = input.nextDouble();
		if (!(41 >= temp && temp >= -51)) {
			System.out.println("temperature is invalid");
			System.exit(0);
		}

		System.out.println("Enter the wind speed (>=2) in miles per hour:");

		int speed = input.nextInt();

		if (!(speed >= 2)) {
			System.out.println("wind speed is invalid");
			System.exit(0);
		}

		double tmc = 35.74 + 0.621 * temp - 35.75 * Math.pow(speed, 0.16) + 0.4275 * temp * Math.pow(speed, 0.16);

		System.out.printf("The wind chill index is : %.5f", tmc);
		input.close();

	}

}
