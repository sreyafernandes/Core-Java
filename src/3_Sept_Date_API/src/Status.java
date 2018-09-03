public enum Status 
{
	NEW(1), REJECTED(4), ACCEPTED(2), COMPLETED(3);

	private int numVal;

	Status(int numVal) {
		this.numVal = numVal;
	}

	public int getNumVal() {
		return numVal;
	}
}

