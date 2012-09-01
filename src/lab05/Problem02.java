package lab05;

/*
Problem02.java
Written by: David Byrne
Description: looping input
Written: 25/05/12
*/

import javabook.*;

public class Problem02 {

	public static void main(String args[]) {

		int input=0;
		MainWindow mWindow = new MainWindow();
		InputBox iBox = new InputBox(mWindow);
		MessageBox mBox = new MessageBox(mWindow);

		//mWindow.show();

		while (input >= 0) {

			input = iBox.getInteger("Please enter a number. Enter a negative number to exit.");
			if (input > 0)
				mBox.show("The square of " +input+ " is " +input*input);

		}

	//mWindow.dispose();

    }

}