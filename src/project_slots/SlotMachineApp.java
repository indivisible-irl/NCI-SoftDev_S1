package project_slots;

/* Project:	SlotMachine - HDSSD1 - Software Development
 * File:	SlotMachineApp.java
 * Author:	David Byrne, 12101575
 * Date:	10/07/2012
 * Desc:	Main Slot Machine application
 */

public class SlotMachineApp {
	public static void main(String args[]){
		////////////////////////////////////////////////////////
		//// functionality
		
		Game game = new Game();								// init a game
		game.welcome();
		game.run();											// main game loop
		game.goodbye();
		
		game.purse.disp();									// after game
	}
}