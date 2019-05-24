package chapter05;
/*
 * (Conversion from kilograms to pounds) Write a program that displays the following
table (note that 1 kilogram is 2.2 pounds):
Kilograms Pounds
1 			2.2
3 			6.6
...
197 		433.4
199 		437.8

 */

public class Chapter05_03 {

	public static void main(String[] args) {

		int kilograms = 1;
		final double poundOfOneKilogram = 2.2;

		double pounds = 0;
		System.out.println("Kilograms\tPounds");

		while (kilograms <= 199) {

			pounds = kilograms * poundOfOneKilogram; //determine from kilogram to pound 

			System.out.printf("   %d\t%12.1f \n", kilograms, pounds);

			kilograms += 2; //because of first kilogram is 1 and increments 2 

		}

	}

}
