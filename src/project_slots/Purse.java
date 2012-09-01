package project_slots;

/* Project:	SlotMachine - HDSSD1 - Software Development
 * File:	Purse.java
 * Author:	David Byrne, 12101575
 * Date:	10/07/2012
 * Desc:	Class for the player's "purse".
 * 			Tracks and manipulates their money.
 */

import java.text.DecimalFormat;

public class Purse {
	////////////////////////////////////////////////////////
	//// data
	private boolean debug = true;			// toggle debug messages
	
	private int coins;						// coins in purse
	private double amount;					// total actual money
	private static double VALUE = 0.25;		// money value of a single coin
	
	private DecimalFormat decimal2 = new DecimalFormat("0.00");	// format double
	
	////////////////////////////////////////////////////////
	//// constructors
	public Purse(){											// default constructor
		set_coins(10);
	}
	public Purse(int num){									// overloaded - int
		// for possible future restore/continue game functionality
		set_coins(num);
	}
	
	////////////////////////////////////////////////////////
	//// get & set methods
	public int get_coins(){									// coins
		return this.coins;
	}
	public void set_coins(int coins){
		this.coins = coins;
	}
	public double get_amount(){								// amount
		calc_amount();					// update amount
		return this.amount;
	}
	public void set_amount(double num){
		this.amount = num;
	}

	////////////////////////////////////////////////////////
	//// functional methods
	private void calc_amount(){								// calculate amount
		// set real money value based on conversion and no. of coins
		set_amount(get_coins() * Purse.VALUE);
	}
	public int checkBet(int bet){							// check player has enough to bet
		if (bet == 0){
			// exit chosen
			return 0;
		}
		if (bet < 0 || bet > 4){
			// bet is invalid (outside 1-4), prob redundant
			if (debug) {
				System.out.println("Purse:  checkBet() - outside bet params");
			}
			return -3;
		} else if (get_coins() == 0){
			// player has no coins left
			if (debug) {
				System.out.println("Purse:  checkBet() - no money");
			}
			String msg = "!  You have no money left!!";
			SUI.message(msg);
			return -2;
		} else if ((get_coins() - bet) < 0){
			// not enough money to cover bet
			if (debug) {
				System.out.println("Purse:  checkBet() - bet too high");
			}
			String msg = "You do not have enough coins for a bet of that size!\n"
							+"\nYou currently have: " +get_coins()
							+"\nYou bet: " +bet
							+"\n\nPlease bet lower.";
			SUI.message(msg);
			return -1;
		} else {
			// player has enough money for bet
			if (debug) {
				System.out.println("Purse:  checkBet() - ok");
			}
			return 1;
		}
	}
	public void bet(int betCoins){							// bet coins
		// remove bet coins from the purse
		if (debug) {
			System.out.println("Purse:  bet() - " +betCoins);
		}
		switch (checkBet(betCoins)){
		case -2:
			// negative bet
			break;
		case -1:
			// no money left
			break;
		case 0:
			// bet too high
			break;
		case 1:
			// bet ok
			set_coins(get_coins() - betCoins);
			break;
		}
	}
	public void win(int numBet, int winMultiplier){			// win coins
		// add won coins to the purse
		if (debug) {
			System.out.println("Purse:  win() - bet: " +numBet+ " win: " +winMultiplier);
		}
		set_coins(get_coins() + (numBet * winMultiplier));
	}
	public void disp(){										// display purse
		// print the purse contents
		String msg = "You now have:\n\n" +get_coins()+ " coins / €" +decimal2.format(get_amount()); 
		SUI.message(msg);
	}
}
