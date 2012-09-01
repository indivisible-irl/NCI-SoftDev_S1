package lab04;

/*
file: Problem1.java
author: David Byrne
date: 18/05/2012
description: Lab problem 1 - Score, if statements
*/

public class Problem1 {
	public static void main(String args[]) {


		int score = 5;
		String message = "No value set";

		if (score >= 10 && score < 50) {
			message = "You won a free go"; }
		else if (score >= 50 && score < 100) {
			message = "You won a half eaten pie"; }
		else if (score >= 100 && score < 200) {
			message = "You won a luxury trip for two to NCI's basement"; }
		else if (score >= 200 && score < 300) {
			message = "You won a pair of cruise liners"; }
		else if (score >= 300 && score < 400) {
			message = "You won 16 Rolex watches"; }
		else if (score >= 400 && score < 500) {
			message = "You won the largest gold nugget in the world, 1 mile in diameter"; }
		else if (score >= 500) {
			message = "You won  the greatest hits of Alanis Morissette deluxe 18 CD box set"; }
		else {
			message = "You have won nothing"; }

		System.out.println(message);



	}

}