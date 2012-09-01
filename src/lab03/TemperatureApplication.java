package lab03;

/*
file: TemperatureApplication.java
author: David Byrne
date: 15/05/2012
description: Application to make use of our Temperature class
*/

import java.text.DecimalFormat;


public class TemperatureApplication	{
	public static void main(String args[]) {

		int result;

		// Define decimal format for doubles
		DecimalFormat df2 = new DecimalFormat("#.##");

		// create Temperature objects
		Temperature cold = new Temperature();
		Temperature hot = new Temperature();

		cold.setCelcius(-5.5);
		hot.setFarenheit(130.0);

		result = cold.calcFarenheit();
		if(result == 0){
			System.out.println(cold.getCelcius()+ " in farenheit is: " +df2.format(cold.getFarenheit()));
		}
		else{
			System.out.println("Celcius not set.");
		}

		result = hot.calcCelcius();
		if(result == 0){
			System.out.println(hot.getFarenheit()+ " in celcius is: " +df2.format(hot.getCelcius()));
		}
		else{
			System.out.println("Farenheit not set.");
		}



	}
}