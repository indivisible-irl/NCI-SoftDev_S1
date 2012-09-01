package ca02;

/*
Name:	DVD.java
Author:	David Byrne
SID:	x12101575
Desc:	A class to represent a DVD.
Written:15/06/12
*/


public class DVD {
	//data members
	private String title, director;
	private double length;


	// constructors
	public DVD(){										// default
		this.title = "No title";
		this.director = "No director";
		this.length = 0.0;
	}
	public DVD(String title, String dir, float length){	// overloaded
		this.title = title;
		this.director = dir;
		this.length = length;
	}

	// get and set
	public String get_title(){									// title
		return this.title;
	}
	public void set_title(String title){
		this.title = title;
	}
	public String get_director(){								// director
		return this.director;
	}
	public void set_director(String dir){
		this.director = dir;
	}
	public double get_length(){									// length
		return this.length;
	}
	public void set_length(double length){
		this.length = length;
	}


	// no behavioural methods
	// if we had a second machine we could maybe use some
	//   to ensure we can't play the same disk in two places

}