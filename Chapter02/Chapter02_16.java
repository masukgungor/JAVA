package chapter02;
/*
 * (Geometry: area of a hexagon) Write a program that prompts the user to enter the
side of a hexagon and displays its area. The formula for computing the area of a
hexagon is
Area =3sqr(3)/2*pow(s),
where s is the length of a side
 */

import java.util.Scanner;

public class Chapter02_16 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the side:");

		double s = input.nextDouble();

		double area = 3 * Math.pow(3, 0.5) * Math.pow(s, 2) / 2;

		System.out.printf("The area of the hexagon is : %.4f", area);
		input.close();

	}

}
