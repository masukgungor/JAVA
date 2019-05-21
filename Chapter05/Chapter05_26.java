package chapter05;
/*
 * (Compute e) You can approximate e using the following series:
e = 1 +1/1! +1/2! +1/3! +1/4! + ... +1/i!
Write a program that displays the e value for i = 10000, 20000, …, and
100000. (Hint: Because i! = i * (i - 1) * c * 2 * 1, then
1/i! is 1/i(i - 1)!
Initialize e and item to be 1 and keep adding a new item to e. The new item is
the previous item divided by i for i = 2, 3, 4, . . . .)
 */

public class Chapter05_26 {

	public static void main(String[] args) {
		double e = 1.0;

		double item = 1.0;
		// Compute e value for
		for (double n = 10000.0; n <= 100000.0; n += 10000.0) {
			for (double i = 1.0; i <= n; i++) {
				item *= i; // compute item

				e += 1.0 / item; // compute e

			}

			// display result
			System.out.printf("The e value for %2.1f     %5.10f \n ", n, e);
		}
	}

}
