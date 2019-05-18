package chapter05;
/*
 * (Conversion from kilograms to pounds and pounds to kilograms) Write a program
that displays the following two tables side by side:
Kilograms Pounds | Pounds Kilograms
1 			2.2  | 20 		9.09
3 			6.6  | 25 		11.36
...
197 		433.4| 510 		231.82
199 		437.8| 515 		234.09
 */

public class Chapter05_05 {
	
	public static void main(String[] args) {

		int kilograms = 1;
		final double poundOfOneKilo = 2.2;

		double poundsOfKilograms = 0;
		
		int pounds = 20 ;
		double KilogramsOfPounds = 0;
		
		System.out.println("Kilograms\tPounds\t| Pounds\tKilograms");

		while (kilograms <= 199 ||  pounds <= 515 ) {

			poundsOfKilograms = kilograms * poundOfOneKilo; //determine from kilogram to pound 

			KilogramsOfPounds = pounds/poundOfOneKilo ; //determine from pond to kilogram

			
			System.out.printf("   %d\t%12.1f\t| %d\t%15.2f \n", kilograms, poundsOfKilograms,pounds, KilogramsOfPounds);

			kilograms += 2; //because of first kilogram is 1 and increments 2 
			pounds+=5; //increment 5

		}
	}
}
