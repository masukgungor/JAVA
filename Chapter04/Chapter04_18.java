package chapter04;
/*
 * (Student major and status) Write a program that prompts the user to enter two
characters and displays the major and status represented in the characters. The first
character indicates the major and the second is number character 1, 2, 3, 4, which
indicates whether a student is a freshman, sophomore, junior, or senior. Suppose
the following chracters are used to denote the majors:
M: Mathematics
C: Computer Science
I: Information Technology
 */

import java.util.Scanner;

public class Chapter04_18 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter two characters: ");

		String key = input.nextLine().toUpperCase();

		char chr1 = key.charAt(0);
		char chr2 = key.charAt(1);

		int a = Character.getNumericValue(chr2);

		String M = "Mathematics";
		String C = "Computer Science";
		String I = "Information Technology";

		String one = "freshman";
		String two = "sophomore";
		String three = "junior";
		String four = "senior";

		if (chr1 != 'M' && chr1 != 'C' && chr1 != 'I' || (3 < a || a < 1)) {

			System.err.println("Invalid input");
			System.exit(0);
			;
		}

		if (chr1 == 'M') {
			if (chr2 == '1') {
				System.out.println(M + "   " + one);
			} else if (chr2 == '2') {
				System.out.println(M + "   " + two);
			} else if (chr2 == '3') {
				System.out.println(M + "   " + three);
			} else if (chr2 == '4') {
				System.out.println(M + "   " + four);
			}
		} else if (chr1 == 'C') {
			if (chr2 == '1') {
				System.out.println(C + "   " + one);
			} else if (chr2 == '2') {
				System.out.println(C + "   " + two);
			} else if (chr2 == '3') {
				System.out.println(C + "   " + three);
			} else if (chr2 == 4) {
				System.out.println(C + "   " + four);
			}
		} else if (chr1 == 'I') {
			if (chr2 == '1') {
				System.out.println(I + "   " + one);
			} else if (chr2 == '2') {
				System.out.println(I + "   " + two);
			} else if (chr2 == '3') {
				System.out.println(I + "   " + three);
			} else if (chr2 == '4') {
				System.out.println(I + "   " + four);
			}
		}
		input.close();
	}
}
