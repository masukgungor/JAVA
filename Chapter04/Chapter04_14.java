package chapter04;
/*
 * (Convert letter grade to number) Write a program that prompts the user to enter a
letter grade A, B, C, D, or F and displays its corresponding numeric value 4, 3, 2,
1, or 0.
 */

import java.util.Scanner;

public class Chapter04_14 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter a letter grade: ( A-B-C-D-F )");
		String chr1 = input.next().toUpperCase();
		String grade = "A,B,C,D,F";

		if (!grade.contains(chr1)) {

			System.err.println("Invalid input");
			System.exit(0);
			;
		}
		char chr = chr1.toUpperCase().charAt(0);

		switch (chr) {
		case 'A':
			System.out.println("The numeric value for grade " + chr + " is " + 4);
			break;
		case 'B':
			System.out.println("The numeric value for grade " + chr + " is " + 3);
			break;
		case 'C':
			System.out.println("The numeric value for grade " + chr + " is " + 2);
			break;
		case 'D':
			System.out.println("The numeric value for grade " + chr + " is " + 1);
			break;
		case 'F':
			System.out.println("The numeric value for grade " + chr + " is " + 0);
			break;
		}
		input.close();
	}
}
