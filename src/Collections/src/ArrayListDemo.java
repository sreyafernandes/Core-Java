import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		System.out.println(list.size()+" : "+list);
		list.add(1);
		System.out.println(list.size()+" : "+list);
		list.add(2);
		list.add(3);
		System.out.println(list.size());
		list.remove(2);
		System.out.println(list.size());
		list.add(2, 3);
		list.add(4);
		list.add(5);
		list.set(0, 1001);
		System.out.println(list.size()+" : "+list);
		boolean isavail = list.contains(1);
		if(isavail==true)
			System.out.println("found");
		else 
			System.out.println("not found");
		int sum =0;
		for(Integer a: list)
		{
			sum+=a;
		}
		System.out.println("sum is : "+sum);
		Iterator<Integer> i = list.iterator();
		System.out.println(i.getClass().getName());
	}
}
