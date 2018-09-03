import java.util.Set;
import java.util.TreeSet;

public class PersonMain {
	public static void main(String[] args) {
		Set<Person> people = new TreeSet<>(new PersonWeightCompare());
		people.add(new Person(24,56,"Sreya"));
		people.add(new Person(24,58,"Ruhika"));
		people.add(new Person(0,26,"Shivani"));
		for (Person person : people) {
			System.out.println(person);
		}
	}
}
