package lab02;

/*
HoursIntoMinutes.java
Author: David Byrne
Created: 04/05/2012
Description: Lab Prob 3 - Convert hours into minutes
*/

// imports
import javabook.MainWindow;
import javabook.MessageBox;
import javabook.InputBox;
import java.text.DecimalFormat;

// Create class -
public class HoursIntoMinutes {
    public static void main(String args[]) {

		// Declarations and creations
		float hours, minutes;

		MainWindow mWindow = new MainWindow();
		MessageBox mBox = new MessageBox(mWindow);
		InputBox iBox = new InputBox(mWindow);

		// Define decimal format for float to two decimal places
		DecimalFormat decimal2 = new DecimalFormat("#.##");

		// Get our value for radius
		hours = iBox.getFloat("Enter the hours you'd like to see in minutes:");

		// Calculate minutes
		minutes = (float)(hours * 60);

		// Display result. if...else for pluralisation of hour(s)
		if (hours == 1) {
			mBox.show(decimal2.format(hours)+ " hour is " +decimal2.format(minutes)+ " minutes.");
		}
		else {
			mBox.show(decimal2.format(hours)+ " hours is " +decimal2.format(minutes)+ " minutes.");
		}

	}

}
