package chapter03;
/*
 * (Health application: BMI) Revise Listing 3.4, ComputeAndInterpretBMI.java, to
let the user enter weight, feet, and inches. For example, if a person is 5 feet and 10
inches, you will enter 5 for feet and 10 for inches.
 */

import java.util.Scanner;

public class Chapter03_06 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final double KILOGRAMS_PER_POUND = 0.45359237; // Constant
		final double METERS_PER_INCH = 0.0254; // Constant
		final double FEET_PER_INCH = 0.0833333; // Constant

		// Prompt the user to enter weight in pounds
		System.out.print("Enter weight in pounds: ");
		double weight = input.nextDouble();

		System.out.print("enter feet in meters ");

		double feet = input.nextDouble();

		// Prompt the user to enter height in inches
		System.out.print("Enter height in inches: ");
		double inches = input.nextDouble();

		inches = inches + feet / FEET_PER_INCH;

		// Compute BMI
		double weightInKilograms = weight * KILOGRAMS_PER_POUND;
		double heightInMeters = inches * METERS_PER_INCH;
		double bmi = weightInKilograms / (heightInMeters * heightInMeters);

		// Display result
		System.out.printf("BMI is %.2f\n", bmi);
		if (bmi < 18.5)
			System.out.println("Underweight");
		else if (bmi < 25)
			System.out.println("Normal");
		else if (bmi < 30)
			System.out.println("Overweight");
		else
			System.out.println("Obese");
		input.close();
	}
}