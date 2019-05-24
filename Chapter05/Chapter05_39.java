package chapter05;

/*
 * (Financial application: find the sales amount) You have just started a sales job
in a department store. Your pay consists of a base salary and a commission. The
base salary is $5,000. The scheme shown below is used to determine the commission
rate.
			Sales Amount                   Commission Rate
			------------------------------------------------
			$0.01–$5,000                     8 percent
			$5,000.01–$10,000               10 percent
			$10,000.01 and above            12 percent
Note that this is a graduated rate. The rate for the first $5,000 is at 8%, the next
$5000 is at 10%, and the rest is at 12%. If the sales amount is 25,000, the commission
is 5,000 * 8% + 5,000 * 10% + 15,000 * 12% = 2,700.
Your goal is to earn $30,000 a year. Write a program that finds the minimum sales
you have to generate in order to make $30,000.
 */
public class Chapter05_39 {

	public static void main(String[] args) {
		final double COMMISSION_SOUGHT = 30000;

		double salary = 5000.0;

		double goalAmount = 30000.0;

		double salesAmount = 0.01;
		
		double comission = 0;

		
		do {
			salesAmount += 0.01;

			if ((salesAmount > 10000.0)) {
				comission += (salesAmount - 10000) * 0.12;
			}
			else if (salesAmount > 5000.0) {
				comission += (salesAmount - 5000.0) * 0.1;
			} else if (salesAmount > 0) {
				comission += salesAmount * 0.08;
			}

		}while (comission < COMMISSION_SOUGHT);

		System.out.printf("Minimum sales to earn $30,000: % .3f " ,salesAmount);
	}
}
