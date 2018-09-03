package pack1;

public class Managero extends EmployeeO{
	int incentive;

	public int getIncentive() {
		return incentive;
	}

	public void setIncentive(int incentive) {
		this.incentive = incentive;
	}
	void display() {
		System.out.println("Salary of "+designation+" : "+(this.incentive+this.salary));
	}
	
}
