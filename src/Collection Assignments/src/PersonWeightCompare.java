import java.util.Comparator;

public class PersonWeightCompare implements Comparator<Person>{

	@Override
	public int compare(Person p1, Person p2) {
		int val=p1.getWeight()-p2.getWeight();
		if(val!=0)
		{
			return val;
		}
		return p1.getHeight()-p2.getHeight();
	}

}
