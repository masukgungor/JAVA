package chapter04;
/*
 * (Process a string) Write a program that prompts the user to enter a string and displays
its length and its first character.
 */

import java.util.Scanner;

public class Chapter04_20 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter a string: ");

		String key = input.nextLine();

		System.out.println("The lenght of " + key + "  :" + key.length());
		System.out.println("the firs char " + key + " is :" + key.charAt(0));

		input.close();
	}

}
