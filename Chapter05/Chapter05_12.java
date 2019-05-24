package chapter05;
/*
 * (Find the smallest n such that n2 7 12,000) Use a while loop to find the smallest
integer n such that n2 is greater than 12,000.
 */

public class Chapter05_12 {
	public static void main(String[] args) {
		
		int n =0 ;
		while (true ) {
			if (n*n > 12000) {
				System.out.println(n);
				break;
			}
			n++;
		}
		
	}

}
