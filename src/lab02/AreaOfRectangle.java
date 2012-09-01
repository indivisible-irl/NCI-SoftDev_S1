package lab02;

/*
AreaOfRectangle.java
Author: David Byrne
Created: 04/05/2012
Description: Lab Prob 1 - Calculate the area of a rectangle
*/

// imports
import javabook.MainWindow;
import javabook.MessageBox;
import javabook.InputBox;
import java.text.DecimalFormat;

// Create class -
public class AreaOfRectangle {
    public static void main(String args[]) {

		// Declarations and creations
		float length, width, area;
		MainWindow mWindow = new MainWindow();
		MessageBox mBox = new MessageBox(mWindow);
		InputBox iBox = new InputBox(mWindow);

		// Define decimal format for floats to two decimal places
		DecimalFormat decimal2 = new DecimalFormat("#.##");

		// Get our value for num1
		length = iBox.getFloat("Enter the length of your rectangle:");
		width = iBox.getFloat("Now enter the width:");

		// Calculate area
		area = length * width;

		// Display result
		mBox.show("The area of a rectangle (" +decimal2.format(length)+ " x " +decimal2.format(width)+ ") is:\n" +decimal2.format(area));

	}

}
