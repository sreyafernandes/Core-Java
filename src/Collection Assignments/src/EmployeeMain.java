import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class EmployeeMain {
	public static void main(String[] args) {
		Employee e1 = new Employee("John","12/12/2012");
		Employee e2 = new Employee("Johanna","12/12/2012");
		Map<String, String> emps = new HashMap<>();
		
		emps.put(e1.getDate(), e1.getName());
		emps.put(e2.getDate(), e2.getName());

		Set<String> s = emps.keySet();
		Iterator<String> itr = s.iterator();
		while(itr.hasNext())
		{
			String key = itr.next();
			String date[] = key.split("/");
			if(date[0])
		}
	}
}
