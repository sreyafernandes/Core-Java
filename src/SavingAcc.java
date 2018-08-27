
public abstract class SavingAcc extends BankAcc{
	private boolean isSalaried;
	private static final float MINBAL = 5000;

	public SavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		super(accNo, accNm, accBal);
		this.isSalaried = isSalaried;
	}
	@Override	
	public String toString() {
		return "SavingAcc [isSalaried=" + isSalaried + "]";
	}
	@Override
	public void withdraw(float amount) {
		float bal=getAccBal();
		if(bal<MINBAL)
			System.out.println("Unable to withdraw due to insufficient funds");
		else
			bal = bal-amount;
		System.out.println("Current Balance is: "+bal);
		System.out.println("Amount withdrawn: "+amount);
	}
}
