package chapter05;
/*
 * (Game: scissor, rock, paper) Programming Exercise 3.17 gives a program that
plays the scissor-rock-paper game. Revise the program to let the user continuously
play until either the user or the computer wins more than two times than its
opponent.
 */

import java.util.Scanner;

public class chapter05_34 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int winComputer = 0;
		int winUser = 0;
		while (true) {
			System.out.println("\nenter selection (scissor = 0, rock =1 ,paper = 2\n");

			int select = input.nextInt();

			int computer = (int) (Math.random() * 3);

			String user = "";
			String computerSelect = "";
			switch (select) {
			case 0:
				user = "scissor";
				break;
			case 1:
				user = "rock";
				break;
			case 2:
				user = "paper";
				break;
			}
			switch (computer) {
			case 0:
				computerSelect = "scissor";
				break;
			case 1:
				computerSelect = "rock";
				break;
			case 2:
				computerSelect = "paper";
				break;
			}

			if (select == computer) {
				System.out.println("status draw  " + user + " = " + computerSelect);
				continue;
			}

			if (select == 1) {
				if (computer == 0) {
					System.out.println("User won  :" + user + " beats " + computerSelect);
					winUser++;
				}
				if (computer == 2) {
					System.out.println("Computer won :" + user + " is defeated " + computerSelect);
					winComputer++;
				}
			}
			if (select == 0) {
				if (computer == 1) {
					System.out.println("Computer won : " + user + " is defeated " + computerSelect);
					winComputer++;
				}
				if (computer == 2) {
					System.out.println("User won : " + user + " beats " + computerSelect);
					winUser++;
				}
			}
			if (select == 2) {
				if (computer == 1) {
					System.out.println("User won : " + user + " beats " + computerSelect);
					winUser++;

				}
				if (computer == 0) {
					System.out.println("Computer won : " + user + " is defeated" + computerSelect);
					winComputer++;
				}
			}
			if (winComputer >= (winUser + 2)) {
				System.out.println("As a result of the game : Computer won");
				break;

			} else if (winUser >= (winComputer + 2)) {

				System.out.println("As a result of the game : User won");
				break;
			}
		}
	}

}
