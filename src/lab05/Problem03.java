package lab05;

/*
Problem03.java
Written by: David Byrne
Description: do...while
Written: 25/05/12
*/

import javabook.*;

public class Problem03 {

	public static void main(String args[]) {

		int score=0;
		MainWindow mWindow = new MainWindow();
		InputBox iBox = new InputBox(mWindow);
		MessageBox mBox = new MessageBox(mWindow);

		//mWindow.show();

		do {

			score = iBox.getInteger("Please enter a number. to exit enter a num such that: 0 <= num <= 100");
			mBox.show("The number you entered is " +score);

		} while (0 <= score && score <= 100);

	//mWindow.dispose();

    }

}