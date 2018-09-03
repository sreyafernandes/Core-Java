import java.util.Comparator;

public class CustNameCompare implements Comparator<Customer>{

	@Override
	public int compare(Customer o1, Customer o2) {
		String s1 = o1.getCustName();
		String s2 = o2.getCustName();
		return s1.compareTo(s2);
		
	}
	
}
