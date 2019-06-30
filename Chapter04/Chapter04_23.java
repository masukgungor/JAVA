package chapter04;
/*
 * (Financial application: payroll) Write a program that reads the following information
and prints a payroll statement:
Employee’s name (e.g., Smith)
Number of hours worked in a week (e.g., 10)
Hourly pay rate (e.g., 9.75)
Federal tax withholding rate (e.g., 20%)
State tax withholding rate (e.g., 9%)
 */

import java.util.Scanner;

public class Chapter04_23 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter employee's name: ");

		String name = input.nextLine();

		System.out.print("Enter number of hours worked in a week: ");

		double numberOfHour = input.nextDouble();

		System.out.print("Enter hourly pay rate: ");

		double hourlyPayRate = input.nextDouble();

		System.out.print("Enter federal tax withholding rate: ");

		double federalTax = input.nextDouble();

		System.out.print("Enter state tax withholding rate: ");

		double stateTax = input.nextDouble();

		double totalDeducation = (hourlyPayRate * numberOfHour) * federalTax
				+ (hourlyPayRate * numberOfHour) * stateTax;

		System.out.println("Employee Name: " + name);
		System.out.println("Hours Worked: " + numberOfHour);
		System.out.println("Pay Rate: $" + hourlyPayRate);
		System.out.println("Gross Pay: $" + (hourlyPayRate * numberOfHour));
		System.out.println("Deductions: ");
		System.out.println(
				"   Federal Withholding (" + federalTax * 100 + " ): $ " + (hourlyPayRate * numberOfHour) * federalTax);
		System.out.println(
				"   State Withholding (" + stateTax * 100 + "): $ " + (hourlyPayRate * numberOfHour) * stateTax);
		System.out.println("   Total Deduction:): $ " + totalDeducation);
		System.out.println("Net Pay : $ " + ((hourlyPayRate * numberOfHour) - totalDeducation));

		input.close();

	}

}
