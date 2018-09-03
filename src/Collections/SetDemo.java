import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		set.add(20);
		System.out.println("HashSet : "+set);
		for(Integer i : set)
			System.out.println(i);
		
		Iterator<Integer> itr = set.iterator();
		System.out.println(itr.getClass().getName());
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
