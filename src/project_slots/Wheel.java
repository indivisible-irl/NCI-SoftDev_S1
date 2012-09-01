package project_slots;

/* Project:	SlotMachine - HDSSD1 - Software Development
 * File:	Wheel.java
 * Author:	David Byrne, 12101575
 * Date:	10/07/2012
 * Updated:	18/07/2012
 * Desc:	Class for individual spinny bits.
 */

// imports
import java.util.Random;

public class Wheel {
	////////////////////////////////////////////////////////
	//// data
	private boolean debug = true;							// toggle debug messages
	
	private String selected = "none";						// string for one fruit
	private int range = Wheel.OPTIONS.length;				// length of options
	Random rand = new Random();								// random functionality
	
	// 	Fruit options expanded to make the random selection and monetary returns
	// 	  more realistic when compared to real-world slot machines.
	private static String[] OPTIONS = {"bell", "bell", "bell", "bell",
										"grape", "grape", "grape",
										"cherry", "cherry", "cherry",
										"lemon", "lemon", "lemon", "lemon", "lemon"};
	
	////////////////////////////////////////////////////////
	//// constructors
	public Wheel(){											// default constructor
	}
	
	////////////////////////////////////////////////////////
	//// get & set methods
	public String get_selected(){							// selected
		return this.selected;
	}
	public void set_selected(String str){
		this.selected = str;
	}
	
	////////////////////////////////////////////////////////
	//// functional methods
	public String spin(){									// spin
		set_selected(Wheel.OPTIONS[rand.nextInt(this.range)]);
		if (debug) {
			System.out.println("Wheel:  spin() - " +get_selected());
		}
		return get_selected();
	}
}