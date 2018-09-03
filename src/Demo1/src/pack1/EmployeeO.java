package pack1;

public class EmployeeO {
	String name;
	int salary;
	String designation;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	void displaySalary() {
		System.out.println("Salary is : "+salary);
	}
}
