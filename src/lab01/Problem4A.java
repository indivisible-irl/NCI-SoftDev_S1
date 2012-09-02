package lab01;

/*
*
*	Problem4A.java
*
*  Author: David Byrne
*  Description: Lab work - More arithmetic operations

*  Written: 27th April 2012
*/

//Create class -
public class Problem4A {
   // Create main()
   public static void main(String args[]) {

		// Problem4A.1
		int i = 12;							// initialise i
		int j = 5;							//  and j
		System.out.println("'i = i / j' results in: " + (i / j));

		// Problem4A.2
		System.out.println("'i = i % j' results in: " + (i % j));

		// Problem4A.3
		i = 10;								// reassign value to i
		j = 5;								//	and j
		i = i / j;
		System.out.println("'i = i / j' results in: " + i);

	}
}