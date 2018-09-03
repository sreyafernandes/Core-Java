
public class DemoNew implements A,B{

	@Override
	public void hello() {
		A.super.hello();
		B.super.hello();
	}
	public static void main(String[] args) {
		DemoNew d = new DemoNew();
		d.hello();
	}
}
