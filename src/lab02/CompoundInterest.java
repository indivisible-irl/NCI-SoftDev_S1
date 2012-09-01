package lab02;

/*
CompoundInterest.java
Author: David Byrne
Created: 07/05/2012
Description: Lab Additional Problem (Mon) - Calculate compound interest over one year
*/

// imports
import javabook.MainWindow;
import javabook.MessageBox;
import javabook.InputBox;
import java.text.DecimalFormat;

// Create class -
public class CompoundInterest {
    public static void main(String args[]) {

		// Declarations and creations
		double euro, interestRate, total;
		MainWindow mWindow = new MainWindow();
		MessageBox mBox = new MessageBox(mWindow);
		InputBox iBox = new InputBox(mWindow);

		// Define decimal format for double
		DecimalFormat df2 = new DecimalFormat("#.##");

		// Get input centimeters
		interestRate = iBox.getDouble("Enter the interest rate:");
		euro = iBox.getDouble("Enter the Euro amount:");

		// Calculate total after one year
		total = euro * (1 + interestRate / 100);

		// Display result
		mBox.show("You will have " +df2.format(total)+ " Euro after one year");

	}

}
