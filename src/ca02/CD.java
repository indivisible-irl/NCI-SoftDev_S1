package ca02;

/*
Name:	CD.java
Author:	David Byrne
SID:	x12101575
Desc:	A class to represent a CD.
Written:15/06/12
*/


public class CD {
	// data members
	private String title, artist;
	private int numTracks;


	// constructors
	public CD(){										// default
		this.title = "No title";
		this.artist = "No artist";
		this.numTracks = 0;
	}
	public CD(String title, String artist, int tracks){	// overloaded
		this.title = title;
		this.artist = artist;
		this.numTracks = tracks;
	}


	// get and set

	public String get_title(){									// title
		return this.title;
	}
	public void set_title(String title){
		if (title == ""){
			System.out.println("---- ! You must specify a title ! ----");
		} else{
			this.title = title;
		}
	}
	public String get_artist(){									// artist
		return this.artist;
	}
	public void set_artist(String artist){
		if (artist == ""){
			System.out.println("---- ! You must specify an artist ! ----");
		} else{
			this.artist = artist;
		}
	}
	public int get_numTracks(){									// numTracks
		return this.numTracks;
	}
	public void set_numTracks(int tracks){
		if (tracks < 1){
			System.out.println("---- ! You can't have a CD without any tracks ! ----\nTracks: " +tracks);
		} else{
			this.numTracks = tracks;
		}
	}

	// no behavioural methods
	// if we had a second machine we could maybe use some
	//   to ensure we can't play the same disk in two places

}