
public class Cat implements Animal{
	@Override
	public void speak() {
		System.out.println("Meow Meow Meow");
	}

	@Override
	public void eat() {
		System.out.println("Milk");
	}
}
