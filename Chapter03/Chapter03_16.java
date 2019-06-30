package chapter03;
/*
 * (Random point) Write a program that displays a random coordinate in a rectangle.
The rectangle is centered at (0, 0) with width 100 and height 200.
 */

public class Chapter03_16 {
	public static void main(String[] args) {

		int x_cordinat = (int) (Math.random() * 200) - 100;
		int y_cordinat = (int) (Math.random() * 400) - 200;
		System.out.println("( " + (x_cordinat) + " , " + (y_cordinat) + " )");

		x_cordinat = (int) (Math.random() * 100) - 50;
		y_cordinat = (int) (Math.random() * 200) - 100;
		System.out.println("( " + (x_cordinat) + " , " + (y_cordinat) + " )");

		x_cordinat = (int) (Math.random() * 100) - 50;
		y_cordinat = (int) (Math.random() * 200) - 100;
		System.out.println("( " + (x_cordinat) + " , " + (y_cordinat) + " )");

		x_cordinat = (int) (Math.random() * 100) - 50;
		y_cordinat = (int) (Math.random() * 200) - 100;
		System.out.println("( " + (x_cordinat) + " , " + (y_cordinat) + " )");

	}
}
