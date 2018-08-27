
public class Sparrow implements Bird, Animal{

	@Override
	public void fly(String name) {
		System.out.println(name + " flies");
	}

	@Override
	public void speak() {
		System.out.println("Chirp Chirp Chirp");
	}

	@Override
	public void eat() {
		System.out.println("Grains, worms and fruit");
	}
	
}
