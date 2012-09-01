package lab03;

/*
file: Temperature.java
author: David Byrne
date: 15/05/2012
description: Convert to and from celcius and farenheit
*/

public class Temperature{

	// Data members
	double celcius = -9000000.0;			// set to impossible value as default
	double farenheit = -9000000.0;			//    will use to test for if set

	// Constructors
	public Temperature(){
		
	}
		// no other constructors wanted as annoying to figure out celcius or farenheit assignment if one arg given.
		//   also pointless to supply both. Just use set and get.

	// Methods:
	public double getCelcius(){
		return this.celcius;
	}
	public void setCelcius(double celcius){
		this.celcius = celcius;
	}
	public double getFarenheit(){
		return this.farenheit;
	}
	public void setFarenheit(double farenheit){
		this.farenheit = farenheit;
	}

	public int calcCelcius(){
		if(farenheit != -9000000.0){
			this.celcius = (this.farenheit - 32) * (5.0 / 9.0);
			return 0;
		}
		else{ return -1; }
	}
	public int calcFarenheit(){
		if(celcius != -9000000.0){
			this.farenheit = this.celcius * (9.0 / 5.0) + 32;
			return 0;
		}
	else{ return -1; }
	}
}
