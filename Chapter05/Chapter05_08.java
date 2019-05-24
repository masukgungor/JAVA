package chapter05;
/*
 * (Find the highest score) Write a program that prompts the user to enter the number
of students and each student’s name and score, and finally displays the name
of the student with the highest score.
 */

import java.util.Scanner;

public class Chapter05_08 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the number of students : ");

		int numberOfStudents = input.nextInt();

		System.out.println("Enter each student’s name and score :  ");

		String nameOfStudent = input.next();

		double scoreOfStudent = input.nextDouble();

		int checkStudentNumber = 0; //for flow control

		double highestScore = scoreOfStudent;
		
		String highestStudentName = nameOfStudent;

		
		while (checkStudentNumber < numberOfStudents -1) {

			System.out.println("Enter each student’s name and score :  ");

			nameOfStudent = input.next();

			scoreOfStudent = input.nextDouble();

			//determine the highest score
			if (highestScore < scoreOfStudent) {
				
				highestScore = scoreOfStudent;
				highestStudentName = nameOfStudent;
			}

			checkStudentNumber++;
		}
		
		//display result
		System.out
				.println("the name of the student with the highest score  : " + highestStudentName + "   " + highestScore);
	}

}
