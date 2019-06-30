package chapter03;
/*
 * (Sort three integers) Write a program that prompts the user to enter three integers
and display the integers in non-decreasing order.
 */

import java.util.Scanner;

public class Chapter03_08 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter three integer number ");
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		int number3 = input.nextInt();

		int temp = 0;

	
		if (number2 > number1 && number2 > number3 && number3 > number1) {
			temp = number1;
			number1 = number2;
			number2 = temp;
			temp = number3;
			number3 = number2;
			number2 = number3;
		}

		if (number2 > number1 && number2 > number3 && number1 > number3) {
			temp = number1;
			number1 = number2;
			number2 = temp;

		}

		if (number3 > number1 && number3 > number2 && number2 > number1) {
			temp = number1;
			number1 = number3;
			number3 = temp;
		}

		if (number3 > number1 && number3 > number2 && number1 > number2) {
			temp = number1;
			number1 = number3;
			number3 = temp;
			temp = number2;
			number2 = number3;
			number3 = temp;

		}

		System.out.println(number1 + "  " + number2 + "  " + number3);

		input.close();
	}
}
