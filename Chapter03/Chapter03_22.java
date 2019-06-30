package chapter03;

/*
 * (Geometry: point in a circle?) Write a program that prompts the user to enter a
point (x, y) and checks whether the point is within the circle centered at (0, 0)
with radius 10. For example, (4, 5) is inside the circle and (9, 9) is outside the
circle, as shown in Figure 3.7a.
(Hint: A point is in the circle if its distance to (0, 0) is less than or equal to 10.
The formula for computing the distance is 2(x2 - x1)2 + (y2 - y1)2. Test your
program to cover all cases.) Two sample runs are shown below.
 */
import java.util.Scanner;

public class Chapter03_22 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter a point with two coordinates:");

		int x_coordinat = input.nextInt();
		int y_coordinat = input.nextInt();

		if ((Math.pow((Math.pow(x_coordinat, 2) + Math.pow(y_coordinat, 2)), 0.5)) <= 10) {
			System.out.println("Point ( " + x_coordinat + "," + y_coordinat + ") is in the circle");

		} else {
			System.out.println("Point ( " + x_coordinat + "," + y_coordinat + ") is not in the circle");
		}
		input.close();
	}

}
