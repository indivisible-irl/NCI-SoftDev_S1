package lab01;

/*
*
*	MyAge.java
*
*  Author: David Byrne
*  Description: Lab work, Problem 1 - Calculate my age in days

*  Written: 28th April 2012
*/

//Create class -
public class MyAge {
   // Create main()
   public static void main(String args[]) {
		// declare vars
		int age = 27, daysInYear = 365;
		int days;

		// calc and print
		days = age * daysInYear;
		System.out.println("You are loosely "+ days + " days old.\n");

	}
}