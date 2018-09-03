
public class EmployeeMain {
	public static void main(String[] args) {
		
		EmpFac1 emp1 = Employee::new;
		Employee e1 = emp1.getEmployee();
		System.out.println(e1);
		
		EmpFac2 emp2 = Employee::new;
		Employee e2 = emp2.getEmployee("Suresh", "Manager");
		System.out.println(e2);
	}
}
