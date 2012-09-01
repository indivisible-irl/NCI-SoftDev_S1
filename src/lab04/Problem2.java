package lab04;

/*
file: Problem2.java
author: David Byrne
date: 18/05/2012
description: Lab problem 2 - Powers, switch case
*/

//import javabook.MainWindow;
//import javabook.InputBox;
//import javabook.MessageWindow;
import javabook.*;

public class Problem2 {
	public static void main(String args[]) {


		int power;
		String powerName = "";

		MainWindow mWindow = new MainWindow("Generic title");
		InputBox iBox = new InputBox(mWindow);
		MessageBox mBox = new MessageBox(mWindow);

		power = iBox.getInteger("Enter the number of zeros.\n\n  Hint:\n 6, 9, 12, 15, 18, 21, 30, 100 ");

		switch (power) {
			case 6:
				powerName = "Million";
				break;
			case 9:
				powerName = "Billion";
				break;
			case 12:
				powerName = "Trillion";
				break;
			case 15:
				powerName = "Quadrillion";
				break;
			case 18:
				powerName = "Quintillion";
				break;
			case 21:
				powerName = "Sextillion";
				break;
			case 30:
				powerName = "Nonillion";
				break;
			case 100:
				powerName = "Googol";
				break;
			default:
				mBox.show("That's not one of the options.");
			}


		if (powerName != "")  {
			mBox.show("That many zeros gives you a " +powerName);
			}

		}

	}