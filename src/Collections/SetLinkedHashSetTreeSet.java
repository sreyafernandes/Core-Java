import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetLinkedHashSetTreeSet {
	public static void main(String[] args) {
		Set<Integer> s = new HashSet<>();
		s.add(20);
		s.add(50);
		s.add(30);
		s.add(40);
		System.out.println("HashSet: "+s);// comes in any order
		Set<Integer> lhs = new LinkedHashSet<>();
		lhs.add(20);
		lhs.add(50);
		lhs.add(30);
		lhs.add(40);
		System.out.println("LinkedHashSet: "+lhs);// prints values as added
		Set<Integer> ts = new TreeSet<>();
		ts.add(20);
		ts.add(50);
		ts.add(30);
		ts.add(40);
		System.out.println("TreeSet: "+ts);// sorts values
	}
}
