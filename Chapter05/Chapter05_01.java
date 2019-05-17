package chapter05;

import java.util.Scanner;

/*(Count positive and negative numbers and compute the average of numbers) Write
a program that reads an unspecified number of integers, determines how many
positive and negative values have been read, and computes the total and average of
the input values (not counting zeros). Your program ends with the input 0.

*/

public class Chapter05_01 {
	public static void main(String[] args) {

		// Create a Scanner

		Scanner input = new Scanner(System.in);

		int positiveNumber = 0; // to determine number of positive values

		int negativeveNumber = 0;// to determine number of negative values
		double sumOfnumber = 0; // to calculate sum of number 

		double average = 0; // to calculate average of total number values

		// Prompt the user to enter a integer

		System.out.println("Enter an integer, the input ends if it is 0: ");

		// To get the value from the user
		int number = input.nextInt();

		//if first number is zero
		if (number == 0) {
			System.out.println("No numbers are entered except 0");
			System.exit(0); //exit program
		}
		
		//if number is not zero 
		while (number != 0) {
			
			//determines how many positive  values
			if (number > 0) {
				positiveNumber++;
			} else {	//determines how many  negative values
				negativeveNumber++;
			}
			sumOfnumber += number; //sum of number
			
			// Prompt the user to enter a integer
			System.out.println("Enter an integer, the input ends if it is 0: ");

			number = input.nextInt();

		}

		//calculate average 
		average = sumOfnumber / (positiveNumber + negativeveNumber);
		
		//prompt result the program
		System.out.println("The number of positives is :" + positiveNumber);
		System.out.println("The number of negative is :" + negativeveNumber);
		System.out.println("The total is :" + sumOfnumber);
		System.out.println("The avarage is :" + average);
	}

}
