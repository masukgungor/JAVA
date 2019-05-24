package chapter05;
/*
 * (Process string) Write a program that prompts the user to enter a string and displays
the characters at odd positions. Here is a sample run:
 */

import java.util.Scanner;

public class Chapter05_48 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter a string:");

		String str = input.nextLine();

		String oddStr = "";

		for (int i = 0; i < str.length(); i++) {

			if (i % 2 == 0) {
				oddStr += str.charAt(i);
			}

		}

		System.out.println(oddStr);
	}

}
