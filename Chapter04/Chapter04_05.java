package chapter04;
/*
 * (Geometry: area of a regular polygon) A regular polygon is an n-sided polygon in
which all sides are of the same length and all angles have the same degree (i.e., the
polygon is both equilateral and equiangular). The formula for computing the area
of a regular polygon is
 */

import java.util.Scanner;

public class Chapter04_05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of side: ");

		double n = input.nextDouble();

		System.out.print("Enter the side: ");

		double s = input.nextDouble();

		double area = (n * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / n));

		System.out.printf("The area of the polygon is : %.8f", area);

		input.close();
	}

}
