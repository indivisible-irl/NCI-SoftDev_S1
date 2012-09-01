package project_slots;

/* Project:	SlotMachine - HDSSD1 - Software Development
 * File:	Wheel.java
 * Author:	David Byrne, 12101575
 * Date:	10/07/2012
 * Desc:	Class to take a single turn
 */

////////////////////////////////////////////////////////////
//// imports
import java.util.Arrays;

public class Turn {
	////////////////////////////////////////////////////////
	//// data
	private boolean debug = true;					// toggle debug messages
	
	private int bet;								// amount bet
	private int winMultiplier;						// multiplier to calc winnings
	private Pull pull;								// create Pull object
	private String[] fruit = new String[3];			// string array to hold fruit result
	// win conditions
	private String[] win10 = {"bell", "bell", "bell"};
	private String[] win7 = {"grape", "grape", "grape"};
	
	////////////////////////////////////////////////////////
	//// constructors
	public Turn(){								// default - testing, not for std use.
		if (debug){
			System.out.println("##################################################");
			System.out.println("\tNew turn:");
		}
		System.out.println("CAUTION!: You are using an unsupported/testing constructor");
		set_bet(2);
	}
	public Turn(int bet){						// overloaded - bet: use this for normal game
		if (debug){
			System.out.println("##################################################");
			System.out.println("\tNew turn:");
		}
		set_bet(bet);
	}

	////////////////////////////////////////////////////////
	//// get & set methods
	public void set_bet(int bet){							// bet
		if (debug){
			System.out.println("Turn:  set_bet() - " +bet);
		}
		this.bet = bet;
	}
	public int get_bet(){
		return this.bet;
	}
	public String[] get_fruit(){							// fruit
		return this.fruit;
	}
	public void set_fruit(String[] array){
		if (debug){
			System.out.print("Turn:  set_fruit() - ");
			for (String fruit : array){
				System.out.print(fruit + ", ");
			}
			System.out.println();
		}
		this.fruit = array;
	}
	public void set_winMultiplier(int num){					// winMultiplier
		if (debug){
			System.out.println("Turn:  set_winMultiplier() - " +num);
		}
		this.winMultiplier = num;
	}
	public int get_winMultiplier(){
		return this.winMultiplier;
	}
	
	////////////////////////////////////////////////////////
	//// functional methods
	public int takeTurn(){					// take a turn
		// take a full turn
		if (get_bet() == 0){
			// entered a 0 to exit
			return -2;
		} else {
			// anything else
			if (verifyBet(get_bet())){
				// bet within 1-4
				validTurn();
				return get_winMultiplier();
			} else {
				// bet not 1-4
				return -1;
			}
		}
	}
	private void validTurn(){
		// take a turn after verify that legit
		pull = new Pull();
		set_fruit(pull.get_fruit());
		checkWin();
	}
	private boolean verifyBet(int bet){							// verify bet
		// test to ensure that bet is from 1-4
		// check for bet of 0 happens [elsewhere]
		if (1 <= bet && bet <= 4){
			return true;
		} else {
			return false;
		}
	}
	public void checkWin(){									// test for win
		// work out if the turn wins anything.
		// returns: [int] win multiplier
		if (Arrays.equals(this.fruit, win10)){
			if (debug){
				System.out.println("Turn:  checkWin() - 10");
			}
			set_winMultiplier(10);
		}
		else if (Arrays.equals(this.fruit, win7)){
			if (debug){
				System.out.println("Turn:  checkWin() - 7");
			}
			set_winMultiplier(7);
		}
		else {
			int cherryCount = 0;		// init a cherries counter
			for (int i=0; i<3; i++){
				if (this.fruit[i] == "cherry"){
					cherryCount++;
				}
			}
			switch (cherryCount){
				case 1:					// 1 cherry
					if (debug){
						System.out.println("Turn:  checkWin() - 1");
					}
					set_winMultiplier(1);
					break;
				case 2:					// 2 cherries
					if (debug){
						System.out.println("Turn:  checkWin() - 3");
					}
					set_winMultiplier(3);
					break;
				case 3:					// 3 cherries
					if (debug){
						System.out.println("Turn:  checkWin() - 5");
					}
					set_winMultiplier(5);
					break;
				default:				// no win
					if (debug){
						System.out.println("Turn:  checkWin() - 0");
					}
					set_winMultiplier(0);
					break;
			}
		}
	}
	public void disp(){
		// need to verify for print
		String msg = "You bet " +get_bet()+ " coins"
				+"\nYou rolled:\n";
		for (int i=0; i<get_fruit().length; i++){
			msg += get_fruit()[i];
			if (i<2){
				msg += ", ";
			}
		}
		if (get_winMultiplier() > 0){
			msg += "\n\nYou won!!"
					+"\n\nYou bet: " +get_bet()
					+"\nand you win: " +(get_bet()*get_winMultiplier());
		} else {
			msg += "\n\nSorry, you didn't win."
					+"\nBetter luck next time!";
		}
		SUI.message(msg);
		
//		System.out.println("##################################################");
//		System.out.println("You have bet " +this.bet);
//		System.out.print("You rolled: ");
//		for (String fruit : this.fruit){
//			System.out.print(fruit + ", ");
//		}
//		System.out.println();
//		if (this.winMultiplier > 0){
//			System.out.println("You won " +(get_bet() * get_winMultiplier()));
//		} else {
//			System.out.println("You didn't win this time. Lost " +get_bet());
//		}
//		System.out.println("##################################################");
	}
	
}
