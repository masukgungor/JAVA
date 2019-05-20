package chapter05;

/*
 * (Find the largest n such that n3 6 12,000) Use a while loop to find the largest
integer n such that n3 is less than 12,000.
 */
public class Chapter05_13 {
	public static void main(String[] args) {

		int n = 0;
		while (true) {
			if (n * n * n > 12000) {
				System.out.println(n - 1);
				break;
			}
			n++;
		}

	}
}
