package chapter01;

/*(Area and perimeter of a circle) Write a program that displays the area and perimeter
of a circle that has a radius of 5.5 using the following formula:
perimeter = 2 * radius * pi
area = radius * radius * pi

*/

public class Chapter01_08 {
	public static void main(String[] args) {
		
		// Variable definition
		double perimeter;
		double area;
		double radius = 5.5;
				
		//calculation perimeter ,pi = 3.14
		perimeter = 2 * radius * 3.14;
		
		//calculation area ,pi = 3.14
		area = radius * radius * 3.14;
		
		//display result calculation
		System.out.println("Perimeter : " + perimeter  );
		System.out.println("Area : " + area );
		
		
		
	}

}
