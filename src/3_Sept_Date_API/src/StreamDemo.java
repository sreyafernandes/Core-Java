import java.util.stream.Stream;

public class StreamDemo {
	public static void main(String[] args) {
		Stream<Integer> st = Stream.of(1,2,3,8);
		st.forEach(p -> System.out.println(p));
	}
}
