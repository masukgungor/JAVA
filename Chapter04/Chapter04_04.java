package chapter04;

import java.util.Scanner;

/*
 * (Geometry: area of a hexagon) The area of a hexagon can be computed using the
following formula (s is the length of a side):
 */

public class Chapter04_04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the side: ");

		double s = input.nextDouble();

		double area = (6 * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / 6));

		System.out.printf("The area of the hexagon is: %.2f", area);

		input.close();

	}

}
