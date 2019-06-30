package chapter01;

/*
 * (Population projection) The U.S. Census Bureau projects population based on the
*following assumptions:
* - One birth every 7 seconds
  - One death every 13 seconds
  - One new immigrant every 45 seconds
Write a program to display the population for each of the next five years. Assume the
current population is 312,032,486 and one year has 365 days. Hint: In Java, if two
integers perform division, the result is an integer. The fractional part is truncated. For
example, 5 / 4 is 1 (not 1.25) and 10 / 4 is 2 (not 2.5). To get an accurate result with
the fractional part, one of the values involved in the division must be a number with a
decimal point. For example, 5.0 / 4 is 1.25 and 10 / 4.0 is 2.5.

 */

public class Chapter01_11 {
	public static void main(String [] args) {
		
		// variable definition
		int born = 7;
		int imigrant = 45;
		int died= 13;
		
		int population = 312032486 ;
		
		//calculate birth,immigrant and death 
		int newBirth =(24*60*60*365/born ) ;
		int newImmigrant = (24*60*60*365/imigrant );
		int newDeath =(24*60*60*365/died );
		
		//display result of calc
		System.out.println("One years later population : " + (population + newBirth + newImmigrant - newDeath ));
		System.out.println("Two years later population : " + (population + newBirth*2 + newImmigrant*2 - newDeath*2 ));
		System.out.println("Three years later population : " +(population + newBirth *3 + newImmigrant*3 - newDeath*3 ));
		System.out.println("Four years later population : " + (population +newBirth *4+ newImmigrant*4 - newDeath*4 ));
		System.out.println("Five years later population : " + (population + newBirth*5+ newImmigrant*5 - newDeath*5 ));
	}

}
