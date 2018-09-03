import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CustMain {
	public static void main(String[] args) {
		Set<Customer> cust = new HashSet<>();
		cust.add(new Customer(0, "i", "i"));
		cust.add(new Customer(1, "i", "i"));
		cust.add(new Customer(2, "i", "i"));
		for(Customer hello: cust)
		{
			System.out.println(hello);
		}
		System.out.println();
		
		Set<Customer> cust1 = new TreeSet<>(new CustIDCompare());// throws an exception of casting since tree set performs sorting which requires comparison
		cust1.add(new Customer(4, "e", "5"));
		cust1.add(new Customer(6, "e", "5"));
		cust1.add(new Customer(5, "e", "5"));
		for(Customer n : cust1)
		{
			System.out.println(n);
		}
		System.out.println();
		
		Set<Customer> cust2 = new TreeSet<>(new CustNameCompare());
		cust2.add(new Customer(4, "ae", "5"));
		cust2.add(new Customer(6, "ce", "5"));
		cust2.add(new Customer(5, "be", "5"));
		for(Customer c: cust2)
			System.out.println(c);
	}
}
