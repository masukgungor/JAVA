package chapter02;
/*
 * (Science: calculating energy) Write a program that calculates the energy needed
to heat water from an initial temperature to a final temperature. Your program
should prompt the user to enter the amount of water in kilograms and the initial
and final temperatures of the water. The formula to compute the energy is
Q = M * (finalTemperature – initialTemperature) * 4184
where M is the weight of water in kilograms, temperatures are in degrees Celsius,
and energy Q is measured in joules
 */

import java.util.Scanner;;

public class Chapter02_10 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the amount of water in kilograms:");
		double weight = input.nextDouble();

		System.out.println("Enter the initial temperature:");
		double teminitialTemperaturep1 = input.nextDouble();

		System.out.println("Enter the final temperature:");
		double temfinalTemperature = input.nextDouble();

		double Q = weight * (temfinalTemperature - teminitialTemperaturep1) * 4184;

		System.out.println("The energy needed is :" + Q);

	}

}
