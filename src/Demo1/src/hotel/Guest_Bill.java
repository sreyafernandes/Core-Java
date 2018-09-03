package hotel;

public class Guest_Bill {
	
	String gN;
	String m;
	double rr;
	double f;
	
	public String getgN() {
		return gN;
	}

	public void setgN(String gN) {
		this.gN = gN;
	}

	public String getM() {
		return m;
	}

	public void setM(String m) {
		this.m = m;
	}

	public double getRr() {
		return rr;
	}

	public void setRr(double rr) {
		this.rr = rr;
	}

	public double getF() {
		return f;
	}

	public void setF(double f) {
		this.f = f;
	}

	void rent()
	{
		double discount=0.0,total=0.0,payable=0.0;
		total = getRr() + getF();
		System.out.println(getM());
		if(getM().equals("Nov") || getM().equals("Jan") || getM().equals("Feb") || getM().equals("Dec") || getM().equals("Mar"))
		{
			discount=(0.5*getRr())+(0.2*getF());
		}
		else if(getM().equals("Apr") || getM().equals("May") || getM().equals("Jun") || getM().equals("July")  || getM().equals("Aug"))
		{
			System.out.println("hello");
			discount=0.2*getRr()+0.1*getF();
			
		}
		else if(getM().equals("Sept") || getM().equals("Oct"))
			{
			discount=0.1*getRr()+0.05*getF();
			}
		else {
			System.out.println("Please enter a proper value for month");
		}
		System.out.println("Room Rent: "+getRr());
		System.out.println("Food: "+getF());
		System.out.println("Discount: "+discount);
		payable = total-discount;
		discount=0;
		System.out.println("Net Payable: "+payable);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

//if(getM() == "Sept" || getM() == "Oct")