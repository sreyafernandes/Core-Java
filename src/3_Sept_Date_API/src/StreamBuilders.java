import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamBuilders {
	public static void main(String[] args) {
		List<String> mN = new ArrayList<>();
		mN.add("Amitabh");
		mN.add("Shekar");
		mN.add("Ajit");
		mN.add("Rahul");
		mN.add("Shah Rukh");
		mN.add("Salman");
		mN.add("Yana");
		mN.add("Lokesh");
//		public static List<String> prefixA(List<String> nM)
//		{
//			return mN.stream()
//					.filter(nM -> nM.equals(nM))
//					.sorted(comparing(Dish::getName))
//					.map(Dish::getName)
//					.collect(toList());
//		}
		
		mN.stream().filter((s)->s.startsWith("A")).forEach(System.out::println);
		mN.stream().filter((s)->s.startsWith("A")).map(String::toUpperCase).forEach(System.out::println);
		
		
		//Employee 
		ArrayList<Employee> emp = new ArrayList<>();
		emp.add(new Employee(1, "Ananya", "Trainer", 50000, 10));
		emp.add(new Employee(2, "Amit", "Admin", 30000, 20));
		emp.add(new Employee(3, "Rahul", "HR", 40000, 30));
		emp.add(new Employee(4, "Ajay", "Trainer", 55000, 10));
		emp.add(new Employee(5, "Kiran", "Admin", 35000, 20));
		emp.add(new Employee(6, "Kumar", "HR", 40500, 30));
		emp.add(new Employee(7, "Ajit", "CEO", 50000, 100));
		emp.add(new Employee(8, "Laxman", "Trainer", 350000, 10));
		
		emp.stream()
		.filter(d -> d.getSalary()>20000 && d.getDeptNo()==10)
		.sorted((d1,d2)->d1.getName().compareTo(d2.getName()))
		.forEach(System.out::println);
	}
	
}
