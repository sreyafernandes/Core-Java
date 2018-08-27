
public class Dog implements Animal{
	@Override
	public void speak() {
		System.out.println("Bow Bow Bow");
	}

	@Override
	public void eat() {
		System.out.println("Bone");
	}
}
