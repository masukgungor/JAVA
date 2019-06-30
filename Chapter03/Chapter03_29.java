package chapter03;
/*
 * (Geometry: two circles) Write a program that prompts the user to enter the center
coordinates and radii of two circles and determines whether the second circle is
inside the first or overlaps with the first, as shown in Figure 3.10. (Hint: circle2 is
inside circle1 if the distance between the two centers 6 = |r1 - r2| and circle2
overlaps circle1 if the distance between the two centers <= r1 + r2. Test your
program to cover all cases.)
 */

import java.util.Scanner;

public class Chapter03_29 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter r1's center x-, y-coordinates and radius:");
		double x1_cordinat = input.nextDouble();
		double y1_cordinat = input.nextDouble();
		double r1 = input.nextDouble();

		System.out.print("Enter r2's center x-, y-coordinates and radius:");
		double x2_cordinat = input.nextDouble();
		double y2_cordinat = input.nextDouble();
		double r2 = input.nextDouble();

		double AB = Math.abs(
				Math.pow(Math.pow((x2_cordinat - x1_cordinat), 2) + Math.pow((y2_cordinat - y1_cordinat), 2), 0.5));

		if (AB <= Math.abs(r2 - r1)) {
			System.out.println("circle2 is inside circle1");
		} else if (AB <= (r2 + r1)) {
			System.out.println("circle2 overlaps circle1");

		} else {
			System.out.println("circle2 does not overlap circle1");
		}

		input.close();
	}

}
