package chapter04;
/*
 * (Random character) Write a program that displays a random uppercase letter
using the Math.random() method.
 */

public class Chapter04_16 {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			System.out.println((char) ((Math.random() * (90 - 65 + 1)) + 65));
		}

	}

}
