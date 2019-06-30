package chapter03;
/*
 * (Geometry: point position) Given a directed line from point p0(x0, y0) to p1(x1,
y1), you can use the following condition to decide whether a point p2(x2, y2) is
on the left of the line, on the right, or on the same line
 */

import java.util.Scanner;

public class chapter03_32 {
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

		if (sum > 0) {

			System.out.println("(" + P2_x + "," + P2_y + ") is on the left side of the line from (" + P1_x + "," + P1_y
					+ ") to (" + P0_x + "," + P0_y + ")");
		} else if (sum == 0) {
			System.out.println("(" + P2_x + "," + P2_y + ") is on the line from (" + P1_x + "," + P1_y + ") to (" + P0_x
					+ "," + P0_y + ")");

		} else if (sum < 0) {

			System.out.println("(" + P2_x + "," + P2_y + ") is on the right side of the line from (" + P1_x + "," + P1_y
					+ ") to (" + P0_x + "," + P0_y + ")");

		}

		input.close();
	}

}
