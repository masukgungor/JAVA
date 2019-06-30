package chapter03;
/*
 * (Algebra: solve quadratic equations) The two roots of a quadratic equation
ax^2 + bx + c = 0 can be obtained using the following formula:
b^2 - 4ac is called the discriminant of the quadratic equation. If it is positive, the
equation has two real roots. If it is zero, the equation has one root. If it is negative,
the equation has no real roots.
Write a program that prompts the user to enter values for a, b, and c and displays
the result based on the discriminant. If the discriminant is positive, display two
roots. If the discriminant is 0, display one root. Otherwise, display “The equation
has no real roots”.
Note that you can use Math.pow(x, 0.5) to compute sqr(x)
 */

import java.util.Scanner;

public class Chapter03_01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a,b,c  : ");

		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();

		double disc = Math.pow(b, 2) - 4 * a * c;

		double r1 = 0;
		double r2 = 0;

		if (disc > 0) {

			r1 = ((-b) + Math.pow(disc, 0.5)) / 2 * a;
			r2 = ((-b) - Math.pow(disc, 0.5)) / 2 * a;
			System.out.printf("The equation has two roots %.4f and %.4f \n", r1, r2);

		} else if (disc == 0) {
			r1 = ((-b) + Math.pow(disc, 0.5)) / 2 * a;
			r2 = ((-b) - Math.pow(disc, 0.5)) / 2 * a;
			System.out.printf("The equation has one roots %.4f \n", r1);

		} else {
			System.out.println("The equation has no real root");

		}
		input.close();
	}

}
