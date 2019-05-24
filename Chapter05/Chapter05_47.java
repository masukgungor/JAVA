package chapter05;
/*
 * (Business: check ISBN-13) ISBN-13 is a new standard for indentifying books. It
uses 13 digits d1d2d3d4d5d6d7d8d9d10d11d12d13. The last digit d13 is a checksum,
which is calculated from the other digits using the following formula:
10 - (d1 + 3d2 + d3 + 3d4 + d5 + 3d6 + d7 + 3d8 + d9 + 3d10 + d11 + 3d12)%10
If the checksum is 10, replace it with 0. Your program should read the input as a
string. Here are sample runs:
 */

import java.util.Scanner;

public class Chapter05_47 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the first 12 digits of an ISBN-13 as a string:");

		String isbnNumber = input.next();

		if (isbnNumber.length() != 12) {
			System.out.println(isbnNumber + " is an invalid input");
			System.exit(0);
		}
		int checkSum = 0;
		for (int i = 0; i < isbnNumber.length(); i++) {
			if (i % 2 != 0) {
				checkSum += Character.getNumericValue(isbnNumber.charAt(i)) * 3;
			} else {
				checkSum += Character.getNumericValue(isbnNumber.charAt(i));
			}
		}

		System.out.println(isbnNumber += (10 - checkSum) == 0 ? "0" : checkSum % 10);
	}

}
