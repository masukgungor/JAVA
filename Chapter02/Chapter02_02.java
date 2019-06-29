package chapter02;

/*
 * 
 * (Compute the volume of a cylinder) Write a program that reads in the radius
and length of a cylinder and computes the area and volume using the following
formulas:
area = radius * radius * pi
volume = area * length

 */
import java.util.Scanner;

public class Chapter02_02 {
	public static void main(String[] args) {

		final double PI = 3.14;
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the radius and length of a cylinder ");

		double radius = input.nextDouble();
		double lenght = input.nextDouble();
		double area = radius * radius * PI;
		double volume = area * lenght;

		System.out.println("The area is : " + area + "\n" + "The volume is : " + volume);
	}

}
