package chapter05;
/*
 * (Financial application: loan amortization schedule) The monthly payment for a
given loan pays the principal and the interest. The monthly interest is computed
by multiplying the monthly interest rate and the balance (the remaining principal).
The principal paid for the month is therefore the monthly payment minus
the monthly interest. Write a program that lets the user enter the loan amount,number of years, and interest rate and displays the amortization schedule for the
loan. Here is a sample run:
 */

import java.util.Scanner;

public class Chapter05_22 {

	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Enter loan amount
		System.out.print("Loan Amount: ");
		double loanAmount = input.nextDouble();

		// Enter number of years
		System.out.print("Number of Years, for example 5: ");
		int numberOfYears = input.nextInt();

		// Enter number annual interest rate
		System.out.print("Annual interest rate: ");
		double annualInterestRate = input.nextDouble();

		double monthlyInterestRate = annualInterestRate / 1200;

		// Calculate payment
		double monthlyPayment = loanAmount * monthlyInterestRate
				/ (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
		double totalPayment = monthlyPayment * numberOfYears * 12;

		double balance = loanAmount;
		double monthlyInterestValue;
		double principal;
		// Display monthly payment
		System.out.println();
		System.out.println("Monthly Payment: " + monthlyPayment);
		
		System.out.println();
		// Display total payment
		System.out.println("Total Payment: " + totalPayment);
		
		System.out.println();
		System.out.println("Payment#     Interest     Principal     Balance");

		for (int i = 0; i < numberOfYears * 12; i++) {

			monthlyInterestValue = monthlyInterestRate * balance;
			principal = monthlyPayment - monthlyInterestValue;
			balance -= principal;
			System.out.printf("%-13d%-13.2f%-13.2f%.2f\n", i, monthlyInterestValue, principal, balance);
		}

	}

}
