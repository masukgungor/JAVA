package chapter05;
/*
 * (Sum a series) Write a program to sum the following series:
1/3 +3/5 +5/7 +7/9 +9/11 +11/13 + .... +95/97 +97/99
 */

public class Chapter05_24 {

	public static void main(String[] args) {
		
			double result = 0.0 ;

			for (double i = 1.0 ; i < 99.0 ; i+=2) {
				
				result += (i )/(i+2 ) ; 

			}
			
			//display result
			System.out.println("Result is :" + result);
	}

}
