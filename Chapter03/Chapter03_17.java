package chapter03;
/*
 * (Game: scissor, rock, paper) Write a program that plays the popular scissor-rockpaper
game. (A scissor can cut a paper, a rock can knock a scissor, and a paper can
wrap a rock.) The program randomly generates a number 0, 1, or 2 representing
scissor, rock, and paper. The program prompts the user to enter a number 0, 1, or
2 and displays a message indicating whether the user or the computer wins, loses,
or draws
 */

import java.util.Scanner;

public class Chapter03_17 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("scissor (0), rock (1), paper (2):");

		int select = input.nextInt();

		if (!(2 >= select && select >= 0)) {
			System.out.println("wrong select");
			System.exit(0);
			;
		}

		int computer = (int) (Math.random() * 3);

		String user = "";
		String computerSelect = "";
		switch (select) {
		case 0:
			user = "Scissor";
			break;
		case 1:
			user = "Rock";
			break;
		case 2:
			user = "Paper";
			break;
		}
		switch (computer) {
		case 0:
			computerSelect = "Scissor";
			break;
		case 1:
			computerSelect = "Rock";
			break;
		case 2:
			computerSelect = "Paper";
			break;
		}

		if (select == computer) {
			System.out.println("It is a draw.  " + user + " = " + computerSelect);
		}
		if (select == 1) {
			if (computer == 0) {
				System.out.println("You won.  " + user + " beats " + computerSelect);

			}
			if (computer == 2) {
				System.out.println("Computer won. " + user + " is defeated " + computerSelect);
			}
		}
		if (select == 0) {
			if (computer == 1) {
				System.out.println("Computer won.  " + user + " is defeated " + computerSelect);

			}
			if (computer == 2) {
				System.out.println("You won.  " + user + " beats " + computerSelect);
			}
		}
		if (select == 2) {
			if (computer == 1) {
				System.out.println("You won.  " + user + " beats " + computerSelect);

			}
			if (computer == 0) {
				System.out.println("You won.  " + user + " is defeated " + computerSelect);
			}
		}
		input.close();
	}

}
