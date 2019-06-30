package chapter03;
/*
 * (Geometry: two rectangles) Write a program that prompts the user to enter the
center x-, y-coordinates, width, and height of two rectangles and determines
whether the second rectangle is inside the first or overlaps with the first, as shown
in Figure 3.9. Test your program to cover all cases.
 */

import java.util.Scanner;

public class Chapter03_28 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter r1's center x-, y-coordinates, width, and height:");
		double x1_cordinat = input.nextDouble();
		double y1_cordinat = input.nextDouble();
		double r1_weight = input.nextDouble();
		double r1_height = input.nextDouble();

		double B_x = 0;
		double C_x = 0;
		double A_y = 0;
		double B_y = 0;

		B_x = x1_cordinat - r1_weight;
		C_x = r1_weight + x1_cordinat;
		A_y = y1_cordinat + r1_height;
		B_y = y1_cordinat - r1_height;

		System.out.print("Enter r2's center x-, y-coordinates, width, and height:");
		double x2_cordinat = input.nextDouble();
		double y2_cordinat = input.nextDouble();
		double r2_weight = input.nextDouble();
		double r2_height = input.nextDouble();

		double F_x = 0;
		double G_x = 0;
		double E_y = 0;
		double F_y = 0;

		F_x = x2_cordinat - r2_weight;
		G_x = r2_weight + x2_cordinat;

		E_y = y2_cordinat + r2_height;
		F_y = y2_cordinat - r2_height;

		if ((Math.abs((A_y - E_y)) < Math.abs((A_y - B_y)) && Math.abs((A_y - F_y)) > Math.abs((A_y - B_y)))
				|| (Math.abs((B_y - F_y)) < Math.abs((A_y - B_y)) && Math.abs((B_y - E_y)) > Math.abs((A_y - B_y)))
				|| (Math.abs((B_x - F_x)) < Math.abs((C_x - B_x)) && Math.abs((B_x - G_x)) > Math.abs((C_x - B_x)))
				|| (Math.abs((C_x - G_x)) < Math.abs((C_x - B_x)) && Math.abs((C_x - F_x)) > Math.abs((C_x - B_x)))) {

			System.out.println("r2  overlaps r1");

		} else if (Math.abs((A_y - E_y)) < Math.abs((A_y - B_y)) && Math.abs((B_y - F_y)) < Math.abs((A_y - B_y))
				&& Math.abs((B_x - F_x)) < Math.abs((C_x - B_x)) && Math.abs((C_x - G_x)) < Math.abs((C_x - B_x))) {

			System.out.println("r2  inside r1");

		} else if (Math.abs((A_y - E_y)) > Math.abs((A_y - B_y)) || Math.abs((B_y - F_y)) > Math.abs((A_y - B_y))
				|| Math.abs((B_x - F_x)) > Math.abs((C_x - B_x)) || Math.abs((C_x - G_x)) > Math.abs((C_x - B_x))) {

			System.out.println("r2 does not overlap r1");

		}

		input.close();
	}

}
