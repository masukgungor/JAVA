package chapter05;
/*
 * (Display leap years) Write a program that displays all the leap years, ten per line,
from 101 to 2100, separated by exactly one space. Also display the number of
leap years in this period.
 */
public class Chapter05_27 {

	public static void main(String[] args) {
		
		String leapYears = "";
		
		int counter = 0 ; // for total leap years
		// Check if the year is a leap year 
		for (int year = 101 ; year <= 2100 ; year++) {
			boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
			if (isLeapYear) {
				leapYears += year + " " ;
				counter++ ;
				//for newline
				if (counter % 10 == 0) {
					leapYears +='\n';
				}
			}
			
		}
		System.out.println(leapYears);
		System.out.println("\nTotal leap years between 101 and 2100 : " + counter);
	}

}
