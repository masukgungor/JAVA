package chapter05;

public class Chapter05_19 {
	public static void main(String[] args) {
		
		int row = 8 ; // Initialize number of  row

		int fittingspace = 0; // to space adjustment
		
		for (int i = 0 ; i < row ; i++) {
			// Display white space
			for (int j =i ; j < 4 * ( row - fittingspace)+3 ; j ++) {
				System.out.print(" ");
			}
			// Display ascending numbers
			for (int k = 0 ; k < i ; k++) {
				System.out.printf("%5d",((int)(Math.pow(2, k) )));

			}
			fittingspace++;
			
			// Display descending numbers
			for (int k = 0 ; k <= i ; k++) {
				System.out.printf("%5d",((int)(Math.pow(2, i - k) )));
			}
			System.out.println();
		}
	}

}
