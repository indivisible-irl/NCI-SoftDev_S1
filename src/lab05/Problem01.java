package lab05;

/*
Problem01.java
Written by: David Byrne
Description: Nested loop to print changing numbers
Written: 25/05/12
*/

public class Problem01 {

	public static void main(String args[]) {

		int i=0, j;

		while (i < 5) {
			// outer loop
			j = 1;
			
			while (j <= 5) {
				// inner loop
				System.out.print(i+j + " ");
			j++;
			}

			// newline
			System.out.println();
			i++;
		}

    }

}