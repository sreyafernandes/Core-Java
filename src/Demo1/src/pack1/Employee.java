package pack1;

public class Employee {

	String ename;
	String dept;
	String design;
	float salary;
	
	Employee(String ename, String dept, String design, float salary){
		this.ename = ename;
		this.dept = dept;
		this.design = design;
		this.salary = salary;
	}
	
	double getAllowance()
	{
		double allowance=1100;
		if (design == "PL")
			allowance = 1600;
			else if (design == "TM")
				allowance = 1300;
			else if (design == "TL")
				allowance = 1270;
			else if (design == "TM")
				allowance = 1300;
			else if (design == "Admin")
				allowance = 1500;
		return allowance;
	}

	void calculateTax()
	{
		double mT=0 ,r=0;
		double g = 0;
		double salary = this.getSalary(); 
		g = salary + this.getAllowance();
		if(salary>20000)
		{
			mT = (0.13*salary)/12;
			r = g - mT;
		}
		else if(salary>=15000 && salary<=20000)
		{
			mT = (0.125*salary)/12;
			r = g - mT;
		}
		else if(salary>=12500 && salary<=14999)
		{
			mT = (0.1125*salary)/12;
			r = g - mT;
		}
		else if(salary>=7500 && salary<=12499)
		{
			mT = (0.096*salary)/12;
			r = g - mT;
		}
		else
		{
			mT=0;
			r = g - mT;
		}
		System.out.println("Salary: "+salary);
		System.out.println("Monthly Tax: "+mT);
		System.out.println("Gross Salary:"+g);
		System.out.println("Net Salary: "+r);
		System.out.println("allowance: "+getAllowance());
		System.out.println();
		
	}
	
	public float getSalary() {
		return salary;
	}


	public static void main(String[] args) {
		Employee e1 = new Employee("Ram", "Admin", "Admin", 20001);
		e1.calculateTax();

		Employee e2 = new Employee("Shyam", "tech", "PL", 50000);
		e2.calculateTax();
		
		Employee e3 = new Employee("Rama", "Admin", "TM", 7400);
		e3.calculateTax();
	}

}
