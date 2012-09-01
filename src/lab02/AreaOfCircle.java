package lab02;

/*
AreaOfCircle.java
Author: David Byrne
Created: 04/05/2012
Description: Lab Prob 2 - Calculate the area of a circle
*/

// imports
import javabook.MainWindow;
import javabook.MessageBox;
import javabook.InputBox;
import java.text.DecimalFormat;
import static java.lang.Math.PI;

// Create class -
public class AreaOfCircle {
    public static void main(String args[]) {

		// Declarations and creations
		float radius;
		double area;

		MainWindow mWindow = new MainWindow();
		MessageBox mBox = new MessageBox(mWindow);
		InputBox iBox = new InputBox(mWindow);

		// Define decimal format for double to two decimal places
		DecimalFormat df2 = new DecimalFormat("#.##");

		// Get our value for radius
		radius = iBox.getFloat("Enter the radius of your circle:");

		// Calculate area
		area = radius * PI * PI;

		// Display result
		mBox.show("The area of a circle with radius " +df2.format(radius)+
				" is:\n" +area+ "\n\nFYI, Pi was defined as: " +PI);

	}

}
