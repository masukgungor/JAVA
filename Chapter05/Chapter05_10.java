package chapter05;
/*
 * (Find numbers divisible by 5 and 6) Write a program that displays all the numbers
	from 100 to 1,000, ten per line, that are divisible by 5 and 6. Numbers are
	separated by exactly one space.
 */

public class Chapter05_10 {

	public static void main(String[] args) {
		

		for (int i = 100, counter = 0; i <= 1000; i++) {

			if (i % 5 == 0 && i % 6 == 0) {
				System.out.print(i + " ");
				counter ++;
				if (counter % 10 == 0) {
					System.out.println();
				}
			}
			
		}

	}

}
