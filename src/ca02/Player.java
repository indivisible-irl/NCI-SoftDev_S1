package ca02;

/*
Name:	Player.java
Author:	David Byrne
SID:	x12101575
Desc:	A class to represent a CD/DVD Player.
Written:15/06/12
*/

import java.text.DecimalFormat;

public class Player {
	// data members
	private String make, model;
	private boolean playing;
	private String current;

	// String formatting
	DecimalFormat decimal_11 = new DecimalFormat("#.#");


	// constructors
	public Player(){							// default
		this.make = "No make";
		this.model = "No model";
		this.playing = false;
		this.current = "None";
	}
	public Player(String make, String model){	// overloaded
		this.make = make;
		this.model = model;
		this.playing = false;
		this.current = "None";
	}


	// get and set
	public String get_make(){							// make
		return this.make;
	}
	public void set_make(String make){
		this.make = make;
	}
	public String get_model(){							// model
		return this.model;
	}
	public void set_model(String model){
		this.model = model;
	}
	public boolean get_playing(){						// playing
		return this.playing;
	}
	private void set_playing(boolean play){
		this.playing = play;
	}
	public String get_current(){						// current
		return this.current;
	}
	private void set_current(String now){
		this.current = now;
	}


	// behavioural methods
	public void playCD(CD cd){
		// play a new CD
		if (this.playing){
			// something already playing
			cantPlay();
		} else{
			// lash it on
			set_current(cd.get_title());
			set_playing(true);
			int tracks = cd.get_numTracks();
			// print output and info
			div();
			System.out.println("You have just started '" +this.current+ "' by " +cd.get_artist()+ ".");
			if (tracks == 1){
				System.out.println("There is " +cd.get_numTracks()+ " track in this album.");
			} else{
				System.out.println("There are " +cd.get_numTracks()+ " tracks in this album.");
			}
			System.out.println("Enjoy!");
			div();
		}
	}
	public void playDVD(DVD dvd){
		// play a new DVD
		if (this.playing){
			// something already playing
			cantPlay();
		} else{
			// load it up
			set_current(dvd.get_title());
			set_playing(true);
			// print output and info
			div();
			System.out.println("You have just started " +this.current+ " directed by " +dvd.get_director()+ ".");
			// use our string formatting method here
			System.out.println("Runtime is " +formatDouble(dvd.get_length())+ " in this album.");
			System.out.println("Enjoy!");
			div();
		}
	}
	public void stop(){
		// stop the player playing
		if (this.playing){
			// when something to stop
			div();
			System.out.println("I hope you enjoyed " +this.current+ "\nCome back again soon!");
			div();

			set_playing(false);
			set_current("None");
		} else{
			// when nothing to stop
			div();
			System.out.println("There is nothing actually currently playing.\nFeel free to choose something nice");
			div();
		}
	}

	private String formatDouble(double num){
		// formatting the double decimal length for printing purposes.
		return decimal_11.format(num);
	}

	private void div(){
		// moving my dividing line print here to make ammending length easier
		System.out.println("---------------------------------------------------------------------------");
	}

	private void cantPlay(){
		// error to print when something is already playing
		div();
		System.out.println("Sorry, '" +get_current()+ "' is already playing.\nPlease stop before attemping to play another.");
		div();
	}

}
