package lab03;

public class AccountApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Account lecturersAccount = new Account();
		lecturersAccount.setAccNum(123456789);
		lecturersAccount.setBranch("Cayman Islands");
		lecturersAccount.setOwner("Jonathan");
		lecturersAccount.setBalance(0);
		
		Account studentsAccount = new Account(234567891, 10000, "Student", "Dublin");
		
		lecturersAccount.disp();
		studentsAccount.disp();
		
		studentsAccount.withdraw(10000);
		lecturersAccount.deposit(10000);
		
		lecturersAccount.disp();
		studentsAccount.disp();

	}

}
