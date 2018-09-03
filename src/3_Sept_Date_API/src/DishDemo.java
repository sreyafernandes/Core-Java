import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class DishDemo {
	public static void main(String[] args) {
		DishDemo d1 = new DishDemo();
		Dish d2 = new Dish();
		System.out.println("Java 7");
		d2.gLCD(Dish.d);
		System.out.println();
		System.out.println("Java 8");
		d2.gLCD(Dish.d);
	}
}
