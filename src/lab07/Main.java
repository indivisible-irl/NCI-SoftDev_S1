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
			// display current sentence
			System.out.println("==============================================");
			System.out.println(sentence);
			System.out.println("----------------------------------------------");
			
			// perform methods from StringUtilities
			List<Integer> asASCII = utility.toASCII(sentence);
			String maxWord = utility.maxWord(sentence);
			String minWord = utility.minWord(sentence);
			String reverse = utility.reverseSentence(sentence);
			Vowels vowels = utility.analyseVowels(sentence);
			boolean isPalendrome = utility.checkPalindrome(sentence);
			
			// print out results
			print("As ASCII", asASCII);
			print("Longest word", maxWord);
			print("Shortest word", minWord);
			print("In reverse", reverse);
			print("Vowels", vowels);
			print("Is palendrome", isPalendrome);
		}
	}

	
	// methods to print different data types and titles
	public static void print(String title, String word){
		System.out.println(title + ":");
		System.out.println("  "+word);
	}
	public static void print(String title, List<Integer> nums){
		System.out.print(title + ":\n  ");
		for (int num : nums){
			System.out.print(num + " ");
		}
		System.out.println();
	}
	public static void print(String title, Vowels vowels){
		int[] counts = vowels.getCounts();
		char[] chars = vowels.getChars();
		System.out.println(title + ":");
		System.out.println("  Char | Count\n  -----|------");
		for (int i=0; i<counts.length; i++){
			System.out.println("    "+chars[i]+"  |   "+counts[i]);
		}
	}
	public static void print(String title, boolean isPal){
		System.out.println(title + ":\n  "+isPal);
	}
}
