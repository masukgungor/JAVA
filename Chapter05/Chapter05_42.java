package chapter05;
/*
 * (Financial application: find the sales amount) Rewrite Programming Exercise
5.39 as follows:
■ Use a for loop instead of a do-while loop.
■ Let the user enter COMMISSION_SOUGHT instead of fixing it as a constant
 */

import java.util.Scanner;

public class Chapter05_42 {
	public static void main(String[] args) {
		// final double COMMISSION_SOUGHT = 30000;

		Scanner input = new Scanner(System.in);

		System.out.println("enter comission sought : ");
		double comissionSought = input.nextDouble();

		double salary = 5000.0;

		double goalAmount = 30000.0;

		double salesAmount = 0.01;

		for (double comission = 0; comission < comissionSought;salesAmount += 0.01) {
			

			if ((salesAmount > 10000.0)) {
				comission += (salesAmount - 10000) * 0.12;
			} else if (salesAmount > 5000.0) {
				comission += (salesAmount - 5000.0) * 0.1;
			} else if (salesAmount > 0) {
				comission += salesAmount * 0.08;
			}

		}

		System.out.printf("Minimum sales to earn $30,000: % .3f ", salesAmount);
	}

}
