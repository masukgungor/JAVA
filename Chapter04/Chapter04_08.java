package chapter04;

/*
 * (Find the character of an ASCII code) Write a program that receives an ASCII code
(an integer between 0 and 127) and displays its character
 */
import java.util.Scanner;

public class Chapter04_08 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter an ASCII code: (0 - 127 )");

		int number = input.nextInt();

		if (number < 0 || number > 127) {
			System.err.println("Invalid input");
			System.exit(0);
		}

		char chr = (char) number;

		System.out.println("The character for ASCII code  " + number + " is " + chr);

		input.close();
	}

}
