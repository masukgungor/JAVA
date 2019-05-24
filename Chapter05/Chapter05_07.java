package chapter05;

/*
 * (Financial application: compute future tuition) Suppose that the tuition for a university
is $10,000 this year and increases 5% every year. In one year, the tuition
will be $10,500. Write a program that computes the tuition in ten years and the
total cost of four years’ worth of tuition after the tenth year.
 */

public class Chapter05_07 {

	public static void main(String[] args) {

		// Variable definition

		double totalTuition = 10_000;

		double tempTuition = 0; // for compute total cost of four years after the tenth year (temp value )

		double increaseOfTuition = 0.05; // increases 5% every year

		int year = 1;

		while (year <= 14) {

			// compute total tuition
			totalTuition = totalTuition + totalTuition * increaseOfTuition;

			// compute tuition in ten years and to after tenth year
			if (year == 10)
				tempTuition = totalTuition;

			year++; // increment year

		}

		// display results
		System.out.println("Total tuition in ten years : " + tempTuition);
		System.out.println(
				"total cost of four years’ worth of tuition after the tenth year: " + (totalTuition - tempTuition));

	}

}
