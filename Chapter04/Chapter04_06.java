package chapter04;
/*
 * (Random points on a circle) Write a program that generates three random points
on a circle centered at (0, 0) with radius 40 and display three angles in a triangle
formed by these three points, as shown in Figure 4.7a. (Hint: Generate a random
angle a in radians between 0 and 2p, as shown in Figure 4.7b and the point determined
by this angle is (r*cos(a), r*sin(a)).)
 */

public class Chapter04_06 {

	public static void main(String[] args) {
		final int RADIUS = 40;

		double a = Math.random() * 360;

		double x1 = RADIUS * Math.cos(a);
		double y1 = RADIUS * Math.sin(a);

		a = Math.random() * 360;

		double x2 = RADIUS * Math.cos(a);
		double y2 = RADIUS * Math.sin(a);

		a = Math.random() * 360;

		double x3 = RADIUS * Math.cos(a);
		double y3 = RADIUS * Math.sin(a);

		double side1 = Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2));
		double side2 = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));
		double side3 = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));

		double angleA = Math
				.toDegrees(Math.acos((side1 * side1 - side2 * side2 - side3 * side3) / (-2 * side2 * side3)));
		double angleB = Math
				.toDegrees(Math.acos((side2 * side2 - side1 * side1 - side3 * side3) / (-2 * side1 * side3)));
		double angleC = Math
				.toDegrees(Math.acos((side3 * side3 - side2 * side2 - side1 * side1) / (-2 * side1 * side2)));

		System.out.printf("Three angle are :( %.2f )  ( %.2f )  ( %.2f ) ", angleA, angleB, angleC);

	}

}
