import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(12, "ABC");
		map.put(23, "DEFY");
		map.put(4, "DEFY");
		map.put(5, "DEFY");
		map.put(6, "DEFY");
		map.put(7, "DEFY");
		System.out.println(map);
		
		Set<Integer> s = map.keySet();
		System.out.println(s);
		
		Iterator<Integer> itr = s.iterator();
		while(itr.hasNext())
		{
			Integer key = itr.next();
			String value = map.get(key);
			System.out.println(key+" : "+value);
		}
		
		Collection<String> values = map.values();
		for(String value : values) {
			System.out.println(value);
		}
		
		boolean keySeacrh = map.containsKey(12);
		if(keySeacrh==true)
			System.out.println("12 is present");
		else
			System.out.println("12 is absent");
		
		boolean valueSearch = map.containsValue("DEFY");
		System.out.println(valueSearch);
		
		map.remove(5);
		System.out.println(map);
		
		map.remove(6, "DEFY");
		System.out.println(map);
		
		Set<Map.Entry<Integer,String>> entry = map.entrySet();
		Iterator<Map.Entry<Integer, String>> itrEntry = entry.iterator();
		while(itrEntry.hasNext()) {
			Map.Entry<Integer, String> record = itrEntry.next();
			System.out.println(record.getKey()+" : "+record.getValue());
		}
	}
}
