package ca02;

/*
Name:	Main.java
Author:	David Byrne
SID:	x12101575
Desc:	A main class to use our CD, DVD and Player classes.
Written:15/06/12
*/


public class Main {
	public static void main(String args[]){

	// print line
	div();

	/* Following the order given in the exam, I'd have done it differently but "Meh!" */

	// make our player
	Player machine = new Player("Sorny", "AllBox");

	// make a DVD
	DVD film = new DVD();
	film.set_title("My Movie");
	film.set_director("Mr. Me");
	film.set_length(115.5);

	// play the DVD
	machine.playDVD(film);

	// now make a CD
	CD album = new CD("Now That's What I Call Musac", "Elevator Elation", 1);

	// try to play the CD
	machine.playCD(album);

	// stop the player
	machine.stop();

	// try to play the CD again
	machine.playCD(album);

	// stop again it for good measure
	machine.stop();

	// print line
	div();

	}

	private static void div(){
		// another dividing line
		System.out.println("===========================================================================");
	}
}