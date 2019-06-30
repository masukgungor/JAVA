package chapter03;
/*
 * (Geometry: points in triangle?) Suppose a right triangle is placed in a plane as
shown below. The right-angle point is placed at (0, 0), and the other two points
are placed at (200, 0), and (0, 100). Write a program that prompts the user to enter
a point with x- and y-coordinates and determines whether the point is inside the
triangle.
 */

import java.util.Scanner;

public class Chapter03_27 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter a point's x- and y-coordinates:");

		double x = input.nextDouble();
		double y = input.nextDouble();

		int bx = 200;
		int by = -100;
		int cx = 0;
		int cy = -100;

		double px = x;
		double py = y - 100;

		double d = bx * cy - cx * by;

		double wa = (px * (by - cy) + py * (cx - bx) + bx * cy - cx * by) / d;
		double wb = (px * cy - py * cx) / d;

		double wc = (py * bx - px * by) / d;

		if ((0 < wa && wa < 1) && (0 < wb && wb < 1) && (0 < wc && wc < 1)) {
			System.out.println("The point is in the triangle");

		} else {
			System.out.println("The point is not in the triangle");
		}
		input.close();
	}

}
