import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ForEachModifiedDemo {
	public static void main(String[] args) {
		List<Integer> l = new ArrayList<>();
		l.add(23);
		l.add(45);
		l.add(56);
		l.add(12);
		l.forEach(new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				System.out.println(t);
			}
			
		});
	}
}
