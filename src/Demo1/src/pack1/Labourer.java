package pack1;

public class Labourer extends EmployeeO{
	int overtimeAmount;

	public int getOvertimeAmount() {
		return overtimeAmount;
	}

	public void setOvertimeAmount(int overtimeAmount) {
		this.overtimeAmount = overtimeAmount;
	}
	void display() {
		System.out.println("Salary of "+designation+" :"+(this.overtimeAmount+this.salary));
	}
}
