package lab02;

/*
TestOutput.java
Author: David Byrne
Created: 07/05/2012
Description: Lab Additional Problem (Tues) - Test print output and how it handles newlines.
*/


/*  Expected output:
One
Two
ThreeFour

FiveSix

*/

// Create class
public class TestOutput {
    public static void main(String args[]) {

		System.out.println("One");
		System.out.print("Two");
		System.out.print("\n");
		System.out.print("Three");
		System.out.println("Four");
		System.out.print("\n");
		System.out.print("Five");
		System.out.println("Six");

	}

}
