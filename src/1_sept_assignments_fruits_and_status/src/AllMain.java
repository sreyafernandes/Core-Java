import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class AllMain {
	public static void main(String[] args) {
		NavigableSet<Fruits> fruits = new TreeSet<>(new Fruits());
		fruits.add(new Fruits("apple", 90, 50, "red"));
		fruits.add(new Fruits("orange", 80, 50, "orange"));
		fruits.add(new Fruits("grapes", 70, 50, "green"));
		
		System.out.println("a) The fruit names of low calories fruits i.e. calories < 100 sorted in descending order of calories");
		NavigableSet<Fruits> ds = fruits.descendingSet();
		System.out.println(ds);
		for (Fruits fruits2 : ds) {
			if(fruits2.getCalories()<90)
				System.out.println(fruits2);	
//		List<Fruits> ls = (List<Fruits>) fruits;
//		System.out.println(ls);

		System.out.println("b)	Color wise list of fruit names.");
		List<Fruits> ls = new ArrayList<>();
		fruits.add(new Fruits("apple", 90, 50, "red"));
		fruits.add(new Fruits("orange", 80, 50, "orange"));
		fruits.add(new Fruits("grapes", 70, 50, "green"));
//		Collections.sort(ls, Fruits::compareByColor);
//		System.out.println(ls);
		}
	}
}
