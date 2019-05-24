package chapter05;

/*
 * (Simulation: heads or tails) Write a program that simulates flipping a coin one
million times and displays the number of heads and tails.
 */
public class Chapter05_40 {

	public static void main(String[] args) {

		int heads = 0;
		int tails = 0;

		for (int i = 0; i < 1000000; i++) {

			int flipping = (int) (Math.random() * 2);

			int result= (flipping == 0)?tails++: heads++ ;
		
		}
		
		System.out.println("heads :" + heads + "  tails :" + tails);
	}

}
