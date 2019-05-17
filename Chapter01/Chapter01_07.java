package chapter01;
/*
 *( Approximate PI) p can be computed using the following formula:
 * 
 * Write a program that displays the result of 4*(1-1/3+1/5-1/7+1/9-1/11) 
 * and 4*(1-1/3+1/5-1/7+1/9-1/11+1/13)
 * Use 1.0 instead of 1 in your program.
 * 
 * */
public class Chapter01_07 {
	public static void main(String [] args) {
		
		// result of first operation 
		double resultOfFirstCalculation = 4*(1.0-1.0/3+1.0/5-1.0/7+1.0/9-1.0/11) ;
		
		// result of first operation
		double resultOfSecondCalculation =4*(1.0-1.0/3+1.0/5-1.0/7+1.0/9-1.0/11+1.0/13) ;
		
		// display result
		System.out.println("result of the first calculation :  " + resultOfFirstCalculation);
		System.out.println("result of the second calculation :  " + resultOfSecondCalculation);
	}

}
