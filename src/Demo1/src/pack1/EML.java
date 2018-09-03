package pack1;

public class EML {
	public static void main(String[] args) {
		Managero m = new Managero();
		Labourer l = new Labourer();
		m.setName("Arun Tendulkar");
		m.setDesignation("Manager");
		m.setSalary(50000);
		m.setIncentive(1000);
		m.display();
		l.setName("Sachin Tendulkar");
		l.setDesignation("Labourer");
		l.setSalary(49000);
		l.setOvertimeAmount(900);
		l.display();
	}
}
