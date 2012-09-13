package lab08;

/*
 * Simple program to convert celsius to fahrenheit using dialogs
 */

import javax.swing.*;

public class Example1 {
	public static void main(String args[]){
		//using the input dialog to get input from the user and storing this in a string variable
		String input = JOptionPane.showInputDialog(null,"Enter the temperature");
		//converting the input string into a double using the double wrapper class
		double celsius = Double.parseDouble(input);
		//performing the calculation
		double fahrenheit = celsius * 1.8 +32;
		//creating a message dialog and displaying the result to the user
		JOptionPane.showMessageDialog(null,"That temperature in fahrenheit is "+fahrenheit);
	}
}
