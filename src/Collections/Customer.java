public class Customer {
	private int custID;
	private String custName;
	private String addr;
	public Customer(int custID, String custName, String addr) {
		super();
		this.custID = custID;
		this.custName = custName;
		this.addr = addr;
	}
	@Override
	public String toString() {
		return "Customer [custID=" + custID + ", custName=" + custName + ", addr=" + addr + "]";
	}
	public int getCustID() {
		return custID;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public void setCustID(int custID) {
		this.custID = custID;
	}
}
