package chapter03;
/*
 * (Geometry: point in a rectangle?) Write a program that prompts the user to enter
a point (x, y) and checks whether the point is within the rectangle centered at
(0, 0) with width 10 and height 5. For example, (2, 2) is inside the rectangle and
(6, 4) is outside the rectangle, as shown in Figure 3.7b. (Hint: A point is in the
rectangle if its horizontal distance to (0, 0) is less than or equal to 10 / 2 and its
vertical distance to (0, 0) is less than or equal to 5.0 / 2. Test your program to
cover all cases.)
 */

import java.util.Scanner;

public class Chapter03_23 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter a point with two coordinates:");

		int x_coordinat = input.nextInt();
		int y_coordinat = input.nextInt();

		if (5 < Math.abs(x_coordinat) || 5.0 / 2 < Math.abs(y_coordinat)) {
			System.out.println("( " + x_coordinat + "," + y_coordinat + ") is not in the rectangle");

		} else {
			System.out.println("( " + x_coordinat + "," + y_coordinat + ") is in the rectangle");
		}
		input.close();
	}

}
