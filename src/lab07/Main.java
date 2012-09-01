package lab07;

/*
 * Class to make use of our StringUtilities
 */

import java.util.List;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// prep
		StringUtilities utility = new StringUtilities();
		String[] sentences = {
				"The quick brown fox jumps over the lazy dog",
				"never odd or even"
		};

		// run everything against all strings
		for (String sentence : sentences){
			// perform methods from StringUtilities
			List<Integer> asASCII = utility.toASCII(sentence);
			String maxWord = utility.maxWord(sentence);
			String minWord = utility.minWord(sentence);
			
			// print out results
			print("As ASCII", asASCII);
			print("Longest word", maxWord);
			print("Shortest word", minWord);
		}
	}

	
	// methods to print different data types and titles
	public static void print(String title, List<Integer> nums){
		System.out.println(title + ":");
		for (int num : nums){
			System.out.print(num + " ");
		}
		System.out.println();
	}
	public static void print(String title, String word){
		System.out.println(title + ":");
		System.out.println("  "+word);
	}
}
