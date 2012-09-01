package project_slots;


public class Test {
	public static void main(String[] args){
		
		// Test turn:
		//int loops = 10;
		int[] bets = {-2,-1,0,1,2,3,4,5};
		
		for (int bet : bets){
			System.out.println("\tTurn:  bet - " +bet);
		//for (int i=0; i<loops; i++){
			//System.out.println("\tTurn " +(i+1)+ "/" +loops+ ":");
			Turn turn = new Turn(bet);
			if (turn.takeTurn() < 0){
				System.out.println("Invilid bet");
				System.out.println("##################################################");
			} else {
				turn.disp();
			}
		}
		
		/*
		// Test purse:
		
		int[] bets = {-2,-1,0,1,2,3,4,5};
		int[] wins = {0,1,3,5,7,10};
		
		Purse purse = new Purse();
		System.out.println("|| Bets:");
		for (int bet : bets){
			//Purse purse = new Purse();
			purse.bet(bet);
			System.out.println("remaining: " +purse.get_coins()+ " or: " +purse.get_amount());
		}
		System.out.println("|| Wins:");
		for (int win : wins){
			purse.win(2, win);
			System.out.println("remaining: " +purse.get_coins()+ " or: " +purse.get_amount());
		}
		
		/*
		// Test spins
		
		Pull pull = new Pull();
		String[] fruit = pull.get_fruit();
		
		System.out.println("Test spins:");
		for (String wheel : fruit){
			System.out.print(wheel + ", ");
		}
		
		
		/*
		// Test wins
		
		String[] test1 = {"bell", "bell", "bell"};				// 10
		String[] test2 = {"grape", "grape", "grape"};			//  7
		String[] test3 = {"cherry", "cherry", "cherry"};		//  5
		String[] test4 = {"bell", "cherry", "bell"};			//  1
		String[] test5 = {"bell", "cherry", "cherry"};			//  3
		String[] test6 = {"cherry", "bell", "bell"};			//  1
		String[] test7 = {"bell", "grape", "bell"};				//  0
		String[] test8 = {"grape", "bell", "grape"};			//  0
		String[][] tests = {test1, test2, test3, test4, test5, test6, test7, test8};
		
		Turn turn = new Turn();
		
		System.out.println("Test wins:");
		for (int i=0; i<tests.length; i++){
			//System.out.println(tests[i]);
			turn.set_fruit(tests[i]);
			turn.checkWin();
			System.out.println("\t" +(i+1)+ ":  " +turn.get_winMultiplier());
		}
		*/
		
	}
}
