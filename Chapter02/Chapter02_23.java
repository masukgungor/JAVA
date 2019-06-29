package chapter02;
/*
 * (Cost of driving) Write a program that prompts the user to enter the distance to
drive, the fuel efficiency of the car in miles per gallon, and the price per gallon,
and displays the cost of the trip
 */

import java.util.Scanner;

public class Chapter02_23 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter the driving distance: ");
		double distance = input.nextDouble();

		System.out.print("Enter miles per gallon: ");
		double fuelEfficiency = input.nextDouble();

		System.out.print("Enter price per gallon: ");
		double price = input.nextDouble();

		double costOfDrive = (distance / fuelEfficiency) * price;

		System.out.printf("The cost of driving is : $ %.2f", costOfDrive);
	}

}
