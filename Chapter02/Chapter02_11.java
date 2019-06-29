package chapter02;

/*
 * (Population projection) Rewrite Programming Exercise 1.11 to prompt the user
to enter the number of years and displays the population after the number of years.
Use the hint in Programming Exercise 1.11 for this program. The population
should be cast into an integer.
 */
import java.util.Scanner;

public class Chapter02_11 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of years:");
		int yil = input.nextInt();
		int population = 312032486;

		int born = 7;
		int imigrant = 45;
		int died = 13;

		int new_born = (24 * 60 * 60 * 365) / born;
		int new_imigrant = (24 * 60 * 60 * 365) / imigrant;
		int new_died = (24 * 60 * 60 * 365) / died;

		System.out.println("one years later population : " + (population + (new_born + new_imigrant - new_died) * yil));

	}

}
