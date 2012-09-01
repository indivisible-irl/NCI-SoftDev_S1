package lab04;


public class Account {

	//data members
	private int accountNumber;
	private String owner;
	private double balance;
	private String bankBranch;

	//default constructor that initializes data members to default state
	public Account(){
		this.accountNumber = 0;
		this.owner = "No Name";
		this.balance = 0;
		this.bankBranch = "No Branch";
	}

	//getter and setter methods for data members
	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getBankBranch() {
		return bankBranch;
	}

	public void setBankBranch(String bankBranch) {
		this.bankBranch = bankBranch;
	}

	//main behaviour of account

	//method to withdraw an amount from the account
	public void withdraw(double amount){
		//assigning balance to be itself minus the amount to be withdrawn
		if (amount > balance) {
			System.out.println("You don't have that much money");
			System.out.println("================================");
		}
		else {
			balance = balance - amount;
			System.out.println("You have withdrawn " +amount);
			System.out.println("================================");
		}
	}

	//method to deposit an amount into the account
	public void deposit(double amount){
		//assigning balance to be itself plus the amount to be deposited
		balance = balance + amount;
		System.out.println("You have deposited " +amount);
		System.out.println("================================");
	}

	//method to print the details of the account
	public void printDetails(){
		System.out.println("Account number: "+accountNumber);
		System.out.println("Account owner: "+owner);
		System.out.println("Account balance: "+balance);
		System.out.println("Account bank branch: "+bankBranch);
		System.out.println("================================");
	}


}
