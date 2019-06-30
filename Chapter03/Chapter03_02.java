package chapter03;

/*
 * (Game: add three numbers) The program in Listing 3.1, AdditionQuiz.java, generates
two integers and prompts the user to enter the sum of these two integers.
Revise the program to generate three single-digit integers and prompt the user to
enter the sum of these three integers.
 */
import java.util.Scanner;

public class Chapter03_02 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int number1 = (int) (Math.random() * 10);
		int number2 = (int) (Math.random() * 10);
		int number3 = (int) (Math.random() * 10);

		System.out.println(number1 + " + " + number2 + " + " + number3 + " = ?");

		int answer = input.nextInt();

		int sum = number1 + number2 + number3;

		System.out.println(sum == answer ? "Correct answer" : "Wrong answer");

		input.close();

	}

}
