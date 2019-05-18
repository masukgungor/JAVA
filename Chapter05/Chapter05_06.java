package chapter05;
/*
 * (Conversion from miles to kilometers) Write a program that displays the following
two tables side by side:
Miles Kilometers | Kilometers Miles
1 1.609 | 20 12.430
2 3.218 | 25 15.538
...
9 14.481 | 60 37.290
10 16.090 | 65 40.398
 */

public class Chapter05_06 {
	public static void main(String[] args) {

		int miles = 1;
		int kilometer = 20 ;
		final double kilometerOfOneMile = 1.609;

		double mileToKilometers = 0;
		double kilometerToMile = 0 ;
		
		System.out.println("Miles\tKilometers\t| Kilometers\tMiles");

		while (miles  <= 10) {

			mileToKilometers = miles * kilometerOfOneMile; //determine from miles to kilometer 
			
			kilometerToMile = kilometer/ kilometerOfOneMile ; //determine from kilometer to miles

			System.out.printf("%d\t%-12.3f\t| %d\t%14.3f \n", miles, mileToKilometers,kilometer,kilometerToMile);

			miles += 1; //Increment
			kilometer+= 5; //Increment 
		}
	}

}
