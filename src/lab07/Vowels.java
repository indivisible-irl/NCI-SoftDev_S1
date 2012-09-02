package lab07;

/**
 * Class to handle the counters and such for vowel stats calculation
 * @author DavidA
 *
 */
public class Vowels {

	private int countA, countE, countI, countO, countU;
	
	private static char cA = 'a';
	private static char cE = 'e';
	private static char cI = 'i';
	private static char cO = 'o';
	private static char cU = 'u';
	
	public Vowels(){
		countA = 0;
		countE = 0;
		countI = 0;
		countO = 0;
		countU = 0;
	}
	
	public int[] getCounts(){
		return new int[]{countA, countE, countI, countO, countU};
	}
	public char[] getChars(){
		return new char[]{'a','e','i','o','u'};
	}
	
	public char toChar(String str){
		return str.charAt(0);
	}
	public void testString(String str){
		String testable = str.toLowerCase();
		testChar(toChar(testable));
	}
	public void testChar(char c){
		if (c == cA){
			countA++;
		} else if (c == cE){
			countE++;
		} else if (c == cI){
			countI++;
		} else if (c == cO){
			countO++;
		} else if (c == cU){
			countU++;
		}
	}
}
