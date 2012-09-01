package project_slots;

/* Project:	SlotMachine - HDSSD1 - Software Development
 * File:	Game.java
 * Author:	David Byrne, 12101575
 * Date:	11/07/2012
 * Desc:	Class for handling a game.
 */

public class Game {
	////////////////////////////////////////////////////////
	//// data
	boolean debug = true;			// toggle console debug messages
	
	Purse purse;					// object for money
	Turn turn;						// object for turns
	int bet;						// integer for bet amount
	int winCode;					// integer for response code / win multiplier from turn
	//String[] logTurn;				// array to store current go
	//String[][] logTurns;			// array to track game
	
	////////////////////////////////////////////////////////
	//// constructors
	public Game(){
		this.purse = new Purse();	// init new purse
	}
	
	////////////////////////////////////////////////////////
	//// get & set methods
	public int get_bet(){									// bet
		return this.bet;
	}
	public void set_bet(int bet){
		this.bet = bet;
	}
	/*
	public String[][] get_logTurns(){						// logTurns
		return this.logTurns;
	}
	public String[] get_logTurn(){
		return this.logTurn;
	}
	*/
	
	////////////////////////////////////////////////////////
	//// functional methods
	public void run(){										// main handling of a game
		boolean running = true;
		while (running){
			if (debug){
				System.out.println("########################## New turn");
			}
			getUserBet();									// player inputs bet
			switch (purse.checkBet(get_bet())){				// test bet value
			case -3:
				// bet outside range (1-4)
				if (debug){
					System.out.println("Game:  case -3 - outside range");
				}
				String msg_outsideRange = "That bet is outside the range 1-4.\n\nPlease make another bet.";
				SUI.message(msg_outsideRange);
				break;
			case -2:
				// no money at all left
				if (debug){
					System.out.println("Game:  case -2 - no money left");
				}
				running = false;							// end game
				break;
			case -1:
				// bet too high but some money left
				if (debug){
					System.out.println("Game:  case -1 - not enough money");
				}
				break;
			case 0:
				// exit code
				if (debug){
					System.out.println("Game:  case 0 - exit");
				}
				running = false;							// end game
				break;
			case 1:
				// has the money for the chosen bet proceed with turn
				if (debug){
					System.out.println("Game:  case 1 - take a turn");
				}
				turn = new Turn(get_bet());
				winCode = turn.takeTurn();
				// logic flow:
				if (winCode < 0){
					// exit or error
					if (winCode == -2){
						//exit
						break;
					} else if (winCode == -1){
						// invalid bet
						String msg_invalidBet = "That is an invalid bet.\n\nPlease choose a bet between 1 and 4";
						SUI.message(msg_invalidBet);
						break;
					} else {
						// unknown response code
						System.out.println("Unknown winCode response recieved. Check your code!");
						break;
					}
				}  // end exit/error (winCode < 0)
				else {
					// valid bet value. commit purse changes accordingly
					purse.bet(get_bet());
					purse.win(get_bet(), winCode);
					turn.disp();
					purse.disp();
				}
			default:
				// response not coded
				System.out.println("Game:  case default - uh oh");
			} // end switch (checkBet)
			if (purse.get_coins() == 0){
				// if no money, quit
				running = false;
			}
		} // end of game while loop
	}
	private void getUserBet(){
		String prompt = "Please enter a bet from 1-4:";
		set_bet(SUI.getInt(prompt));
	}
	public void welcome(){									// Welcome message
		String msg_welcome = "Welcome to SlotMachine!"
				+"\n\nYou start with 10 coins worth €2.50"
				+"\n\nYou can exit at any time by betting 0 coins."
				+"\n\nEnjoy!";
		SUI.message(msg_welcome);
		System.out.println("##################################################");
		System.out.println("Welcome");
	}
	public void goodbye(){
		String msg_goodbye = "Thank you for playing SlotMachine!"
				+"\n\nWe hope you enjoyed your game."
				+"\nPlease come back again soon!";
		SUI.message(msg_goodbye);
		System.out.println("##################################################");
		System.out.println("Goodbye");
	}

}
