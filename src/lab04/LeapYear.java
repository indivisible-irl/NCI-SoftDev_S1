package lab04;

public class LeapYear {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] testYears = new int[]{0, 1715, 100, 400, 1644, 1731, 1800, 2000};
		

		for (int year : testYears){
			System.out.print(year +":\t");
			System.out.println(testLeapYear(year));
		}
	}

	
	public static boolean testLeapYear(int year){
		if (year % 400 == 0){
			return true;
		} else if (year % 4 == 0 && !(year % 100 == 0)){
			return true;
		} else {
			return false;
		}
	}
}
