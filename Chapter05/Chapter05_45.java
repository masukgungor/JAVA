package chapter05;

import java.util.Scanner;

/*
 * (Statistics: compute mean and standard deviation) In business applications, you
are often asked to compute the mean and standard deviation of data. The mean is
simply the average of the numbers. The standard deviation is a statistic that tells
you how tightly all the various data are clustered around the mean in a set of data.
For example, what is the average age of the students in a class? How close are the
ages? If all the students are the same age, the deviation is 0.
Write a program that prompts the user to enter ten numbers, and displays the
mean and standard deviations of these numbers using the following formula:
 */
public class Chapter05_45 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter ten numbers : ");
		
		double sum = 0;
		double number;
		double squareSum=0;
		
		for ( int i =0; i<10 ; i++ ) {
			
			number = input.nextDouble();
			sum+= number ;
			squareSum += Math.pow(number, 2);
			
		}
		
		double mean = sum/10;
		double deviation = Math.sqrt((squareSum -(Math.pow(sum, 2)/10))/9);
		System.out.println("The Mean is : " + mean);
		System.out.printf("The standart deviation is : %.5f" , deviation);
	}

}
