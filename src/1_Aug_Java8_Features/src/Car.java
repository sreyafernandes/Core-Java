
public class Car implements Vehicle{

	@Override
	public void drive() {
		System.out.println("Driving a car");
		
	}

	@Override
	public void displayinfo() {
		System.out.println("This is a car");
	}
	
}
