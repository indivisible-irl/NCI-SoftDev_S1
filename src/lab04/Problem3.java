package lab04;


public class Problem3 {

	public static void main(String[] args) {

		//declaring two account objects
		Account lecturerAccount;
		Account studentAccount;

		//creating two account objects
		lecturerAccount = new Account();
		studentAccount = new Account();

		//setting attributes of objects
		lecturerAccount.setAccountNumber(10987222);
		lecturerAccount.setOwner("Jonathan Meaney");
		lecturerAccount.setBalance(0);
		lecturerAccount.setBankBranch("Cayman Islands");

		studentAccount.setAccountNumber(11233254);
		studentAccount.setOwner("Joe Bloggs");
		studentAccount.setBalance(10000);
		studentAccount.setBankBranch("Mayor Square, Dublin 1");

		//displaying the initial values of the two accounts
		lecturerAccount.printDetails();
		studentAccount.printDetails();

		//withdrawing and depositing
		studentAccount.withdraw(10000);
		lecturerAccount.withdraw(10000);
		lecturerAccount.deposit(10000);
		studentAccount.deposit(10000);
		//studentAccount.withdraw(10000);
		//displaying the final values of the two accounts
		lecturerAccount.printDetails();
		studentAccount.printDetails();

	}

}
