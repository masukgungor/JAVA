package chapter05;
/*
 * (Display the ASCII character table) Write a program that prints the characters in
the ASCII character table from ! to ~. Display ten characters per line. The ASCII
table is shown in Appendix B. Characters are separated by exactly one space.
 */

public class Chapter05_15 {

	public static void main(String[] args) {
		
		int min = '!';
		int max = '~';
		
		while (min <= max) {
			System.out.print((char)min + " ");
			min ++ ;
			if (min %10 ==0)
				System.out.println();
		}
		
	}

}
