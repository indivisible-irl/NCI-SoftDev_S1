package lab02;

/*
CalculateWages.java
Author: David Byrne
Created: 04/05/2012
Description: Lab Prob 4 - Calculate weekly wages from hours and hourly rate of pay
*/

// imports
import javabook.MainWindow;
import javabook.InputBox;
import javabook.MessageBox;
import java.text.DecimalFormat;

// Create class -
public class CalculateWages {
    public static void main(String args[]) {

		// Declarations and creations
		double weeklyHours, payPerHour, weeklyWages;
		MainWindow mWindow = new MainWindow();
		MessageBox mBox = new MessageBox(mWindow);
		InputBox iBox = new InputBox(mWindow);

		// Define decimal format for double
		DecimalFormat df2 = new DecimalFormat("#.##");

		// Get our inputs
		weeklyHours = iBox.getDouble("Enter the hours you work in a week:");
		payPerHour = iBox.getDouble("What's your hourly rate in Euro?");

		// Calculate wages
		weeklyWages = weeklyHours * payPerHour;

		// Display result
		mBox.show("Working " +df2.format(weeklyHours)+
				" for " +df2.format(payPerHour)+
				" you should earn " +df2.format(weeklyWages)+ " Euro in a week.");

    }
}
