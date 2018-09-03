public class BankAccount {
	
	private int accNo;
	private int balance;
	private String name;
	
	public BankAccount(int accNo, int balance, String name) {
		super();
		this.accNo = accNo;
		this.balance = balance;
		this.name = name;
	}
	
	public int getAccNo() {
		return accNo;
	}
	public int getBalance() {
		return balance;
	}
	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "BankAccount [accNo=" + accNo + ", balance=" + balance + ", name=" + name + "]";
	}

}
