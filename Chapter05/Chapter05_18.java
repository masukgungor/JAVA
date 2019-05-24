package chapter05;
/*
 * 
 * (Display four patterns using loops) Use nested loops that display the following
patterns in four separate programs:

 */

public class Chapter05_18 {
	public static void main(String[] args) {

		int row = 7;
		// Create spaces in each row
		for (int i = 1; i < row; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();

		}
		System.out.println();
		System.out.println("----------------------------------------------------");
		System.out.println();

		// Create spaces in each row
		for (int i = 1; i < row; i++) {
			for (int j = 6, k = 1; j >= i; j--, k++) {
				System.out.print(k + " ");
			}

			System.out.println();
		}
		System.out.println();
		System.out.println("----------------------------------------------------");
		System.out.println();

		int fittingSpace = 0;
		// Create spaces in each row
		for (int i = 1; i < row; i++) {
			for (int j = i; j < (2 * row - 3) - fittingSpace; j++) {
				System.out.print(" ");
			}
			for (int k = i; k > 0; k--) {
				System.out.print(k + " ");

			}
			fittingSpace++;

			System.out.println();
		}
		System.out.println();
		System.out.println("----------------------------------------------------");
		System.out.println();
		int changeNumber = row;
		int arangeSpace = 0;
		// Create spaces in each row
		for (int i = 1; i < row; i++) {
			for (int j = 0; j < 2 * arangeSpace; j++) {
				System.out.print(" ");
			}

			for (int k = 1; k < changeNumber; k++) {
				System.out.print(k + " ");

			}
			changeNumber--;
			arangeSpace++;
			fittingSpace++;
			System.out.println();

		}
	}

}
