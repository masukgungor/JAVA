package chapter04;
/*
 * (Find the Unicode of a character) Write a program that receives a character and
displays its Unicode
 */

import java.util.Scanner;

public class Chapter04_09 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a character: ");

		char number = input.next().charAt(0);

		System.out.println("The Unicode for the character " + number + " is " + (int) number);

		input.close();

	}

}
