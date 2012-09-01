package lab06;

/*
Name:	ArrayUtilities.java
Author:	David Byrne
SID:	x12101575
Desc:	A utilities class to play with arrays.
Written:16/06/12
*/


public class ArrayUtilities {

	// behavioural methods only in this one.
	///////////////////////////////////////////////////////////////////////////////////////////
	// get the sum of all the elements
	public int arraySum(int[] array, boolean print){
		int sum = 0;
		for (int i=0; i < array.length; i++){
			sum += array[i];
		}
		if (print){
			// include this so we can reuse the functionality skipping the print
			System.out.println("The sum of your array is:\t" +sum);
			line();
		}
		return sum;
	}
	///////////////////////////////////////////////////////////////////////////////////////////
	// get the average value of the elements
	public double arrayAvg(int[] array, boolean print){
		double avg = arraySum(array, false) / array.length;
		if (print){
			// include this so we can reuse the functionality skipping the print
			System.out.println("The avg of your array is:\t" +avg);
			line();
		}
		return avg;
	}
	///////////////////////////////////////////////////////////////////////////////////////////
	// get the maximum value in the array
	public int arrayMax(int[] array, boolean print){
		int max = Integer.MIN_VALUE;
		for (int i=0; i < array.length; i++){
			if (array[i] > max){
				max = array[i];
			}
		}
		if (print){
			System.out.println("The maximum value is:\t\t" +max);
			line();
		}
		return max;
	}
	///////////////////////////////////////////////////////////////////////////////////////////
	// get the minimum value in an int array
	public int arrayMin(int[] array, boolean print){
		// initialise the max int value so we can test for lower than it.
		int min = Integer.MAX_VALUE;
		//System.out.println("!\tTEST: int max is: " +min);
		//line();
		for (int i=0; i < array.length; i++){
			if (array[i] < min){
				min = array[i];
			}
		}
		if (print){
			System.out.println("The minimum value is:\t\t" +min);
			line();
		}
		return min;
	}
	///////////////////////////////////////////////////////////////////////////////////////////
	// print the whole array
	public void arrayPrint(int[] array, boolean print){
		if (print){
			System.out.println("The contents of your array:");
		}
		for (int i=0; i < array.length; i++){
			System.out.print(array[i]+ " ");
		}
		line();
		line();
	}
	///////////////////////////////////////////////////////////////////////////////////////////
	// copy arrays
	public int[] arrayCopy(int[] array1, int[] array2, boolean print){
		if(array1.length != array2.length){
			System.out.println("!!  Your arrays must be of the same dimension");
			line();
			return null;
		} else{
			for (int i=0; i < array1.length; i++){
				array2[i] = array1[i];
			}

			if (print){
				System.out.println("Your 1st array contains:");
				arrayPrint(array1, false);
				System.out.println("Your 2nd array contains:");
				arrayPrint(array2, false);
				line();
			}
			return array2;
		}
	}
	///////////////////////////////////////////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////////////////////////////////////
	// duplicate methods for dealing with doubles
	// get the sum of all the elements
	public double arraySum(double[] array, boolean print){
		double sum = 0.0;
		for (int i=0; i < array.length; i++){
			sum += array[i];
		}
		if (print){
			// include this so we can reuse the functionality skipping the print
			System.out.println("The sum of your array is:\t" +sum);
			line();
		}
		return sum;
	}
	///////////////////////////////////////////////////////////////////////////////////////////
	// get the average value of the elements
	public double arrayAvg(double[] array, boolean print){
		double avg = arraySum(array, false) / array.length;
		if (print){
			// include this so we can reuse the functionality skipping the print
			System.out.println("The avg of your array is:\t" +avg);
			line();
		}
		return avg;
	}
	///////////////////////////////////////////////////////////////////////////////////////////
	// get the maximum value in the array
	public double arrayMax(double[] array, boolean print){
		double max = 0;
		for (int i=0; i < array.length; i++){
			if (array[i] > max){
				max = array[i];
			}
		}
		if (print){
			System.out.println("The maximum value is:\t\t" +max);
			line();
		}
		return max;
	}
	///////////////////////////////////////////////////////////////////////////////////////////
	// get the minimum value in an int array
	public double arrayMin(double[] array, boolean print){
		// initialise the max int value so we can test for lower than it.
		double min = Double.MAX_VALUE;
		//System.out.println("!\tTEST: double max is: " +min);
		//line();
		for (int i=0; i < array.length; i++){
			if (array[i] < min){
				min = array[i];
			}
		}
		if (print){
			System.out.println("The minimum value is:\t\t" +min);
			line();
		}
		return min;
	}
	///////////////////////////////////////////////////////////////////////////////////////////
	// print the whole array
	public void arrayPrint(double[] array, boolean print){
		if (print){
			System.out.println("The contents of your array:");
		}
		for (int i=0; i < array.length; i++){
			System.out.print(array[i]+ " ");
		}
		line();
		line();
	}
	///////////////////////////////////////////////////////////////////////////////////////////
	// copy arrays
	public double[] arrayCopy(double[] array1, double[] array2, boolean print){
		if(array1.length != array2.length){
			System.out.println("!!  Your arrays must be of the same dimension");
			line();
			return null;
		} else{
			for (int i=0; i < array1.length; i++){
				array2[i] = array1[i];
			}

			if (print){
				System.out.println("Your 1st array contains:");
				arrayPrint(array1, false);
				System.out.println("Your 2nd array contains:");
				arrayPrint(array2, false);
			}
			line();
			return array2;
		}
	}
	///////////////////////////////////////////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////////////////////////////////////
	// print a 2D array
	public void arrayPrint(int[][] array, boolean print){
		if (print){
			System.out.println("Your 2D array contains:");
		}
		// loop through rows
		for (int i=0; i < array.length; i++){
			System.out.print(i+ " | ");
			// loop through the columns
			for (int j=0; j < array[0].length; j++){
				int num = array[i][j];
				if (num < 10){
					System.out.print(" " +num+ " ");
				} else{
					System.out.print(array[i][j]+ " ");
				}
			}
			System.out.println();
		}
	}
	///////////////////////////////////////////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////////////////////////////////////
	public void line(){
		// print a blank line for spacing
		System.out.println();
	}


}
