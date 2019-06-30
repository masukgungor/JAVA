package chapter04;
/*
 * (Hex to binary) Write a program that prompts the user to enter a hex digit and
displays its corresponding binary number
 */

import java.util.Scanner;

public class Chapter04_12 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter a hex digit: ");

		String chr = input.next().toUpperCase();

		if (chr.charAt(0) < '0' || chr.charAt(0) > 'F') {
			System.err.println("Invalid input ");
			System.exit(0);
		}
		int hexDecimal = Integer.parseInt(chr, 16);

		String binary = Integer.toBinaryString(hexDecimal);

		System.out.println(" The binary value is  : " + binary);

		input.close();

	}

}
