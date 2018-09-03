import java.util.Comparator;

public class CustIDCompare implements Comparator<Customer>{

	@Override
	public int compare(Customer c1, Customer c2) {
		Integer id1 = c1.getCustID();
		Integer id2 = c2.getCustID();
		return id1.compareTo(id2);
	}
	
}
