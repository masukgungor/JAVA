package chapter01;

/*
 * (Average speed in miles) Assume a runner runs 14 kilometers in 45 minutes and 30
seconds. Write a program that displays the average speed in miles per hour. (Note
that 1 mile is 1.6 kilometers.)
 */
public class Chapter01_10 {
	public static void main(String[] args) {
		
		double kilometers = 14 ;
		double minutes = 45 ;
		double seconds = 30 ;
		double totalMil ;
		double totalHour ;
		double milPersec ;
		
		//1 mile is 1.6 kilometers
		totalMil = kilometers/1.6 ;
		
		//calculate total hour
		totalHour = (45.0/60 + 30.0/3600);
		
		//calculate perseconds
		milPersec = totalHour/totalMil ;
		
		System.out.println("Avarage speed : " +totalMil);
		
		
		
	}

}
