package lab02;

/*
VolumeOfSphere.java
Author: David Byrne
Created: 04/05/2012
Description: Lab Additional Problem (Thurs) - Calculate the volume of a sphere
*/

// imports
import javabook.MainWindow;
import javabook.MessageBox;
import javabook.InputBox;
import java.text.DecimalFormat;
import static java.lang.Math.PI;

// Create class -
public class VolumeOfSphere {
    public static void main(String args[]) {

		// Declarations and creations
		double radius, volume;

		MainWindow mWindow = new MainWindow();
		MessageBox mBox = new MessageBox(mWindow);
		InputBox iBox = new InputBox(mWindow);

		// Define decimal format for double
		DecimalFormat df2 = new DecimalFormat("#.##");

		// Get our value for radius
		radius = iBox.getDouble("Enter the radius of your sphere:");

		// Calculate volume
		volume = (4.0/3.0)*(PI*(radius*radius*radius));		// use doubles to retain precision

		// Display result
		mBox.show("The volume of a sphere with radius " +df2.format(radius)+
				" is:\n" +volume+ "\n\nPI is: " +PI);

	}

}
