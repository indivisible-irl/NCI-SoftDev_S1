package project_slots;

/* Project:	SlotMachine - HDSSD1 - Software Development
 * File:	Pull.java
 * Author:	David Byrne, 12101575
 * Date:	19/07/2012
 * Desc:	Class for a full roll/pull result
 */

public class Pull {
	////////////////////////////////////////////////////////
	//// data
	private boolean debug = true;							// toggle debug messages
	
	private String[] fruit = new String[3];					// string array to hold a 'pull'.
	private Wheel wheel1 = new Wheel();						// separate 'wheels'
	private Wheel wheel2 = new Wheel();
	private Wheel wheel3 = new Wheel();
	
	
	////////////////////////////////////////////////////////
	//// constructors
	public Pull(){
		// default constructor
		assign();											// set fruit array
	}
	
	////////////////////////////////////////////////////////
	//// get & set
	public String[] get_fruit(){		// call for rolled array
		return this.fruit;
	}
	private void set_fruit(String f1, String f2, String f3){
		this.fruit[0] = f1;
		this.fruit[1] = f2;
		this.fruit[2] = f3;
		if (debug) {
			System.out.print("Pull:  set_fruit() - ");
			for (String wheel : this.fruit) {
				System.out.print(wheel + ", ");
			}
			System.out.println();
		}
	}
	
	////////////////////////////////////////////////////////
	//// functional methods
	private void assign(){				// generate and set fruit array
		set_fruit(wheel1.spin(), wheel2.spin(), wheel3.spin());
	}
}
