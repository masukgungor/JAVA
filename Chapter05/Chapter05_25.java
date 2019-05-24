package chapter05;
/*
 * (Compute p) You can approximate p by using the following series:
p = 4(1 -1/3+1/5 -1/7 +1/9 -1/11 + ... +(-1)i + 1/2i - 1)
Write a program that displays the p value for i = 10000, 20000, …, and
100000.
 */

public class Chapter05_25 {

	public static void main(String[] args) {

		double pi = 0;
		//calculate PI for n
		for (double n = 10000.0; n <= 100000.0; n += 10000.0) {
			for (double i = 1.0; i <= n; i += 1.0) {

				pi += Math.pow((-1), (i + 1)) / (2 * i - 1); 

			}

			double sum = 4 * pi / (n / 10000.0); 
			
			//display result
			System.out.printf("Pi value for %.1f : %.10f \n", n, sum);
		}
	}
}
