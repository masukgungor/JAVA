package chapter02;
/*
 * (Financial application: calculate future investment value) Write a program that
reads in investment amount, annual interest rate, and number of years, and displays
the future investment value using the following formula:
futureInvestmentValue = investmentAmount * (1 + monthlyInterestRate)^numberOfYears*12
 */

import java.util.Scanner;

public class Chapter02_21 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter investment amount:");
		double investmentAmount = input.nextDouble();

		System.out.print("Enter annual interest rate in percentage::");
		double annualInterestRate = input.nextDouble();

		double monthlyInterestRate = annualInterestRate / 1200;

		System.out.println("Enter number of years:");
		int numberOfYears = input.nextInt();

		double futureInvestmentValue = investmentAmount * Math.pow((1 + monthlyInterestRate), numberOfYears * 12);

		System.out.printf("Accumulated value is $ %.2f", futureInvestmentValue);
		input.close();
	}

}
