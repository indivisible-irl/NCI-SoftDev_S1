package lab03;

public class Account {

	// vars
	private long accNum, balance;
	private String owner, branch;
	
	// constructors
	public Account(){
		setAccNum(0);
		setBalance(0);
		setOwner("No owner");
		setBranch("No branch");
	}
	public Account(long accNum, long balance, String owner, String branch){
		this.setAccNum(accNum);
		this.setBalance(balance);
		this.setOwner(owner);
		this.setBranch(branch);
	}
	
	// getters & setters
	public long getAccNum() {
		return accNum;
	}
	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	
	// functional methods
	public void deposit(long amount){
		setBalance(getBalance()+amount);
	}
	public void withdraw(long amount){
		// ignoring testing as that happens in a later lab
		setBalance(getBalance()-amount);
	}
	public void disp(){
		System.out.println("==============================");
		System.out.println(" Account:   " +getAccNum());
		System.out.println(" Owner:     " +getOwner());
		System.out.println(" Branch:    " +getBranch());
		System.out.println(" Balance:   " +getBalance());
	}
	
}
