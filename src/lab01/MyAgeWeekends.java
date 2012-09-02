package lab01;

/*
*
*	MyAgeWeekends.java
*
*  Author: David Byrne
*  Description: Lab work, Problem 1 - Calculate my age in days

*  Written: 28th April 2012
*/

//Create class -
public class MyAgeWeekends {
   // Create main()
   public static void main(String args[]) {

		int age = 27, daysInYear = 365;
		int days;
		double weekendFraction = 2.0 / 7.0, weekends;
		//float weekends;

		days = age * daysInYear;
		// multiply by the fraction of weekends. Not the most accurate...
		weekends = days  * weekendFraction;

		System.out.println("You are loosely "+ days + " days old.");

		//System.out.println("You have survived "+ weekends + " fridays and saturdays so far...\n");
		// ^ Decimal days?
		// Converted to int and added one for rounding and being nice for leap years
		System.out.println("You have survived "+ (int)(weekends+1) + " fridays and saturdays so far...\n");

	}
}