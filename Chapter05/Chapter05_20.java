package chapter05;
/*
 * (Display prime numbers between 2 and 1,000) Modify Listing 5.15 to display all
the prime numbers between 2 and 1,000, inclusive. Display eight prime numbers
per line. Numbers are separated by exactly one space.
 */

public class Chapter05_20 {
	public static void main(String[] args) {

		int number = 2;
		String primeNumbers = "";
		int counter = 0; // calculate new line number
		boolean isPrime = true; // to check prime number or not

		while (2 <= number && number <= 1000) {

			// for determine prime number
			for (int i = 2; i < number; i++) {
				// if number is not prime number ,then break the loop
				if (number % i == 0) {
					isPrime = false;
					break;
				}

			}

			// to get prime number
			if (isPrime) {
				counter++;

				primeNumbers += number + " ";
				// to new line after 8 number
				if (counter % 8 == 0) {
					primeNumbers += '\n';

				}
			}
			isPrime = true; // to again check number is prime ?
			number++;
		}

		//display the prime number
		System.out.println(primeNumbers);
	}
}
