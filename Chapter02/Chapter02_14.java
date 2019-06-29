package chapter02;
/*
 * (Health application: computing BMI) Body Mass Index (BMI) is a measure of
health on weight. It can be calculated by taking your weight in kilograms and
dividing by the square of your height in meters. Write a program that prompts the
user to enter a weight in pounds and height in inches and displays the BMI. Note
that one pound is 0.45359237 kilograms and one inch is 0.0254 meters. Here is
a sample run:
 */

import java.util.Scanner;

public class Chapter02_14 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter weight in pounds:");
		double pounds = input.nextDouble();
		System.out.print("Enter height in inches:");
		double inches = input.nextDouble();

		double kilogram = pounds * 0.45359237;
		double height = inches * 0.0254;

		System.out.printf("BMI is : %.4f", (kilogram / height));
	}

}
