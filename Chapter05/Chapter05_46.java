package chapter05;

import java.util.Scanner;

/*
 * (Reverse a string) Write a program that prompts the user to enter a string and
displays the string in reverse order.
 */
public class Chapter05_46 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string:");

		String str = input.nextLine();
		String reverseStr = "";
		char temp;

		for (int i = str.length() - 1; i >= 0; i--) {
			reverseStr += str.charAt(i);
		}

		System.out.println("The reversed string is :" + reverseStr);
	}

}
