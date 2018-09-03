package pack1;

public class AbstractMain extends AbstractDemo{
	AbstractMain(){
		System.out.println("AbsMain method");
	}
	public static void main(String[] args) {
		AbstractMain abs = new AbstractMain();
	}
}
