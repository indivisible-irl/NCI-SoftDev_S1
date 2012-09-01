package project_slots;

/* Project:	SlotMachine - HDSSD1 - Software Development
 * File:	SUI.java
 * Author:	David Byrne, 12101575
 * Date:	19/07/2012
 * Desc:	Static Utility Class for a Simple User InterFace (javabook)
 */

import javabook.MainWindow;
import javabook.MessageBox;
import javabook.InputBox;

public class SUI {
	////////////////////////////////////////////////////////
	//// data / objects
	private static MainWindow mWindow = new MainWindow("Slot Machine");
	private static MessageBox mBox = new MessageBox(mWindow);
	private static InputBox iBox = new InputBox(mWindow);
	
	////////////////////////////////////////////////////////
	//// constructor
	private SUI(){
		// default PRIVATE constructor
	}
	
	////////////////////////////////////////////////////////
	//// methods
	public static void message(String msg){
		mBox.show(msg);
	}
	public static int getInt(String prompt){
		return iBox.getInteger(prompt);
	}
	public static float getFloat(String prompt){
		return iBox.getFloat(prompt);
	}
	public static double getDouble(String prompt){
		return iBox.getDouble(prompt);
	}
	public static String getString(String prompt){
		return iBox.getString(prompt);
	}
}