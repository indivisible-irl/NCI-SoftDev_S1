package lab01;

/*
*
*	Problem4C.java
*
*  Author: David Byrne
*  Description: Lab work - Even more arithmetic operations, complex this time.

*  Written: 27th April 2012
*/

//Create class -
public class Problem4C {
   // Create main()
   public static void main(String args[]) {

		// Problem4C.1
		int i = 21;							// initialise i
		int j = 42;							//  and j
		int k = 11;							//  also k
		i = 4 * (j + 16) % k;
		System.out.println("'i = 4 * (j + 16) % k' results in:\n\t" + i);

		// Problem4C.2
		i = 21;
		i = i - j + k * 7;
		System.out.println("'i = i - j + k * 7' results in:\n\t" + i);

		// Problem4C.3
		i = 21;								// reinitialise i
		i = (i - j + k) * 7;
		System.out.println("'i = (i - j + k) * 7' results in:\n\t" + i);

		/*
			Could also have just calculated in the print statement like so:
				System.out.println("'i = 4 * (j + 16) % k' results in:\n\t" + (i - j + k * 7));
			So that 'i' is not modified and needs no reinitialisation.
		*/
	}
}