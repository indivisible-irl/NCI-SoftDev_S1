package lab01;

/*
*
*	Problem2C.java
*
*  Author: David Byrne
*  Description: Lab work - Temperature converter

*  Written: 27th April 2012
*/

//Create class -
public class Problem2C {
   // Create main()
   public static void main(String args[]) {
		// Declare our variables
		float celcius, farenheit;

		// Assign the first value to calculate
		celcius = 30.0f;

		// Perform the calculation
		farenheit = (float)((celcius * 1.8) + 32);

		// Print our result
		System.out.println(celcius + "\tdegrees celcius in farenheit is " + farenheit);


		// Rinse and repeat for the other values of celcius since we're not looping yet
		celcius = 100.0f;
		farenheit = (float)((celcius * 1.8) + 32);
		System.out.println(celcius + "\tdegrees celcius in farenheit is " + farenheit);

		celcius = 0.0f;
		farenheit = (float)((celcius * 1.8) + 32);
		System.out.println(celcius + "\tdegrees celcius in farenheit is " + farenheit);
	}
}