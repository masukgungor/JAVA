package chapter03;
/*
 * (Geometry: point on line segment) Programming Exercise 3.32 shows how to test
whether a point is on an unbounded line. Revise Programming Exercise 3.32 to
test whether a point is on a line segment. Write a program that prompts the user
to enter the three points for p0, p1, and p2 and displays whether p2 is on the line
segment from p0 to p1
 */

import java.util.Scanner;

public class Chapter03_34 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter three points for p0, p1, and p2: ");

		double P0_x = input.nextDouble();
		double P0_y = input.nextDouble();
		double P1_x = input.nextDouble();
		double P1_y = input.nextDouble();
		double P2_x = input.nextDouble();
		double P2_y = input.nextDouble();

		double sum = (P1_x - P0_x) * (P2_y - P0_y) - (P2_x - P0_x) * (P1_y - P0_y);

		if (sum == 0 && (P1_x > P2_x && P2_x > P0_x) && (P1_y > P2_y && P2_y > P0_y)) {
			System.out.println("(" + P2_x + "," + P2_y + ") is on the line from (" + P1_x + "," + P1_y + ") to (" + P0_x
					+ "," + P0_y + ")");

		} else {
			System.out.println("(" + P2_x + "," + P2_y + ") is not on the line segment from (" + P1_x + "," + P1_y
					+ ") to (" + P0_x + "," + P0_y + ")");
		}

		input.close();

	}

}
