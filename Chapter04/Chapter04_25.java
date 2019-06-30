package chapter04;

/*
 * (Generate vehicle plate numbers) Assume a vehicle plate number consists of three
uppercase letters followed by four digits. Write a program to generate a plate
number
 */

public class Chapter04_25 {

	public static void main(String[] args) {

		String s = "";

		for (int i = 0; i < 3; i++) {

			s += (char) (Math.random() * ('Z' - 'A') + 'A');

		}
		for (int i = 0; i < 4; i++) {

			s += (char) (Math.random() * 10 + '0');

		}

		System.out.println("Random vehicle plate number : " + s);

	}

}
