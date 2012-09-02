package lab01;

/*
*
*	PhoneSquared.java
*
*  Author: David Byrne
*  Description: Lab work, Problem 1 - Calculate my age in days

*  Written: 28th April 2012
*/

//Create class -
public class PhoneSquared {
   // Create main()
   public static void main(String args[]) {
		// Declare and assign vars
		int phoneInt = 852376851;
		long phoneLong = phoneInt;

		// Print and calc together for int and long vers
		System.out.println("Int calulations:");
		System.out.println("You phone number is:\t"+ phoneInt);
		System.out.println("Your number squared is:\t"+ phoneInt * phoneInt);
		System.out.println("Your number % 5 is:\t"+ phoneInt % 5);

		System.out.println("\nLong calulations:");
		System.out.println("You phone number is:\t"+ phoneLong);
		System.out.println("Your number squared is:\t"+ phoneLong * phoneLong);
		System.out.println("Your number % 5 is:\t"+ phoneLong % 5 +"\n");
	}
}