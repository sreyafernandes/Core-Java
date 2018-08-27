
public class SingletonClass {
	int count;
	private static SingletonClass sc;
	private SingletonClass(int count) {
		this.count=count;
		System.out.println(count);
		
	}
	private static SingletonClass instance() {
		if(sc == null) {
			sc = new SingletonClass(1);
		}
		return sc;
	}
	public static void main(String[] args) {
	SingletonClass sc = new SingletonClass(5);
	}
}
