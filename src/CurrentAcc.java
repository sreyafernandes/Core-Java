public abstract class CurrentAcc extends BankAcc{
	private final float creditLimit;

	public CurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal);		
		this.creditLimit = creditLimit;
	}
	@Override
	public void withdraw(float amount) {
		float bal=getAccBal();
		if((bal+creditLimit)<amount)
			System.out.println("Unable to withdraw balance due to insufficient funds");
		else 
			bal = bal-amount;
		System.out.println("Current Balance is: "+bal);
		System.out.println("Amount withdrawn is: "+amount);
	}
	@Override
	public String toString() {
		return null;
	}
	
}
