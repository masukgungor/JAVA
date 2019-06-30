package chapter02;
/*
 * (Financial application: compound value) Suppose you save $100 each month
into a savings account with the annual interest rate 5%. Thus, the monthly interest
rate is 0.05/12 = 0.00417. After the first month, the value in the account
becomes
100 * (1 + 0.00417) = 100.417
After the second month, the value in the account becomes
(100 + 100.417) * (1 + 0.00417) = 201.252
After the third month, the value in the account becomes
(100 + 201.252) * (1 + 0.00417) = 302.507
and so on.
Write a program that prompts the user to enter a monthly saving amount and
displays the account value after the sixth month. (In Exercise 5.30, you will use a
loop to simplify the code and display the account value for any month.)
 */

import java.util.Scanner;

public class Chapter02_13 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the monthly saving amount: ");

		double saveMoney = input.nextDouble();
		double constValue = 1 + 0.00417;

		double firstMounth = saveMoney * constValue;
		double secontMounth = (firstMounth + saveMoney) * constValue;
		double thirdMounth = (secontMounth + saveMoney) * constValue;
		double fourthMounth = (thirdMounth + saveMoney) * constValue;
		double fifthMounth = (fourthMounth + saveMoney) * constValue;
		double sixthMounth = (fifthMounth + saveMoney) * constValue;
		System.out.printf("After the sixth month, the account value is : %.2f", sixthMounth);
		input.close();
	}

}
