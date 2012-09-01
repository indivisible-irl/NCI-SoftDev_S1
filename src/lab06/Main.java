package lab06;

/*
Name:	Main.java
Author:	David Byrne
SID:	x12101575
Desc:	A main class to play with our ArrayUtilities.
Written:16/06/12
*/

public class Main{
	public static void main(String args[]){

		// define an array
		int[] numbers = {1,4,13,43,25,6,44,9,7,26,76,45,12,9,5,3,2,5,12};
		double[] decimals = {1.0,1.1,1.2,1.3,1.4,1.5,1.6,1.7,1.8,1.9,2.0};

		int[] testArray = new int[numbers.length];
		double[] testArray2 = new double[decimals.length];

		int[][] twoD = {
						{1, 2, 3, 4, 5, 6, 7, 8, 9,10,11,12,13,14,15,16,17,18,19,20},
						{2, 4, 6, 8,10,12,14,16,18,20,22,24,26,28,30,32,34,36,38,40},
						{3, 6, 9,12,15,18,21,24,27,30,33,36,39,42,45,48,51,54,57,60}
						};

		// create our interface class
		ArrayUtilities util = new ArrayUtilities();


		// run some methods from our ArrayUtilities
		util.arraySum(numbers, true);
		util.arrayAvg(numbers, true);
		util.arrayMax(numbers, true);
		util.arrayMin(numbers, true);
		util.arrayPrint(numbers, true);

		util.arrayCopy(numbers, testArray, true);

		// double arrays:
		util.arraySum(decimals, true);
		util.arrayAvg(decimals, true);
		util.arrayMax(decimals, true);
		util.arrayMin(decimals, true);
		util.arrayPrint(decimals, true);

		util.arrayCopy(decimals, testArray2, true);

		// print a 2D array
		util.arrayPrint(twoD, true);


		// Print a new line to separate the output from the close prompt.
		System.out.println();
	}
}
