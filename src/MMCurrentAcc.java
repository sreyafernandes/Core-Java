
public class MMCurrentAcc extends CurrentAcc{
	private final float creditLimit;
	public MMCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal, creditLimit);		
		this.creditLimit = creditLimit;
	}
}
