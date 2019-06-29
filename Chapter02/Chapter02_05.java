package chapter02;

/*
 * (Financial application: calculate tips) Write a program that reads the subtotal
and the gratuity rate, then computes the gratuity and total. For example, if the
user enters 10 for subtotal and 15% for gratuity rate, the program displays $1.5
as gratuity and $11.5 as total.
 */
import java.util.Scanner;

public class Chapter02_05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the subtotal and a gratuity rate: ");

		double total = input.nextDouble();
		double gratuity = input.nextDouble();

		double gratuityRate = total * gratuity / 100;
		double subTotal = total + gratuityRate;

		System.out.println("The gratuity is : $" + gratuityRate + "\n and total is : $" + subTotal);
	}

}
