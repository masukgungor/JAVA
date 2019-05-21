package chapter05;
/*
 * 
 * (Demonstrate cancellation errors) A cancellation error occurs when you are
manipulating a very large number with a very small number. The large number
may cancel out the smaller number. For example, the result of 100000000.0 +
0.000000001 is equal to 100000000.0. To avoid cancellation errors and obtain
more accurate results, carefully select the order of computation. For example, in
computing the following series, you will obtain more accurate results by computing
from right to left rather than from left to right:
1 + 1 /2 +1/3 + ..... +1/n
Write a program that compares the results of the summation of the preceding
series, computing from left to right and from right to left with n = 50000.
 */

public class Chapter05_23 {

	public static void main(String[] args) {

		double resultLeftToRight = 0.0;
		double resultRightToLeft = 0.0;
		
		// calculate left to right
		for (double i = 1.0; i < 50000.0; i++) {

			resultLeftToRight += 1 / i;

		}
		 // calculate right to left 
		for (double i = 50000.0; i > 1.0; i--) {

			resultRightToLeft += 1 / i;

		}
		//display result
		System.out.println("Left to Right : " + (resultLeftToRight + 1.0));
		System.out.println("Right to Left : " + (resultRightToLeft + 1.0));

		System.out.println("Sum of  ( Left to Right - Right to Left ) = "
				+ ((resultLeftToRight + 1.0 - (resultRightToLeft + 1.0))));
	}

}
