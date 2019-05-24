package chapter05;
/*
 * (Summation) Write a program to compute the following summation.
 * 1 / (1 + √2) + 1 / (√2 + √3) + 1 / (√3 + √4) + ... +  1 / (√624 + √625)

 */

public class Chapter05_35 {
public static void main(String[] args) {
	
	double total = 0;
	for (int i = 1 ; i<= 625 ; i++) {
		total += 1/(Math.sqrt(i)+Math.sqrt(i+1));
	}
	
	System.out.printf("Summation is : %.4f\n ",total);
}
}
