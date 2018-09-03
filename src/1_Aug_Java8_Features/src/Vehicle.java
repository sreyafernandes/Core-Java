
public interface Vehicle {
	public void drive();
	public void displayinfo();
	public default void blowHorn() {
		System.out.println("Toot Toot");
	};
}
