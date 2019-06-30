package chapter03;
/*
 * (Compute the perimeter of a triangle) Write a program that reads three edges for
a triangle and computes the perimeter if the input is valid. Otherwise, display that
the input is invalid. The input is valid if the sum of every pair of two edges is
greater than the remaining edge.
 */

import java.util.Scanner;

public class Chapter03_19 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter three edges for a triangle:");

		int edge1 = input.nextInt();
		int edge2 = input.nextInt();
		int edge3 = input.nextInt();

		if ((edge1 + edge2) < edge3 || (edge1 + edge3) < edge2 || (edge3 + edge2) < edge1) {
			System.out.println("Input is invalid");

		} else {
			System.out.println("perimeter of triangle is = " + edge1 + " + " + edge2 + " + " + edge3 + " = "
					+ (edge1 + edge2 + edge3));
		}
		input.close();
	}

}
