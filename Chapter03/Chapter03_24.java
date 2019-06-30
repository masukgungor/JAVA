package chapter03;
/*
 * (Game: pick a card) Write a program that simulates picking a card from a deck
of 52 cards. Your program should display the rank (Ace, 2, 3, 4, 5, 6, 7, 8, 9, 10,
Jack, Queen, King) and suit (Clubs, Diamonds, Hearts, Spades) of the card.
 */

public class Chapter03_24 {
	public static void main(String[] args) {

		int suit_select = (int) (Math.random() * 4);
		int card_select = (int) (Math.random() * 13);

		String suit = "";
		String card = "";
		switch (suit_select) {
		case 0:
			suit = "Clubs";
			break;
		case 1:
			suit = "Diamonds";
			break;
		case 2:
			suit = "Hearts";
			break;
		case 3:
			suit = "Spades";
			break;

		}
		switch (card_select) {
		case 0:
			card = "Ace";
			break;
		case 1:
			card = "2";
			break;
		case 2:
			card = "3";
			break;
		case 3:
			card = "4";
			break;
		case 4:
			card = "5";
			break;
		case 5:
			card = "6";
			break;
		case 6:
			card = "7";
			break;
		case 7:
			card = "8";
			break;
		case 8:
			card = "9";
			break;
		case 9:
			card = "Jack";
			break;
		case 10:
			card = "Queen";
			break;
		case 11:
			card = "King";
			break;

		}

		System.out.println("The card you picked is " + card + " of " + suit);

	}

}
