package lab02;

/*
ConvertLength.java
Author: David Byrne
Created: 06/05/2012
Description: Lab Additional Problem (Sat) - Convert from centimeters to inches
*/

// imports
import javabook.MainWindow;
import javabook.MessageBox;
import javabook.InputBox;
import java.text.DecimalFormat;

// Create class -
public class ConvertLength {
    public static void main(String args[]) {

		// Declarations and creations
		double centimeters, inches;
		MainWindow mWindow = new MainWindow();
		MessageBox mBox = new MessageBox(mWindow);
		InputBox iBox = new InputBox(mWindow);

		// Define decimal format for double
		DecimalFormat df2 = new DecimalFormat("#.##");

		// Get input centimeters
		centimeters = iBox.getDouble("Enter centimeters to convert to inches:");

		// Calculate length in inches
		inches = centimeters / 2.54;

		// Display result
		mBox.show("Input: " +df2.format(centimeters)+ " cm\nOutput: " +df2.format(inches)+ " inches.");

	}

}
