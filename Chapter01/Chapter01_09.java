package chapter01;

/*
 * (Area and perimeter of a rectangle) Write a program that displays the area and
	perimeter of a rectangle with the width of 4.5 and height of 7.9 using the following
	formula:
	area = width * height

 */

public class Chapter01_09 {
	public static void main(String[] args) {

		// Variable definition
		double height = 7.9;
		double regtangleArea;
		double regtanglePerimeter;
		double width = 4.5;

		// calculation area ,pi = 3.14
		regtangleArea = height * width;
		regtanglePerimeter = 2 * (height + width);
		

		System.out.println(" Regtangle area : " + regtangleArea);
		System.out.println(" Regtangle perimeter : " + regtanglePerimeter);

	}

}
