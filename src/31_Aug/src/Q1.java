import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Q1 {
	public static void main(String[] args) {
		Set<Integer> s = new TreeSet<>();
		s.add(7);
		s.add(8);
		s.add(6);
		
		Iterator<Integer> itr = s.iterator();
		while(itr.hasNext())
		{
			int m=itr.next();
			if(m<7)
				System.out.println(m);
			else
				itr.next();
		}
	}
}
