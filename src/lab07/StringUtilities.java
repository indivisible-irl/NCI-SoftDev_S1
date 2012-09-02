package lab07;

import java.util.ArrayList;
import java.util.List;

/**
 * Class to manipulate and test strings
 */
public class StringUtilities {
	
	StringBuffer sb;

	/**
	 * Convert a string to its ASCII representation.
	 * @param String str
	 * @return List<Integer>
	 */
	public List<Integer> toASCII(String str){
		sb = new StringBuffer(str);
		List<Integer> asciiOut = new ArrayList<Integer>();
		
		for (int i=0; i<str.length(); i++){
			int ascii = (int) sb.charAt(i);
			asciiOut.add(ascii);
		}
		return asciiOut;
	}
	/**
	 * Calculate and return the longest word in a string
	 * !! Only splits on spaces, will include punctuation as part of words (no punct in egs)
	 * @param String str
	 * @return String
	 */
	public String maxWord(String str){
		// TODO better regex for split
		String[] split = str.split(" ");
		int max = 0;
		String longest = "";
		for (String word : split){
			if (word.length() > max){
				max = word.length();
				longest = word;
			}
		}
		return longest;
	}
	/**
	 * Calculate and return the shortest word in a string
	 * !! Only splits on spaces, will include punctuation as part of words (no punct in egs)
	 * @param String str
	 * @return String
	 */
	public String minWord(String str){
		// TODO better regex for split
		String[] split = str.split(" ");
		int min = Integer.MAX_VALUE;
		String shortest = "";
		for (String word : split){
			if (word.length() < min){
				min = word.length();
				shortest = word;
			}
		}
		return shortest;
	}
	/**
	 * Reverse a string
	 * @param String str
	 * @return String
	 */
	public String reverseSentence(String str){
		sb = new StringBuffer(str);
		sb.reverse();
		return sb.toString();
	}
	/**
	 * Calculate the number and types of vowels in a string
	 * @param String str
	 */
	public Vowels analyseVowels(String str){
		String testable = str.toLowerCase();
		sb = new StringBuffer(testable);
		Vowels vowels = new Vowels();
		for (int i=0; i<sb.length(); i++){
			vowels.testChar(sb.charAt(i));
		}
		return vowels;
	}
	
	public boolean checkPalindrome(String str){
		sb = new StringBuffer(str);
		StringBuffer lettersOnly = new StringBuffer();
		for (int i=0; i<sb.length(); i++){
			if (Character.isLetter(sb.charAt(i))){
				lettersOnly.append(sb.charAt(i));
			}
		}
		String justLetters = lettersOnly.toString();
		String reverse = reverseSentence(justLetters);
		return justLetters.equals(reverse);
	}
	
}
