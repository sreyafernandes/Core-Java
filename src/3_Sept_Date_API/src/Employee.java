
public class Employee {
	
	private int empno;
	private String name;
	private String desg;
	private int salary;
	private int deptNo;
	
	public Employee(int empno, String name, String desg, int salary, int deptNo) {
		super();
		this.empno = empno;
		this.name = name;
		this.desg = desg;
		this.salary = salary;
		this.deptNo = deptNo;
	}

	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", name=" + name + ", desg=" + desg + ", salary=" + salary + ", deptNo="
				+ deptNo + "]";
	}

	public int getEmpno() {
		return empno;
	}

	public String getName() {
		return name;
	}

	public String getDesg() {
		return desg;
	}

	public int getSalary() {
		return salary;
	}

	public int getDeptNo() {
		return deptNo;
	}
	
	
}
