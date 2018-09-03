import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PersonMain {
	public static void main(String[] args) {
		List<Person> persons = new ArrayList<>();
		persons.add(new Person("Yukine",32));
		persons.add(new Person("Yato",34));
		persons.add(new Person("Hiyori",36));
		
		Person p = new Person();
		Collections.sort(persons, p::compareByName);
		System.out.println(persons);
		
		Collections.sort(persons, Person::compareByAge);
		System.out.println(persons);
	}
}
