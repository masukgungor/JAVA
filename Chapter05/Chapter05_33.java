package chapter05;
/*
 * (Perfect number) A positive integer is called a perfect number if it is equal to
the sum of all of its positive divisors, excluding itself. For example, 6 is the first
perfect number because 6 = 3 + 2 + 1. The next is 28 = 14 + 7 + 4 + 2
+ 1. There are four perfect numbers less than 10,000. Write a program to find all
these four numbers.
 */
public class Chapter05_33 {

	public static void main(String[] args) {
		
		int tempNumber=0;
		
		for (int number = 2; number<=10000 ; number++) {
		
			for (int perfNumber = number-1 ;perfNumber >= 1 ; perfNumber--) {
				
				if (number%perfNumber == 0) {
					tempNumber+=perfNumber;
				}
			}
			if (tempNumber == number) {
				System.out.println(number + " is a perfect number");
			}
			tempNumber=0;
		}

	}

}
