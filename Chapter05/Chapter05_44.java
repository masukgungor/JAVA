package chapter05;
/*
 * (Computer architecture: bit-level operations) A short value is stored in 16 bits.
Write a program that prompts the user to enter a short integer and displays the 16
bits for the integer. Here are sample runs:

https://github.com/jsquared21
 */

import java.util.Scanner;

public class Chapter05_44 {
public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("enter an integer ");
	
	short number =input.nextShort();
	
	String shortBits ="";
	
	for (int i = 0; i < 16; i++) {
		shortBits = (number & 1) + shortBits;
		number >>= 1;
	
	}
	System.out.println("The bits are :" + shortBits);
}
}
