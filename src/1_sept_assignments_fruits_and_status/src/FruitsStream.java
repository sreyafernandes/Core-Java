import java.util.ArrayList;
import java.util.List;

public class FruitsStream {
	public static void main(String[] args) {
		
		List<Fruits> fs = new ArrayList<>();
		fs.add(new Fruits("apple", 90, 50, "red"));
		fs.add(new Fruits("orange", 80, 50, "orange"));
		fs.add(new Fruits("grapes", 70, 50, "green"));
		
		fs.stream().filter(f -> f.getColor().equals("Red")).sorted((f1,f2)->f1.getPrice().compareInt(f2.getPrice()));
	}
}
