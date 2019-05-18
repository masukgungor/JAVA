package chapter05;

/*
 * (Conversion from miles to kilometers) Write a program that displays the following
table (note that 1 mile is 1.609 kilometers):
Miles Kilometers
1 		1.609
2 		3.218
...
9 		14.481
10 		16.090
 */

public class Chapter05_04 {
	public static void main(String[] args) {

		int miles = 1;
		final double kilometerOfOneMile = 1.609;

		double kilometers = 0;
		System.out.println("Miles\tKilometers");

		while (miles  <= 10) {

			kilometers = miles * kilometerOfOneMile; //determine from kilogram to pound 

			System.out.printf("%d\t%-12.3f \n", miles, kilometers);

			miles += 1; //Increment

		}
	}
}
