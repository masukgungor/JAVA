package chapter05;

import java.util.Scanner;
/*
 * (Financial application: compare loans with various interest rates) Write a program
that lets the user enter the loan amount and loan period in number of years
and displays the monthly and total payments for each interest rate starting from
5% to 8%, with an increment of 1/8. Here is a sample run:
 */

public class Chapter05_21 {
	
	public static void main(String[] args) {
		   // Create a Scanner
	    Scanner input = new Scanner(System.in);

	    // Enter loan amount
	    System.out.print("Loan Amount: ");
	    
	    double loanAmount = input.nextDouble();
	    
	    double annualInterestRate = 5.0;
	    
	  
	    // Enter number of years
	    System.out.print( "Number of Years, for example 5: ");
	    int numberOfYears = input.nextInt();
	    
	    System.out.println("Interest Rate  Monthly Payment  Total Payment");
	    
	    while(annualInterestRate <8.0) {
	    	  // Obtain monthly interest rate
		    double monthlyInterestRate = annualInterestRate / 1200;

	    	  // Calculate payment
		    double monthlyPayment = loanAmount * monthlyInterestRate / (1
		      - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
		    double totalPayment = monthlyPayment * numberOfYears * 12;
	    	annualInterestRate = annualInterestRate +0.125;
	    	
	    	
	    	System.out.printf("%-5.3f", annualInterestRate);
			System.out.print("%         ");
	    	System.out.printf("%-16.2f %-15.2f \n",monthlyPayment,totalPayment);
	    }

	}

}
