package lab02;

/*
TestVariableOutput.java
Author: David Byrne
Created: 07/05/2012
Description: Lab Additional Problem (Wed) - Test variable printing output.
*/

// Expected output:
/*
The output is 12
The output is 3
*/


public class TestVariableOutput {
    public static void main(String args[]) {

		int x, y;
		x = 1;
		y = 2;
		System.out.println("The output is " + x + y);
		System.out.println("The output is " + (x + y));

	}

}
