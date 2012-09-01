package lab02;

/*
ConvertLength.java
Author: David Byrne
Created: 06/05/2012
Description: Lab Additional Problem (Sun) - Convert from degrees Celcius to degrees Farenheit
*/

// imports
import javabook.*;
import java.text.DecimalFormat;

// Create class -
public class CelciusToFarenheit2 {
    public static void main(String args[]) {

		// Declarations and creations
		double celcius, farenheit;
		MainWindow mWindow = new MainWindow();
		MessageBox mBox = new MessageBox(mWindow);
		InputBox iBox = new InputBox(mWindow);

		// Define decimal format for double to two decimal places
		DecimalFormat df2 = new DecimalFormat("#.##");

		// Get input temperature (celcius)
		celcius = iBox.getDouble("Enter the temperature in celcius:");

		// Calculate temperature in Farenheit
		farenheit = celcius * 9/5 + 32;

		// Display result
		mBox.show(df2.format(celcius)+ " degrees Celcuis is " +df2.format(farenheit)+ " degrees Farenheit");

	}

}
