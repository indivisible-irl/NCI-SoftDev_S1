package lab01;

/*
*
*	Problem3C.java
*
*  Author: David Byrne
*  Description: Lab work - Basic Arithmatic

*  Written: 27th April 2012
*/

//Create class -
public class Problem3C {
   // Create main()
   public static void main(String args[]) {
		// Declare our variables
		final float a = 5.0f, b = 10.0f;
		float c;

		// Perform our permutaions of operations and print the equations and results
		c = a + b;
		System.out.println("c = a + b results in: " + c);
		c = a - b;
		System.out.println("c = a - b results in: " + c);
		c = a * b;
		System.out.println("c = a * b results in: " + c);
		c = a / b;
		System.out.println("c = a / b results in: " + c);
		c = a % b;
		System.out.println("c = a % b results in: " + c);

		// Same again reversed
		System.out.println("\nc = b + a results in: " + (b + a));
		System.out.println("c = b - a results in: " + (b - a));
		System.out.println("c = b * a results in: " + (b * a));
		System.out.println("c = b / a results in: " + (b / a));
		System.out.println("c = b % a results in: " + (b % a) +"\n");

	}
}