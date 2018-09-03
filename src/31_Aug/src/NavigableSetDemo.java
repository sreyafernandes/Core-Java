import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class NavigableSetDemo {
	public static void main(String[] args) {
		NavigableSet<Integer> ns = new TreeSet<>();
		ns.add(20);
		ns.add(30);
		ns.add(50);
		ns.add(70);
		ns.add(90);
		ns.add(25);
		ns.add(40);
		ns.add(55);
		ns.add(87);
		System.out.println(ns);
		System.out.println(ns.ceiling(10));
		System.out.println(ns.ceiling(20));
		System.out.println(ns.higher(10));
		System.out.println(ns.higher(100));
		System.out.println(ns.lower(40));
		System.out.println(ns.floor(35));
		System.out.println(ns.lower(5));
		System.out.println();
		
		SortedSet<Integer> ss1 = ns.headSet(50);
		System.out.println(ss1);
		NavigableSet<Integer> ns1 = ns.headSet(50, true);
		System.out.println(ns1);
		System.out.println();
		
		SortedSet<Integer> ss2 = ns.tailSet(55);
		System.out.println(ss2);
		SortedSet<Integer> ns2 = ns.tailSet(55, false);
		System.out.println(ns2);
		System.out.println();
		
		SortedSet<Integer> ss3 = ns.subSet(20, 70);
		System.out.println(ss3);
		NavigableSet<Integer> ns3 = ns.subSet(20, false, 70, true);
		System.out.println(ns3);
		
	}
}
